
// procurar biblioteca resulu��o tela no java
package horadosistema;

import java.util.Date;
import java.util.Locale;


public class HoraDoSistema {
	public static void main(String[] args) {
		
		Date relogio = new Date();
		System.out.println("A hora do sistema �");
		System.out.println(relogio.toString());
		
		Locale locale = Locale.getDefault();
		System.out.println("O idioma do SO �:");
		System.out.println("O idioma do SO �: " + locale.getDisplayLanguage());
		
		
	}
}
