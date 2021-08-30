import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.UnknownCurrencyException;

public class EuroVO {
    private CurrencyUnit currencyUnitEUR;
    private Double currencyValue;

    public EuroVO euroVO(String currencyUnit, Double currencyValue) {
        try {
            if (currencyUnit.equals("EUR")) {
                this.currencyUnitEUR = Monetary.getCurrency(currencyUnit);
                this.currencyValue = currencyValue;
            }
        } catch (UnknownCurrencyException unknownCurrencyException) {
            System.out.println("Invalid currency unit!.." + unknownCurrencyException);
        }
        return this;
    }

    public CurrencyUnit getCurrencyUnitEUR() {
        return currencyUnitEUR;
    }

    public Double getCurrencyValue() {
        return currencyValue;
    }
}
