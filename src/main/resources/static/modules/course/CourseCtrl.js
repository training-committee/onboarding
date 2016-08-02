/**
 * @ngdoc controller
 * @name app:CourseCtrl
 *
 * @description
 *
 *
 * @requires $scope
 * */
angular.module('app')
    .controller('CourseCtrl', ['$scope', '$routeParams', 'Course', function($scope, $routeParams, Course){

    	$scope.course = Course.get({id:1});

}]);
