import java.util.Scanner;

public class Encuentranumero2{
	public static void main (String[] args){
		
		Scanner lector= new Scanner (System.in);
		int [] numeros = new int[4];
		numeros[0]=10;
		numeros[1]=3;
		numeros[2]=2;
		numeros[3]=5;
		
		int pos = buscaNumero(numeros,7);
		System.out.println(pos);
	}
	
	public static int buscaNumero(int[] enteros, int valor){
		int index=-1;
		for(int i=0; i<enteros.length && index==-1;i++){
			if(enteros[i]==valor) {
				index=i;
			}
		}
			
		return index;
	}
}