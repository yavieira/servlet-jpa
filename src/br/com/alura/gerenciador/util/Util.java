package br.com.alura.gerenciador.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;

public class Util {

	public Date formatStringToDate(String date) throws ServletException {
		
		Date newDate = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            newDate = sdf.parse(date);
        } catch (ParseException e) {
            throw new ServletException(e);
        }
        return newDate;
	}
}
