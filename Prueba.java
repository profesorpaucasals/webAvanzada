
/**
 * Write a description of class Prueba here.
 * 
 * @author JUAN PEDRO 1.0
 * @version (a version number or a date)
 */
public class Prueba
{
    public static void main(String[] args) {
        try {
            
        String texto_iso=new String(new String("ñ").getBytes(),"ISO-8859-1");
        
        
        System.out.println(texto_iso);
        
        } catch (Exception e) {
            
        }
    }
}
