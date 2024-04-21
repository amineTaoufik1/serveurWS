package org.example;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.List;

@WebService(serviceName="BanqueWS")
public class BanqueService {

        @WebMethod(operationName="ConversionEuroToDh")
        public double conversion(@WebParam(name="montant")double mt){

            return mt*11;

        }

        @WebMethod
        public String test(){ return "Test"; }
        @WebMethod
        public Compte getCompte(){ return new Compte (1,7000); }
        @WebMethod
        public List<Compte> getComptes(){
            List<Compte> cptes=new ArrayList<Compte>();
            cptes.add (new Compte (1,7000));
            cptes.add (new Compte (2,7000));
            cptes.add (new Compte (3,7000));
            return cptes;

}
}
