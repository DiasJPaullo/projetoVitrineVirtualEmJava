<%-- 
    Document   : Grid
    Created on : 26/10/2021, 22:45:23
    Author     : diasj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <jsp:useBean id="produto" class="dados.Mock"></jsp:useBean>
 
 <div class="row">
    <c:forEach var="index" items="${produto.listaId}">
       <div class="col-sm-6 col-md-4">
            <div class="thumbnail">
                <div class="card" style="width: 34rem;">


                            <c:set var= "url" value="arquivos/produto${index}.jpg"/> 
                            <center>

                               <img src= "${url}" width="220" height="auto" alt="...">

                            </center>  

                            <div class="card-body">
                                <div class="caption text-center">
                                   <h4 class="card-title"> ${produto.listaNome.get(index-1)} </h4> 

                                   <h3> <b style="color:#FF0000;">Preço:</b> ${produto.listaPreco.get(index-1)} </h3>

                                   <form action="ProdutoServlet" method="post">
                                        <input type="hidden" name="listaId" name="detalhes" value="${index}">
                                        <button type="submit" class="btn btn-info">mais detalhes </button> 
                                   </form>

                                </div>

                            </div>
                    </div>
                </div>
                                  
       </div>
    </c:forEach>
</div>