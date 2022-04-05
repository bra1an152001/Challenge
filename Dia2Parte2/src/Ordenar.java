//de la a a la l por cantidad de letras, de la l a la z ordenamiento por el abecedario
public class Ordenar{
	private String[] vector={"coder", "devplace", "personas", "curso", "alumnado"};
	public Ordenar() {
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector.length - 1; j++) {
                if (vector[j].length() >vector[j + 1].length()) {
                    String temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }
        Mostrar(vector);
	}
	private void Mostrar(String[] vec) {
		for(int i=0;i<vec.length;i++) {
			System.out.print(vec[i]+" ");
		}
	}
	public static void main(String[] args) {
		Ordenar or=new Ordenar();
	}
}
