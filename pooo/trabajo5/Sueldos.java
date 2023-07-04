 import java.util.Scanner;
public class Sueldos
{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        Obra miObra = new Obra("1234567","grancolombia","fusagasuga");
        String identificacion, nombre, rango;
        
        double promedio =0;
        
        System.out.println("diguite el numero de ayudantes: ");
        int numAyudantes = sc.nextInt();
        for(int i=0;i<numAyudantes;i++){
            double sueldo1, sueldo2, sueldo3;
            System.out.println("diguite la identificacion del ayudante: ");
            identificacion = sc.next();
            System.out.println("diguite el nombre del ayudante: ");
            nombre = sc.next();
            System.out.println("diguite el rango del ayudante: ");
            rango = sc.next();
            System.out.println("diguite el sueldo del trabajador: ");
            sueldo1 =sc.nextDouble();
            System.out.println("diguite el sueldo del trabajador: ");
            sueldo2 = sc.nextDouble();
            System.out.println("diguite el sueldo del trabajador: ");
            sueldo3 =sc.nextDouble();
            
            miObra.adicionarAyudante(identificacion, nombre, rango, sueldo1, sueldo2, sueldo3);        
        }
        
        System.out.println("diguite el numero de oficiales: ");
        int numOficiales = sc.nextInt();
        for(int i=0;i<numOficiales;i++){
            double sueldo1, sueldo2, sueldo3;
            System.out.println("diguite la identificacion del oficiales: ");
            identificacion = sc.next();
            System.out.println("diguite el nombre del oficial: ");
            nombre = sc.next();
            System.out.println("diguite el rango del oficial: ");
            rango = sc.next();
            System.out.println("diguite el sueldo del trabajador: ");
            sueldo1 =sc.nextDouble();
            System.out.println("diguite el sueldo del trabajador: ");
            sueldo2 = sc.nextDouble();
            System.out.println("diguite el sueldo del trabajador: ");
            sueldo3 =sc.nextDouble();
            
            miObra.adicionarOficial(identificacion, nombre, rango, sueldo1, sueldo2, sueldo3);
        }
        
        System.out.println("diguite el numero de maestros: ");
        int numMaestros = sc.nextInt();
        for(int i=0;i<numMaestros;i++){
            double sueldo1, sueldo2, sueldo3;
            System.out.println("diguite la identificacion del maestro: ");
            identificacion = sc.next();
            System.out.println("diguite el nombre del maestro: ");
            nombre = sc.next();
            System.out.println("diguite el rango del maestro: ");
            rango = sc.next();
            System.out.println("diguite el sueldo del trabajador: ");
            sueldo1 =sc.nextDouble();
            System.out.println("diguite el sueldo del trabajador: ");
            sueldo2 = sc.nextDouble();
            System.out.println("diguite el sueldo del trabajador: ");
            sueldo3 =sc.nextDouble();
            
            miObra.adicionarMaestro(identificacion, nombre, rango, sueldo1, sueldo2, sueldo3);
        }
        
        promedio = miObra.calcularPromedioGeneral();
        System.out.println("\nel promedio de los sueldos es: "+promedio);
    }
}






















