package Course.Task6;

import java.math.BigDecimal;

public class Company {
    private Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    public void giveEverybodyBonus(BigDecimal companyBonus){
        for (int i = 0; i < employees.length; i++) {
            employees[i].setBonus(companyBonus);
        }
    }
    public BigDecimal totalToPay(){
        BigDecimal totalMoney = BigDecimal.valueOf(0);
        for (int i = 0; i < employees.length; i++) {
            totalMoney = totalMoney.add(employees[i].toPay());
        }
        
        return totalMoney;
    }
    public String nameMaxSalary(){
        String name;
        if (employees.length == 1) name = employees[0].name;
        else {
            name = employees[0].name;
            for (int i = 0; i < employees.length - 1; i++) {
                if (employees[i].toPay().compareTo(employees[i + 1].toPay()) != -1) {
                    name = employees[i+1].name;
                }
            }
        }
        return name;
    }
}
