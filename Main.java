import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombreObra;
        int nTrabajadores;
        double totalSueldo = 0.0;
        double sueldo;
        double promedioSueldo;

        System.out.print("Ingrese el nombre de la obra: ");
        nombreObra = entrada.nextLine();

        System.out.print("Ingrese el número de trabajadores: ");
        nTrabajadores = entrada.nextInt();

        for (int i = 1; i <= nTrabajadores; i++) {
            System.out.print("Ingrese el sueldo del trabajador " + i + ": ");
            sueldo = entrada.nextDouble();
            totalSueldo += sueldo;
        }

        promedioSueldo = totalSueldo / nTrabajadores;

        System.out.println("El nombre de la obra es: " + nombreObra);
        System.out.println("El total de sueldo pagado es: " + totalSueldo);
        System.out.println("El promedio de sueldo por trabajador es: " + promedioSueldo);

       
    }
}
