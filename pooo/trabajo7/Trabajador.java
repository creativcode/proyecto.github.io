public abstract class Trabajador
{
    protected final String id;
    private String nombre;
    
    public Trabajador(String id, String nombre)throws Exception{
        if(id.trim().equals(""))
            throw new Exception("valor invalido ");
        if(id.matches(".*[a-zA-Z].*"))
            throw new Exception("la id no puede tener caracteres");
            
        this.id =id;
        setNombre(nombre);
    }
    
    public abstract double calcularPromedio();
    
    public String getId(){
        return id;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if(nombre != null) this.nombre = nombre;
        else this.nombre ="";
    }
}















