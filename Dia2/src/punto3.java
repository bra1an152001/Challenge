import java.util.Scanner;
import java.sql.Array;
import java.util.Arrays;

public class punto3 {
	int mayor;
	int menor;
	int[] num=new int[10];
	public void ingresar() {
		Scanner tec=new Scanner(System.in);
		
		System.out.println("Ingrese 10 valores:");
		for(int i=0;i<10;i++) {
			num[i]=tec.nextInt();
		}
		

	}
	
	
	public void mayorYmenor(int[] num) {
		mayor=menor=num[0];
		for(int x=0;x<10;x++) {
			if(num[x]>mayor) {
				mayor=num[x];
			}
			if(num[x]<menor) {
				menor=num[x];
			}
		}
		
	}
	
	public void numPar() {
		for(int x=0;x<10;x++) {
			if(num[x]%2==0) {
				System.out.print(num[x]+" ");
			}
		}
		System.out.println("");
	}
	
	public void numImpar() {
		for(int x=0;x<10;x++) {
			if(num[x]%2!=0) {
				System.out.println(num[x]+" ");
			}
		}
	}
	public void imprimir() {
		
		mayorYmenor(num);
		System.out.println("El numero mayor es:"+mayor);
		System.out.println("El numero mayor es:"+menor);
		System.out.println("Los numeros pares son:");
		numPar();
		System.out.println("Los numeros impares son:");
		numImpar();
		Arrays.sort(num);
		System.out.println("Los numeros ordenados de manera ascendente son:");
		for(int i=0;i<10;i++) {
			System.out.println(num[i]+ " ");
		}
		System.out.println("Los numeros ordenados de manera descendente son:");
		for(int i=10;i>=0;i--) {
			System.out.print(num[i]+ " - ");
		}
	}
	

	public static void main(String[] args) {
		punto3 p3= new punto3();
		p3.ingresar();
		p3.imprimir();

	}

}
