package br.com.nlw.Proffy.util;

public final class UtilProffy {
	
	private UtilProffy() {
		
	}

	public static int converterHorasParaMinutos(String hora) {
		String[] horasSplit = hora.split(":");
		int horas = Integer.parseInt(horasSplit[0]);
		horas = horas * 60;
		int minutos = Integer.parseInt(horasSplit[1]);
		return horas + minutos;
	}
	
}
