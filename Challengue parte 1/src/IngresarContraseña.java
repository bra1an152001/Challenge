import java.util.Scanner;

public class IngresarContrase�a {
	Scanner teclado=new Scanner(System.in);
	public void ingresar() {
		String valor2;
		int cont=1;
		System.out.print("Ingrese su contrase�a: ");
		String valor = teclado.next();
		
		//aca use un do while para hacer que almenos tenga un intento para ingresar su contrase�a
		do {
			System.out.print("Por favor vuelva a ingresar su contrase�a: ");
			valor2=teclado.next();
			if(valor2.equals(valor)) {
				System.out.print("Felicitaciones,record�s tu contrase�a");
				break;
			}                                                                //el do while se ejecuta 1 vez y tiene un contador para que finalize cuando este llegue a 3, pero si 
			                                                                //escribe la contrase�a bien antes, salimos del do while con un break.
			cont++;
			
		}while(cont<=3);
		
		if(cont==4) {
			System.out.print("Tenes que ejercitar la memoria");
			}
		
	}

	public static void main(String[] ar) {
		IngresarContrase�a ing=new IngresarContrase�a();
        ing.ingresar();
    }

}
