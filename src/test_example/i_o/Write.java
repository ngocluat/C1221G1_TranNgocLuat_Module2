package test_example.i_o;

import java.util.Arrays;
import java.util.Objects;

public class Write {
    public static void main(String[] args) {
        String a = "23456789";
        char[] b = a.toCharArray();
        System.out.println(Arrays.toString(b));
        System.out.println(   Objects.requireNonNull(b));

    }
}
