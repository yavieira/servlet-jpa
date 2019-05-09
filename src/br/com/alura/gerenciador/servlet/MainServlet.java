package br.com.alura.gerenciador.servlet;

import java.io.IOException;

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
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {

		String actionParam = req.getParameter("action");

		if (actionParam.equals("FindEmpresa")) {

			FindEmpresa action = new FindEmpresa();
			action.exec(req, resp);

		} else if (actionParam.equals("ListaEmpresas")) {

			ListaEmpresas action = new ListaEmpresas();
			action.exec(req, resp);

		} else if (actionParam.equals("NovaEmpresa")) {

			NovaEmpresa action = new NovaEmpresa();
			action.exec(req, resp);

		} else if (actionParam.equals("UpdateEmpresa")) {

			UpdateEmpresa action = new UpdateEmpresa();
			action.exec(req, resp);

		} else if (actionParam.equals("RemoveEmpresa")) {

			RemoveEmpresa action = new RemoveEmpresa();
			action.exec(req, resp);
		}
	}
}
