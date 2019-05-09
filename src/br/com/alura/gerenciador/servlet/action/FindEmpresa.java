package br.com.alura.gerenciador.servlet.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.servlet.dao.EmpresaDAO;
import br.com.alura.gerenciador.servlet.model.Empresa;

public class FindEmpresa {

	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String paramId = req.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		Empresa empresa = new EmpresaDAO().find(id);
		
		req.setAttribute("empresa", empresa);

		RequestDispatcher rd = req.getRequestDispatcher("/formUpdateEmpresa.jsp");
		rd.forward(req, resp);
		
	}
}
