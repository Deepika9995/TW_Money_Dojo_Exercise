import java.util.ArrayList;
import java.util.List;

public class EuroVOImplementation {

    public double sumOfEuros(List<EuroVO> euroVOList) {
        double sumMoney = 0.0;
        for (EuroVO euroVO : euroVOList) {
            sumMoney += euroVO.getEuroAmount().getNumber().doubleValue();
        }
        return sumMoney;
    }


    public boolean findMatchingEuroVO(Double e1, Double e2, ArrayList<EuroVO> euroVOList) {
        boolean foundMatch = false;
        Double x = null;
        Double sum = e1 + e2;
        if (!(euroVOList.isEmpty())) {
            for (EuroVO euroVO : euroVOList) {
                if (sum.equals(euroVO.getEuroAmount().getNumber().doubleValue())) {
                    foundMatch = true;
                    x = euroVO.getEuroAmount().getNumber().doubleValue();
                    break;
                }
            }
            if (foundMatch) {
                System.out.println("Sum equals the Object Value " + x);
            }
        }
        return foundMatch;
    }
}
