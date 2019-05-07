package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.dao.EmpresaDAO;
import br.com.alura.gerenciador.modelo.Empresa;
import br.com.alura.gerenciador.util.Util;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/updateEmpresa")
public class UpdateEmpresaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		String idParam = req.getParameter("id");
		String nomeParam = req.getParameter("nome");
		String dataParam = req.getParameter("dataAbertura");
		Integer id = Integer.valueOf(idParam);
		
		Date dataAbertura = new Util().formatStringToDate(dataParam);
		
		Empresa empresa = new EmpresaDAO().find(id);
		empresa.setNome(nomeParam);
		empresa.setDataAbertura(dataAbertura);
		new EmpresaDAO().updateEmpresa(empresa);
		resp.sendRedirect("listaEmpresas");
	}
}
