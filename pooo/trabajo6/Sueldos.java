import java.util.Scanner;
public class Sueldos
{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        Obra miObra = new Obra("123", "gransan"); 
        String id, nombre, curso;
        
        double promedio =0;
        
        System.out.println("diguite el numero de ayudantes");
        int numAyudantes = sc.nextInt();
        for(int i=0;i<numAyudantes;i++){
            double sueldo1, sueldo2;
            System.out.println("diguite la id ");
            id =sc.next();
            System.out.println("diguite el nombre");
            nombre =sc.next();
            System.out.println("diguite el sueldo");
            sueldo1=sc.nextDouble();
            System.out.println("diguite el sueldo");
            sueldo2=sc.nextDouble();
        }
        
        System.out.println("diguite el numero de obreros");
        int numObreros = sc.nextInt();
        for(int i=0;i<numObreros;i++){
            double sueldo1, sueldo2;
            System.out.println("diguite la id ");
            id =sc.next();
            System.out.println("diguite el nombre");
            nombre =sc.next();
            System.out.println("diguite el sueldo");
            sueldo1=sc.nextDouble();
            System.out.println("diguite el sueldo");
            sueldo2=sc.nextDouble();
        }
        
        System.out.println("diguite el numero de maestros");
        int numMaestros = sc.nextInt();
        for(int i=0;i<numMaestros;i++){
            double sueldo1, sueldo2;
            System.out.println("diguite la id ");
            id =sc.next();
            System.out.println("diguite el nombre");
            nombre =sc.next();
            System.out.println("diguite el sueldo");
            sueldo1=sc.nextDouble();
            System.out.println("diguite el sueldo");
            sueldo2=sc.nextDouble();
        }
        
        promedio = miObra.calcularPromedioGeneral();
        System.out.println("\n el promedio de sueldos es: "+promedio);
    }
}
