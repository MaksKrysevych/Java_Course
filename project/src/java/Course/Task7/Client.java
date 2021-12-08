package Course.Task7;

import java.math.BigDecimal;

public class Client {
    private Deposit[] deposits;

    public Client() {
        deposits = new Deposit[10];
    }

    public boolean AddDeposit(Deposit deposit) {
        if (deposits[deposits.length - 1] == null) {
            for (int i = 0; i < deposits.length; i++) {
                if (deposits[i] == null) {
                    deposits[i] = deposit;
                    break;
                }
            }
            return true;
        }
        else   {
            return false;
        }
    }

    public BigDecimal totalIncome(){
        BigDecimal money = BigDecimal.ZERO;
        for (int i = 0; i < deposits.length; i++) {
            if (deposits[i] != null) {
                money = money.add(deposits[i].income());

            }
        }
        return money;
    }

    public BigDecimal maxIncome(){
        if (deposits[0] != null ) {
            BigDecimal maxIncome = deposits[0].income();
            for (int i = 0; i < deposits.length; i++) {
                if (deposits[i] != null && maxIncome.compareTo(deposits[i].income()) == -1) {
                    maxIncome = deposits[i].income();
                }
            }
            return maxIncome;
        }
        else {
            return BigDecimal.ZERO;
        }
    }

    public BigDecimal getIncomeByNumber(int depositNumber) {
        if (deposits.length > depositNumber) {
            return deposits[depositNumber].income();
        }
        else {
            return BigDecimal.ZERO;
        }
    }
}
