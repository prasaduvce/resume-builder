var app = angular.module('crudApp');

app.controller('UserCRUDController', ['$scope', 'UserCRUDService', function ($scope, UserCRUDService) {

    $scope.master = {};

    $scope.addUser = function (user) {
        console.log("$scope.user"+user);
        if (user) {
            $scope.master = angular.copy(user);
            UserCRUDService.addUser($scope.master);
        } else {
            console.log("Null request body, not submitting the form");
        }
    };

    $scope.reset = function (form) {
        if (form) {
            form.$setPristine();
            form.$setUntouched();
        }
        $scope.user = angular.copy($scope.master);
    };

    $scope.reset();
}]);