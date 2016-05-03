angular
    .module('app')
    .controller('CreateCourseCtrl', ['$scope', 'Course', function ($scope, Course) {

        var init = function () {
            $scope.IsMatch = false;
            $scope.course = new Course();

        };

        init();

        $scope.uploading = function () {
            if (($scope.course.title == null) || ($scope.course.videoUrl == null)) {
                if ($scope.course.title == $scope.course.videoUrl) {
                    $scope.IsMatch = true;
                }
                return false;
            } else {
                $scope.IsMatch = false;
                $scope.course.$save();
            }
        };
    }]);
