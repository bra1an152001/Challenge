import java.util.Scanner;

public class NumeroAleatorio {
	private int num, rand;
	public void numeroRandom() {
	Scanner teclado=new Scanner(System.in);
	rand = (int)(Math.random()*1000+1);//genera un numero aleatorio entre 0-999, por lo cual le sumo 1 para que sean 1000
	do {
		System.out.print("Adivina el numero entre 1 y 1000: ");
	    num=teclado.nextInt();
	    
       }while(rand!=num);//solo se terminara si el numero random es igual al numero que ingreso.
		
	System.out.print("Adivinaste! el numero era: "+rand);
	}
	
	
	public static void main(String[] ar) {
        NumeroAleatorio na=new NumeroAleatorio();
        na.numeroRandom();
    }
}
