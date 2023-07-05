package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); 
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); 
		
		LocalDateTime pastWeekLocalDate = d05.minusDays(7); //simplesmente procurar o minus pra reduzir dias, meses, anos e etc
		LocalDateTime nextWeekLocalDate = d05.plusDays(7); //mesma coisa de cima, só que add
		
		System.out.println(pastWeekLocalDate);
		System.out.println(nextWeekLocalDate);
		
		System.out.println(d05.plusDays(2));
		System.out.println(d05.plusHours(2));
		System.out.println(d05.minusMinutes(20));
		
		System.out.println(d06.minus(7, ChronoUnit.DAYS)); //a data global é diferente, precisa chamar esse chrono unit
		System.out.println(d06.plus(2, ChronoUnit.HOURS));

		Duration t1 = Duration.between(pastWeekLocalDate, nextWeekLocalDate); 
		
		System.out.println(t1.toDays()); //mostra a diferença em horas
		System.out.println(t1.toHours()); //diferença em horas
		
		Duration t2 = Duration.between(pastWeekLocalDate, d04.atTime(0, 0)); //da erro sem o at time pq o d04 n tem tempo, é um localdate aí fazendo assim rola
		System.out.println(t2.toDays());
		
		System.out.println(Duration.between(pastWeekLocalDate, d04.atStartOfDay()));
	}
}
