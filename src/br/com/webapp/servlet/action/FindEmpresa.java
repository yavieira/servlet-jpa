package br.com.webapp.servlet.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.webapp.servlet.dao.EmpresaDAO;
import br.com.webapp.servlet.model.Empresa;

public class FindEmpresa implements BaseAction {

	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		String paramId = req.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		Empresa empresa = new EmpresaDAO().find(id);
		
		req.setAttribute("empresa", empresa);

		return "forward:formUpdateEmpresa.jsp";		
	}
}
