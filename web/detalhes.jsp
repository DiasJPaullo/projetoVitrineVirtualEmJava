<%-- 
    Document   : Detalhes
    Created on : 27/10/2021, 11:33:50
    Author     : diasj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sobre Produto</title>
        <link href="css/style.css" rel="stylesheet">
    </head>
    <body>
        <h1>Detalhes do Livro</h1>

        <section class="grid3">
            <div class="grid3-item">
                <img src="arquivos/${imgProduto}">
                <h2 id="preco">Preço: ${precoProduto}</h2>
            </div>
            <div class="grid3-item">
                <h3 id="titulo">"${nomeProduto}"</h3>

                <p>
                    "${descricaoProduto}"
                </p>
                <div class="align-right"> <button onclick="myFunction()" id="btn_comprar">Comprar</button> </div>
                <script>
                function myFunction() {
                    if(confirm("Compra Realizado com Sucesso!")){
                    window.location="index.jsp";; 
                    }
                }
                </script>

            </div>

        </section>      

    </body>
</html>
