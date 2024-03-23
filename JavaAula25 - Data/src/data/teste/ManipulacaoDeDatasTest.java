package data.teste;

import java.util.Calendar;
import java.util.Date;

/*
 * MANIPULAÇÃO DE DATAS:
 * 
 * EXISTIA A CLASSE DATA,UTIL MAIS NÃO ERA TÃO VERSATIL PARA TRABALHAR COM DATAS 
 * INTERNACIONALIZADAS ENTÃO FOI ADICIONADO NA VERSÃO DO JAVA 1.1 UMA NOVA CLASSE 
 * NO JAVA CHAMADA CALENDAR ATE A VERSÃO 7 DO JAVA. ATÉ ESSA VERSÃO O CALENDAR TRABALHAVA
 * E MANIPULAVA DATAS.
 * 
 * A PARTIR DO JAVA 8 ELES CRIARAM NOVAMENTE UM NOVO PACOTE DE DATAS PARA SE TRABALHAR 
 * QUE SE CHAMA PACOTE TIME QUE OFERECE MUITAS FUNCIONALIDADES QUE A CLASSE DATE E A CLASSE
 * CALENDAR.
 * 
 * A CLASSE DATA NÃO É MUITO USUAL PARA SE TRABALHAR E TAMBEM NÃO OFERECE MUITO SUPORTE DE 
 * MÉTODOS POIS MUITOS DELES ESTÃO DEPRECIADOS PARA ISSO EXISTE O MÉTODO CALENDAR.
 * 
 * MÉTODO CALENDAAR:
 * 
 * OBS: CALENDAR É UMA CLASSE ABSTRATA NÃO É POSSIVEL INSTANCIAR OBJETOS ATRAVES DELA 
 * NO ENTANTO É POSSIVEL UTILIZAR A FUNÇÃO GETINSTANCE() E DEPOIS IMPRIMIR OS VALORES 
 * DO OBEJTO DA CLASSE CALENDAR.
 * 
 * OBS1:  SEMPRE QUE BUSCAR OS OS VALORES USANDO O MÉTODO GET DA CLASSE CALENDAR
 * UTILIZE O MÉTODO COMPLETO DA CLASSE PARA QUE OUTROS DESENVOLVEDORES NÃO POSSAM SE 
 * ATRAPALHAR POR NÃO SABEREM A LOGICA DE PARAMETROS INDICADOS NOS MÉTODOS COMO NUMEROS
 * INTEIROS ISOLADOS.
 * 
 * METODOS UTEIS :
 * 
 * CALENDAR.DAY_OF_MONTH → GERA O DIA DO MÉS ATUAL EM INTEIRO.
 * CALENDAR.DAY_OF_WEAK → GERA O DIA DA SEMANA EM INTEIRO
 * CALENDAR.DAY_OF_YEAR → GERA O DIA TOTAL NO ANO EM NUMERO INTEIRO.
 * CALENDAR.YEAR → GERA O ANO ATUAL EM NUMERO INTEIRO.
 * 
 * 
 * OBS2: QUANDO SE TRABALHA COM MOEDAS , DATAS E LOCALIZAÇÃO TRABALHA-SE COM 5 CLASSE ESPECIFICAS
 * NUMEBERFORMAT, LOCALE, CALENDAR, DATE, DATEFORMAT.
 * 
 */

public class ManipulacaoDeDatasTest {

	public static void main(String[] args) {
		System.out.println("<<<<Trabalhando com Datas>>>>");
		Date data = new Date();
		System.out.println("Verificando a hora atual: " + data.toString());
		System.out.println("Vericando em milisegundos usando getTime: " + data.getTime());
		data.setTime(data.getTime()+ 3_600_000L);
		System.out.println(data);
		
		System.out.println("-----------------------------");
		Calendar c = Calendar.getInstance();
		c.setTime(data);
		if(Calendar.SUNDAY == c.getFirstDayOfWeek()) {
			System.out.println("Domingo é o primeiro dia da semana!");
		}
		System.out.println("Dia do Mês: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia do Ano: " + c.get(Calendar.DAY_OF_YEAR));
		System.out.println("Dia da Semana: " + c.get(Calendar.DAY_OF_WEEK));
		System.out.println("Dia da Semana e Mês: " + c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("Ano Atual: " + c.get(Calendar.YEAR));
		
		
		System.out.println("--------------------------------------");
		c.add(Calendar.HOUR, 24);
		c.roll(Calendar.MONTH, 1);
		Date date2 = c.getTime();
		System.out.println(date2);
		
		
		
		

	}

}
