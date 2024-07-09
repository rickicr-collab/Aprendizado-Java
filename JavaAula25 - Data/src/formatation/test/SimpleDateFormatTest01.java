package formatation.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
	tituloGerador();
	String mask = "'Brasil' dd 'de' MMMM 'de' YYYY";
	SimpleDateFormat sdf = new SimpleDateFormat(mask);
	System.out.println("Data Formatada: " + sdf.format(new Date()));
	
	try {
	    System.out.println("Data Formatada com Parse: " + sdf.parse("Brasil 02 de Julho de 2024"));
	} catch (ParseException e) {
	    e.printStackTrace();
	}
	
    }
    
    public static void tituloGerador() {
	System.out.println("-------------------------------------------");
	System.out.println("      Trabalhando com SimpleDateFormat     ");
	System.out.println("-------------------------------------------");
    }

}
