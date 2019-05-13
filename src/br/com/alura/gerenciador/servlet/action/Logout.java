package br.com.alura.gerenciador.servlet.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout implements BaseAction {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {

		HttpSession session = req.getSession();
		session.removeAttribute("userLogado");
		
		return "redirect:main?action=LoginForm";
	}
}
