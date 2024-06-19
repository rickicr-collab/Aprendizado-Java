package interfaces.dominio;

public class FileLoader implements DataLoader, DataRemove{

    @Override
    public void load() {
	System.out.println("Arquivo do banco de dados carregado!!!");
	
    }

    @Override
    public void removeData() {
	System.out.println("Arquivo do banco de dados removido!!!");
	
    }

    @Override
    public void checkPermission() {
	System.out.println("Checando a Permissão do arquivo do banco de dados!");
    }
    
    
    public  void retrieveMaxDataSize() {
	 System.out.println("Dentro do FileLoader!" );
    }


}
