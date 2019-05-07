package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.alura.gerenciador.dao.EmpresaDAO;
import br.com.alura.gerenciador.modelo.Empresa;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String nomeEmpresa = req.getParameter("nome"); //Retorna SEMPRE String
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		EmpresaDAO dao = new EmpresaDAO();
		dao.addEmpresa(empresa);

		//Chama Jsp
//		RequestDispatcher rd = req.getRequestDispatcher("/listaEmpresas"); //dispatcher só é válido para uma requisição
//		req.setAttribute("nomeEmpresa", empresa.getNome());
//		req.setAttribute("dataAbertura", empresa.getDataAbertura());
//		rd.forward(req, resp);
		
		resp.sendRedirect("listaEmpresas"); //redirect suporte várias requisições
	}

}
