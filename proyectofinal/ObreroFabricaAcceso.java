
public class ObreroFabricaAcceso
{
    public static ObreroAcceso creaObreroAcceso() throws ExcepcionAcceso {
        return new ObreroAccesoImpl();
    }
}
