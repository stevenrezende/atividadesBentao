
import java.util.*;
public class moedas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
        int numero,cont100=0,cont50=0, cont25=0,cont10=0,cont5=0,cont1=0;
        System.out.print("Entre com um valor qualquer em centavos:");
        numero = ler.nextInt();
        
        //Dividindo o numero por 100 sabemos quantas vezes o 100 encontra-se no valor
		cont100= numero/100;
		//O que sobrar da divisão passa a ser o numero agora que deverá ser  completado pelos demais valores
        numero = numero%100;
        
        cont50= numero/50;
        numero = numero%50;
        
        cont25= numero/25;
        numero = numero%25;
        
        cont10= numero/10;
        numero = numero%10;
        
        cont5= numero/5;
        numero = numero%5;
        
        cont1= numero/1;
        numero = numero%1;
        
        System.out.println("Moedas de R$ 1,00:" + cont100 );
        System.out.println("Moedas de R$ 0,50:" + cont50 );
        System.out.println("Moedas de R$ 0,25:" + cont25 );
        System.out.println("Moedas de R$ 0,10:" + cont10 );
        System.out.println("Moedas de R$ 0,05:" + cont5 );
        System.out.println("Moedas de R$ 0,01:" + cont1 );
        
	}

}
