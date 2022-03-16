import java.util.Random;
import java.util.Scanner;
public class Password {
	private int longitud;
	private String randString,contra;
	String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	Scanner teclado=new Scanner(System.in);
	
	public Password() {
		System.out.println("Ingrese la longitud: ");
		longitud=teclado.nextInt();
	} 

public void generarPassword() {

	StringBuilder pass = new StringBuilder();
	Random random = new Random();
	for(int i = 0; i < longitud; i++) {
		int num = random.nextInt(banco.length());
		char tomarchar = banco.charAt(num);
		pass.append(tomarchar);
	}
	randString = pass.toString();  //lo convierto en una cadena de texto
	contra=randString;
	System.out.println("Su contraseña es: " + contra);
	
	System.out.println("Contraseña segura? : "+esFuerte(randString));
    }

	
	
	
public static boolean esFuerte(String contra) {
		int contmayus = 0,contminus=0;
		int contnum = 0;
		for(int i=0; i<contra.length();i++) {
			if(contra.charAt(i)>=65 && contra.charAt(i)<=90) {	
				contmayus++;
			}else if(contra.charAt(i)>=97 && contra.charAt(i)<=122){
				contminus++;
			}else {
				contnum++;
				
			}
		}
		if(contmayus>2&&contminus>1&&contnum>3) {
			return true;
		}else {
			return false;
		}
		
			
}


public static void main(String[] ar) {
    Password pass=new Password();
    pass.generarPassword();
}


}