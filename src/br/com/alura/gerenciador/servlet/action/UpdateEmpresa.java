package br.com.alura.gerenciador.servlet.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.servlet.dao.EmpresaDAO;
import br.com.alura.gerenciador.servlet.model.Empresa;
import br.com.alura.gerenciador.servlet.util.Util;

public class UpdateEmpresa implements BaseAction {

	public String exec(HttpServletRequest req, HttpServletResponse resp) {

		String idParam = req.getParameter("id");
		String nomeParam = req.getParameter("nome");
		String dataParam = req.getParameter("dataAbertura");
		Integer id = Integer.valueOf(idParam);
		
		Date dataAbertura = null;
		
		try {
			dataAbertura = new Util().formatStringToDate(dataParam);
		} catch (Exception e) {
			
		}

		Empresa empresa = new EmpresaDAO().find(id);
		
		empresa.setDataAbertura(dataAbertura);
		empresa.setNome(nomeParam);
		new EmpresaDAO().updateEmpresa(empresa);
		
		return "redirect:main?action=ListaEmpresas";
	}
}
