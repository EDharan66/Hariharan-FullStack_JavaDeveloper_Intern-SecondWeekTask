
import java.util.List;
import java.util.stream.Collectors;

public class SearchByPhone extends Searcher {

    public SearchByPhone() {

        this.hashMap = OperatorClass.getInstance().info;
    }

    @Override
    public List doSearch() {
        System.out.println("Enter the phone no : ");
        Long enteredNumber = sc.nextLong();
        sc.nextLine();
        showDataList = hashMap.values().stream().filter(dataInfo -> dataInfo.phone.equals(enteredNumber)).collect(Collectors.toList());
        return showDataList;

    }
}
