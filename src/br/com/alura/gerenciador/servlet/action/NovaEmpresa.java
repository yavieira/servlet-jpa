package br.com.alura.gerenciador.servlet.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.servlet.dao.EmpresaDAO;
import br.com.alura.gerenciador.servlet.model.Empresa;

public class NovaEmpresa implements BaseAction {

	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		String nomeEmpresa = req.getParameter("nome"); // Retorna SEMPRE String

		if (nomeEmpresa.isEmpty() || nomeEmpresa == null) {
			return "Nome da empresa não pode ser vazio."; 
		} else {
			Empresa empresa = new Empresa();
			empresa.setNome(nomeEmpresa);
			EmpresaDAO dao = new EmpresaDAO();
			dao.addEmpresa(empresa);
			return "redirect:main?action=ListaEmpresas"; // redirect suporte várias requisições
		}
	}
}
