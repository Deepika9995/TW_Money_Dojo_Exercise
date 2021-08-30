import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.UnknownCurrencyException;

public class EuroVO {
    private CurrencyUnit currencyUnitEUR;
    private MonetaryAmount euroAmount;

    public EuroVO euroVO(String currencyUnit, Double currencyValue) {
        try {
            if (currencyUnit.equals("EUR")) {
                this.currencyUnitEUR = Monetary.getCurrency(currencyUnit);
                euroAmount = Monetary.getDefaultAmountFactory().setCurrency(currencyUnit).setNumber(currencyValue).create();
            }
        } catch (UnknownCurrencyException unknownCurrencyException) {
            System.out.println("Invalid currency unit!.." + unknownCurrencyException);
        }
        return this;
    }

    public CurrencyUnit getCurrencyUnitEUR() {
        return currencyUnitEUR;
    }

    public MonetaryAmount getEuroAmount() {
        return euroAmount;
    }
}
