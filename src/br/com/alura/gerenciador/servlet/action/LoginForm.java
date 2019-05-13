package br.com.alura.gerenciador.servlet.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginForm implements BaseAction {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {

		return "forward:formLogin.jsp";
	}

}
