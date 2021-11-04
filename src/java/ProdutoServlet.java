import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dados.Mock;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author diasj
 */
public class ProdutoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           
            String Id = request.getParameter("listaId");
            int index = Integer.parseInt(Id);
            
            Mock produto = new Mock();
            request.setAttribute("nomeProduto", produto.getListaNome().get(index-1));
            request.setAttribute("imgProduto", produto.getListaImagem().get(index+11));
            request.setAttribute("descricaoProduto", produto.getListaDescricao().get(index-1));
            request.setAttribute("precoProduto", produto.getListaPreco().get(index-1));
            RequestDispatcher rd=request.getRequestDispatcher("/detalhes.jsp");
            response.setCharacterEncoding("UTF-8");
            rd.include(request, response); 
    }


}
