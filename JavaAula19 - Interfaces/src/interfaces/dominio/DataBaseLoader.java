package interfaces.dominio;

public  class DataBaseLoader implements DataLoader, DataRemove {
    
    static{
	System.out.println("-----------------------------------------------");
	System.out.println("     Trabalhando com Interfaces                ");
	System.out.println("-----------------------------------------------");
    }

    @Override
    public void load() {
	System.out.println("Carregando dados do banco de dados!!!");
	
    }

    @Override
    public void removeData() {
	System.out.println("Remoção de dados no banco de dados!!!");
	
    }

    @Override
    public void checkPermission() {
	System.out.println("Checando Permissão do Banco de dados!");
	
    }
    
    public void retrieveMaxDataSize() {
	 System.out.println("Dentro do DataBaseLoader! " );
    }

    
    
    
      
    
    
    
    

}
