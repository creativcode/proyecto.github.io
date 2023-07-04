import java.util.Scanner;
public class Sueldo
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numObreros;
        Obrero[] losObreros = new Obrero[51];
        String identificacion, nombre, puesto;
        double sueldo1, sueldo2, sueldo3;
        double promedio=0;
        
        System.out.println("diguite la cantidad de obreros: ");
        numObreros = sc.nextInt();
        
        for(int i=1;i<=numObreros;i++){
            System.out.println("diguite la identificaccion del obrero #"+i);
            identificacion = sc.next();
            System.out.println("diguite el nombre del obrero: ");
            nombre = sc.next();
            System.out.println("diguite el puesto del obrero: ");
            puesto = sc.next();
            System.out.println("diguite el 1 sueldo: ");
            sueldo1 = sc.nextDouble();
            System.out.println("diguite el 2 sueldo: ");
            sueldo2 = sc.nextDouble();
            System.out.println("diguite el 3 sueldo: ");
            sueldo3 = sc.nextDouble();
            
            Obrero unObrero = new Obrero();
            
            unObrero.identificacion = identificacion;
            unObrero.nombre = nombre;
            unObrero.puesto = puesto;
            unObrero.sueldoUno = sueldo1;
            unObrero.sueldoDos = sueldo2;
            unObrero.sueldoTres = sueldo3;
            
            losObreros[i] = unObrero;
        }
        for(int i=1;i<=numObreros;i++){
            double sum = (losObreros[i].sueldoUno+losObreros[i].sueldoDos+losObreros[i].sueldoTres) /3;
            promedio = promedio + sum;
        }
        promedio = promedio / numObreros;
        System.out.println("el promedio de el sueldo es: "+promedio);
    }
}
