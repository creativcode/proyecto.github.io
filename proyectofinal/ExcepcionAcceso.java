public class ExcepcionAcceso extends Exception
{
    public ExcepcionAcceso(String message) {
        super(message);
    }
   
    public ExcepcionAcceso(String message, Throwable cause) {
        super(message, cause);
    }
    
    @Override
    public String toString() {
        String className = getClass().getName();
        String message = getLocalizedMessage();
        return (message != null) ? (className + ": " + message) : className;
    }
}
