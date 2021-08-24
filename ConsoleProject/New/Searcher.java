import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public abstract class Searcher{
    Scanner sc = new Scanner(System.in);
    HashMap<String, DataInfo> hashMap;
    List<DataInfo> showDataList;

    public abstract List<DataInfo> doSearch();
}
