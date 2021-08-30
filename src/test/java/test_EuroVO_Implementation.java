import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class test_EuroVO_Implementation {

    EuroVOImplementation euroVOImplementation = new EuroVOImplementation();

    @Test
    public void retrieve_EuroVO_List(){
        EuroVO euroVO1 = new EuroVO();
        euroVO1.euroVO("EUR", 200.0);
        List<EuroVO> euroVOList = new ArrayList<>(euroVOImplementation.createEuroVOList(euroVO1));

        EuroVO euroVO2 = new EuroVO();
        euroVO2.euroVO("EUR", 410.0);
        euroVOList.addAll(euroVOImplementation.createEuroVOList(euroVO2));

        Assert.assertEquals(2,euroVOList.size());

    }

}
