import java.util.Scanner;
public class Sueldo
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int numTrabajadores;
        Obra miObra = new Obra("123456", "grancolombia", "fusagasuga");
        String identificacion, nombre, rango;
        double sueldo1, sueldo2, sueldo3;
        double promedio = 0;
        
        System.out.println("diguite el numero de trabajdores");
        numTrabajadores =sc.nextInt();
        
        for(int i=0;i<numTrabajadores; i++){
            System.out.println("diguite la identificacion del trabajadador: ");
            identificacion = sc.next();
            System.out.println("diguite el nombre del trabajador: ");
            nombre = sc.next();
            System.out.println("diguite el rango del trabajador: ");
            rango = sc.next();
            System.out.println("diguite el suledo 1 del trbajador");
            sueldo1 = sc.nextDouble();
            System.out.println("diguite el suledo 2 del trbajador");
            sueldo2 = sc.nextDouble();
            System.out.println("diguite el suledo 3 del trbajador");
            sueldo3 = sc.nextDouble();
            miObra.adicionarTrabajador(identificacion, nombre, rango, sueldo1, sueldo2, sueldo3);
        }
        
        promedio = miObra.calcularPromedioGeneral();
        System.out.println("\nel promedio del los sueldos es: "+promedio);
    }
}
