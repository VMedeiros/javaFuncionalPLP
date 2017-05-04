package horarioPorZona;
import java.time.LocalTime;
import java.time.ZoneId;

public class TimeZona {
    public static void main(String[] args) {
        
    	//criando uma fábrica ZoneId através do LocalTime
        LocalTime horaBrasil = LocalTime.now();
        LocalTime horaChina = LocalTime.now(ZoneId.of("Etc/GMT+8"));
        System.out.println(String.format("Horário do Brasil: " + horaBrasil));
        System.out.println(String.format("Horário da China: " + horaChina));
       
    }
}