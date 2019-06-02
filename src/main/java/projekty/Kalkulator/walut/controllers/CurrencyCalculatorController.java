package projekty.Kalkulator.walut.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import projekty.Kalkulator.walut.repository.CurrencyRepository;
import projekty.Kalkulator.walut.servis.CurrencyServis;

@Controller
public class CurrencyCalculatorController {
    @Autowired
    CurrencyRepository currencyRepository;
    @Autowired
    CurrencyServis currencyServis;

    @RequestMapping("/test")
    @ResponseBody
    public String testApp() {
        return "test aplikacji";
    }


    @RequestMapping("jsp")
    public String testJsp() {
        return "Calculator";
    }

    @RequestMapping("html")
    public String testHtmlL() {
        return "Calculator2";
    }


    @RequestMapping("/json")
    @ResponseBody
    public String testJson() {
        String json1 = currencyServis.getJson("USD");
        String json2 = currencyServis.getJson("DKK");
        String json3 = currencyServis.getJson("NOK");
        String json4 = currencyServis.getJson("SEK");
        String json5 = currencyServis.getJson("EUR");
        return "json test";
    }


}
