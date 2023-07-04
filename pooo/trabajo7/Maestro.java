public class Maestro extends Trabajador
{
    private double sueldouno;
    private double sueldodos;
    private double sueldotres;
    
    Maestro(String id, String nombre, double sueldouno, double sueldodos, double sueldotres)throws Exception{
        super(id, nombre);
        setSueldouno(sueldouno);
        setSueldodos(sueldodos);
        setSueldotres(sueldotres);
    }
    
    public double calcularPromedio(){
        return (sueldouno +sueldodos +sueldotres)/3;
    }
    
    public double getSueldouno(){
        return sueldouno;
    }
    public void setSueldouno(double Sueldouno){
        if(sueldouno >=0) this.sueldouno = sueldouno;
        else this.sueldouno =0;
    }
    
    public double getSueldodos(){
        return sueldodos;
    }
    public void setSueldodos(double sueldodos){
        if(sueldodos >=0) this.sueldodos = sueldodos;
        else this.sueldodos =0;
    }
    
    public double getSueldotres(){
        return sueldotres;
    }
    public void setSueldotres(double sueldotres){
        if(sueldotres >=0) this.sueldotres = sueldotres;
        else this.sueldotres =0;
    }
}
















