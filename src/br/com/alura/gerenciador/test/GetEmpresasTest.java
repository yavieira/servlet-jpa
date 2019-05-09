package br.com.alura.gerenciador.test;

import java.util.List;

import br.com.alura.gerenciador.servlet.dao.EmpresaDAO;
import br.com.alura.gerenciador.servlet.model.Empresa;

public class GetEmpresasTest {

	public static void main(String[] args) {

		EmpresaDAO dao = new EmpresaDAO();
		List<Empresa> list = dao.getEmpresas();
		for (Empresa empresa : list) {
			System.out.println(empresa.getNome());
		}
	}

}
