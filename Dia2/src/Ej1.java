import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		
		boolean salir=false;
		int opcion;
		
		while(!salir) {
			System.out.println("Menu........");
			System.out.println(" 1 Accion ");
			System.out.println("2 Accion ");
			System.out.println("3 Accion");
			System.out.println("4 Accion");
			System.out.println("Ingrese la opcion: ");
			opcion=sn.nextInt();
			
			
			switch(opcion) {
			default: System.out.println("Ingrese un numero entre 1-4");
			break;
			
			case 1: 
				System.out.println("Elegiste 1");
				break;
				
			case 2: 
				System.out.println("Elegiste 2");
				break;
				
			case 3: 
				System.out.println("Elegiste 3");
				break;
				
			case 4: 
				salir=true;
			}
		}

	}

}
