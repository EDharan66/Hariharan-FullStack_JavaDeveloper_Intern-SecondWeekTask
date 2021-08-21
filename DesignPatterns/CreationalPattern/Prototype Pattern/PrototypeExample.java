import java.util.HashMap;
import java.util.Map;

public class PrototypeExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();

        //Use the clone method to get the Employee object
        Employees empsNew = (Employees) emps.clone();


        HashMap<String,Object> list = empsNew.getEmpList();
        list.remove("hai@mail");



        System.out.println("emps List: ");
        for (Map.Entry entry1 : emps.getEmpList().entrySet()){
            System.out.println("key = " + entry1.getKey()+" Value = "+ entry1.getValue() );
        }
        System.out.println("\nempsNew List: clone()");
        for (Map.Entry entry : list.entrySet()){
            System.out.println("key = " + entry.getKey()+" Value = "+ entry.getValue() );
        }
    }
}
