package horaData;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class HoraDataAntigo {
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2017, Calendar.MAY, 05);
		Date data = c.getTime();
		
		System.out.println("Ano: " + c.get(Calendar.YEAR));
		System.out.println("M�s: " + c.get(Calendar.MONTH));
		System.out.println("Dia do M�s: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("Data atual sem formata��o: " + data);
			
		//Data atual
		DateFormat dataAtual = DateFormat.getDateInstance();
		System.out.println("Data atual com formata��o: " + dataAtual.format(data));
			
		//Hora atual
		DateFormat hora = DateFormat.getTimeInstance();
		System.out.println("Hora formatada: " + hora.format(data));

		//Data e Hora atuais
		DateFormat dataHora = DateFormat.getDateTimeInstance();
		System.out.println(dataHora.format(data));

		}
	}
