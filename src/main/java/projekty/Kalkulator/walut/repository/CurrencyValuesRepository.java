package projekty.Kalkulator.walut.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projekty.Kalkulator.walut.models.CurrencyValues;

public interface CurrencyValuesRepository extends JpaRepository<CurrencyValues, Integer> {
}
    