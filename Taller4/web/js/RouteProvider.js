'use strict';


// Declare app level module which depends on filters, and services
var app = angular.module('adminTaller4', [
    'ngRoute',
    'ngMaterial',
    'angularUtils.directives.dirPagination',
    'adminTaller4.controllers'
]);
app.config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/', {templateUrl: 'partials/menu.html'});
        $routeProvider.when('/Facultad', {templateUrl: 'partials/Facultad.html', controller: 'FacultadCtrl'});
        $routeProvider.when('/Carrera', {templateUrl: 'partials/Carrera.html', controller: 'CarreraCtrl'});
        $routeProvider.when('/Municipio', {templateUrl: 'partials/Municipio.html', controller: 'MunicipioCtrl'});
        $routeProvider.when('/Materia', {templateUrl: 'partials/Materia.html', controller: 'MateriaCtrl'});
        $routeProvider.when('/Estudiante', {templateUrl: 'partials/Estudiante.html', controller: 'EstudianteCtrl'});
        $routeProvider.when('/Profesor', {templateUrl: 'partials/Profesor.html', controller: 'ProfesorCtrl'});
        $routeProvider.when('/Matricula', {templateUrl: 'partials/Matricula.html', controller: 'MatriculaCtrl'});
<<<<<<< HEAD
        $routeProvider.when('/BuscarEstudiante', {templateUrl: 'partials/BuscarEstudiante.html',controller: 'BusquedaCtrl'});
        $routeProvider.when('/BuscarEstudiante/:busqueda', {templateUrl: 'partials/BuscarEstudiante.html',controller: 'BusquedaCtrl'});
=======
        $routeProvider.when('/Horarios', {templateUrl: 'partials/Horarios.html', controller: 'HorariosCtrl'});
>>>>>>> 5170ebf09c71ae22ec15e6f4377e4f6838827057
        
        $routeProvider.otherwise({redirectTo: '/'});
    }]);

var module = angular.module("adminTaller4.controllers", []);
