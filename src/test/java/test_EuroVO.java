import org.junit.Assert;
import org.junit.Test;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.UnknownCurrencyException;

public class test_EuroVO {

@Test
public void euroVO_currencyUnit_is_notNULL(){
    CurrencyUnit eur = Monetary.getCurrency("EUR");
    Assert.assertNotNull(eur);
}

@Test(expected = UnknownCurrencyException.class)
public void throwsError_currencyCode_whenNoExist(){
    Monetary.getCurrency("XYZ");
}

}
