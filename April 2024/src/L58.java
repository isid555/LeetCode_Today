import java.util.Arrays;

public class L58 {
    public static void main(String[] args) {
        String S = "fly across the moon";
        String[] words = S.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words[words.length-1]);
        System.out.println(words[words.length-1].length());
    }
}
