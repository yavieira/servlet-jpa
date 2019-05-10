package br.com.alura.gerenciador.servlet.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BaseAction {

	public String exec(HttpServletRequest req, HttpServletResponse resp);
}
