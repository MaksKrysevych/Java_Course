package Course.Task6;

import java.math.BigDecimal;

public class SalesPerson extends Employee {
    int percent;

    public SalesPerson(String name, BigDecimal salary, int percent) {
        super(name, salary);
        this.percent = percent;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if (percent>200) this.bonus = bonus.multiply(BigDecimal.valueOf(3));
        else if (percent>100) this.bonus  = bonus.multiply(BigDecimal.valueOf(2));
        else this.bonus = bonus;
    }
}
