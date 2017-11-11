app.service('UserCRUDService',['$http', function($http) {

    this.getUser = function getUser(userId) {
        return $http({
            method: 'GET',
            url: 'users/'+userId
        });
    };

    this.addUser = function addUser(username, name, address, email, mobile) {
        return $http ({
            method: 'POST',
            url: 'users',
            data: {
                'username': username,
                'name': name,
                'address': address,
                'email': email,
                'mobile': mobile
            }
        });
    };

    this.getAllUsers = function getAllUsers() {
        return $http({
            method: 'GET',
            url: 'users'
        });
    };
}]);