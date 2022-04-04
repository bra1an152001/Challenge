import java.util.Scanner;

public class punto3 {
	int n1=0,n2=0,n3=0,prom=0;
	
	public void ingresar() {
		Scanner teclado= new Scanner(System.in);
		System.out.print("Ingrese la primera nota: ");
		n1=teclado.nextInt();
		System.out.print("Ingrese la primera nota: ");
		n2=teclado.nextInt();
		System.out.print("Ingrese la primera nota: ");
		n3=teclado.nextInt();
	}
	
	public void CalcularPromedio() {
		prom=(n1+n2+n3)/3;
		if(prom<10) {
			System.out.print("Reprobado");
		}else if((prom>=10) && (prom<15)) {
			System.out.print("Aprobado");
		}else {
			System.out.print("Eximido");
		}
		
	}

	public static void main(String[] args) {
		punto3 p3= new punto3();
		p3.ingresar();
		p3.CalcularPromedio();

	}

}
