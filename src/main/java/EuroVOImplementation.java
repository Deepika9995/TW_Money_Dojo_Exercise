import java.util.List;

public class EuroVOImplementation {


    public Double sumOfEuros(List<EuroVO> euroVOList) {
        Double sum = 0.0;
        for (EuroVO euroVO : euroVOList) {
            sum += euroVO.getCurrencyValue();
        }
        return sum;
    }


}
