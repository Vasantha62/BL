import java.util.*;


interface IEmployeeWage {
    void addCompanyEmpWage(String company, int wagePerHour, int workingDays, int maxHoursPerMonth);
    void computeEmpWage();
    int getTotalWage(String company);
}


class CompanyEmpWage {
    public final String company;
    public final int wagePerHour;
    public final int workingDays;
    public final int maxHoursPerMonth;
    public int totalWage;

    public CompanyEmpWage(String company, int wagePerHour, int workingDays, int maxHoursPerMonth) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.workingDays = workingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    @Override
    public String toString() {
        return "Company : " + company + " | Total Wage : " + totalWage;
    }
}
class EmployeeWageBuilder implements IEmployeeWage {

    private ArrayList<CompanyEmpWage> companyList = new ArrayList<>();

    @Override
    public void addCompanyEmpWage(String company, int wagePerHour, int workingDays, int maxHoursPerMonth) {
        companyList.add(new CompanyEmpWage(company, wagePerHour, workingDays, maxHoursPerMonth));
    }

    @Override
    public void computeEmpWage() {
        for (CompanyEmpWage companyEmp : companyList) {
            int totalWage = computeCompanyWage(companyEmp);
            companyEmp.setTotalWage(totalWage);
            System.out.println(companyEmp);
        }
    }

    private int computeCompanyWage(CompanyEmpWage company) {
        int totalHours = 0;
        int totalDays = 0;

        while (totalHours < company.maxHoursPerMonth && totalDays < company.workingDays) {
            totalDays++;

            int empHrs;
            int attendance = (int)(Math.random() * 3); // 0,1,2

            switch (attendance) {
                case 1:
                    empHrs = 8; 
                    break;
                case 2:
                    empHrs = 4; 
                    break;
                default:
                    empHrs = 0; 
            }

            totalHours += empHrs;
        }

        return totalHours * company.wagePerHour;
    }

    @Override
    public int getTotalWage(String company) {
        for (CompanyEmpWage comp : companyList) {
            if (comp.company.equals(company)) {
                return comp.totalWage;
            }
        }
        return -1;
    }
}


public class EmpWageMain {
    public static void main(String[] args) {

        EmployeeWageBuilder wageBuilder = new EmployeeWageBuilder();

        wageBuilder.addCompanyEmpWage("TCS", 20, 20, 100);
        wageBuilder.addCompanyEmpWage("Infosys", 25, 22, 120);
        wageBuilder.addCompanyEmpWage("Wipro", 18, 26, 110);

        wageBuilder.computeEmpWage();

        System.out.println("Total Wage for Infosys : " + wageBuilder.getTotalWage("Infosys"));
    }
}



