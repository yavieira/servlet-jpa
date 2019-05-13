package br.com.alura.gerenciador.servlet.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.servlet.dao.EmpresaDAO;
import br.com.alura.gerenciador.servlet.model.Empresa;

public class ListaEmpresas implements BaseAction {

	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		
		EmpresaDAO dao = new EmpresaDAO();
		List<Empresa> lista = dao.getEmpresas();
		req.setAttribute("empresas", lista);
		
		return "forward:listaEmpresas.jsp";
	}
}
