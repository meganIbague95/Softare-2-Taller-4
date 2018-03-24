'use strict';

module.controller('BusquedaCtrl', ['$scope', '$http','$routeParams','$location', function ($scope, $http,$routeParams,$location) {
        $scope.busqueda='';
        $scope.busquedaParams='';
        $scope.listaEstudiantes=[];
        
        if(typeof $routeParams.busqueda !== 'undefined')
            $scope.busquedaParams=$routeParams.busqueda;       
                
                
        
        if($scope.busquedaParams!== ''){
            $scope.busqueda=$scope.busquedaParams;
            $http.get('./webresources/Estudiante/search/' + $scope.busquedaParams, {})
                    .success(function (data, status, headers, config) {
                        $scope.listaEstudiantes = data;
                    }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
            });
        };
        
        
        $scope.buscar=function(){
            if($.trim($scope.busqueda)!='')
                $location.url('/BuscarEstudiante/'+ $scope.busqueda);
        }
    }]);



