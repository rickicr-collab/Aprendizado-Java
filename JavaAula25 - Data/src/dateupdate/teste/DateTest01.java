package dateupdate.teste;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
	tituloGerador();
	Date date = new Date();
	date.after(date);
	System.out.println(date);
	
    }
    
    public static void tituloGerador() {
	System.out.println("-----------------------------------------------------");
	System.out.println("              Introdução a Classe Date               ");
	System.out.println("-----------------------------------------------------");
    }

}
