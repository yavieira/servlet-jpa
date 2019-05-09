package br.com.alura.gerenciador.servlet.action;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.servlet.dao.EmpresaDAO;
import br.com.alura.gerenciador.servlet.model.Empresa;
import br.com.alura.gerenciador.servlet.util.Util;

public class UpdateEmpresa {

	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String idParam = req.getParameter("id");
		String nomeParam = req.getParameter("nome");
		String dataParam = req.getParameter("dataAbertura");
		Integer id = Integer.valueOf(idParam);
		
		Date dataAbertura = new Util().formatStringToDate(dataParam);

		Empresa empresa = new EmpresaDAO().find(id);
		
		empresa.setDataAbertura(dataAbertura);
		empresa.setNome(nomeParam);
		new EmpresaDAO().updateEmpresa(empresa);
		resp.sendRedirect("main?action=ListaEmpresas");
	}
}
