import java.util.Scanner;

public class esPrimo2 {
	private static int valor;
	public void ingresar() {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Ingrese un numero del 1 al 14: ");
		valor=teclado.nextInt();
		System.out.print("Es primo? "+Primo());
	}
	public static boolean Primo() {
		boolean primo=false;
		if(valor==2||valor==3||valor==5||valor==7||valor==11||valor==13) {
			primo=true;
		}else {
			return false;
		}
		return primo;
	}

	public static void main(String[] args) {
		esPrimo2 pr=new esPrimo2();
        pr.ingresar();
        pr.Primo();

	}

}
