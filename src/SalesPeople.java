import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SalesPeople extends Employees {
    public SalesPeople( String name, String group) {
        super( name, group);
        this.monthSalary = setSalary();
    }


    @Override
    public int setSalary() {
        Random r = new Random();
        return r.nextInt((2000 - 1500) + 1) + 1500;

    }
}
