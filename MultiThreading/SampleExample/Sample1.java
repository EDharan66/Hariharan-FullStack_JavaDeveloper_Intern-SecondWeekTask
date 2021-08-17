public class Sample1 {
    public static void main(String[] args) {
        demo obj = new demo(5,6);
        demo1 obj1 = new demo1(5,6);
        obj.start();
        obj1.start();
    }
}

class demo extends Thread{
    int a;
    int b;
    demo(int a,int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public void run() {
        System.out.println("a+b = " + (a + b));
    }
}

class demo1 extends Thread{
    int a;
    int b;
    demo1(int a,int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public void run() {
        System.out.println("a-b = " + (a - b));
    }
}