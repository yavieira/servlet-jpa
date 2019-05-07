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
@WebServlet("/findEmpresa")
public class FindEmpresaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		String paramId = req.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		Empresa empresa = new EmpresaDAO().find(id);
		
		req.setAttribute("empresa", empresa);

		RequestDispatcher rd = req.getRequestDispatcher("/formUpdateEmpresa.jsp");
		rd.forward(req, resp);
	}
}
