package excecoes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CapturarExcecoes
 */
@WebServlet("/pages/capturarExcecao")
public class CapturarExcecoes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CapturarExcecoes() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String valor =request.getParameter("valor");
			Integer.parseInt(valor);
			response.setStatus(200);
			response.getWriter().write("Processada com sucesso...");
			
		} catch (Exception e) {
			// TODO: handle exception
			response.setStatus(500);//erro interno do servidor
			response.getWriter().write("Processada de forma errada");
		}
		
		
	}

}
