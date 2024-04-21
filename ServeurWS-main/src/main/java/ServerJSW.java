import jakarta.xml.ws.Endpoint;
import org.example.BanqueService;

public class ServerJSW {
    public static void main(String[] args){
        Endpoint.publish("http://0.0.0.0:9191/",new BanqueService());
        System.out.println("Web Service deploye sur http://0.0.0.0:9191/");
    }
}
