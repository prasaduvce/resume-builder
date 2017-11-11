var app = angular.module('crudApp', []);

app.controller('UserCRUDController', ['$scope', 'UserCRUDService', function ($scope, UserCRUDService) {

    $scope.addUser = function () {
     console.log("$scope.user"+$scope.user);
        if ($scope.user !== null && $scope.user.username ) {
            UserCRUDService.addUser($scope.user)
                .success(function(data, status, headers, config) {
                    $scope.message = 'User added';
                                        $scope.errorMessage = '';
                }).error(function(data, status, headers, config) {
                    $scope.errorMessage = 'Error adding user!';
                    $scope.message = '';
                });
        } else {
            $scope.errorMessage = 'Please enter user name';
            $scope.message = '';
        }
    }
}]);