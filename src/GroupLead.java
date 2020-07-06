import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GroupLead extends Employees {

    List<Employees> groupOfEmployees = new ArrayList<>();
    public GroupLead( String name, String group, List<Employees> groupOfEmployees) {
        super( name, group);
        this.groupOfEmployees = groupOfEmployees;
    }


    @Override
    public int setSalary() {
        int basicSalary = 1800;
        int counterEmployees = groupOfEmployees.size();
        return basicSalary + (counterEmployees * 200);
    }
}
