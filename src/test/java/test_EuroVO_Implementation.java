import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class test_EuroVO_Implementation {

    @Test
    public void test_sum_of_euros() {
        List<EuroVO> euroVOList = new ArrayList<>();
        double[] d;
        d = new double[]{2.0, 5.0, 7.0, 10.0, 10.0, 8.0, 8.0};
        for (double v : d) {
            EuroVO euroVO = new EuroVO();
            euroVOList.add(euroVO.euroVO("EUR", v));
        }
        EuroVOImplementation euroVOImplementation = new EuroVOImplementation();

        Assert.assertEquals(50.0, euroVOImplementation.sumOfEuros(euroVOList), 0);
    }

    @Test
    public void test_Adding_Two_Euros_Should_Return_EuroVO() {
        ArrayList<EuroVO> euroVOList = new ArrayList<>();
        double[] d;
        d = new double[]{2.0, 5.0, 7.0, 10.0, 10.0, 8.0, 8.0};
        for (double v : d) {
            EuroVO euroVO = new EuroVO();
            euroVOList.add(euroVO.euroVO("EUR", v));
        }
        EuroVOImplementation euroVOImplementation = new EuroVOImplementation();

        Double e1 = 2.0;
        Double e2 = 5.0;

        Assert.assertTrue(euroVOImplementation.findMatchingEuroVO(e1, e2, euroVOList));
    }

    @Test
    public void test_Equality_Of_EuroVOS(){
        EuroVO e1 = new EuroVO();
        e1.euroVO("EUR",15.0);
        EuroVO e2 = new EuroVO();
        e2.euroVO("EUR", 15.0);
        System.out.println(e1.equals(e2));
        Assert.assertEquals("Equal", e1, e2);
    }
}
