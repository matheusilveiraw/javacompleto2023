package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d01 = LocalDate.now(); //chamar a data de agora
		System.out.println(d01);
		LocalDateTime d02 = LocalDateTime.now(); //agora com hora
		System.out.println(d02);
		Instant d03 = Instant.now(); //data hora gnt (z no final)
		System.out.println(d03);
		
		LocalDate d04 = LocalDate.parse("2022-07-20"); //transformar a string de data para localdate
		System.out.println(d04);
		
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); //conversão de string para datetime
		System.out.println(d05);
		
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); //convertendo o com hora gnt
		System.out.println(d06);
		
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00"); //botando 3 horas no final da linha, ele converte pra o fuso horario de londres
		System.out.println(d07);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate d08 = LocalDate.parse("20/07/1999", fmt1); //isso aqui não pode ser converrtido sem o datetimeformatter criado ali, 
		System.out.println(d08);
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); //criando mais um modo formatado
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		System.out.println("d09: " + d09);
		
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		System.out.println(d10);
		
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		System.out.println(d11);
		
		System.out.println("----");
		System.out.println();
	}

}
