import java.util.Scanner;

public class punto6 {
	public int N, aux, inverso = 0, cifra,num;
	public void ingresar() {
		Scanner teclado= new Scanner(System.in);
		System.out.print("Ingrese el valor: ");
		num=teclado.nextInt();

	}
	
	public void EsCapicua() {
		aux = num;
        while (aux!=0){
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }
        if(num == inverso){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
	}

	public static void main(String[] args) {
		punto6 p6= new punto6();
		p6.ingresar();
		p6.EsCapicua();

	}

}
