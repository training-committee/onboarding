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
    .controller('CourseCtrl', ['$scope', '$routeParams', 'Course', '$sce', function($scope, $routeParams, Course, $sce){

    	$scope.course = Course.get({id:1});



    	 $scope.trustSrc = function(src) {
    		return $sce.trustAsResourceUrl(src);
  		};

}]);
