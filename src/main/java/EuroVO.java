import javax.money.CurrencyUnit;
import javax.money.Monetary;

public class EuroVO {

    String currencyUnit;
    CurrencyUnit eur = Monetary.getCurrency(currencyUnit);
}
