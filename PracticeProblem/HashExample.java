import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.HashMap;

public class HashExample {
    public static void main(String[] args) {


        HashMap<String, DataInfo> info = new HashMap<>();
        HashMap searchMap = new HashMap();
        Long phone = 6383145560L;

        try {
            FileInputStream fis = new FileInputStream("DataInfo.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            info = (HashMap) ois.readObject();
        } catch (EOFException e) {
            System.out.println("no data");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(info);
        System.out.println(info.keySet());
        System.out.println(info.values());
        long beforeExc = System.currentTimeMillis();
        System.out.println(Arrays.toString(info.values().parallelStream().filter(dataInfo -> dataInfo.phone.equals(phone)).toArray()));
        long afterExc = System.currentTimeMillis();

        System.out.println("beforeExc = " + beforeExc);
        System.out.println("afterExc = " + afterExc);
        System.out.println("timing : " + (afterExc-beforeExc));

        beforeExc = System.currentTimeMillis();
        System.out.println(Arrays.toString(info.values().stream().filter(dataInfo -> dataInfo.phone.equals(phone)).toArray()));
        afterExc = System.currentTimeMillis();

        System.out.println("beforeExc = " + beforeExc);
        System.out.println("afterExc = " + afterExc);
        System.out.println("timing : " + (afterExc-beforeExc));
    }
}
