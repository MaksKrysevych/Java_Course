package Course.Task6;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void test1() {
        BigDecimal salary = BigDecimal.valueOf(3000);
        BigDecimal bonus = BigDecimal.valueOf(300);

        Manager manager = new Manager("Alex", salary, 100);
        manager.setBonus(bonus);
        BigDecimal money = manager.toPay();
        assertEquals(BigDecimal.valueOf(3300) , money);
    }
    @Test
    public void test2(){
        BigDecimal salary = BigDecimal.valueOf(3000);
        BigDecimal bonus = BigDecimal.valueOf(300);
        SalesPerson salesPerson = new SalesPerson("Alex", salary, 1200);
        salesPerson.setBonus(bonus);
        BigDecimal money = salesPerson.toPay();
        assertEquals(BigDecimal.valueOf(3900) , money);
    }
    @Test
    public void test3(){
        Manager[] arr = new Manager[]{new Manager("Valera", BigDecimal.valueOf(3100), 110), new Manager("Alex", BigDecimal.valueOf(3000), 100), new Manager("Max", BigDecimal.valueOf(3200), 120)};
        Company company = new Company(arr);
        company.giveEverybodyBonus(BigDecimal.valueOf(300));
        assertEquals("Max", company.nameMaxSalary());
    }
}