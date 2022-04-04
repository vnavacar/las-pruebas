import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String iniciales = ClaseCadena.DevuelveIniciales("Andreas Dulac"); 
        System.out.println("El metodo devuelve: "+iniciales);
        Scanner teclado = new Scanner(System.in);
        String entrada;

        do{
            System.out.println("Introduzca otro nombre");
            entrada = teclado.nextLine();
            System.out.println("El metodo devuelve: "+ClaseCadena.DevuelveIniciales(entrada) );
        }while(entrada != "no");
        teclado.close();

    }
}
