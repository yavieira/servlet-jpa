package br.com.alura.gerenciador.servlet.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.servlet.dao.EmpresaDAO;
import br.com.alura.gerenciador.servlet.model.Empresa;

public class ListaEmpresas {

	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmpresaDAO dao = new EmpresaDAO();
		List<Empresa> lista = dao.getEmpresas();
		req.setAttribute("empresas", lista);
		RequestDispatcher rd = req.getRequestDispatcher("/listaEmpresas.jsp");
		rd.forward(req, resp);
	}
}