import java.util.Scanner;

public class Auto implements Andable{
	public int n1;
	Scanner teclado=new Scanner(System.in);

	@Override
	public void movimiento() {
		do {
			System.out.println("Ingrese el destino al que se dirije: ");
			System.out.println("1 Playa");
            System.out.println("2 Estadio");
            System.out.println("3 Plaza");
            System.out.println("4 Ninguno");
            System.out.print("Elija un destino: ");
            n1=teclado.nextInt();
		}while(n1>4 );
		
		switch(n1){
		
        default:
             System.out.println("El auto esta detenido");
        break;
        case 1:
        	System.out.println("Esta a 10km");
        break;
        case 2:
        	System.out.println("Esta a 20km");
        break;
        case 3:
        	System.out.println("Esta a 1km");
        	break;
		}
	}

}
