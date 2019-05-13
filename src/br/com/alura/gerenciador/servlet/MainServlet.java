package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.servlet.action.BaseAction;

@WebServlet("/main")
public class MainServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		String actionParam = req.getParameter("action");

		boolean userLogado = (session.getAttribute("userLogado")) != null;
		boolean loginAction = actionParam.equals("LoginForm") || actionParam.equals("LoginAuthentic");
		
		if(!userLogado & !loginAction) {
		    resp.sendRedirect("main?action=LoginForm");
		    return;
		}
		
		String path = "";
		String actionClass = "br.com.alura.gerenciador.servlet.action." + actionParam;

			try {
				Class<?> instance = Class.forName(actionClass);
				BaseAction action = (BaseAction) instance.newInstance();
				path = action.exec(req, resp);
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				throw new ServletException();
			}

			String[] tipoRequest = path.split(":"); // [0] tipo do request [1] path
			if (tipoRequest[0].equals("forward")) {
				RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/view/" + tipoRequest[1]);
				rd.forward(req, resp);
			} else {
				resp.sendRedirect(tipoRequest[1]);
			}
		}
	}