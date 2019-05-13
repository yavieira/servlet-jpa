package br.com.alura.gerenciador.servlet.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.servlet.dao.LoginDAO;
import br.com.alura.gerenciador.servlet.model.User;

public class NovoLogin implements BaseAction {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		String userNameParam = (String) req.getParameter("name");
		String userPassParam = (String) req.getParameter("pass");
		String userPassConfirm = (String) req.getParameter("pass2");

		User user = new User();
		user.setName(userNameParam);
		if (userPassParam.equals(userPassConfirm)) {
			user.setPass(userPassParam);
			new LoginDAO().add(user);
			return "forward:formLogin.jsp";
		} else {
			return "forward:formNovoUser.jsp";
		}
	}
}
