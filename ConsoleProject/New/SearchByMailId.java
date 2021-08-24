import java.util.List;

public class SearchByMailId extends Searcher {

    public SearchByMailId() {
        this.hashMap = OperatorClass.getInstance().info;
    }

    @Override
    public List doSearch() {
        System.out.println("Enter the mail id :");
        String enteredMail = sc.nextLine();
        showDataList.clear();
        showDataList.add(hashMap.get(enteredMail));
        return showDataList;

    }
}
