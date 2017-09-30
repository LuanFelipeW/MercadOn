<?php
    $hostname = "localhost";
    $bancodedados = "mercadon";
    $usuario = "root";
    $senha = "";

    $conn = new mysqli($hostname, $usuario, $senha, $bancodedados);
    if ($conn->connect_error) {
        echo "Falha ao conectar: (".$conn->connect_errno.")".$conn->connect_error;
    }

?>