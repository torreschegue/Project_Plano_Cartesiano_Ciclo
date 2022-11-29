import java.util.Scanner;

public class Do_While {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		do {
			System.out.println("Ingrese un valor entre 0 y 999 (0 - Finaliza)");
			numero = teclado.nextInt();
			
			if(numero >= 100 && numero <= 999) {
				System.out.println("Tu numero es de 3 digitos");
			} else if (numero >= 10 && numero < 100){
				System.out.println("Tu numero es de 2 digitos");
			}else if (numero < 10){
				System.out.println("Tu numero es de 1 digitos");
			}else {
				System.out.println("Tu numero esta fuera de Rango .... !");
			}
				
			
		} while (numero != 0);
	}
	
}
