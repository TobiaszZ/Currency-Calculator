package projekty.Kalkulator.walut.models;

import org.springframework.format.annotation.NumberFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class CurrencyValues {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
//    @NotEmpty
    @NumberFormat
    private double eurValue;
//    @NotEmpty
    @NumberFormat
    private double sekValue;
//    @NotEmpty
    @NumberFormat
    private double nokValue;
//    @NotEmpty
    @NumberFormat
    private double dkkValue;


    @Override
    public String toString() {
        return "CurrencyValues{" +
                "id=" + id +
                ", eurValue=" + eurValue +
                ", sekValue=" + sekValue +
                ", nokValue=" + nokValue +
                ", dkkValue=" + dkkValue +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getEurValue() {
        return eurValue;
    }

    public void setEurValue(double eurValue) {
        this.eurValue = eurValue;
    }

    public double getSekValue() {
        return sekValue;
    }

    public void setSekValue(double sekValue) {
        this.sekValue = sekValue;
    }

    public double getNokValue() {
        return nokValue;
    }

    public void setNokValue(double nokValue) {
        this.nokValue = nokValue;
    }

    public double getDkkValue() {
        return dkkValue;
    }

    public void setDkkValue(double dkkValue) {
        this.dkkValue = dkkValue;
    }
}
