package dateupdate.teste;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
	tituloGerador();
	int valorAno = 2024;
	int valorMes = 5;
	int valorDia = 10;
	System.out.println("Date: " + new Date());
	System.out.println("Valor do Mês do ano: " + Month.JULY.getValue());
	LocalDate date = LocalDate.of(2024, Month.JULY, 02);
	LocalDate date2 = LocalDate.of(valorAno, valorMes, valorDia);
	System.out.println("Data 02: " + date2);
	System.out.println("Data: " + date);
	
	System.out.println("<<<<  Metodos para utilização >>>>");
	System.out.println("Ano: " + date.getYear());
	System.out.println("Mês: " + date.getMonth());
	System.out.println("Dia do Mês: " + date.getDayOfMonth());
	System.out.println("Dia do Ano: " + date.getDayOfYear());
	System.out.println("Dia da Semana: " + date.getDayOfWeek());
	System.out.println("Quantidade de dias dentro do mês: " + date.lengthOfMonth());
	System.out.println("Verificando se o ano é bisexto: " + date.isLeapYear());
	System.out.println("Buscando o ano de forma mais especifica: " + date.get(ChronoField.YEAR));
	System.out.println("Buscando o dia do Mês de forma especifica: " + date.get(ChronoField.DAY_OF_MONTH));
	System.out.println("Numero Maximo de valor atribuido para datas: " + LocalDate.MAX);
	System.out.println("NUmero Minimo de valor atribuido para datas: " + LocalDate.MIN);
	
	System.out.println("----------------------------------------------------");
	

    }
    
    public static void tituloGerador() {
	System.out.println("-------------------------------------------");
	System.out.println("        Trabalhando com LocalDate          ");
	System.out.println("-------------------------------------------");
    }

}
