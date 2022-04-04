import java.util.Scanner;

public class esPrimo {
	private int valor;
	public void ingresar() {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Ingrese un numero del 1 al 14: ");
		int valor=teclado.nextInt();
	}
	public void Primo() {
		int cont=0;
		for(int i=1;i<=valor;i++) {
			if(valor%i==0) {
				cont++;
		    }
	 }	
		if(cont!=2) System.out.print("No es primo");
		
		else System.out.print("Es primo");
	}

	public static void main(String[] args) {
		esPrimo pr=new esPrimo();
        pr.ingresar();

	}

}
