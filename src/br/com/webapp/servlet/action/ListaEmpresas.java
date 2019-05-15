package br.com.webapp.servlet.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.webapp.servlet.dao.EmpresaDAO;
import br.com.webapp.servlet.model.Empresa;

public class ListaEmpresas implements BaseAction {

	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		
		EmpresaDAO dao = new EmpresaDAO();
		List<Empresa> lista = dao.getEmpresas();
		req.setAttribute("empresas", lista);
		
		return "forward:listaEmpresas.jsp";
	}
}
