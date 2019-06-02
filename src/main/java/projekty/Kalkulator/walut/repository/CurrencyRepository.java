package projekty.Kalkulator.walut.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projekty.Kalkulator.walut.models.Currency;

public interface CurrencyRepository extends JpaRepository<Currency, Integer> {


}
