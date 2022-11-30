import java.util.Scanner;

/*
 * Programa:
 * Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a
 * introducir). El programa debe informar de cuantos números introducidos son mayores que
 * 0, menores que 0 e iguales a 0.
 * 
 * 
 * Cuandos numeros desea ingresar: ?
 * -2
 * 
 * 
 * */
public class Do_while_6 {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Scanner teclado = new Scanner(System.in);
		
		// Variables
		int numero; // Almacena los numeros entrantes de teclado
		int contador;  // Llevara el incremento del los datos a introducir
		int mayor; // cuantos mayores hay
		int menor; // Cuantos menores hay
		int cero; // Cuantos cero hay
		
		mayor = 0;
		menor = 0;
		cero = 0;
		
		System.out.println("Introduce la cantidad de numeros que vas a introducir");
		contador = teclado.nextInt();
		
		do {
			if(contador <= 0) {
				System.out.println("El numero ingresado debe ser un entero positivo. Ingresa un nuevo valor: ");
				contador = teclado.nextInt();
			}
		}while(contador <= 0);
		
		// Si la contrador Trae un valor negativo no entra el ciclo
		while(contador > 0){
			System.out.println("Introduce un Numero: ");
			numero = teclado.nextInt();
			
			if(numero > 0){
				mayor ++;
			} else if (numero < 0) {
				menor ++;
			}else {
				cero ++;
			}
			
			//contador = contador -1;
			contador --;		
		}
		
		System.out.println("Fin");

	}

}
