package Course.Task7;

import java.math.BigDecimal;

public class BaseDeposit extends Deposit{


    public BaseDeposit(BigDecimal depositAmount, int timeOfDeposit) {
        super(depositAmount, timeOfDeposit);
    }

    @Override
    public BigDecimal income() {
        BigDecimal money = BigDecimal.valueOf(0);
        BigDecimal percent = BigDecimal.valueOf(period());
        money = money.add(money());
        percent = percent.multiply(BigDecimal.valueOf(0.05));
        money = money.multiply(percent);

        return money;
    }
}
