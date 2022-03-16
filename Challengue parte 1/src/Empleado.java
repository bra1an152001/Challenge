import java.util.Scanner;

public class Empleado {
	private String nombre;
	private int antig,hora,canthora,total;
	public void ingresarEmpleado() {
		Scanner teclado=new Scanner(System.in);
		//ingreso de datos
		System.out.print("Valor de hora del empleado: ");
		hora=teclado.nextInt();
		System.out.print("Nombre del Empleado: ");
		nombre=teclado.next();
		System.out.print("Antiguedad del Empleado: ");
		antig=teclado.nextInt();
		System.out.print("Cantidad de horas trabajadas: ");
		canthora=teclado.nextInt();
		CalcularImporte();
	}
	//en este metodo multiplico el valor de la hora por la cantidad de horas trabajadas en el mes.
	//luego en el if digo que si la antiguedad es mayor a 10, multiplico todos sus años trabajados por 30, y se los sumo al valor total.
	public void CalcularImporte() {

		int valor1=hora*canthora;
		if(antig>10) {
			int extra=antig;
			int totalAntig=extra*30;
			total=valor1+totalAntig;
		}
	}
	
	public void imprimir() {
		System.out.println("Nombre del Empleado: "+nombre+"\nTiene una antiguedad de: "+antig+" años\n"+"Cobra un total de "+total+"$");
	}
	
	public static void main(String[] ar) {
        Empleado em=new Empleado();
        em.ingresarEmpleado();
        em.CalcularImporte();
        em.imprimir();
    }

}
