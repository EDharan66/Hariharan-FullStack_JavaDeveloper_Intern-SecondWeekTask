import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class SearchByName extends Searcher {


    public SearchByName() {
        this.hashMap = OperatorClass.getInstance().info;
    }

    @Override
    public List doSearch() {
        System.out.println("Enter the name : ");
        String enteredName = sc.nextLine();
        showDataList = hashMap.values().stream().filter(dataInfo -> dataInfo.name.equals(enteredName)).collect(Collectors.toList());
        return showDataList;
    }
}
