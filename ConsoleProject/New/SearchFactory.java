
import java.util.List;

public class SearchFactory {
    String searchType;
    Searcher search;
    List<DataInfo> showDataList;

    public SearchFactory(String searchType) {
        this.searchType = searchType;
    }


    public List<DataInfo> doSearch() {
        if(searchType.equalsIgnoreCase("MAIL_ID")){
            search = new SearchByMailId();
            showDataList = search.doSearch();
        }else if(searchType.equalsIgnoreCase(("PHONE_NO"))){
            search = new SearchByPhone();
            showDataList = search.doSearch();
        }else if(searchType.equalsIgnoreCase(("NAME"))){
            search = new SearchByName();
            showDataList = search.doSearch();
        }else if(searchType.equalsIgnoreCase(("EMP_ID"))){
            search = new SearchByEmpId();
            showDataList = search.doSearch();
        }else {
            System.out.println("please enter correctly!!");
        }

         return showDataList;
    }
}
