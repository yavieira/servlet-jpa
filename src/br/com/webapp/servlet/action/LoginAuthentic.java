package br.com.webapp.servlet.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.webapp.servlet.dao.LoginDAO;
import br.com.webapp.servlet.model.User;

public class LoginAuthentic implements BaseAction {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {

		String userNameParam = (String) req.getParameter("name");
		String userPassParam = (String) req.getParameter("pass");
		
		User user = new LoginDAO().find(userNameParam);

		if (user != null) {
			if (user.getName().equals(userNameParam) && user.getPass().equals(userPassParam)) {
				HttpSession session = req.getSession();
				session.setAttribute("userLogado", user);
				return "redirect:main?action=ListaEmpresas";
			} else {
				return "redirect:main?action=LoginForm";
			}
		}
		return "";
	}
}
