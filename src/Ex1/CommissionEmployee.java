package Ex1;

public class CommissionEmployee extends Object {
    //Variables
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales<0.0){
            throw new IllegalArgumentException("Gross sales must be > 0");
        }
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate<=0.0 || commissionRate>1.0){
            throw new IllegalArgumentException("Commsion rate must be >0 and <0");
        }
        this.commissionRate = commissionRate;
    }

    //constructor
    public CommissionEmployee(String fName, String lName, String ssn, double grossSales, double commissionRate){
        //Implicit call to the Object default constructor
        if(grossSales<0.0){
            throw new IllegalArgumentException("Gross sales must be greater than 0.0");
        }

        //check commission rate falls between 0% and 100%
        if(commissionRate<=0.0 || commissionRate>1.0){
            throw new IllegalArgumentException("Commsion rate must be >0 and <0");
        }

        this.firstName = fName;
        this.lastName= lName;
        this.socialSecurityNumber=ssn;
        this.grossSales=grossSales;
        this.commissionRate=commissionRate;


    }

}
