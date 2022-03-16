import java.util.Scanner;

public class esPrimo {
	public void ingresar() {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		int valor=teclado.nextInt();
		Primo(valor);
		
	}
	public void Primo(int x) {
		int cont=0;
		//este for recorre desde el numero 1 hasta el numero ingresado, si el resultado es 0, significa que es divisible por el mismo, si hay mas de 2 numeros divisibles
		//por el numero ingresado, significa que no es primo.
		for(int i=1;i<=x;i++) {
			if(x%i==0) {
				cont++;
		    }
	 }	
		if(cont!=2) System.out.print("No es primo");//aca aclaro que si la cantidad de divisores enteros del numero no es 2, significa que no es primo
		
		else System.out.print("Es primo");
	}
	
	
	public static void main(String[] ar) {
        esPrimo pr=new esPrimo();
        pr.ingresar();
    }

}
