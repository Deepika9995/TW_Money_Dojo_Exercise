import java.util.List;

public class EuroVOImplementation {

    public double sumOfEuros(List<EuroVO> euroVOList) {
        double sumMoney = 0.0;
        for (EuroVO euroVO : euroVOList) {
            sumMoney += euroVO.getEuroAmount().getNumber().doubleValue();
        }
        return sumMoney;
    }
}
