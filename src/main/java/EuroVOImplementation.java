import java.util.ArrayList;
import java.util.List;

public class EuroVOImplementation {

    EuroVO euroVO = new EuroVO();

    public List<EuroVO> createEuroVOList(EuroVO euroVO){
        List<EuroVO> euroVOList = new ArrayList<>();
        euroVOList.add(euroVO);
        return euroVOList;
    }

}
