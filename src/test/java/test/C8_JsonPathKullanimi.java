package test;

import org.json.JSONObject;
import org.junit.Test;
import org.json.JSONArray;

public class C8_JsonPathKullanimi
 {
    @Test
    public void jsonPath01() {

        JSONObject kisiselBilgileri = new JSONObject();
        JSONObject adresBilgileri = new JSONObject();
        JSONObject cepTelefonuBilgileri = new JSONObject();
        JSONObject evTelefonuBilgileri = new JSONObject();
        JSONArray telefonBilgileri = new JSONArray();

        cepTelefonuBilgileri.put("type","iPhone");
        cepTelefonuBilgileri.put("number","0123-4567-8888");

        evTelefonuBilgileri.put("type","home");
        evTelefonuBilgileri.put("number","0123-4567-8910");

        telefonBilgileri.put(cepTelefonuBilgileri);
        telefonBilgileri.put( evTelefonuBilgileri);

        adresBilgileri.put("streetAdress","naist street");
        adresBilgileri.put("city","Nara");
        adresBilgileri.put("postalCode","630-0192");

        kisiselBilgileri.put("firstName","John");
        kisiselBilgileri.put("lastName","Doe");
        kisiselBilgileri.put("age",26);
        kisiselBilgileri.put("address",adresBilgileri);
        kisiselBilgileri.put("telephone",telefonBilgileri);

        System.out.println(kisiselBilgileri);


    }






}
