var app = angular.module('crudApp');

app.factory('UserCRUDService',['$http', function($http) {
    return {
        getUser: function(userId) {
           return $http.get('users/'+userId);
        },
        addUser: function(user) {
            return $http.post('users', user);
        },
        getAllUsers: function() {
            return $http.get('users');
        }
    }
}]);