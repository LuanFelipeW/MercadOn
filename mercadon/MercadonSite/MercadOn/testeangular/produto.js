angular.module("MercadonApp", [])
    .value('urlBase', 'http://localhost:9090/signoWeb/rest/')
    .controller("ProdutoController", function ($http, urlBase) {

        var self = this;
        self.usuario = 'Luiz Carlos Jr';

        self.produtos = [];
        self.produto = undefined;


        self.selecionarProdutos = function () {
            $http({
                method: 'GET',
                url: urlBase + 'produtos/'
            }).then(function successCallback(response) {
                self.produtos = response.data;
                self.produto = undefined;
            }, function errorCallback(response) {
                self.ocorreuErro();
            });
        };

        self.activate = function () {
            self.selecionarProdutos();
        };
        self.activate();
    });;