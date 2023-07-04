public class Ayudante{
    private final String id;
    private String nombre;
    private double sueldouno;
    private double sueldodos;
    
    public String getId(){
        return id;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if(nombre != null) this.nombre = nombre;
        else this.nombre = "";
    }
        
    public double getSueldouno(){
        return sueldouno;
    }
    public void setSueldouno(double sueldouno){
        if(sueldouno >= 0) this.sueldouno = sueldouno;
        else this.sueldouno = 0;
    }
    
    public double getSueldodos(){
        return sueldodos;
    }
    public void setSueldodos(double sueldodos){
        if(sueldodos >= 0) this.sueldodos = sueldodos;
        else this.sueldodos = 0;
    }
    
    Ayudante(String id, String nombre, double sueldouno, double sueldodos){
        if(id != null) this.id = id;
        else this.id ="";
        setNombre(nombre);
        setSueldouno(sueldouno);
        setSueldodos(sueldodos);
    }
    
    double calcularPromedio(){
        return (sueldouno + sueldodos) /2;
    }
}















