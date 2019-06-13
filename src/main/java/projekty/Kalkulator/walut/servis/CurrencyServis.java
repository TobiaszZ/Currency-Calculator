package projekty.Kalkulator.walut.servis;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import projekty.Kalkulator.walut.repository.CurrencyRepository;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

@Component
public class CurrencyServis {
    @Autowired
    CurrencyRepository currencyRepository;


    public Double getJson(String code) {

        String url = "http://api.nbp.pl/api/exchangerates/rates/A/" + code + "?format=json";
        Double currencyValue = null;
        try {
            URL obj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

            int responseCode = connection.getResponseCode();

            BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = input.readLine()) != null) {
                response.append((inputLine));
            }
            input.close();

            JSONObject resp = new JSONObject(response.toString());
            JSONArray rates = resp.getJSONArray("rates");
            JSONObject currency = new JSONObject(rates.get(0).toString());
            currencyValue = currency.getDouble("mid");

            System.out.println(resp.getString("currency"));
            System.out.println("value: " + currencyValue);
            System.out.println("data: " + currency.getString("effectiveDate"));

            System.out.println("Request URL: " + url);
            System.out.println("Response code: " + responseCode);

            System.out.println("rates   " + rates);

        } catch (Exception e) {
            e.printStackTrace();
        }


        return currencyValue;
    }


    public boolean validate(String eur, String sek, String nok, String dkk) {
        try {
            double dEur = Double.parseDouble(eur);
            double dSek = Double.parseDouble(sek);
            double dNok = Double.parseDouble(nok);
            double dDkk = Double.parseDouble(dkk);
            double result = dEur * dSek * dNok * dDkk;
            if (dEur < 0&&dSek< 0&&dNok< 0&&dDkk< 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }


    }

}
