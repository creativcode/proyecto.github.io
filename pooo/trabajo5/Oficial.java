public class Oficial
{

    private final String identificacion;
    private String nombre;
    private String rango;
    private double sueldouno;
    private double sueldodos;
    private double sueldotres;
    
    public String getIdentificacion(){
        return identificacion;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if(nombre != null) this.nombre = nombre;
        else this.nombre = "";
    }
    
    public String getRango(){
        return rango;
    }
    public void setRango(String rango){
        if(rango != null) this.rango = rango;
        else this.rango = "";
    }
    
    public double getSueldouno(){
        return sueldouno;
    }
    public void setSueldouno(double sueldouno){
        if(sueldouno >= 0) this.sueldouno = sueldouno;
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
    
    Oficial(String identificacion, String nombre, String rango, double sueldouno, double sueldodos, double sueldotres){
        if(identificacion != null) this.identificacion = identificacion;
        else this.identificacion = "";
        setNombre(nombre);
        setRango(rango);
        setSueldouno(sueldouno);
        setSueldodos(sueldodos);
        setSueldotres(sueldotres);
    }
    
    double calcularPromedio(){
        return (sueldouno + sueldodos + sueldotres) / 3;
    }
}




















