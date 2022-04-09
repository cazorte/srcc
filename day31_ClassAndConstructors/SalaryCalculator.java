package day31_ClassAndConstructors;

public class SalaryCalculator {

    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHours;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        double salary = hourlyRate * weeklyHours * 52;
        return salary;
    }

    public double totalStateTax(){
        double totalStateTax = salary() /100 * stateTaxRate;
        return totalStateTax;
    }

    public double totalFederalTax(){
        double totalFederalTax = salary() /100 * federalTaxRate;
        return totalFederalTax;
    }

    public  double  salaryAfterTax(){
        double salaryAfterTax = salary() - totalStateTax() - totalFederalTax() ;
        return salaryAfterTax;
    }

    public String toString() {
        return "SalaryCalculator { --> " +
                "hourlyRate=" + hourlyRate +
                ", Salary after tax=" + salaryAfterTax() +

                ", weeklyHours=" + weeklyHours +
                '}';
    }
}
