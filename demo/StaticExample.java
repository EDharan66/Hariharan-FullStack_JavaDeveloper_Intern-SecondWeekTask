public class StaticExample {

    int firstValue;
    static int secondValue;

    public StaticExample(int firstValue) {
        this.firstValue = firstValue;
    }

    public void setSecondValue(int secondValue) {
        StaticExample.secondValue = secondValue;
    }

    static void show(){

        System.out.println("hello!!"  );
    }

    public static void main(String[] args) {
        StaticExample obj = new StaticExample(5);
        StaticExample obj1 = new StaticExample(5);
        obj.setSecondValue(6);
    }

}
