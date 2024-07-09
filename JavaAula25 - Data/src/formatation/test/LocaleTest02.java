package formatation.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
	tituloGerador();
	System.out.println("Localidade Padrão do Sistema: " + Locale.getDefault());
	String[] isoCountries = Locale.getISOCountries();
	String[] isoLanguages = Locale.getISOLanguages();
	for(String lingua: isoLanguages) {
	    System.out.print(lingua + " ");
	}
	System.out.println();
	for(String paises: isoCountries) {
	    System.out.print(paises + " ");
	}
	
    }
    
    public static void tituloGerador() {
	System.out.println("-----------------------------------------------------");
	System.out.println("            Classe Locale - Funções Uteis            ");
	System.out.println("-----------------------------------------------------");
    }


}
