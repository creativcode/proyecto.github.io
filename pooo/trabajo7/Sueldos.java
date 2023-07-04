import java.util.Scanner;
public class Sueldos
{
    public static void main(String args[])throws Exception{
        Scanner sc = new Scanner(System.in);
        Obra miObra = new Obra("123", "granColombia");
        String id, nombre;
        double sueldo1, sueldo2, sueldo3;
        double promedio =0;
        int opcMenu =0;
        
        do{
            System.out.println("\nMenu de opciones");
            System.out.println("[1] adicionar ayudante");
            System.out.println("[2] adicionar oficial");
            System.out.println("[3] adicionar maestro");
            System.out.println("[4] calcular promedio");
            System.out.println("[5] salir\n");
            System.out.println("Escoje una opcion: ");
            opcMenu = sc.nextInt();
            switch(opcMenu){
                case 1:
                sc.nextLine();
                System.out.println("diguite la id");
                id = sc.next();
                System.out.println("diguite el nombre");
                nombre = sc.next();
                System.out.println("diguite el sueldo");
                sueldo1 = sc.nextDouble();
                try{
                    miObra.adicionarTrabajador(id, nombre, sueldo1);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
                System.out.println("************");
                
                case 2:
                sc.nextLine();
                System.out.println("diguite la id");
                id = sc.next();
                System.out.println("diguite el nombre");
                nombre = sc.next();
                System.out.println("diguite el sueldo");
                sueldo1 = sc.nextDouble();
                System.out.println("diguite el sueldo");
                sueldo2 = sc.nextDouble();
                try{
                    miObra.adicionarTrabajador(id, nombre, sueldo1, sueldo2);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
                System.out.println("************");
                case 3:
                sc.nextLine();
                System.out.println("diguite la id");
                id = sc.next();
                System.out.println("diguite el nombre");
                nombre = sc.next();
                System.out.println("diguite el sueldo");
                sueldo1 = sc.nextDouble();
                System.out.println("diguite el sueldo");
                sueldo2 = sc.nextDouble();
                System.out.println("diguite el sueldo");
                sueldo3 = sc.nextDouble();
                try{
                    miObra.adicionarTrabajador(id, nombre, sueldo1, sueldo2, sueldo3);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
                System.out.println("************");
                case 4:
                    sc.nextLine();
                    promedio =miObra.calcularPromedioGeneral();
                    System.out.println("\n el promedio es: "+promedio);
                    break;
                default:
                    System.out.println("ha seleccionado salir");
            }
        }while(opcMenu != 5);
    }
    
}














