import java.util.Scanner;
public class Sueldos
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numObreros;
        Obreros[] losObreros = new Obreros[50];
        String identificacion, nombre, rango;
        double sueldo1, sueldo2, sueldo3;
        double promedio =0;
        
        System.out.println("diguite el numero de obreros: ");
        numObreros = sc.nextInt();
        
        for(int i=0;i<numObreros;i++){
            System.out.println("diguite la identificacion del obrero: ");
            identificacion = sc.next();
            System.out.println("diguite el nombre del obrero: ");
            nombre = sc.next();
            System.out.println("diguite el rango de obrero: ");
            rango = sc.next();
            System.out.println("diguite el sueldo 1 del obrero: ");
            sueldo1 = sc.nextDouble();
            System.out.println("diguite el sueldo 2 del obrero: ");
            sueldo2 = sc.nextDouble();
            System.out.println("diguite el sueldo 3 del obrero: ");
            sueldo3= sc.nextDouble();
            
            Obreros unObrero = new Obreros(identificacion, nombre, rango, sueldo1, sueldo2, sueldo3);
            losObreros[i] = unObrero;
        }
        for(int i=0;i<numObreros;i++){
            promedio = promedio + losObreros[i].calcularPromedio();
        }
        promedio = promedio / numObreros;
        System.out.println("\nel promedio del sueldo es: "+promedio);
    }
}
