import java.io.InputStream;
import java.util.Scanner;
public class SistemasNumericosIntercambiables {
	public static void main(String[] args) {
		
		int menu;
		int valor[] = {0,1,5,10,50,100};
		int suma = 0;
		int ant =0;
		int mc =0;
		char letra = ' ';
		char Rom[] = {' ', 'I', 'V', 'X', 'L', 'C'};
		Scanner entrada = new Scanner(System.in);
        System.out.printf("%s%n","1. Convertir de Arabigos a Romanos");
        System.out.printf("%n");
        System.out.printf("%s%n","2. Convertir de Romanos a Arabigos");
        System.out.printf("%s%n","Ingresa Opcion:");
        System.out.printf("%n");
        menu = entrada.nextInt();
		// TODO Auto-generated method stub
        switch(menu) {
        case 1: 
        	//Este caso va a ser usado para convertir los numeros de Romanos a Arabigos
        	System.out.printf("%s%n","Convertir numeros Romanos a Arabigos");
            Scanner leer = new Scanner(System.in);
            System.out.printf("Ingrese el numero Romano a convertir: ");
            String romano = leer.nextLine();
            for(int i = 0; i < romano.length(); i++){

                letra = romano.charAt(i);

                for(int j = 0; j < Rom.length; j++){

                    if(letra == Rom[j]){

                                suma = suma + valor [j];

                            if( ant < valor[j]){ 

                                    suma = suma - ant*2 ; 

                                    ant = valor[j]; 

                            }else {

                        ant = valor[j];

                                }

                    }

                }

        }

        System.out.print(suma);
        break;
        case 2:
        	//Este caso va a ser usado para convertir los numeros de Arabigos a Romanos
        	
        	Scanner in = new Scanner (System.in);
        	System.out.print("Ingrese el numero arabigo a cambiar: ");
        	int numero = in.nextInt();
        	System.out.println();
        	switch ((numero/100)%10) {
        	case 1: System.out.print("C");	break;
        	}
        	switch ((numero/10)%10) {
        	case 1: System.out.print("X");	break;
        	case 2: System.out.print("XX"); break;
        	case 3: System.out.print("XXX");	break;
        	case 4: System.out.print("XL");	break;
        	case 5: System.out.print("L");	break;
        	case 6: System.out.print("LX");	break;
        	case 7: System.out.print("LXX");	break;
        	case 8: System.out.print("LXXX");	break;
        	case 9: System.out.print("XC");	break;
        	}
        	
        	switch (numero%10) {
        	
        	case 1: System.out.print("I");	break;
        	case 2: System.out.print("II");	break;
        	case 3: System.out.print("III"); break;
        	case 4: System.out.print("IV");	break;
        	case 5: System.out.print("V");	break;
        	case 6: System.out.print("VI");	break;
        	case 7: System.out.print("VII");	break;
        	case 8: System.out.print("VIII");	break;
        	case 9: System.out.print("IX");	break;
        }
        System.out.println('\n');
        }
	}
	

	}


