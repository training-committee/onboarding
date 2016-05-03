angular
    .module('app', ['ngRoute', 'ngCookies', 'ngResource'])
    .factory('XSRFInterceptor', [ '$cookies', '$log', function ($cookies, $log) {

        var XSRFInterceptor = {

            request: function(config) {
                var token = $cookies.get('XSRF-TOKEN');

                if (token) {
                    config.headers['X-XSRF-TOKEN'] = token;
                    $log.info("X-XSRF-TOKEN: " + token);
                }

                return config;
            }
        };
        return XSRFInterceptor;
    }])
    .config(['$routeProvider', '$httpProvider', function ($routeProvider, $httpProvider) {
        $routeProvider
            .when('/', {
                templateUrl: '/modules/home/home.tpl.html',
                controller: 'HomeCtrl'
            })
            .when('/login', {
                templateUrl: '/modules/auth/login.tpl.html',
                controller: 'AuthCtrl'
            })
            .when('/trainer', {
                templateUrl: '/modules/trainer/trainerView.tpl.html',
                controller: 'CreateCourseCtrl'
            });
        $httpProvider.interceptors.push('XSRFInterceptor');
    }])
    .run(['AuthService', function(AuthService){
        AuthService.init();
    }]);
