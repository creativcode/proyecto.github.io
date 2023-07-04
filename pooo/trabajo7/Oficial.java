public class Oficial extends Trabajador
{
    private double sueldouno;
    private double sueldodos;
    
    Oficial(String id, String nombre, double sueldouno, double sueldodos) throws Exception{
        super(id, nombre);
        setSueldouno(sueldouno);
        setSueldodos(sueldodos);
    }
    
    public double calcularPromedio(){
        return (sueldouno + sueldodos)/2;
    }
    
    public double getSueldouno(){
        return sueldouno;
    }
    public void setSueldouno(double sueldouno){
        if(sueldouno >=0) this.sueldouno = sueldouno;
        else this.sueldouno=0;
    }
    
    public double getSueldodos(){
        return sueldodos;
    }
    public void setSueldodos(double sueldodos){
        if(sueldodos >=0) this.sueldodos = sueldodos;
        else this.sueldodos =0;
    }
}

















