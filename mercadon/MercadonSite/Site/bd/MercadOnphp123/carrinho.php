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
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Carrinho de compras</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/estilos.css" rel="stylesheet">

    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

</head>
<body>

<table class="table table-hover tabelacarrinho">
    <tr>
        <td width="88" align="center">Produto</td>
        <td width="88" align="center">Imagem</td>
        <td width="134" align="center">Quantidade</td>
        <td width="77" align="center">Preco</td>
        <td width="65" align="center">Subtotal</td>
        <td width="147" align="center">Remover</td>
    </tr>
    <form action="?acao=up" method="post"/>

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

        $preco = number_format($res['PRECO'],2,',', '.');

        $sub = number_format($res['PRECO']* $quantidade,2,',', '.');

        $total += $res['PRECO'] * $quantidade;




        ?>
            <tr>
                <td align="center"><?php echo $nome ?></td>
                <td align="center"><?php echo "<img style='width: 50px;' src='".$res['imagem']."'>";?></td>
                <?php echo  "<td align='center'><input type='text' size='3' name='prod[$id]' value='$quantidade'/></td>" ?>
                <td align="center"><?php  echo $preco ?></td>
                <td align="center"><?php echo $sub ?></td>
                <?php echo  '<td align="center"><a href="?acao=del&id='.$id.'">Remover</a></td>'; ?>
            </tr>
            <?php

        }

        }

        ?>



        <td><input class="btn btn-success" type="submit" value="Atualizar carrinho"/></td>
        <td></td>
        <td></td>
        <td></td>
        <td id="total">TOTAL R$</td>
        <td id="totalvalor" align="center"><?php echo $total ?></td>
        <tr><td><a href="index.php">Continuar a comprar<a/></td></tr>
</table>




<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>