var app = angular.module('crudApp', ['ngRoute']);

app.config(function($routeProvider) {
    $routeProvider.when('/', {
        templateUrl: '/templates/home.html'
    }).when('/register', {
        templateUrl: '/templates/register.html',
        controller: 'UserCRUDController'
    }).when('/login', {
        templateUrl: '/templates/login.html'
    }).when('/resumeForm', {
        templateUrl: '/templates/resumeForm.html'
    }).otherwise({
        redirectTo: '/'
    });
});