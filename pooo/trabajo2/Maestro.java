public class Maestro
{
    String identificacion;
    String nombre;
    String rango;
    double sueldoUno;
    double sueldoDos;
    double sueldoTres;
    
    Maestro(String identificacion, String nombre, String rango, double notaUno, double notaDos, double notaTres){
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.rango = rango;
        this.sueldoUno = sueldoUno;
        this.sueldoDos = sueldoDos;
        this.sueldoTres = sueldoTres;
    }
    double calcularPromedio(){
        return (sueldoUno+sueldoDos+sueldoTres) /3;
    }    
}
