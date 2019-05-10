package br.com.alura.gerenciador.servlet.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.servlet.dao.EmpresaDAO;
import br.com.alura.gerenciador.servlet.model.Empresa;

public class FindEmpresa implements BaseAction {

	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		String paramId = req.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		Empresa empresa = new EmpresaDAO().find(id);
		
		req.setAttribute("empresa", empresa);

		return "forward:formUpdateEmpresa.jsp";		
	}
}
