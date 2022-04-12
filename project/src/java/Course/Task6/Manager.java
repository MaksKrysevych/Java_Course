package Course.Task6;

import java.math.BigDecimal;

public class Manager extends Employee{
    int quantity;

    public Manager(String name, BigDecimal salary, int clientAmount) {
        super(name, salary);
        this.quantity = clientAmount;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if (quantity>150) this.bonus = bonus.add(BigDecimal.valueOf(1000));
        else if (quantity>100) this.bonus = bonus.add(BigDecimal.valueOf(500));
        else this.bonus = bonus;
    }
}