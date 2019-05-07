package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.dao.EmpresaDAO;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/removeEmpresa")
public class RemoveEmpresaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		String paramId = req.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		EmpresaDAO dao = new EmpresaDAO();
		dao.removeEmpresa(id);

		resp.sendRedirect("listaEmpresas"); //redirect suporte várias requisições
	}

}
