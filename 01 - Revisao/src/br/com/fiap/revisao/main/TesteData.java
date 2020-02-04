package br.com.fiap.revisao.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteData {

	public static void main(String[] args) {
		//Obter um objeto com adata atual
		Calendar hoje = Calendar.getInstance();
		
		//Exibir  a data
		System.out.println(hoje);
		
		//data especifica
		Calendar aniversario = new GregorianCalendar(2020, Calendar.JULY, 29);
		
		//formatar data
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formatador.format(hoje.getTime()));
		System.out.println(formatador.format(aniversario.getTime()));
	}

}
