package br.com.webapp.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import br.com.webapp.servlet.dao.EmpresaDAO;
import br.com.webapp.servlet.model.Empresa;

@WebServlet("/empresas")
public class EmpresaService extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Empresa> list = new EmpresaDAO().getEmpresas();
		Gson gson = new Gson();
		String json = gson.toJson(list);
		
		resp.setContentType("application/json");
		resp.getWriter().print(json);
	}
}
