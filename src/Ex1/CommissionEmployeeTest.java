package Ex1;

public class CommissionEmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee("Rojina", "Akter", "121212", 100000, 0.12);

        System.out.printf("Employee %nFirst Name: %s%nLast Name: %s%nSSN: %s%nGross Sales: $%.2f%nCommission Rate: %.2f", employee.getFirstName(), employee.getLastName(), employee.getSocialSecurityNumber(), employee.getGrossSales(), employee.getCommissionRate());
employee.setGrossSales(10000);
employee.setCommissionRate(0.5);
        System.out.printf("\nEmployee %nFirst Name: %s%nLast Name: %s%nSSN: %s%nGross Sales: $%.2f%nCommission Rate: %.2f", employee.getFirstName(), employee.getLastName(), employee.getSocialSecurityNumber(), employee.getGrossSales(), employee.getCommissionRate());

    }

}
