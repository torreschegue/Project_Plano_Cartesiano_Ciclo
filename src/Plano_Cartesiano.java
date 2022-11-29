import java.util.Scanner;

public class Plano_Cartesiano {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		int conjuntoCoordenadas, x, y, contadorCuadrante1,  contadorCuadrante2,  contadorCuadrante3,  contadorCuadrante4;
		contadorCuadrante1 = 0;
		contadorCuadrante2 = 0;
		contadorCuadrante3 = 0;
		contadorCuadrante4 = 0;
		
		System.out.println("Cual es la cantidad de coordenadas en X y Y:");
		conjuntoCoordenadas = teclado.nextInt();
		
		for(int i = 1; i<=conjuntoCoordenadas; i++) {
			
			System.out.println("Ingrese Coordenada en X: " + i);
			x = teclado.nextInt();	
			System.out.println("Ingrese Coordenada en Y: " + i);
			y = teclado.nextInt();	
			
			if(x>0 && y>0) {
				contadorCuadrante1 ++;
			}else if(x<0 && y>0) {
				contadorCuadrante2 ++;
			} else if(x<0 && y <0) {
				contadorCuadrante3 ++;
			}else if(x>0 && y<0) {
				contadorCuadrante4 ++;
			}
		}
		
		System.out.println("Cantidad de puntos en el cuadrante #1: " + contadorCuadrante1);
		System.out.println("Cantidad de puntos en el cuadrante #2: " + contadorCuadrante2);
		System.out.println("Cantidad de puntos en el cuadrante #3: " + contadorCuadrante3);
		System.out.println("Cantidad de puntos en el cuadrante #4: " + contadorCuadrante4);

	}

}
