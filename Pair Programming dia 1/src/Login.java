import java.util.Scanner;
/* Realizar un programa que permita a un usuario registrarse con su nombre, email, y contraseña. Luego el mismo debera loguearse con su email y contraseña,
 *  de ser correctos ambos datos le aparecera un mensaje en pantalla que dira Inicio de sesion exitoso*/
public class Login {
	Scanner teclado=new Scanner(System.in);
	private String nombre,clave,email,clave2,email2;
	public Login() {
		
		System.out.println("Registrate");
		System.out.print("Nombre: ");
		nombre=teclado.next();
		System.out.print("Email: ");
		email=teclado.next();
		System.out.print("Contraseña: ");
		clave=teclado.next();
		System.out.println("Registro exitoso");
	}
	public void Logueo() {
		System.out.println("Inicia Sesion");
		System.out.print("Email: ");
		email2=teclado.next();
		System.out.print("Contraseña: ");
		clave2=teclado.next();
	}
	
	
	public void comprobar() {
		
		if(email.equals(email2) && clave.equals(clave2)) 
		{
			System.out.print("Inicio se sesion exitoso"); 
		}
		
	    else System.out.print("Nombre o Usuario Incorrecto!");
		
}
	

	public static void main(String[] args) {
		Login log=new Login();
		log.Logueo();
		log.comprobar();

	}

}
	
