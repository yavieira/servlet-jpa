package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
		System.out.println("Cadastrando empresa");
		String nomeEmpresa = req.getParameter("nome"); //Retorna SEMPRE String
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		EmpresaDAO dao = new EmpresaDAO();
		dao.addEmpresa(empresa);
		
		RequestDispatcher rd = req.getRequestDispatcher("/empresaCadastrada.jsp");
		req.setAttribute("nomeEmpresa", empresa.getNome());
		rd.forward(req, resp);
	}

}
