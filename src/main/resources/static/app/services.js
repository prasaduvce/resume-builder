var app = angular.module('crudApp');

app.factory('UserCRUDService',['$http', function($http) {
    return {
        getUser: function(userId) {
            $http.get('users/'+userId).success(function (data) {
                console.log("GET response from server, data is ===> "+data);
            });
        },
        addUser: function(user) {
             $http.post('users', user)
                 .success(function(data, status, headers, config) {
                 console.log("POST response from serverdata, , status, headers, config is ===> "+data, status, headers, config);
             }).error(function (data, status, headers, config) {
                 console.log("Error while invoking post USER response data, status, headers, config is ==> "+data, status, headers, config);
             });
        },
        getAllUsers: function() {
            return $http.get('users');
        }
    }
}]);