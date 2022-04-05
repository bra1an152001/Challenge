import java.util.Scanner;

/*Realizar un programa que simule una calculadora, donde realice las operaciones básicas (suma, resta, multiplicación, división)
 * , el usuario debe primero ingresar dos valores, y especificar con un carácter la operación a realizar, para el uso del ejercicio
 *  debe usar la sentencia switch.
*/
public class punto1 {
	double n1,n2,resu;
	public void ingresar() {
		Scanner tec=new Scanner(System.in);
		System.out.print("Ingrese primer valor: ");
		n1=tec.nextDouble();
		System.out.print("Ingrese segundo valor: ");
		n2=tec.nextDouble();
		System.out.println("Que operacion desea realizar?");
		System.out.println("1  =  +");
		System.out.println("2  =  -");
		System.out.println("3  =  *");
		System.out.println("4  =  /");
		System.out.println("Operacion: ");
		int op=tec.nextInt();
		operacion(op);
		
	}
	
	public void operacion(int op) {
		switch(op) {
		default: System.out.println("Ninguna opcion ingresada");
		break;
		case 1: resu=n1+n2;
		         System.out.print("La suma es: "+resu);
		break;
		case 2: resu=n1-n2;
		         System.out.print("La resta es: "+resu);
		break;
		case 3: resu=n1*n2;
		         System.out.print("La multiplicacion es: "+resu);
		break;
		case 4: resu=n1/n2;
		         System.out.print("La divicion es: "+resu);
		break;
		}
	}

	public static void main(String[] args) {
		punto1 p1=new punto1();
		p1.ingresar();
		

	}

}
