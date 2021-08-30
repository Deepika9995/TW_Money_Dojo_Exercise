import org.junit.Assert;
import org.junit.Test;

import javax.money.*;

public class test_EuroVO {

    @Test
    public void euroVO_currencyUnit_is_notNULL() {
        CurrencyUnit eur = Monetary.getCurrency("EUR");
        Assert.assertNotNull(eur);
    }

    @Test(expected = UnknownCurrencyException.class)
    public void throwsError_currencyCode_whenNoExist() {
        Monetary.getCurrency("XYZ");
    }

    @Test
    public void get_euro_value_object() {
        EuroVO euroVO = new EuroVO();
        euroVO.euroVO("EUR", 200.0);
        Assert.assertEquals("EUR", euroVO.getCurrencyUnitEUR().getCurrencyCode());
    }
}
