import java.util.Scanner;
public class MAIN {

	public static void main(String[] args) {

		Scanner teclado=new Scanner(System.in);
		int posi=0, valor=0;
		int vector[]=new int[10];
		int aux[]=new int[10];
		System.out.println("INTRODUCE LOS VALORES PERTINENTES AL VECTOR ");
		for(int i=0;i<vector.length;i++) {
			if(i<8) {
				vector[i]=teclado.nextInt();
			}else {
				if(i==8) {
					System.out.println("INTRODUZCA UN VALOR");
					vector[i]=teclado.nextInt();
				 valor=vector[i];
				}else {
					if(i==vector.length-1) {
						System.out.println("DI LA POSICION A LA QUE QUIERES QUE SE ENCUENTRE");
						vector[i]=teclado.nextInt();
						posi=vector[i];
					}
				}
			}			
		}
		
		for(int i=0;i<vector.length;i++) {
			if(posi==i) {
				aux[i]=valor;
			}else {
				if(i>posi) {
					aux[i]=vector[i-1];
				}else {
					if(i<posi) {
						aux[i]=vector[i];
					}
				}
			}
		}
		System.out.println("LA MATRIZ ES: ");
		for(int i=0;i<vector.length;i++) {
			System.out.print(aux[i]);
		}
	}
}