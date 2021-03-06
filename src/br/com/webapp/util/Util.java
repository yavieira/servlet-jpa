package br.com.webapp.util;

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
            throw new ServletException("Erro ao fazer parse da data.");
        }
        return newDate;
	}
}
