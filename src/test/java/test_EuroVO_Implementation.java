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


}
