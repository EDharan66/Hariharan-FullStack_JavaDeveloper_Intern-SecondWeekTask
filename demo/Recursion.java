public class Recursion {

    public int recur(int m){
        System.out.println("m = " + m);
        return m!=0?recur(m-1)+m:m;
    }

    public static void main(String[] args) {

        Recursion re = new Recursion();

        System.out.println("re.recur(5) = " + re.recur(5));
    }

}
