package Course.Task7;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void test1() {
        BaseDeposit bd = new BaseDeposit(BigDecimal.valueOf(1000), 1);
        assertEquals(BigDecimal.valueOf(50).setScale(2, RoundingMode.HALF_UP), bd.income());
    }

    @Test
    public void test2() {
        SpecialDeposit sd = new SpecialDeposit(BigDecimal.valueOf(1000), 1);
        sd.income();
        assertEquals(BigDecimal.valueOf(10).setScale(2, RoundingMode.HALF_UP), sd.income());
    }

    @Test
    public void test3() {
        LongDeposit ld = new LongDeposit(BigDecimal.valueOf(1000), 7);
        ld.income();
        assertEquals(BigDecimal.valueOf(150).setScale(2, RoundingMode.HALF_UP), ld.income());
    }

    @Test
    public void test4() {
        Client client = new Client();
        BaseDeposit bd = new BaseDeposit(BigDecimal.valueOf(1000), 1);
        SpecialDeposit sd = new SpecialDeposit(BigDecimal.valueOf(1000), 1);
        LongDeposit ld = new LongDeposit(BigDecimal.valueOf(1000), 7);

        client.AddDeposit(bd);
        client.AddDeposit(sd);
        client.AddDeposit(ld);
        client.maxIncome();

        assertEquals(BigDecimal.valueOf(150).setScale(2, RoundingMode.HALF_UP), client.maxIncome());
    }

    @Test
    public void test5() {
        Client client = new Client();
        BaseDeposit bd = new BaseDeposit(BigDecimal.valueOf(1000), 1);
        SpecialDeposit sd = new SpecialDeposit(BigDecimal.valueOf(1000), 1);
        LongDeposit ld = new LongDeposit(BigDecimal.valueOf(1000), 7);

        client.AddDeposit(bd);
        client.AddDeposit(sd);
        client.AddDeposit(ld);

        assertEquals(BigDecimal.valueOf(210).setScale(2, RoundingMode.HALF_UP), client.totalIncome());
    }

    @Test
    public void test6() {
        Client client = new Client();
        BaseDeposit bd = new BaseDeposit(BigDecimal.valueOf(1000), 1);
        SpecialDeposit sd = new SpecialDeposit(BigDecimal.valueOf(1000), 1);
        LongDeposit ld = new LongDeposit(BigDecimal.valueOf(1000), 7);

        client.AddDeposit(bd);
        client.AddDeposit(sd);
        client.AddDeposit(ld);

        assertEquals(BigDecimal.valueOf(150).setScale(2, RoundingMode.HALF_UP), client.getIncomeByNumber(2));
    }
}
