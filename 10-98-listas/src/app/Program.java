package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		System.out.println("Index of Bob: " + list.indexOf("Bob")); //mostrar o index, retorna -1 se não encontrar
		
		//list.remove("Anna"); //remove por nome
		//list.remove(2); //remove por posição
//		list.removeIf(x -> x.charAt(0) == 'M'); //remove todos que começarem com M
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); ///vai fazer uma nova lista onde só quem começa com A vai ser mantido
		//cria lista, transforam lista em stream, passa o filtro, usa esse collectors pra transformar pra lista de novo
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------");
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------");

		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findAny().orElse(null);
		System.out.println(name); //se não encontrar nada ele mostra um nulo
		
		
	}
}