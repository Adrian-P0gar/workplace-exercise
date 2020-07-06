import java.util.Map;

public class OfficeWorker extends Employees {
    boolean isSenior;
    public OfficeWorker( String name, String group, boolean isSenior) {
        super( name, group);
        this.isSenior = isSenior;
    }



    @Override
    public int setSalary() {
        if(isSenior == true){
            this.yearSalary.add(1700);
            return 1700;
        }
        else {
            this.yearSalary.add(1250);
            return 1250;
        }
    }
}
