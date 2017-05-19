package Act1;

public class Ejercicio1 {

	public static void main(String[] args) {

		int num=0;
		int contadorNeg=0;
		int contadorPos=0;
		int contadorCero=0;
		int media=0;
		int suma=0;
		
		
		
		int[] array= new int[20];
		
		
		for(int i=0; i<20;i++){
		num=(int) Math.round(Math.random()*(100-(-100))+(-100));
		System.out.print(num+" ");
		array[i]=num;
		
		if(array[i]<0){
			contadorNeg++;
		}
		else if(array[i]==0){
			contadorCero++;
		}
		else if(array[i]>0){
			contadorPos++;
		}
		
		
		suma+=num;
		}
		
		media=suma/20;
		
		
		System.out.println("\nNegativos: "+contadorNeg);
		System.out.println("Positivos: "+contadorPos);
		System.out.println("Ceros: "+contadorCero);
		System.out.println("Media: "+media);
		
		
	}

}
