import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HelperClass implements DataOperation {
    int empId;
    Long phone;
    String mailId;
    String name;

    HashMap<String, DataInfo> info = new HashMap<String, DataInfo>();

    Scanner sc = new Scanner(System.in);

    public Boolean checkData() {
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


    public void serialize() {
        try {
            FileOutputStream fos = new FileOutputStream("DataInfo.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(info);
            oos.close();
            fos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

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

        if (checkData().equals(true)) {
            info.put(mailId, new DataInfo(empId, phone, mailId, name));
//            System.out.println(info);

            for (Map.Entry entry : info.entrySet()){
                System.out.println("key = " + entry.getKey()+" Value = "+ entry.getValue() );
            }
            serialize();
        } else {
            System.out.println("first data!");
            serialize();
        }

        return "Storage is complete";
    }

    @Override
    public String showData() {

        if (checkData().equals(true)) {
//            System.out.println("Deserialize HashMap " + this.info);

            for (Map.Entry entry : info.entrySet()){
                System.out.println("key = " + entry.getKey()+" Value = "+ entry.getValue() );
            }
            return "complete";
        } else {
            return "empty file!";
        }
    }

    @Override
    public String searchData() {

        if (checkData().equals(true)) {
            boolean bool = true;

            while (bool){
                System.out.println("\n====================");
                System.out.println("search the data ");
                System.out.println("1. Email id : ");
                System.out.println("2. Email id and phone no : ");
                System.out.println("3. Email id and name : ");
                System.out.println("4. Email id and emp id : ");
                System.out.println("====================");
                System.out.print("enter your option: ");
                int selectOption = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter the mail id :");
                String enteredMail = sc.nextLine();
                DataInfo searchData = info.get(enteredMail);


                switch (selectOption) {
                    case 1:
                        if (searchData != null) {

                            System.out.println("Your searched data : " + searchData);
                        } else {
                            System.out.println("No such data found");
                        }
                        break;
                    case 2:
                        System.out.println("Enter the phone no : ");
                        Long enteredNumber = sc.nextLong();
                        sc.nextLine();
                        if (searchData.phone.equals(enteredNumber)) {
                            System.out.println("Your searched data : " + searchData);
                        } else {
                            System.out.println("No such data found");
                        }
                        break;
                    case 3:
                        System.out.println("Enter the name : ");
                        String enteredName = sc.nextLine();
                        if (searchData.name.equals(enteredName)) {
                            System.out.println("Your searched data : " + searchData);
                        } else {
                            System.out.println("No such data found");
                        }
                        break;
                    case 4:

                        System.out.println("Enter the emp id : ");
                        int enteredEmpId = sc.nextInt();
                        sc.nextLine();
                        if (searchData.empId == enteredEmpId) {
                            System.out.println("Your searched data : " + searchData);
                        } else {
                            System.out.println("No such data found");
                        }
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

        return "search data complete";
    }

    @Override
    public String updateData() {

        if (checkData().equals(true)) {
            boolean bool = true;

            while (bool) {

                System.out.println("Enter the mail id :");
                String enteredMailId = sc.nextLine();
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

                        serialize();

                        break;
                    case 2:

                        System.out.println("your old name is \"" + updateData.name + "\"");
                        System.out.println("enter your new name");
                        String newUpdatename = sc.nextLine();
                        updateData.name = newUpdatename;
                        System.out.println("updated name is : " + updateData.name);
                        info.put(enteredMailId, updateData);
                        System.out.println("your updated data : " + info.get(enteredMailId));

                        serialize();

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

                        serialize();

                        break;
                    case 4:

                        System.out.println("your old emp id is \"" + updateData.empId + "\"");
                        System.out.println("enter your new phone");
                        int newUpdateEmpId = sc.nextInt();
                        sc.nextLine();
                        updateData.empId = newUpdateEmpId;
                        System.out.println("updated name is : " + updateData.empId);
                        info.put(enteredMailId, updateData);
                        System.out.println("your updated data : " + info.get(enteredMailId));

                        serialize();

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
        if (checkData().equals(true)) {
            System.out.println("Enter the mail id for which data will be delete :");
            String enteredMailId = sc.nextLine();
            info.remove(enteredMailId);
//            System.out.println(info);
            serialize();

            for (Map.Entry entry : info.entrySet()){
                System.out.println("key = " + entry.getKey()+" Value = "+ entry.getValue() );
            }

        } else {
            System.out.println("No data is available! please store the data first");
        }
        return "data deleted";
    }


    // this for new
    @Override
    public String forWhat(String forWhat) {
        return null;
    }
}



