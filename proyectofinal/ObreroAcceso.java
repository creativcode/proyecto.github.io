import java.util.List;

public interface ObreroAcceso {
    boolean registrarObrero(Obrero obrero) throws ExcepcionAcceso;
    List<Obrero> obtenerObreros() throws ExcepcionAcceso;
    boolean actualizarObrero(Obrero obrero) throws ExcepcionAcceso;
    boolean eliminarObrero(Obrero obrero) throws ExcepcionAcceso;
    Obrero obtenerObreroPorId(int id) throws ExcepcionAcceso;
}

