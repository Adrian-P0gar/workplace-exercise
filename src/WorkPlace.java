import java.util.ArrayList;
import java.util.List;

public class WorkPlace {
    public static void main(String[] args) {
        ArrayList<Employees> officeGroup1 = new ArrayList<>();
        ArrayList<Employees> salesGroup1 = new ArrayList<>();

        Employees firstEmployee = new SalesPeople("George", "OfficeGroup1");
        Employees   secondEmployee = new OfficeWorker("Veta", "SalesGroup1", true);
        Employees   thirdEmployee = new OfficeWorker("Georgeta", "SalesGroup1", false);
        Employees   fourthEmployee = new GroupLead("Mihai", "OfficeGroup1", officeGroup1);
        Employees   fifthEmployee = new GroupLead("Constatin", "SalesGroup1", salesGroup1);

        officeGroup1.add(fifthEmployee);
        salesGroup1.add(secondEmployee);
        salesGroup1.add(thirdEmployee);


        printSalary(officeGroup1, fourthEmployee);
        printSalary(salesGroup1, fifthEmployee );
    }

    public static void printSalary(List<Employees> group, Employees lead){
        for(Employees employee : group){
            System.out.println("Salary for " + employee.name + " is " + employee.salaryCalculator());
        }
        System.out.println("The group lead "+ lead.name +  " salary is: " + lead.salaryCalculator() );
    }
}
