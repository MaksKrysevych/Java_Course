package Course.Task6;
import java.math.*;

public abstract class Employee {
    String name;
    BigDecimal money = BigDecimal.valueOf(0);
    BigDecimal salary;
    BigDecimal bonus;

    public String getName() {
        return name;
    }
    public BigDecimal getSalary() {
        return salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
    public abstract void setBonus(BigDecimal bonus);

    public Employee(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    public BigDecimal toPay(){
        money = money.add(salary);
        money = money.add(bonus);

        return money;
    }
}