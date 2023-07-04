
public class Ayudante extends Trabajador
{
    private double sueldouno;
    
    Ayudante(String id, String nombre, double sueldouno)throws Exception{
        super(id, nombre);
        setSueldouno(sueldouno);
    }
    
    public double calcularPromedio(){
        return sueldouno;
    }
    
    public double setSueldouno(){
        return sueldouno;
    }
    public void setSueldouno(double sueldouno){
        if(sueldouno >=0) this.sueldouno = sueldouno;
        else this.sueldouno =0;
    }
}













