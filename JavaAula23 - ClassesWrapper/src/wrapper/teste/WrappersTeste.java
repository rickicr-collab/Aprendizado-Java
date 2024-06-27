package wrapper.teste;

public class WrappersTeste {
    
	public static void main(String[] args) {
		
		
		byte bytePrimitivo = 1;
		short shortPrimitivo = 1;
		int intPrimitivo = 10;
		long longPrimitivo = 10;
		float floatPrimitivo = 10;
		double doublePrimitivo = 10;
		char charPrimitivo = 'A';
		boolean booleanPrimitivo = true;
		
		
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
		System.out.println(Character.forDigit(intPrimitivo, charPrimitivo));
		System.out.println(Character.isIdeographic(charPrimitivo));
				
		
		
		System.out.println("----------------------------------------------------");
		
		System.out.println("Tipo byte Primitivo: " + bytePrimitivo);
		System.out.println("Tipo short Primitivo: " + shortPrimitivo);
		System.out.println("Tipo int Primitivo: " + intPrimitivo);
		System.out.println("Tipo Long Primitivo: " + longPrimitivo);
		System.out.println("Tipo float Primitivo: " + floatPrimitivo);
		System.out.println("Tipo double Primitivo: " + doublePrimitivo);
		System.out.println("Tipo char Primitivo: " + charPrimitivo);
		System.out.println("Tipo boolean Primitivo: " + booleanPrimitivo);
		
		System.out.println("----------------------------------------------------");
		
		System.out.println("Tipo Byte Wrapper: " + byteWrapper);
		System.out.println("Tipo Short Wrapper: " + shortWrapper);
		System.out.println("Tipo Integer Wrapper: " + integerWrapper);
		System.out.println("Tipo Long Wrapper: " + longWrapper);
		System.out.println("Tipo Float Wrapper: " + floatWrapper);
		System.out.println("Tipo Double Wrapper: " + doubleWrapper);
		System.out.println("Tipo Character Wrapper: " + charWrapper);
		System.out.println("Tipo Boolean Wrapper: " + booleanWrapper);
		
		System.out.println("\n--------------------------------");
		String valor = "10";
		Integer f = Integer.parseInt(valor);
		System.out.println("Resultado: " + f);
		
		System.out.println("----------- Convertendo valores de String -----------------");
		
		Integer intW = Integer.parseInt(valor);
		System.out.println("Valor Convertido para Integer: " + intW);
		Boolean verdadeiro = Boolean.parseBoolean("True");
		System.out.println("Valor COnvertido para Boolean: " + verdadeiro);
		

	}

}
