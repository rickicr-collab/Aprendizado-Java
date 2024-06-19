package interfaces.testes;

import interfaces.dominio.DataBaseLoader;
import interfaces.dominio.DataLoader;
import interfaces.dominio.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
	DataBaseLoader dbl = new DataBaseLoader();
	FileLoader fl = new FileLoader();
	fl.load();
	dbl.load();
	System.out.println("---------");
	fl.removeData();
	dbl.removeData();
	System.out.println("---------");
	dbl.checkPermission();
	fl.checkPermission();
	System.out.println("---------");
	fl.retrieveMaxDataSize();
	dbl.retrieveMaxDataSize();
	DataLoader.printMaxDataSize();
	
	
	
    }

}
