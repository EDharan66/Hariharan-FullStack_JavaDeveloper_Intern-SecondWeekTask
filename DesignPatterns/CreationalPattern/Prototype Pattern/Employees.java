import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;

// here Cloneable interface is a marker interface.
public class Employees implements Cloneable{

    private HashMap<String,Object> info;

    public Employees(){
        info = new HashMap<String, Object>();
    }

    public Employees(HashMap<String,Object> info){
        this.info=info;
    }
    public void loadData(){
        try {
            FileInputStream fis = new FileInputStream("DataInfo.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            this.info = (HashMap) ois.readObject();
        } catch (EOFException e) {
            System.out.println("empty data!");
            System.out.println("e = " + e);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public HashMap<String,Object> getEmpList() {
        return info;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{

        HashMap<String,Object> info = new HashMap<>(this.getEmpList());
        return new Employees(info);
    }
}
