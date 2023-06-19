<!--HEADING-->
# Ejercicio Base

En su labor como programador de software ha sid elegido para desarrollar un programa que necesita un jefe de obra, que desea calcular el promedio del sueldo de los trabajadore de su obra de construccion

Aclaraciones: 

* Se debe poder ingresar el nombre de la obra
* se debe ingresar la cantida de trabajdores 
* Se mostrara en pantalla el nombre de la obra y el promeio que gana un trabajador

## [Historia dDe Usuario](https://dfafadhadfh.atlassian.net/jira/servicedesk/projects/P1/queues/custom/19/P1-1 "jira")

![plantilla_historia_usuario](jira.jfif)

## [Caso De Uso](https://lucid.app/lucidchart/50890080-53e1-482a-b8c5-c762263721d8/edit?invitationId=inv_02a784d2-b9d7-4e5d-9a52-bcf140b7d575 "lucidchard")

![plantilla_caso_uso](caso.jfif)

## [Diagrama De Flujo](https://lucid.app/lucidchart/686fd944-9b2f-4314-8607-1daaa7888887/edit?invitationId=inv_71c76c7c-2eb1-4cb4-9189-e5d30f187066 "lucidchart")

![plantilla_diagrama_flujo](diagrama.jfif)

## [Seudo Codigo]()

![plantilla_seudocodigo](seudo.jfif)

# Codigo

Java

import java.util.Scanner;

public class promedio

{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nombreObra;
        int nTrabajadores;
        double totalSueldo = 0;
        double sueldo;
        double promedioSueldo;
        
        System.out.print("diguite el nombre de la obra ");
        nombreObra = entrada.next();
        System.out.print("Ingrese la cantidad de trabajadores: ");
        nTrabajadores = entrada.nextInt();

        for (int i=1; i<=nTrabajadores; i++) {

            System.out.print("Ingrese el sueldo del trabajador " + i + ": ");
            sueldo = entrada.nextDouble();
            totalSueldo += sueldo;
        }

        promedioSueldo = totalSueldo / nTrabajadores;
        
        System.out.println("\nobra "+nombreObra);
        System.out.println("El promedio del sueldo de los " + nTrabajadores + " trabajadores es: " + promedioSueldo);
    }
}



# proyect.github.io
