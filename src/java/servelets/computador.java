
package servelets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "computador", urlPatterns = {"/computador"})
public class computador extends HttpServlet {
  Conexao con = new Conexao();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        float total = Float.parseFloat(request.getParameter("total"));
        float preco = Float.parseFloat(request.getParameter("preco"));
        float consumo = Float.parseFloat(request.getParameter("consumo"));
        
        float valor = total / preco;
        float distancia = total * consumo;
        
        
//        
//            con.conectar();
//            con.Inserir("usuario", "nome", "'" + total + "'"
//            );
//            con.desconectar();
          
        
        
        request.setAttribute("valor", valor);
        request.setAttribute("distancia", distancia);
        
        request.getRequestDispatcher("computador.jsp").forward(request, response);
        
       
    }


}
