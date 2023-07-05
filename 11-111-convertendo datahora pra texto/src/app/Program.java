package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); 
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); 
		
		System.out.println(d04);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println(d04.format(fmt1)); //usando o format
		System.out.println(fmt1.format(d04)); //só pra mostrar que da pra chamar começando pelo fmt1
		System.out.println(d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); //só pra mostrar que pode ser feito assim, caso não queria usar uma var
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println(d05);
		System.out.println(d05.format(fmt1)); //nesse caso n vai mostrar a hora pq fmt1 n tem hora 
		System.out.println(d05.format(fmt2));
		
		System.out.println(d06); //instant n tem format
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println(fmt3.format(d06));
	}

}
