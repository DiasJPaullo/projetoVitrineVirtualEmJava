<%-- 
    Document   : index
    Created on : 26/10/2021, 15:52:55
    Author     : diasj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Loja JPDias</title>
        <link href="css/bootstrap.css" rel="stylesheet">
    </head>
    <body>
        
        <div class="container theme-showcase" role="main">
            <div class="page-header">
                <h1>Estantes de Livros</h1>
            </div>
            <c:import url="Grid.jsp" /> 
        </div>
            
    
        
        
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="js/bootstrap.min.js"></script
    </body>
</html>
