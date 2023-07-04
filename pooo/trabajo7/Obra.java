import java.util.ArrayList;
public class Obra
{
    private final String nit;
    private String nomObra;
    private ArrayList trabajador;
    
    public Obra(String nit, String nomObra){
        if(nit != null) this.nit = nit;
        else this.nit ="";
        setNomObra(nomObra);
        trabajador = trabajador = new ArrayList();
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getNomObra(){
        return nomObra;
    }
    public void setNomObra(String nomObra){
        if(nomObra != null) this.nomObra =nomObra;
        else this.nomObra ="";
    }
    
    public double calcularPromedioGeneral(){
        double promedio =0;
        for(int i=0; i<trabajador.size(); i++){
            promedio += ((Trabajador) trabajador.get(i)).calcularPromedio();
        }
        return promedio /3;
    }
    
    public void adicionarTrabajador(String id, String nombre, double sueldouno)throws Exception{
        trabajador.add(new Ayudante(id, nombre, sueldouno));
    }
    
    public void adicionarTrabajador(String id, String nombre, double sueldouno, double sueldodos)throws Exception{
        trabajador.add(new Oficial(id, nombre, sueldouno, sueldodos));
    }
    
    public void adicionarTrabajador(String id, String nombre, double sueldouno, double sueldodos, double sueldotres)throws Exception{
        trabajador.add(new Maestro(id, nombre, sueldouno, sueldodos, sueldotres));
    }
}


















