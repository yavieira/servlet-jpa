package br.com.alura.gerenciador.servlet.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.servlet.dao.EmpresaDAO;

public class RemoveEmpresa implements BaseAction {

	public String exec(HttpServletRequest req, HttpServletResponse resp) {
	
		String paramId = req.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		EmpresaDAO dao = new EmpresaDAO();
		dao.removeEmpresa(id);

		return "redirect:main?action=ListaEmpresas"; //redirect suporte várias requisições
	}
}
