var app = angular.module('crudApp');

app.controller('UserCRUDController', ['$scope', 'UserCRUDService', function ($scope, UserCRUDService) {

    $scope.master = {};
    $scope.errors = [];

    $scope.addUser = function (user) {
        if (user) {
            $scope.master = angular.copy(user);
            UserCRUDService.addUser($scope.master)
                .success(function(data, status, headers, config) {
                    console.log("POST response from serverdata, , status, headers, config is ===> "+data, status, headers, config);
                    $scope.httpStatus = status;
                }).error(function (data, status, headers, config) {
                    if (data.errorInfos && data.errorInfos.length > 0) {
                        for(var i = 0 ; i < data.errorInfos.length ; i++) {
                            $scope.errors.push(data.errorInfos[i]);
                        }
                    }
                    console.log("$scope.errors. =====> "+$scope.errors);
                });
        } else {
            console.log("Null request body, not submitting the form");
        }
    };

    $scope.reset = function (form) {
        $scope.master = {};
        $scope.errors = [];
        $scope.httpStatus = 0;

        if (form) {
            form.$setPristine();
            form.$setUntouched();
        }
        $scope.user = angular.copy($scope.master);
    };

    $scope.reset();
}]);