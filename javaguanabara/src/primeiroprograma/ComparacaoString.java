package primeiroprograma;

public class ComparacaoString {
	
	public static void main(String[] args) {
		
		String nome1 = "Jo�o";
		String nome2 = "Jo�o";
		String nome3 = new String("Jo�o");
		String res;
		
		res = (nome1.equals(nome3))?"igual":"diferente";
		System.out.println(res);
		
		
	}
}
