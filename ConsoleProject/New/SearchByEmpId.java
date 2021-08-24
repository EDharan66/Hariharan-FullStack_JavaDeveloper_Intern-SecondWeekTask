import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class SearchByEmpId extends Searcher {


    public SearchByEmpId() {
        this.hashMap = OperatorClass.getInstance().info;
    }

    @Override
    public List doSearch() {
        System.out.println("Enter the emp id : ");
        int enteredEmpId = sc.nextInt();
        sc.nextLine();
        showDataList = hashMap.values().stream().filter(dataInfo -> dataInfo.empId == enteredEmpId).collect(Collectors.toList());
        return showDataList;
    }
}
