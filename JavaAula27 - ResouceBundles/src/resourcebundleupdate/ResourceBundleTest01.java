package resourcebundleupdate;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
	tituloGerador();
	System.out.println(" <<<< Trabalhando com Localidade Default >>>>");
	ResourceBundle bundle = ResourceBundle.getBundle("messages", Locale.getDefault());
	System.out.println(bundle.getString("hello"));
	System.out.println(bundle.getString("good.morning"));
	System.out.println(bundle.getString("feminista"));
	
	System.out.println(" <<<< Trabalhando com localidade English >>>>");
	bundle = ResourceBundle.getBundle("messages", Locale.of("en", "US"));
	System.out.println(bundle.getString("hello"));
	System.out.println(bundle.getString("good.morning"));

	System.out.println(" <<<< Trabalhando com localidade Japones >>>>");
	bundle = ResourceBundle.getBundle("messages", Locale.of("ja", "JP"));
	System.out.println(bundle.getString("ohayo"));
	System.out.println(bundle.getString("sayonara"));

	System.out.println(" <<<< Trabalhando com proprerties >>>>");
	bundle = ResourceBundle.getBundle("messages");
	System.out.println(bundle.getString("hi"));
	System.out.println(bundle.getString("youtube"));
	

    }

    public static void tituloGerador() {
	System.out.println("---------------------------------------------------");
	System.out.println("        Trabalhando com Resource Bundles           ");
	System.out.println("---------------------------------------------------");
    }

}
