angular
    .module('app', ['ngRoute'])
    .config(['$routeProvider', function ($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: '/modules/home/home.tpl.html',
                controller: 'HomeCtrl'
            })
            .when('/login', {
                templateUrl: '/modules/auth/login.tpl.html',
                controller: 'AuthCtrl'
            });
    }])
    .run(['AuthService', function(AuthService){
        AuthService.init();
    }]);
