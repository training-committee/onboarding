angular
    .module('app')
    .controller('AuthCtrl', ['$scope', '$location', 'AuthService', function ($scope, $location, AuthService) {

        $scope.loading = false;
        $scope.credentials = {};

        $scope.login = function () {
            AuthService.authenticate($scope.credentials);
        }
    }]);
