import java.util.Scanner;

public class Triangulo {
	private int l1,l2,l3;
	
	public void recibirValores() {
		Scanner tec=new Scanner(System.in);
		System.out.print("Primer lado: ");
		l1=tec.nextInt();
		System.out.print("Segundo lado: ");
		l2=tec.nextInt();
		System.out.print("Tercer lado: ");
		l3=tec.nextInt();
	}
	
	public void TipoTriangulo() {
		if(l1==l2 && l2==l3) {
			System.out.print("Es un triangulo Equilatero");
		}else if(l1==l2&&l1!=l3||l2==l3&&l3!=l1||l3==l1&&l1!=l2) {
			System.out.print("Es un triangulo Isoceles");
		}else {
			System.out.print("Es un triangulo Escaleno");
		}
	}

	public static void main(String[] args) {
		Triangulo tr=new Triangulo();
		tr.recibirValores();
		tr.TipoTriangulo();

	}

}
