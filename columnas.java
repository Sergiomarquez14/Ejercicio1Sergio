import java.util.Scanner;
/* COLUMNAS
Hacer un programa que imprima a 10 columnas los números enteros
del 1 hasta el límite que especifique el usuario.*/
public class Columnas {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
	    // pedir número al usuario
		System.out.print("Introduce límite: ");
		int limite = sc.nextInt() ;
		
		for(int i=1; i<=límite; i++) {
			System.out.print(i + "  ");
			if ( i%10 == 0)  {
				System.out.println();
		}
	}
	
}