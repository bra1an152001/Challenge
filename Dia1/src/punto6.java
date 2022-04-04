import java.util.Scanner;

public class punto6 {
	public int cont, reves = 0, cifra,num;
	public void ingresar() {
		Scanner teclado= new Scanner(System.in);
		System.out.print("Ingrese el valor: ");
		num=teclado.nextInt();

	}
	
	public void EsCapicua() {
		cont = num;
        while (cont!=0){
            cifra=cont % 10;
            reves=reves*10+cifra;
            cont=cont/10;
        }
        if(num==reves){
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
