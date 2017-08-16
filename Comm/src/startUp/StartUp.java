package startUp;


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

    }

}
