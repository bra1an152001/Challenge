import java.util.Scanner;

public class IngresarNumeros {
	public int numero,suma,sumapares,mayor=0,menor=100000000; 
	
	public void numero() {
		Scanner teclado=new Scanner(System.in);
	do {
			System.out.print("Ingrese los numeros: ");
	        numero=teclado.nextInt();
	        if(numero!=-1) {            //vuelvo a especificar que el numero no sea -1, para que si es el primer numero que ingresa, termine el programa
	        	if(numero%2==0) {
	        		sumapares+=numero;
	        	}     	
	        if(numero>mayor) {
	        	suma+=numero;
	        	mayor=numero;
	        	if(mayor<menor) {                   //si el numero que anteriormente era mayor, es menor que el actual menor, el mayor pasa a ser el menor, de lo contrario continua la sentencia.
	        		menor=mayor;
	        	}
	        }else if(numero<mayor) {
	        	menor=numero;
	        	suma+=menor;
	        }else if(numero<mayor&&numero>menor) { 
	        	suma+=numero;
	        }
	      }
	        
       }while(numero!=-1);//solo se termina si se ingresa un -1
	
	System.out.println("El numero mayor es: "+mayor);
	System.out.println("El numero menor es: "+menor);
	System.out.println("La suma es: "+suma);
	System.out.println("La suma de los numeros pares es: "+sumapares);
	}
	
	
	
	
	
	public static void main(String[] ar) {
        IngresarNumeros in=new IngresarNumeros();
        in.numero();
    }

}
