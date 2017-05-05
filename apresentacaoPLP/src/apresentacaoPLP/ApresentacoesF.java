package apresentacaoPLP;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

//Fabrica de Datas
public class ApresentacoesF {
	private static Apresentacoes[] apresentacoes = {
			new Apresentacoes("Grupo 1 - Java Funcional", LocalDate.of(2017, Month.MAY, 4),
			new BigDecimal(2)),
			new Apresentacoes("Grupo 2 - Java Funcional", LocalDate.of(2017, Month.MAY, 5),
			new BigDecimal(2)),
			
			new Apresentacoes("Grupo 1 - JavaScript Funcional", LocalDate.of(2017, Month.MAY, 5),
			new BigDecimal(2)),
			new Apresentacoes("Grupo 2 - Go Funcional", LocalDate.of(2017, Month.MAY, 5),
			new BigDecimal(2)),
			
			new Apresentacoes("Grupo 1 - Imperativa com C", LocalDate.of(2017, Month.MAY, 11),
			new BigDecimal(2)),
			new Apresentacoes("Grupo 2 - Scala", LocalDate.of(2017, Month.MAY, 11),
			new BigDecimal(2))
		  };
	//Lista todos os filmes
	public List<Apresentacoes> ListaApresentacoes() {
		return Arrays.asList(apresentacoes);
	}
}
