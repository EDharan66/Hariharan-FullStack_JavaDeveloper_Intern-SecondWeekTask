
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.*;

public class OperatorClass implements DataOperation{

    int empId;
    Long phone;
    String mailId;
    String name;
    Boolean checkData;
    private static OperatorClass instance;

    HashMap<String ,DataInfo> info = new HashMap<String, DataInfo>();
    List<DataInfo> showDataList;

    Scanner sc = new Scanner(System.in);

    private OperatorClass() {
        if(CheckData()){
            checkData = true;
        }else {
            checkData = false;
        }
    }

    public Boolean CheckData() {
        try {
            FileInputStream fis = new FileInputStream("DataInfo.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            this.info = (HashMap) ois.readObject();
        } catch (EOFException e) {
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public static OperatorClass getInstance() {
        if (instance == null) {
            instance = new OperatorClass();
        }
        return instance;
    }

    @Override
    public String storeData() {
        System.out.println("Enter your Mail Id : ");
        this.mailId = sc.nextLine();
        System.out.println("Enter your name : ");
        this.name = sc.nextLine();
        System.out.println("Enter your emp Id : ");
        this.empId = sc.nextInt();
        System.out.println("Enter your phone no : ");
        this.phone = sc.nextLong();
        sc.nextLine();

        if (checkData) {
            info.put(mailId, new DataInfo(empId, phone, mailId, name));

            for (Map.Entry entry : info.entrySet()) {
                System.out.println("key = " + entry.getKey() + " Value = " + entry.getValue());
            }

        } else {
            System.out.println("first data!");
        }

        return "Your data is stored!! ";
    }

    @Override
    public String showData() {
        if (checkData) {

            for (Map.Entry entry : info.entrySet()) {
                System.out.println("key = " + entry.getKey() + " Value = " + entry.getValue());
            }
            return "complete";
        } else {
            return "empty file!";
        }
    }

    @Override
    public String searchData() {
        if (checkData) {
            boolean bool = true;

            while (bool) {
                String choice = forWhat("Search");
                SearchFactory factory = new SearchFactory(choice);
                showDataList = factory.doSearch();

                if (showDataList.size()!=0) {
                    System.out.println("Your searched data : " + showDataList);
                } else {
                    System.out.println("No such data found");
                }
                System.out.println("Do you want continue enter \"true\" or \"false\" : ");
                bool = sc.nextBoolean();

            }

        } else {
            System.out.println("No data is available! please store the data first");
        }

        return "search data complete";
    }

    @Override
    public String forWhat(String forWhat){
        System.out.println("\n====================");
        System.out.println(forWhat+" the data by");
        System.out.println("1. Email id : ");
        System.out.println("2. phone no : ");
        System.out.println("3. name : ");
        System.out.println("4. emp id : ");
        System.out.println("====================");
        System.out.print("enter your option: ");
        int selectOption = sc.nextInt();
        sc.nextLine();

        String choice = "";


        switch (selectOption) {
            case 1:
                choice = "MAIL_ID";
                break;
            case 2:
                choice = "PHONE_NO";
                break;
            case 3:
                choice = "NAME";
                break;
            case 4:
                choice = "EMP_ID";
                break;
            default:
                System.out.println("Your option was not correct! please enter correctly");
                break;
        }

        return choice;
    }

    @Override
    public String updateData() {
        if (checkData) {
            boolean bool = true;

            while (bool) {

                String choice = forWhat("Update");
                SearchFactory factory = new SearchFactory(choice);
                showDataList = factory.doSearch();

                String enteredMailId = showDataList.get(0).mailId;
                DataInfo updateData = info.get(enteredMailId);
                System.out.println(updateData);

                System.out.println("what do want update");
                System.out.println("1. update mail id");
                System.out.println("2. update name");
                System.out.println("3. update phone no");
                System.out.println("4. update emp id");

                System.out.println("====================");
                System.out.print("enter your option: ");
                int updateOption = sc.nextInt();
                sc.nextLine();
                switch (updateOption) {
                    case 1:
                        System.out.println("your old mail id is \"" + updateData.mailId + "\"");
                        System.out.println("enter your new mail id");
                        String newUpdateMailId = sc.nextLine();
                        updateData.mailId = newUpdateMailId;
                        System.out.println("updated mail id is : " + updateData.mailId);
                        info.remove(enteredMailId);
                        info.put(newUpdateMailId, updateData);
                        System.out.println("your updated data : " + info.get(newUpdateMailId));
                        break;
                    case 2:

                        System.out.println("your old name is \"" + updateData.name + "\"");
                        System.out.println("enter your new name");
                        String newUpdatename = sc.nextLine();
                        updateData.name = newUpdatename;
                        System.out.println("updated name is : " + updateData.name);
                        info.put(enteredMailId, updateData);
                        System.out.println("your updated data : " + info.get(enteredMailId));

                        break;
                    case 3:

                        System.out.println("your old phone no is \"" + updateData.phone + "\"");
                        System.out.println("enter your new phone");
                        Long newUpdatePhoneNo = sc.nextLong();
                        sc.nextLine();
                        updateData.phone = newUpdatePhoneNo;
                        System.out.println("updated name is : " + updateData.phone);
                        info.put(enteredMailId, updateData);
                        System.out.println("your updated data : " + info.get(enteredMailId));


                        break;
                    case 4:

                        System.out.println("your old emp id is \"" + updateData.empId + "\"");
                        System.out.println("enter your new emp id");
                        int newUpdateEmpId = sc.nextInt();
                        sc.nextLine();
                        updateData.empId = newUpdateEmpId;
                        System.out.println("updated name is : " + updateData.empId);
                        info.put(enteredMailId, updateData);
                        System.out.println("your updated data : " + info.get(enteredMailId));


                        break;
                    default:
                        System.out.println("Your option was not correct! please enter correctly");
                        break;
                }

                System.out.println("Do you want continue enter \"true\" or \"false\" : ");
                bool = sc.nextBoolean();
            }
        } else {
            System.out.println("No data is available! please store the data first");
        }

        return "update completed";
    }

    @Override
    public String deleteData() {
        if (checkData) {
            String choice = forWhat("Delete");
            SearchFactory factory = new SearchFactory(choice);
            showDataList = factory.doSearch();

            String enteredMailId = showDataList.get(0).mailId;
            info.remove(enteredMailId);

            for (Map.Entry entry : info.entrySet()){
                System.out.println("key = " + entry.getKey()+" Value = "+ entry.getValue() );
            }

        } else {
            System.out.println("No data is available! please store the data first");
        }
        return "data deleted";
    }
}

class DataInfo implements Serializable {
    int empId;
    Long phone;
    String mailId;
    String name;

    public DataInfo(int empId, Long phone, String mailId, String name) {
        this.empId = empId;
        this.phone = phone;
        this.mailId = mailId;
        this.name = name;
    }

    public String toString() {

        return "{ Mail Id : " + this.mailId + ", Name : " + this.name + ", Emp Id : " + this.empId + ", Phone No : " + this.phone + " }";
    }
}