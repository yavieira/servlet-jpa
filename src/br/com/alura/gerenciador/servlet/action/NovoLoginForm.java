package br.com.alura.gerenciador.servlet.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NovoLoginForm implements BaseAction {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {

		return "forward:formNovoUser.jsp";
	}
}
