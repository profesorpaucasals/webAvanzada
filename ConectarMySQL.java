public class ConectarMySQL {
    public static void main(String[] args) {
        // Cargar el controlador JDBC de MySQL
        try {
            // Registrar el driver JDBC
	    Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver JDBC de MySQL cargado y registrado correctamente.");
        } catch (ClassNotFoundException e) {
            System.out.println("No se pudo cargar el controlador JDBC de MySQL.");
            e.printStackTrace();
            return;
        }
    }
}