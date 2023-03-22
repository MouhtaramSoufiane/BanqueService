package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "ConversionEuroToDh")
    public double conversion(@WebParam(name = "montant") double mnt){
        return mnt*11;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code,Math.random(),new Date());

    }
    @WebMethod
    public List<Compte> listCompte(){
        List<Compte> list=new ArrayList<>();
        list.add(new Compte(1,Math.random(),new Date()));
        list.add(new Compte(2,Math.random(),new Date()));
        list.add(new Compte(3,Math.random(),new Date()));
        return list;

    }
}
