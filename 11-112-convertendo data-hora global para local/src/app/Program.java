package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); 
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); 
		
		System.out.println(d06);
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); //covertendo o instant (data global) para data local utilizando o zone id do sistema
		
		System.out.println(r1);
		
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal")); //mesma coisa do anterior utilizando portugal como referencia 
		
		System.out.println(r2);
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault()); //só pra mostrar que funciona igual com localdatetime

		System.out.println(r3);
		
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));  //só pra mostrar que funciona igual com localdatetime

		System.out.println(r4);
		
		System.out.println(d04.getDayOfMonth()); //para pegar o dia
		System.out.println(d04.getMonthValue()); //pegar o mês
		System.out.println(d04.getYear()); //pegar o mês
		
		System.out.println(d05.getHour()); //pra pegar a hora
		System.out.println(d05.getMinute());//para pegar os minutos
	}
}
