public class ArrayNumeros {
	public static void main (String[] args) {
		int[] numeros= new int[100];
		for (int i=0; i<100; i++){
			int rellenar = (int)(Math.random()*100 + 1);
			for (int j=0;j<100;j++){
				if (numeros[j]==rellenar){
					rellenar= (int)(Math.random()*100+1);
					j=-1;
				}
			}
			numeros[i]=rellenar;
		}
		for (int x=0;x<100;x++){
			System.out.printf("%4d",numeros[x]);
		}
	}  
}