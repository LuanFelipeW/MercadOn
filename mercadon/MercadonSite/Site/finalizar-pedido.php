<?php include ("php/conexaobd.php");

$total = isset($_POST['vtotal'])?$_POST['vtotal']:"2";

$descontoavista= $total - ($total*0.10);
$fretec= number_format($total*0.1,2,",",".");
$fretem= number_format($total*0.2,2,",",".");
$cartaocredito1 = number_format($total/12,2,",",".");
$cartaocredito2 = number_format($total/10,2,",",".");
$cartaocredito3 = number_format($total/6,2,",",".");
$cartaocredito4 = number_format($total/5,2,",",".");
$cartaocredito5 = number_format($total/3,2,",",".");
$cartaocredito6 = number_format($total/2,2,",",".");
$cartaocredito7 = number_format($total/1,2,",",".");


?>

<!DOCTYPE html>
<html lang="pt-BR">
<head>

    <meta charset="UTF-8">
    <link href="css/estilos.css" rel="stylesheet"/>
    <link href="css/bootstrap.min.css" rel="stylesheet"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" href="imgs/favicon.ico" />
    <link href="css/menu.css" rel="stylesheet"/>

    <title>MercadOn</title>
</head>
<body class="plano-de-fundo">
<div class="container-fluid">

    <!-- NAVBAR -->
    <header class="cabecalho">
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand logo-topo" href="index.php"><img src="imgs/logo.png" height=30px alt="Dispute Bills"></a>
                </div>



                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <form class="navbar-form navbar-left" method="get" action="php/resultado.php">
                        <div class="form-group">
                            <input type="text" style="width: 270px; position: relative; margin-left: 70%; z-index: 3"  class="form-control" name="procura" placeholder="Pesquisar produto" >
                        </div>
                        <button type="submit" style="width: auto; height: auto; margin-left: 150px; position: relative; z-index: 4" class="btn btn-default">Pesquisar</button>
                    </form>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#" data-toggle="modal" data-target="#modal_acessar">Acessar</a></li>
                        <li><a href="carrinho.php">Carrinho</a></li>
                    </ul>

                </div><!-- /.container-fluid -->
            </div>
        </nav>

        <!--CAROUSEL-->

        <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                <li data-target="#carousel-example-generic" data-slide-to="3"></li>
            </ol>

            <!-- Wrapper for slides -->
            <div class="carousel-inner imagem" role="listbox">
                <div class="item active">
                    <img src="imgs/carousel/ofertas1.jpg" alt="...">
                    <div class="carousel-caption">

                    </div>
                </div>
                <div class="item imagem">
                    <img src="imgs/carousel/ofertas2.jpg" alt="...">
                    <div class="carousel-caption">

                    </div>
                </div>

                <div class="item imagem">
                    <img src="imgs/carousel/ofertas3.jpg" alt="...">
                    <div class="carousel-caption">

                    </div>
                </div>
                <div class="item imagem">
                    <img src="imgs/carousel/ofertas4.jpg" alt="...">
                    <div class="carousel-caption">

                    </div>
                </div>

            </div>

            <!-- Controls -->
            <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>

        </div>

        <!-- MENU PRINCIPAL -->
        <input type="checkbox" id="bt_menu">
        <label for="bt_menu">&#9776;</label>


        <nav class="menu">
            <ul>

                <li><a href="#">Mercearia</a>
                    <ul>
                        <li><a href="http://127.0.0.1/Site/php/resultado.php?procura=acucar">Açúcar</a></li>
                        <li><a href="http://127.0.0.1/Site/php/resultado.php?procura=ole">Azeites e óleos</a></li>
                        <li><a href="http://127.0.0.1/Site/php/resultado.php?procura=biscoito">Biscoitos</a></li>
                        <li><a href="http://127.0.0.1/Site/php/resultado.php?procura=leite">Leites</a></li>
                        <li><a href="#">Gelatinas, Misturas para Bolos & Cia.</a></li>
                        <li><a href="#">Cestas</a></li>
                        <li><a href="#">Chocolates, doces e salgadinhos</a></li>
                        <li><a href="#">Conservas e enlatados</a></li>
                        <li><a href="#">Cremes de Leite e Leites Condensados</a></li>
                        <li><a href="#">Frutas Cecas e Castanhas</a></li>


                    </ul>
                </li>
                <li><a href="#">Bebibas</a>
                    <ul>
                        <li><a href="http://127.0.0.1/Site/php/resultado.php?procura=cerveja">Cervejas</a></li>
                        <li><a href="http://127.0.0.1/Site/php/resultado.php?procura=agua">Águas</a></li>
                        <li><a href="http://127.0.0.1/Site/php/resultado.php?procura=refrigerante">Refrigerantes</a></li>
                        <li><a href="#">Chás e Mates</a></li>
                        <li><a href="#">Energéticos e Isotônicos</a></li>
                        <li><a href="#">Orgânicas</a></li>
                        <li><a href="#">Orientais</a></li>
                        <li><a href="#">Vinhos e Espumantes</a></li>
                    </ul>
                </li>
                <li><a href="#">Carnes</a>
                    <ul>
                        <li><a href="http://127.0.0.1/Site/php/resultado.php?procura=carne">Bovinos</a></li>
                        <li><a href="#">Aves</a></li>
                        <li><a href="#">Carnes Exóticas</a></li>
                        <li><a href="#">Linguiças</a></li>
                        <li><a href="#">Peixes e Frutos do Mar</a></li>
                        <li><a href="#">Suínos</a></li>
                    </ul>
                </li>
                <li><a href="#">Frios</a>
                    <ul>
                        <li><a href="http://127.0.0.1/Site/php/resultado.php?procura=margarina">Manteigas, Margarinas e Requeijões</a></li>
                        <li><a href="http://127.0.0.1/Site/php/resultado.php?procura=pizza">Congelados</a></li>
                        <li><a href="http://127.0.0.1/Site/php/resultado.php?procura=fatia">Embutidos e Defumados</a></li>
                        <li><a href="#">Iogurtes e Sobremesas</a></li>
                        <li><a href="#">Massas Frescas</a></li>
                        <li><a href="#">Pães e Bolos Congelados</a></li>
                        <li><a href="#">Queijos</a></li>
                    </ul>
                </li>
                <li><a href="#">Hortifruti</a>
                    <ul>
                        <li><a href="http://127.0.0.1/Site/php/resultado.php?procura=fruta">Frutas</a></li>
                        <li><a href="http://127.0.0.1/Site/php/resultado.php?procura=alface">Alface</a></li>
                        <li><a href="#">Verduras</a></li>
                        <li><a href="#">Legumes</a></li>
                        <li><a href="#">Orgânicos</a></li>

                    </ul>
                </li>
                <li><a href="#">Padaria</a>
                    <ul>
                        <li><a href="http://127.0.0.1/Site/php/resultado.php?procura=biscoito">Biscoitos e Rosquinhas</a></li>
                        <li><a href="http://127.0.0.1/Site/php/resultado.php?procura=bolo">Bolos e Confeitaria</a></li>
                        <li><a href="#">Pães</a></li>
                        <li><a href="#">Pães de Queijo</a></li>
                        <li><a href="#">Panetones</a></li>
                        <li><a href="#">Salgados</a></li>
                    </ul>
                </li>
                <li><a href="#">Perfumaria</a>
                    <ul>
                        <li><a href="http://127.0.0.1/Site/php/resultado.php?procura=absorve">Absorventes e Higiene Íntima</a></li>
                        <li><a href="http://127.0.0.1/Site/php/resultado.php?procura=cot">Algodões, Hastes Flexíveis e Curativos</a></li>
                        <li><a href="http://127.0.0.1/Site/php/resultado.php?procura=desodorante">Desodorantes</a></li>
                        <li><a href="http://127.0.0.1/Site/php/resultado.php?procura=xampu">Xampu</a></li>
                        <li><a href="#">Fraldas Geriátricas</a></li>
                        <li><a href="#">Higiene Oral</a></li>
                        <li><a href="#">Infantil e Fraldas</a></li>
                        <li><a href="#">Lenços</a></li>
                        <li><a href="#">Pápeis Higiênicos</a></li>
                        <li><a href="#">Para a Gestante</a></li>
                    </ul>
                </li>
                <li><a href="#">Limpeza</a>
                    <ul>
                        <li><a href="http://127.0.0.1/Site/php/resultado.php?procura=lava">Para Toda a Casa</a></li>
                        <li><a href="http://127.0.0.1/Site/php/resultado.php?procura=limpador">Limpador</a></li>
                        <li><a href="http://127.0.0.1/Site/php/resultado.php?procura=amaciante">Amaciante</a></li>
                        <li><a href="http://127.0.0.1/Site/php/resultado.php?procura=inseticida">Inseticidas</a></li>
                        <li><a href="http://127.0.0.1/Site/php/resultado.php?procura=repelente">Repelente</a></li>
                        <li><a href="#">Para o Banheiro</a></li>

                    </ul>
                </li>
            </ul>
        </nav>
    </header>

    <!-- FUNDO PRETO TRANSPARENTE -SEÇÃO PRINCIPAL -->

    <section class="conteudo-corpo">

        <div class="row artigos-produtos">
            <div class="col-md-9 fundo-branco-transparente">
                <div class="row">
                <img class="img-responsive" src="imgs/finalizar-pedido/formaspgto.jpg" id="imagem-pgmto" ">
                </div>

                <div class="col-md-8 pgto">
                    <img src="imgs/finalizar-pedido/icone_frete.png" class=img-responsive>
                    <div class="radio">
                        <label>
                            <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked>
                            <strong>Transporte do MERCADO <?php echo 'R$'.$fretec ?></strong> &mdash; modo tradicional de trasporte.
                        </label>
                    </div>
                    <div class="radio">
                        <label>
                            <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">
                            <strong>Transportadora PARTICULAR <?php echo 'R$'.$fretem ?></strong> &mdash; modo mais rápido de transporte.
                        </label>
                        <h4 class="entrega">ENDEREÇO DE ENTREGA</h4>
                        <select class="form-control">
                            <option>Rua Stein n° 53 Itoupava, Centro</option>
                            <option>Rua Alameda nº 23, Centro</option>
                            <option>Rua Rodolfo Arlindo nº 54, Velha</option>
                        </select>
                        <h4 class="entrega">OBSERVAÇÕES PARA ENTREGA</h4>
                        <textarea class="form-control" rows="3"></textarea>

                    </div>
                </div>

                <div class="col-md-4 pagamento4">
                    <h4 class="entrega">FORMA DE PAGAMENTO</h4>
                    <hr align="center" width="90%" size="1" color=red>
                    <h5 class="entrega">&nbsp &nbsp &nbspCARTÃO DE CRÉDITO</h5>
                    <label class="radio-inline">
                        <input type="radio" name="frete_proprio" id="inlineRadio1" id="mostraproprio" value="mostrar_proprio" id="proprio1" onclick="mostra_proprio()"><img src="imgs/finalizar-pedido/mastercard.jpg">
                    </label>
                    <label class="radio-inline">
                        <input type="radio" name="frete_proprio" id="inlineRadio2" value="mostrar_proprio" id="proprio2" onclick="mostra_proprio()"><img src="imgs/finalizar-pedido/visa.jpg">
                    </label>
                    <label class="radio-inline">
                        <input type="radio" name="frete_proprio" id="inlineRadio3" value="mostrar_proprio" id="proprio3" onclick="mostra_proprio()"><img src="imgs/finalizar-pedido/american-express.jpg">
                    </label><br/><br/>
                    <label class="radio-inline">
                        <input type="radio" name="frete_proprio" id="inlineRadio3" value="mostrar_proprio" id="proprio4" onclick="mostra_proprio()"><img src="imgs/finalizar-pedido/elo.jpg">
                    </label>&nbsp
                    <label class="radio-inline">
                        <input type="radio" name="frete_proprio" id="inlineRadio3" value="mostrar_proprio" id="proprio5" onclick="mostra_proprio()"><img src="imgs/finalizar-pedido/hipercard.jpg">
                    </label>
                    <label class="radio-inline">
                        <input type="radio" name="frete_proprio" id="inlineRadio3" value="mostrar_proprio" id="proprio6" onclick="mostra_proprio()"><img src="imgs/finalizar-pedido/paypal.jpg">
                    </label>
                    <hr align="center" width="90%" size="1" color=red>
                    <label class="radio-inline">
                     <h5 class="entrega">PAGAMENTO À VISTA</h5>
                        <input type="radio" name="frete_proprio" id="inlineRadio3" value="mostrar_correios" id="proprio7" onclick="mostrar_correios()"><img src="imgs/finalizar-pedido/boleto.jpg">
                    </label>
                </div>
                <div class="container-fluid infocartao">
                    <script>
                        function mostra_proprio()
                        {

                            document.getElementById('mostrar_proprio').style.display=" block";
                        }
                        function mostra__correio()
                        {
                            document.getElementById('mostrar_correios').style.display="block";
                        }
                    </script>

                    <div class="col-md-8 conteudopagamento">
                    <label id="mostrar_proprio" for="mostraproprio" style="display: none">

                        <h4>Digite o nome do proprietário do cartão</h4>
                        <input type="text" class="form-control" placeholder="Ex: MARCOS ANTONIO JR">


                        <h4>Digite o número do cartão</h4>
                        <input type="text" class="form-control" placeholder="0000-0000-0000-0000">

                        <h4>Escolha em quantas vezes irá pagar</h4>
                        <select class="form-control input-sm">
                            <option><?php echo '(12x)'.'R$ '.$cartaocredito1 ?></option>
                            <option><?php echo '(10x)'.'R$ '.$cartaocredito2 ?></option>
                            <option><?php echo '(6x)'.'R$ '.$cartaocredito3 ?></option>
                            <option><?php echo '(5x)'.'R$ '.$cartaocredito4 ?></option>
                            <option><?php echo '(3x)'.'R$ '.$cartaocredito5 ?></option>
                            <option><?php echo '(2x)'.'R$ '.$cartaocredito6 ?></option>
                            <option><?php echo '(1x)'.'R$ '.$cartaocredito7 ?></option>
                        </select><br/>

                        <h4>Digite o número de segurança</h4>
                        <input type="text" class="form-control" placeholder="Ex: 345"><br/>

                        <script type="text/javascript">
                            function redirecionar(){
                                alert("Pedido Finalizado");
                                window.location="index.php";
                            }
                        </script>
                        <button class="btn btn-info" onclick="redirecionar();">Clique aqui</button>

                    </label>

                </div>
    </section>

    <!-- EXEMPLO MODAL 1 -->

    <div class="modal fade" tabindex="-1" role="dialog" id="modal_acessar">
        <div class="modal-dialog modal-sm" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">Login</h4>
                </div>
                <div class="modal-body">
                    <form>
                        <div class="form-group">
                            <label for="exampleInputEmail1">Endereço de e-mail</label>
                            <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Email">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputPassword1">Senha</label>
                            <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <p><a href="#" data-toggle="modal" data-target="#modal_cadastrar" id="cadastro">Cadastre-se</a></p>
                    <button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
                    <button type="button" class="btn btn-success">Acessar</button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->

    <!-- EXEMPLO MODAL 2 -->

    <div class="modal fade" tabindex="-1" role="dialog" id="modal_cadastrar">
        <div class="modal-dialog modal-lg" role="document">
            <div class="modal-content modalCadastro">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">Cadastro</h4>
                </div>
                <div class="modal-body setor_principal_cadastro">
                    <form class="form">
                        <div class="form-group">
                            <label for="exampleInputName2">Nome</label>
                            <input type="text" class="form-control" id="exampleInputName2" placeholder="Escreva Seu nome aqui">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputName3">Sobrenome</label>
                            <input type="text" class="form-control" id="exampleInputName3" placeholder="Escreva seu sobrenome aqui">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputEmail4">Email</label>
                            <input type="email" class="form-control" id="exampleInputEmail4" placeholder="seuemail@provedor">
                        </div>
                        <div class="row">
                            <div class="form-group col-md-5">
                                <label for="exampleInputPassword2">Senha</label>
                                <input type="password" class="form-control" id="exampleInputPassword2" placeholder="Password">
                            </div>
                            <div class="form-group col-md-5">
                                <label for="exampleInputPassword3">Confirme Sua Senha</label>
                                <input type="password" class="form-control" id="exampleInputPassword3" placeholder="Password">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="exampleInputName5">Data de nascimento</label>
                            <input type="datetime-local" class="form-control" id="exampleInputName5" placeholder="Jane Doe">
                        </div>
                        <label>Sexo</label>
                        <div class="checkbox">
                            <label>
                                <input type="radio"  name="inlineRadioOptions" id="inlineRadio1" value="option1" checked> Masculino
                            </label>
                        </div>
                        <div class="checkbox">
                            <label>
                                <input type="radio"  name="inlineRadioOptions" id="inlineRadio2" value="option2"> Feminino
                            </label>
                        </div>
                        <div class="row">
                            <div class="col-xs-3">
                                <label for="cep">CEP</label>
                                <input type="text" class="form-control" id="cep" placeholder="00000-000" maxlength="9" size="10" >
                            </div>
                            <div class="col-xs-6">
                                <label for="rua">Rua</label>
                                <input type="text" class="form-control" id="rua" placeholder="Ex: Nereu Ramos" >
                            </div>
                            <div class="col-sm-4 col-md-3 col-xs-5">
                                <label for="num">Número</label>
                                <input type="text" class="form-control" id="num" placeholder="Ex: 9999" >
                            </div>
                        </div>
                        <div class="row bairro">
                            <div class="col-xs-7">
                                <label for="bairro">Bairro</label>
                                <input type="text" class="form-control" id="bairro" placeholder="Ex: Centro" >
                            </div>
                            <div class="form-group col-xs-5">
                                <label for="cidade">Cidade</label>
                                <input type="text" class="form-control" id="cidade" placeholder="Rio de Janeiro">
                            </div>
                            <div class="form-group col-xs-8">
                                <label for="estado">Estado</label>
                                <input type="text" class="form-control" id="estado" placeholder="Ex: Santa Catarina">
                            </div>
                            <div class="form-group col-xs-4">
                                <label for="complem">Complemento</label>
                                <input type="text" class="form-control" id="complem" placeholder="Ex: Ap. 501">
                            </div>
                        </div>

                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-danger" data-dismiss="modal">Cancelar</button>
                    <button type="button" class="btn btn-success">Cadastrar-se</button>
                </div>
            </div>
        </div>
    </div>




    <footer>
        <div class="row">
            <div class="rodape">
                <p id="rodapenome"><br/><strong>Mercadon, proibido a copia parcial ou completa, 2017</strong></p>
            </div>
        </div>
    </footer>

</div> <!--FIM DO CONTAINER PRINCIPAL -->

<script src="js/jquery-1.11.3.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>