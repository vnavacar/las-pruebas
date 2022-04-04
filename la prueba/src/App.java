import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String iniciales = ClaseCadena.DevuelveIniciales("Andreas Dulac"); 
        System.out.println("Intentando: Andreas Dulac,El metodo devuelve: "+iniciales);

        System.out.println("Intentando: '''' El metodo devuelve: "+ClaseCadena.DevuelveIniciales(""));
        System.out.println("Intentando: 1234 4231 El metodo devuelve: "+ClaseCadena.DevuelveIniciales("1234 4231"));
        Scanner teclado = new Scanner(System.in);
        String entrada;

        do{
            System.out.println("Introduzca otro nombre");
            entrada = teclado.nextLine();
            System.out.println("El metodo devuelve: "+ClaseCadena.DevuelveIniciales(entrada) );
        }while(entrada.equals("no") == false);
        teclado.close();

    }
}
