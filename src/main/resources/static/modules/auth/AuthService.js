angular
    .module('app')
    .factory('AuthService', ['$http', '$location', '$rootScope', '$httpParamSerializerJQLike', function ($http, $location, $rootScope, $httpParamSerializerJQLike) {
        var checkAuth = function (path) {
            if (auth.authenticated) {
                if (!path) {
                    $location.path(auth.homePath);
                }
            } else {
                $location.path(auth.loginPath);
            }
        };

        var enter = function (path) {
            $http({
                url: '/api/user',
                method: 'GET'
            }).then(function (response) {
                if (response.data.name) {
                    auth.authenticated = true;
                }
                checkAuth(path);
            }, function () {
                checkAuth(path);
            });
        };

        var nextPath = function () {
            return auth.path == auth.loginPath || !auth.path ? auth.homePath : auth.path;
        };

        var auth = {
            authenticated: false,
            loginPath: '/login',
            homePath: '/',

            authenticate: function (credentials) {
                var login = $http.post('/login',
                    $httpParamSerializerJQLike(credentials), {
                        headers: {
                            'Content-Type': 'application/x-www-form-urlencoded'
                        }
                    });

                login.success(function () {
                    auth.authenticated = true;
                    $location.path(nextPath());
                }).error(function () {
                    auth.authenticated = false;
                });
            },

            init: function () {
                $rootScope.$on('$routeChangeStart', function (event, next) {
                    enter(next.$$route ? next.$$route.originalPath : $location.path());
                });
            }
        };

        return auth;
    }]);
