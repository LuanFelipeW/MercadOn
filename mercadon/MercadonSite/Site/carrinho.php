<?php include ("php/conexaobd.php");
session_start();
if(!isset($_SESSION['carrinho'])){

    $_SESSION['carrinho'] = array();
}
if(isset($_GET['acao'])){
 //ADICIONAR NO CARRINHO
    if($_GET['acao'] == 'add'){

        $id = intval($_GET['id']);

        if(!isset($_SESSION['carrinho'][$id])){

            $_SESSION['carrinho'][$id] = 1;

        }else {
            require ("php/conexaobd.php");

            $_SESSION['carrinho'][$id] += 1;

        }

    }

 //DELETAR DO CARRINHO
    if($_GET['acao'] == 'del'){

        $id = intval($_GET['id']);

        if(isset($_SESSION['carrinho'][$id])){

            unset($_SESSION['carrinho'][$id]);
        }
    }

    if($_GET['acao'] == 'up'){

        if(is_array($_POST['prod'])){
            foreach($_POST['prod'] as $id => $quantidade){

                $id = intval($id);
                $quantidade = intval($quantidade);

                if(!empty($quantidade) || $quantidade <> 0){

                    $_SESSION['carrinho'][$id] = $quantidade;

                } else {
                    unset($_SESSION['carrinho'][$id]);
                }
            }
        }
    }
}


?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <title>Carrinho de compras</title>
    <link href="css/bootstrap.min.css" rel="stylesheet"/>
    <link href="css/estilos.css" rel="stylesheet"/>

</head>
<body class="corpo-carrinho">


<table class="table table-hover tabelacarrinho">
    <tr class="titulomenu">
        <td width="88" align="center">Produto</td>
        <td width="88" align="center">Supermercados</td>
        <td width="88" align="center">Imagem</td>
        <td width="134" align="center">Quantidade</td>
        <td width="77" align="center">Preço</td>
        <td width="65" align="center">Subtotal</td>
        <td width="147" align="center">Remover</td>
    </tr>
    <form action="?acao=up" method="post">

        <?php

        if(count($_SESSION['carrinho']) == 0){

        } else {
        $total = 0;
        foreach($_SESSION['carrinho'] as $id => $quantidade){

        $select = "SELECT * FROM produtos WHERE ID='$id'";

        $query = mysqli_query($conn, $select);

        $res = mysqli_fetch_assoc($query);

        $nome = $res['PRODUTO'];

        $imagens = $res['imagem'];

        $mercado = $res['SUPERMERCADO'];

        $preco = number_format($res['PRECO'],2,',', '.');

        $sub = number_format($res['PRECO']* $quantidade,2,',', '.');

        $total += $res['PRECO'] * $quantidade;

              ?>
            <tr>
                <td align="center"><?php echo $nome ?></td>
                <td align="center" style="color: #985f0d; font-weight: bolder"><?php echo $mercado ?></td>
                <td align="center"><?php echo "<img style='width: 50px;' src='".$res['imagem']."'>";?></td>
                <?php echo  "<td align='center'><input type='text' size='3' name='prod[$id]' value='$quantidade'/></td>" ?>
                <td align="center"><?php  echo $preco ?></td>
                <td align="center"><?php echo $sub ?></td>
                <?php echo  '<td align="center"><a class="btn btn-danger" href="?acao=del&id='.$id.'" role="button"><span class="glyphicon glyphicon-trash"> Remover</span></a></td>'; ?>

            </tr>
            <?php

        }

        }

        ?>

        <td><button a class="btn btn-warning" href="#" role="button"><span class="glyphicon glyphicon-refresh"> Atualizar</span></button></td>

        <td id="total" colspan="5" align="right">TOTAL</td>
        <td id="totalvalor" align="center"><?php echo 'R$ '.$total ?></td>
        <tr><td colspan="2" align="left"><a class="btn btn-warning" href="index.php" role="button">VOLTAR PARA LOJA</a></form></td><td colspan="6" align="right"><?php echo('<form action="finalizar-pedido.php" method="post">'); ?>
        <?php echo('<input type="hidden" name="vtotal" value="'. $total .'" />'); ?>
        <?php echo "<input class='btn btn-success' type='submit' value='FINALIZAR PEDIDO'>"; ?>
        <?php echo "</form>"; ?></td></tr>








    </form>
</table>




<script src="js/jquery-1.11.3.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>