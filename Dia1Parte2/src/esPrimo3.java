import java.util.Scanner;

public class esPrimo3 {
	private int valor;
	String comp;
	public void ingresar() {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Ingrese un numero del 1 al 14: ");
		valor=teclado.nextInt();
		Primo();
	}
	public void Primo() {
		switch(valor) {
	case 2:  comp = "primo";
         break;
    case 3:  comp = "primo";
         break;
    case 5:  comp = "primo";
         break;
    case 7:  comp = "primo";
         break;
    case 11:  comp = "primo";
         break;
    case 13:  comp = "primo";
         break;
    default: comp = "No es primo";
         break;
		}
		System.out.println(comp);
	}

	public static void main(String[] args) {
		esPrimo3 pr=new esPrimo3();
        pr.ingresar();

	}

}
