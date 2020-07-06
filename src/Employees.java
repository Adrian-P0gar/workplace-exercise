import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Employees {
    int id;
    String name;
    String group;
    int monthSalary;
    int counterId = 0;
    List<Integer>yearSalary = new ArrayList<>();
    public Employees( String name, String group) {
        counterId++;
        this.id = counterId;
        this.name = name;
        this.group = group;

    }


    public  Map salaryCalculator(){
        Map<YearMonths,Integer> yearSalary = new HashMap<>();
        for(int i=0; i <= 12;i++){
            for(YearMonths month: YearMonths.values()){
                yearSalary.put(month, setSalary());
            }
        }
        return yearSalary;
    };
    public abstract int setSalary();
}
