package startUp;

<<<<<<< HEAD
import werkzeuge.kontextWerkzeug.KontextWerkzeug;

public class StartUp
{

            
    public static void main(String[] args)
    {
       new KontextWerkzeug(); 
=======
import services.LadeServiceDummyImpl;
import werkzeuge.kontextWerkzeug.KontextWerkzeug;

public class StartUp
{

            
    public static void main(String[] args)
    {
       
       new KontextWerkzeug(new LadeServiceDummyImpl()); 
>>>>>>> branch 'master' of https://github.com/karimdjemai/CommApp

    }

}
