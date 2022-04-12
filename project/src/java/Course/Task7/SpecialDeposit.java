package Course.Task7;

import java.math.BigDecimal;

public class SpecialDeposit extends Deposit{

    public SpecialDeposit(BigDecimal depositAmount, int timeOfDeposit) {
        super(depositAmount, timeOfDeposit);
    }

    @Override
    public BigDecimal income() {
        BigDecimal money = BigDecimal.valueOf(0);
        money = money.add(money());
        BigDecimal percent = BigDecimal.valueOf(period());
        percent = percent.multiply(BigDecimal.valueOf(0.01));
        money = money.multiply(percent);
        return money;
    }
}
