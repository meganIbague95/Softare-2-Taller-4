'use strict';

module.controller('MatriculaCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
        //listar
        $scope.lista = [];
        $scope.datosFormulario = {};
        $scope.panelEditar = true;
        
        
        
        
        $scope.listaAnios = [ ];        
        for(var i=(new Date).getFullYear(); i>=1953; i--){
            $scope.listaAnios.push(i);
        }
        
        $scope.listaEstudiantes=[];        
        $scope.cargarEstudiantes = function () {
            $http.get('./webresources/Estudiante', {})
                    .success(function (data, status, headers, config) {
                        $scope.listaEstudiantes = data;
                    }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
            });
        };        
        $scope.cargarEstudiantes();
        
        $scope.listaMaterias=[];
        $scope.cargarMaterias = function () {
            $http.get('./webresources/Municipio', {})
                    .success(function (data, status, headers, config) {
                        $scope.listaMaterias = data;
                    }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
            });
        };  
        $scope.cargarMaterias();
        
        
        
        
        
        
        $scope.listar = function () {
            $http.get('./webresources/Matricula', {})
                    .success(function (data, status, headers, config) {
                        $scope.lista = data;
                    }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
            });
        };

        
        //$scope.listar();
        //guardar
        $scope.nuevo = function () {
            $scope.panelEditar = true;
            $scope.datosFormulario = {};
        };

        $scope.guardar = function () {
            $scope.errores = {};
            var error = false;
            
            $http.post('./webresources/Matricula', JSON.stringify($scope.datosFormulario), {}
            ).success(function (data, status, headers, config) {
                alert("Los datos han sido guardados con Exito");
                $scope.panelEditar = false;
                $scope.listar();
            }).error(function (data, status, headers, config) {
                alert('Error al guardar la informaci\xf3n, por favor intente m\xe1s tarde');
            });
        };
        $scope.cancelar = function () {
            $scope.panelEditar = false;
            $scope.datosFormulario = {};
        };

        //editar
        $scope.editar = function (data) {
            $scope.panelEditar = true;
            $scope.datosFormulario = data;
        };
        //eliminar
        $scope.eliminar = function (data) {
            if (confirm('\xbfDesea elminar este registro?')) {
                $http.delete('./webresources/Matricula/' + data.id, {})
                        .success(function (data, status, headers, config) {
                            $scope.listar();
                        }).error(function (data, status, headers, config) {
                    alert('Error al eliminar la informaci\xf3n de Materia, por favor intente m\xe1s tarde');
                });
            }
        };
    }]);


