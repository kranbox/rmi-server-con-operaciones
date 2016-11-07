


public class RMIServerMain {

    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        try 
        {
            RMIService ws = new RMIService();
           
            int suma = ws.getSuma(123, 10);
            int resta = ws.getResta(123, 10);
            int multiplicacion = ws.getMultiplicacion(123, 10);
            int division = ws.getDivision(123, 10);

            System.out.println("suma: " + suma);
            System.out.println("resta: " + resta); 
            System.out.println("multiplicacion: " + multiplicacion); 
            System.out.println("division: " + division); 
        } 
        catch (Exception ex)
        {
            ex.printStackTrace();
            System.out.println("ERROR: " + ex);
        }
    }
}
