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
		
		/*
		 * Si el valor que trae contador es menor o igual a 0
		 * Este entrara en un nuevo proceso en el ciclo do-While
		 * Y este se va a ejecutar siempre y cuando se le asigne un numero negativo a contador
		 * para culminar el ciclo, contador debe tener un valor entero positivo
		 * */
		do {
			if(contador <= 0) {
				System.out.println("El numero ingresado debe ser un entero positivo. Ingresa un nuevo valor: ");
				contador = teclado.nextInt();
			}
		}while(contador <= 0);
		
		
		/*
		 * Cuando Contador traiga un valor entero positivo 
		 * entrara al ciclo While y va a solicitar la contidad
		 * que tiene asignado contador y esa seran las iteraciones del ciclo 
		 * */
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
