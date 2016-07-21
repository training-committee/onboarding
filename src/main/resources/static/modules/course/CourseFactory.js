/**
 * @ngdoc service
 * @name app:CourseFactory
 *
 * @description
 *
 *
 * */
angular.module('app')
    .factory('Course', ['$resource', function($resource){

    var Course = $resource('/api/course/:id', {id:'@id'});

    return Course;
}]);
