import java.util.Scanner;

//Realizar un programa para el cálculo de las raíces de ecuación de segundo grado,
//el programa debe diferenciar entre las raíces imaginarias, raíces distintas, raíces iguales.
public class punto2 {
	int a,b,c,aux,resu;
	
	public void ingresar() {
		Scanner tec=new Scanner(System.in);
		System.out.println("formula: b2 – 4ac ");
		
		System.out.print("Ingrese valor de a: ");
		a=tec.nextInt();
		System.out.print("Ingrese valor de b: ");
		b=tec.nextInt();
		System.out.print("Ingrese valor de c: ");
		c=tec.nextInt();
		
	}
	
	public void calcular() {
		aux=(int) Math.pow(b, 2);
		resu=aux-(4*a*c);
		
		if(resu>0) {
			System.out.print("Hay dos raices reales distintas");
		}else if(resu==0) {
			System.out.print("Hay una raiz doble");
		}else {
			System.out.print("No hay raices reales");
		}
		System.out.println("Resu= "+resu);
	}
	

	public static void main(String[] args) {
		punto2 p2= new punto2();
		p2.ingresar();
		p2.calcular();
		

	}

}
