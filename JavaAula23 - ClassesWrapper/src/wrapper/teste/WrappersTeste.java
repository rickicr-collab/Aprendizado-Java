package wrapper.teste;

/*
 * CLASSES WRAPPERS:
 * 
 * CLASSES PRIMITIVAS DO JAVA;
 * byte/ short/ int/ long/ float/ double/ char/ boolean:
 * 
 * CLASSES WRAPPER DOS TIPOS PRIMITIVOS:
 * Byte/ Short/ Integer/ Long/ Float/ Double/ Character/ Boolean: 
 * 
 * OBS: A CLASSE BYTE SO ACEITA VALORES ATÉ 127 BYTES ACIMA DISSO GERA UM ERRO DE COMPILAÇÃO
 * OBS: NÃO É POSSIVEL UTILIZAR CASTING PARA ALGUMAS CLASSE DEVIDO SUA IMCOPATIBILIDADE 
 * EM RELAÇAO A VALOR DE MEMORIA COMO POR EXEMPLO UM INT SER UM LONG.
 * 
 * OBS: QUANDO SE TEM CLASSES DA MESMA LINHA HORIZONTAL NÃO SE PODE USAR POLIMORFISMO 
 * É O CASO DAS CLASES LONG, DOUBLE E FLOAT.
 * 
 * AUTOBOXING E UNBOXING:
 * 
 * AUTOBOXING → É PEGAR UM VALOR DE TIPO PRIMITIVO E TRANSFORMA-LO EM WRAPPER.
 * UNBOXING → 
 * 
 * 
 */

public class WrappersTeste {

	public static void main(String[] args) {
		
		//CLASSES PRIMITIVAS
		byte bytePrimitivo = 1;
		short shortPrimitivo = 1;
		int intPrimitivo = 10;
		long longPrimitivo = 10;
		float floatPrimitivo = 10;
		double doublePrimitivo = 10;
		char charPrimitivo = 'A';
		boolean booleanPrimitivo = true;
		
		//CLASSES WRAPPER
		Byte byteWrapper = 1;
		Short shortWrapper = 2;
		Integer integerWrapper =10;
		Long longWrapper = 10L;
		Float floatWrapper = 2.5F;
		Double doubleWrapper = 10D;
		Character charWrapper = 'B';
		Boolean booleanWrapper = false;
			
		System.out.println(Character.isDigit('9'));
		System.out.println(Character.isLetter('1'));
		System.out.println(Character.isLetterOrDigit('B'));
		System.out.println(Character.isUpperCase('B'));
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.toUpperCase('a'));
		
		
		
		System.out.println("\n--------------------------------");
		String valor = "10";
		Integer f = Integer.parseInt(valor);
		System.out.println("Resultado: " + f);

	}

}
