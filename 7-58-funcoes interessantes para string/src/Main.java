
public class Main {

	public static void main(String[] args) {
		
		String original = " abcde FGHIJ ABC abc DEFG    ";
		
		
		System.out.println("Original: " + original);
		System.out.println("Minuscula: " + original.toLowerCase()); 
		System.out.println("Maiuscula: " + original.toUpperCase()); 
		System.out.println("Trim: " + original.trim()); //apaga os espaços em branco nos finais
		System.out.println("Substring: " + original.substring(4)); //corta a frase a partir de um valor que eu der
		System.out.println("Substring c/ 2 parametros: " + original.substring(4, 14)); //vai recortar do 4 ao 9
		System.out.println("replace p/ caracteres: " + original.replace('a', 'x')); //troca uma caracter por outra
		System.out.println("replace p/ strings: " + original.replace("abc", "myT")); //troca string tbm
		System.out.println("indexof: " + original.indexOf("bc")); //me retorna aonde começa bc na string 
		System.out.println("indexof último: " + original.lastIndexOf("bc")); //última vez que aparece a string determinada
		
		//armazenando frases em um vetor
		String s = "potato apple lemon orange";
		
		String[] vect = s.split(" "); //dividiu a frase pelos espaços
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);


	}

}
