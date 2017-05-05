package horarioPorZona;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {

	public static void main(String[] args) {
		  //Data e hora atuais
	      LocalDateTime horaLocal = LocalDateTime.now();
	      System.out.println("Data e Hora: " + horaLocal);
	      //Data atual
	      LocalDate data = LocalDate.now();
	      System.out.println("Data: " + data);
	      //Hora atual
	      LocalTime hora = LocalTime.now();
	      System.out.println("Hora: " + hora);	     
	}
}


