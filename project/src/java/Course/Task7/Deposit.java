package Course.Task7;
import java.math.*;

public abstract class  Deposit {
    private BigDecimal depositAmount;
    private int depositPeriod;

    public BigDecimal money() {
        return depositAmount;
    }
    public int period() { return depositPeriod; }

    public Deposit(BigDecimal depositAmount, int depositPeriod) {
        this.depositAmount = depositAmount;
        this.depositPeriod = depositPeriod;
    }

    public abstract BigDecimal income();
}
