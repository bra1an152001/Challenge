import java.util.Scanner;

public class punto1 {
	int peso;
	float altura,resu=0;
	
	
	public void ingresar() {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Ingrese su peso: ");
		peso=teclado.nextInt();
		System.out.print("Ingrese su altura en centimetros: ");
		altura=teclado.nextFloat();
		altura=altura/100;
		resu=peso/(altura*altura);
		
	}
	public void CalcularIMC() {
		if(resu<20) {
			System.out.print("Mal estado");
		}else if((resu>=20) && (resu<=22)) {
			System.out.print("Bajo de peso");
		}else if((resu>22) && (resu<=25)) {
			System.out.print("Peso Normal");
		}else if((resu>25) && (resu<=30)) {
			System.out.print("Sobre Peso");
		}else if((resu>30) && (resu<=40)) {
			System.out.print("Sobrepeso Cronico");
		}else {
			System.out.print("Hospitalizado");
		}
	}
	

	public static void main(String[] args) {
		punto1 d=new punto1();
		d.ingresar();
		d.CalcularIMC();
	}

}