package br.com.webapp.test;

import java.util.List;

import br.com.webapp.servlet.dao.EmpresaDAO;
import br.com.webapp.servlet.model.Empresa;

public class GetEmpresasTest {

	public static void main(String[] args) {

		EmpresaDAO dao = new EmpresaDAO();
		List<Empresa> list = dao.getEmpresas();
		for (Empresa empresa : list) {
			System.out.println(empresa.getNome());
		}
	}

}
