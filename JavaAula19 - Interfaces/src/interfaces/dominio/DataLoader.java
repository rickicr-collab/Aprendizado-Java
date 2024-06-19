package interfaces.dominio;

public interface DataLoader {
    
    int MAX_DARA_SIZE = 10;
    
     void load();
     
     default void checkPermission() {
	 System.out.println("Checando a Permissão dos Dados Carregados!!!");
     }
     
     default void retrieveMaxDataSize() {
	 System.out.println("Dentro do retrieveMaxDataSize: " + MAX_DARA_SIZE);
     }
     
     public static void printMaxDataSize() {
	 System.out.println("Dentro do printMaxDataSize: " + MAX_DARA_SIZE);
     }

}
