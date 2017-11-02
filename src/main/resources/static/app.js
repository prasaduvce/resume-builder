var app = angular.module('crudApp', []);

app.controller('UserCRUDController', ['$scope', 'UserCRUDService', function ($scope, UserCRUDService) {
    $scope.addUser = function () {
        if ($scope.user !== null && $scope.user.username ) {
            UserCRUDService.addUser($scope.user.username, $scope.user.name, $scope.user.address, $scope.user.email, $scope.user.mobile)
                .then(function success(response) {
                    $scope.message = 'User added';
                    $scope.errorMessage = '';
                }),
                function error(response) {
                    $scope.errorMessage = 'Error adding user!';
                    $scope.message = '';
                }
        } else {
            $scope.errorMessage = 'Please enter user name';
            $scope.message = '';
        }
    }
}]);