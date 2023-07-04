import java.util.Scanner;
public class Sueldo
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Maestro[] losMaestros = new Maestro[50];
        String identificacion, nombre, rango;
        int numMaestros =0, opcionMenu =0;
        double sueldoUno, sueldoDos, sueldoTres;
        double promedio =0;
        
        while(opcionMenu !=3){
            System.out.println("menu de opciones...");
            System.out.println("\n1. agregar un maestro: ");
            System.out.println("2. calcular promedio de sueldo: ");
            System.out.println("3. salir ");
            System.out.println("escoja una opcion... ");
            opcionMenu = sc.nextInt();
            
            if(opcionMenu==1){
                System.out.println("diguite la identificacion del maestro: ");
                identificacion = sc.next();
                System.out.println("diguite el nombre del maestro: ");
                nombre = sc.next();
                System.out.println("diguite el rango del maestro: ");
                rango = sc.next();
                System.out.println("digite el 1 sueldo: ");
                sueldoUno = sc.nextDouble();
                System.out.println("diguite el 2 sueldo: ");
                sueldoDos = sc.nextDouble();
                System.out.println("diguite el 3 sueldo: ");
                sueldoTres = sc.nextDouble();
                
                Maestro unMaestro = new Maestro(identificacion, nombre, rango, sueldoUno, sueldoDos, sueldoTres);
                losMaestros[numMaestros] = unMaestro;
                numMaestros++;    
            }
            else if(opcionMenu ==2){
                for(int i=0;i<numMaestros;i++){
                    promedio = promedio + losMaestros[i].calcularPromedio() / numMaestros;
                }
                System.out.println("\nel promedio del sueldo de los maestros es: "+promedio);
            }          
        }
    }
}
