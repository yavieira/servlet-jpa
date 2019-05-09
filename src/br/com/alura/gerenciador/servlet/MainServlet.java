package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.servlet.action.FindEmpresa;
import br.com.alura.gerenciador.servlet.action.ListaEmpresas;
import br.com.alura.gerenciador.servlet.action.NovaEmpresa;
import br.com.alura.gerenciador.servlet.action.RemoveEmpresa;
import br.com.alura.gerenciador.servlet.action.UpdateEmpresa;

@WebServlet("/main")
public class MainServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String actionParam = req.getParameter("action");
		String path = "";

		if (actionParam.equals("FindEmpresa")) {

			FindEmpresa action = new FindEmpresa();
			path = action.exec(req, resp);

		} else if (actionParam.equals("ListaEmpresas")) {

			ListaEmpresas action = new ListaEmpresas();
			path = action.exec(req, resp);

		} else if (actionParam.equals("NovaEmpresa")) {

			NovaEmpresa action = new NovaEmpresa();
			path = action.exec(req, resp);

		} else if (actionParam.equals("UpdateEmpresa")) {

			UpdateEmpresa action = new UpdateEmpresa();
			path = action.exec(req, resp);

		} else if (actionParam.equals("RemoveEmpresa")) {

			RemoveEmpresa action = new RemoveEmpresa();
			path = action.exec(req, resp);
		}

		String[] tipoRequest = path.split(":"); //[0] tipo do request [1] path 
		if (tipoRequest[0].equals("forward")) {
			RequestDispatcher rd = req.getRequestDispatcher(tipoRequest[1]);
			rd.forward(req, resp);
		} else {
			resp.sendRedirect(tipoRequest[1]);
		}
	}
}
