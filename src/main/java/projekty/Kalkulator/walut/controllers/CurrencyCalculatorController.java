package projekty.Kalkulator.walut.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import projekty.Kalkulator.walut.models.CurrencyValues;
import projekty.Kalkulator.walut.repository.CurrencyRepository;
import projekty.Kalkulator.walut.servis.CurrencyServis;

import javax.validation.Valid;

@Controller
public class CurrencyCalculatorController {

    @Autowired
    CurrencyServis currencyServis;

    @RequestMapping("/test")
    @ResponseBody
    public String testApp() {
        return "test aplikacji";
    }


    @GetMapping("Calculator")
    public String testJsp() {
        return "Calculator";
    }


    @RequestMapping("/testParam")

    private String testParam(Model model, @RequestParam(name = "EUR") Double eur) {
        System.out.println(eur);
        model.addAttribute("sum", eur);

        return "forward:/jsp";
    }

    @PostMapping("/Calculator")

    private String testParam(Model model, @RequestParam(name = "EUR") String eur, @RequestParam(name = "SEK") String sek, @RequestParam(name = "NOK") String nok, @RequestParam(name = "DKK") String dkk) {

        if (currencyServis.validate(eur, sek, nok, dkk)) {

            double exRateEur = currencyServis.getJson("EUR");
            double exRateSek = currencyServis.getJson("SEK");
            double exRateNok = currencyServis.getJson("NOK");
            double exRateDkk = currencyServis.getJson("DKK");

            double dEur = Double.parseDouble(eur);
            double dSek = Double.parseDouble(sek);
            double dNok = Double.parseDouble(nok);
            double dDkk = Double.parseDouble(dkk);

            double sum = dEur * exRateEur + dSek * exRateSek + dNok * exRateNok + dDkk * exRateDkk;
            double v = sum * 100;
            long round = Math.round(v);
            double sum2 = (double) round;
            double v1 = sum2 / 100;

            model.addAttribute("sum", v1);


        } else {
            model.addAttribute("error", "Prosze wpisać w kążde pole liczbę. Części dziesiętne oddzielaj kropką. Na przykład 4.5");

        }
        return "/Calculator";
    }


//    @GetMapping("/cal")
//    public String Calculator2get(Model model) {
//        model.addAttribute("currencyValues", new CurrencyValues());
//        return "/Cal";
//    }
//
//    @PostMapping("/cal")
//    public String Calculator2post(@Valid CurrencyValues currencyValues, BindingResult result, Model model) {
//        if (result.hasErrors()) {
//            return "Cal";
//        } else {
//            double exRateEur = currencyServis.getJson("EUR");
//            double exRateSek = currencyServis.getJson("SEK");
//            double exRateNok = currencyServis.getJson("NOK");
//            double exRateDkk = currencyServis.getJson("DKK");
//            double sum = currencyValues.getEurValue() * exRateEur + currencyValues.getSekValue() * exRateSek + currencyValues.getNokValue() * exRateNok + currencyValues.getDkkValue() * exRateDkk;
//
//            model.addAttribute("sum", sum);
//            return "Calculator";
//        }
//
//    }


}
