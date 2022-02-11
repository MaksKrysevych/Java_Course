package Course.Task7;

import java.math.BigDecimal;

public class LongDeposit extends Deposit{

    public LongDeposit(BigDecimal depositAmount, int timeOfDeposit) {
        super(depositAmount, timeOfDeposit);
    }

    @Override
    public BigDecimal income() {
        BigDecimal money = BigDecimal.valueOf(0);
        if (period() > 6) {
            BigDecimal percent = BigDecimal.valueOf(period());
            percent = percent.subtract(BigDecimal.valueOf(6));
            percent = percent.multiply(BigDecimal.valueOf(0.15));
            money = money.add(money());
            money = money.multiply(percent);
            return money;
        }
        else {
            return money;
        }
    }
}
