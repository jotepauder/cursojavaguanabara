package primeiroprograma;

import java.util.Scanner;

public class TiposPrimitivos {
	public static void main(String[] args) {
	
	//tipos de variaveis 	
	 int idade = 28;
	 char nome = 'j';  
	 boolean meunome = true;
	 float idadeEsseAno = 28.2f;
	 String nomecompleto = "Jo�o Paulo";
	 
	 
	 System.out.println("Qual � o seu nome completo: " + nomecompleto);
	 System.out.println("Qual � a sua idade: " + idade + " anos");
	 System.out.println("Qual � a primeira letra do seu nome: " + nome);
	 System.out.println("Qual � a sua idade esse ano: " + idadeEsseAno);
	
	 if(meunome == true) {
		 System.out.println("Qual � a primeira letra do seu nome: " + nome);
	 } else {
		 System.out.println("Voc� errou na primeira letra do seu nome");
	 }
		 
	 Scanner teclado = new Scanner(System.in);
	 System.out.print("Digite o seu nome completo:" );
	 nomecompleto = teclado.nextLine();
	 System.out.print("Digite a sua idade: ");
	 idade = teclado.nextInt();
	 System.out.println("O seu nome completo � " + nomecompleto + " e a sua idade � " + idade + " anos");
	 
	 
	 
	}	
}
