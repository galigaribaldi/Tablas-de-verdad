import java.util.Scanner;
public class Tabla{
	public Tabla(){

	}
/**
@autor: Barcenas Martinez Edgar Daniel
@autor: Cabrera Garibaldi Hernán Galileo
@see: Este programa ejecuta imprimir las tblas de verdad en java
@param: No recibe ningun parametro
@see: se ejecuta en cuanto decidamos que tabals de verdad Queremos imprimir
*/
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int opcion;
		do{
		System.out.println("1.v (Y)\n2.^(O)\n3.->(IMPLICA)\n4.<->(DOBLE IMPLICACION) \n5.7(NO)\n6.Salir");
		opcion= sc.nextInt();
		switch (opcion) {
			case 1:
			System.out.println("     Disyuncion    ");
			System.out.println("-------------------");
			System.out.println("|  p  |  q   | pvq |");
			System.out.println("-------------------");
			System.out.println("|  v  |  v   |  v  |");
			System.out.println("-------------------");
			System.out.println("|  v  |  f   |  v  |");
			System.out.println("-------------------");
			System.out.println("|  f  |  v   |  v  |");
			System.out.println("-------------------");
			System.out.println("|  f  |  f   |  f  |");
			System.out.println("-------------------");

			System.out.println("     Disyuncion    ");
			System.out.println("-------------------");
			System.out.println("|  p  |  q   | pv7q|");
			System.out.println("-------------------");
			System.out.println("|  v  |  v   |  f  |");
			System.out.println("-------------------");
			System.out.println("|  v  |  f   |  v  |");
			System.out.println("-------------------");
			System.out.println("|  f  |  v   |  v  |");
			System.out.println("-------------------");
			System.out.println("|  f  |  f   |  f  |");
			System.out.println("-------------------");

			break;

			case 2:
			System.out.println("    Conjuncion:   ");
			System.out.println("-------------------");
			System.out.println("|  p  |  q  | p^q |");
			System.out.println("-------------------");
			System.out.println("|  v  |  v  |  v   |");
			System.out.println("-------------------");
			System.out.println("|  v  |  f  |  f   |");
			System.out.println("-------------------");
			System.out.println("|  f  |  v  |  f   |");
			System.out.println("-------------------");
			System.out.println("|  f  |  f  |  f   |");
			System.out.println("-------------------");

			System.out.println();
			System.out.println("    Conjuncion:   ");
			System.out.println("-------------------");
			System.out.println("|  p  |  q  | p^7q |");
			System.out.println("-------------------");
			System.out.println("|  v  |  v  |  f   |");
			System.out.println("-------------------");
			System.out.println("|  v  |  f  |  v   |");
			System.out.println("-------------------");
			System.out.println("|  f  |  v  |  f   |");
			System.out.println("-------------------");
			System.out.println("|  f  |  f  |  f   |");
			System.out.println("-------------------");
			break;

			case 3:
			System.out.println("     IMPLICACION   ");
			System.out.println("-------------------");
			System.out.println("|  p  |  q  |p->q |");
			System.out.println("-------------------");
			System.out.println("|  v  |  v  |  v  |");
			System.out.println("-------------------");
			System.out.println("|  v  |  f  |  f  |");
			System.out.println("-------------------");
			System.out.println("|  f  |  v  |  v  |");
			System.out.println("-------------------");
			System.out.println("|  f  |  f  |  v  |");
			System.out.println("-------------------");

			System.out.println("     IMPLICACION   ");
			System.out.println("-------------------");
			System.out.println("|  p  |  7q  |p->q |");
			System.out.println("-------------------");
			System.out.println("|  v  |  v  |  f  |");
			System.out.println("-------------------");
			System.out.println("|  v  |  f  |  v  |");
			System.out.println("-------------------");
			System.out.println("|  f  |  v  |  f  |");
			System.out.println("-------------------");
			System.out.println("|  f  |  f  |  f  |");
			System.out.println("-------------------");

			break;

			case 4:
			System.out.println(" DOBLE IMPLICACION ");
			System.out.println("-------------------");
			System.out.println("|  p  |  q  |p<->q|");
			System.out.println("-------------------");
			System.out.println("|  v  |  v  |  v  |");
			System.out.println("-------------------");
			System.out.println("|  v  |  f  |  f  |");
			System.out.println("-------------------");
			System.out.println("|  f  |  v  |  f  |");
			System.out.println("-------------------");
			System.out.println("|  f  |  f  |  v  |");
			System.out.println("-------------------");
			break;

			case 5:
			System.out.println("      Negacion     ");
			System.out.println("-------------------");
			System.out.println("|  p   | 7p   |     |");
			System.out.println("-------------------");
			System.out.println("|  v   |  f   |     |");
			System.out.println("-------------------");
			System.out.println("|  f   |  v   |     |");
			System.out.println("-------------------");
			case 6:
			System.out.println("Saliendo.....");
			break;
			default:
				System.out.println("opcion Incorrecta:");
		}
	}while(opcion!=6);
	}
}
