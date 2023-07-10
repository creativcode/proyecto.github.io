import java.util.List;

public class ControlObrero
{
    private final VistaObrero vista;
    private final ObreroAcceso acceso;

    public ControlObrero() throws ExcepcionAcceso {
        this.vista = new VistaObrero();
        this.acceso = ObreroFabricaAcceso.creaObreroAcceso();
    }

    public void registrar(Obrero obrero) {
        try {
            acceso.registrarObrero(obrero);
        } catch (ExcepcionAcceso e) {
            mostrarError("Error al registrar obrero", e);
        }
    }

    public void actualizar(Obrero obrero) {
        try {
            acceso.actualizarObrero(obrero);
        } catch (ExcepcionAcceso e) {
            mostrarError("Error al actualizar obrero", e);
        }
    }

    public void eliminar(Obrero obrero) {
        try {
            acceso.eliminarObrero(obrero);
        } catch (ExcepcionAcceso e) {
            mostrarError("Error al eliminar obrero", e);
        }
    }
    
    public void verObreros() {
        try {
            List<Obrero> obreros = acceso.obtenerObreros();
            vista.verObreros(obreros);
        } catch (ExcepcionAcceso e) {
            mostrarError("Error al obtener obreros", e);
        }
    }

    public Obrero obtenerObreroPorId(int id) {
        try {
            return acceso.obtenerObreroPorId(id);
        } catch (ExcepcionAcceso e) {
            mostrarError("Error al obtener obrero por ID", e);
            return null;
        }
    }

    private void mostrarError(String mensaje, Exception e) {
        System.out.println(mensaje);
        e.printStackTrace();
    }
}
