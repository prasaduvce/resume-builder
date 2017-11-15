var app = angular.module('crudApp', ['ngRoute']);

app.config(function($routeProvider) {
    $routeProvider.when('/', {
        templateUrl: '/templates/home/home.html'
    }).when('/register', {
        templateUrl: '/templates/register/register.html',
        controller: 'UserCRUDController'
    }).when('/login', {
        templateUrl: '/templates/login/login.html'
    }).when('/resumeForm', {
        templateUrl: '/templates/resumeForm/resumeForm.html'
    }).otherwise({
        redirectTo: '/'
    });
});