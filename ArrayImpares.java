import java.util.Scanner;

*/hola mundo*/
public class ArrayImpares{
	public static void main (String[] args){
		int[] numero = new int[15];
		Scanner lector = new Scanner(System.in);
		for(int i = 0; i<numero.length; i++) {
			System.out.print("Numero[" + i + "]: ");
			numero[i]=lector.nextInt();
			}
		
		for(int i=numero.length-1; i>=0; i--) {
			if (numero[i]%2 !=0)
			System.out.print(numero[i] + " ");
		}
	
	}
}