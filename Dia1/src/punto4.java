import java.util.Scanner;

public class punto4 {
	int n1=0,n2=0,n3=0;
	public void ingresar() {
		Scanner teclado= new Scanner(System.in);
		System.out.print("Ingrese el primer valor: ");
		n1=teclado.nextInt();
		System.out.print("Ingrese el segundo valor: ");
		n2=teclado.nextInt();
		System.out.print("Ingrese tercer valor: ");
		n3=teclado.nextInt();
	}
	
	public void CalcularMayor() {
		if((n1>n2) && (n1>n3)) {
			System.out.print("El numero mayor es: "+n1);
		}else if((n2>n1)&&(n2>n3)) {
			System.out.print("El numero mayor es: "+n2);
		}else {
			System.out.print("El numero mayor es: "+n3);
		}
	}

	public static void main(String[] args) {
		punto4 p4= new punto4();
		p4.ingresar();
		p4.CalcularMayor();

	}

}
