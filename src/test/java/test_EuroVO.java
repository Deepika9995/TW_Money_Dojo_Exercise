import org.junit.Assert;
import org.junit.Test;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

public class test_EuroVO {

@Test
public void test_EuroVO_CurrencyUnit_Is_NotNULL(){
    CurrencyUnit eur = Monetary.getCurrency("EUR");
    Assert.assertNotNull(eur);
}

}
