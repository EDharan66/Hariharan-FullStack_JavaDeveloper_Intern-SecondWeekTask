import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

public class Serialize implements Serializable {

    public Serialize() {

        try {
            FileOutputStream fos = new FileOutputStream("DataInfo.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(OperatorClass.getInstance().info);
            oos.close();
            fos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
