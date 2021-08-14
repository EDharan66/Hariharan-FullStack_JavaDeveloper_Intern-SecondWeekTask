
import java.util.HashSet;

public class Sample {

    public static void main(String[] args) {

        HashSet<Character> ch = new HashSet<>();
        int count = 0;

        String st = "ajkhsdjfpaushruiklasfajkhsdjfpaushruiklasfajkhsdjfpaushruiklasfajkhsdjfpaushruiklasfajkhsdjfpaushruiklasfajkhsdjfpaushruiklasfajkhsdjfpaushruiklasfajkhsdjfpaushruiklasfajkhsdjfpaushruiklasfajkhsdjfpaushruiklasfajkhsdjfpaushruiklasfajkhsdjfpaushruiklasfajkhsdjfpaushruiklasfajkhsdjfpaushruiklasfajkhsdjfpaushruiklasfajkhsdjfpaushruiklasfajkhsdjfpaushruiklasfajkhsdjfpaushruiklasfajkhsdjfpaushruiklasfajkhsdjfpaushruiklasfajkhsdjfpaushruiklasfajkhsdjfpaushruiklasfajkhsdjfpaushruiklasfajkhsdjfpaushruiklasfajkhsdjfpaushruiklasfajkhsdjfpaushruiklasfajkhsdjfpaushruiklasfajkhsdjfpaushruiklasfajkhsdjfpaushruiklasfajkhsdjfpaushruiklasf";
        for (int i = 0; i < st.length(); i++) {
            ch.add(st.charAt(i));
            if(ch.size() == 12){
                break;
            }
            count++;
        }
        System.out.println("ch.size() = " + ch.size());
        System.out.println("st = " + st.length());
        System.out.println("count = " + count);

    }
}
