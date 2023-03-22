import ws.BanqueService;

import javax.xml.ws.Endpoint;

public class ServeurWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9999/",new BanqueService());
        System.out.println("web service deploye dans http://0.0.0.0:9999/");
    }
}
