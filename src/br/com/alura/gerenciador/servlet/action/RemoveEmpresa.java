package br.com.alura.gerenciador.servlet.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.servlet.dao.EmpresaDAO;

public class RemoveEmpresa {

	public String exec(HttpServletRequest req, HttpServletResponse resp) throws IOException {
	
		String paramId = req.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		EmpresaDAO dao = new EmpresaDAO();
		dao.removeEmpresa(id);

		return "redirect:main?action=ListaEmpresas"; //redirect suporte várias requisições
	}
}
