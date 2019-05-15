package br.com.webapp.servlet.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NovaEmpresaForm implements BaseAction {

	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		
		 return "forward:formNovaEmpresa.jsp";
	}
}
