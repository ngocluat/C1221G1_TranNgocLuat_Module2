package test_example;

public class Test {
    public static void main(String[] args) {
//        String x = "   CodeGym_Viet_Nam    ";
//        x = x.trim();
//        int index = x.indexOf("_");
//        String y = x.substring(0, index);
//        System.out.println(y);
        String x = "user@fpt.edu.vn";
        String y = "\\w+@\\w+(\\.\\w+){1,2}";
        if(x.matches(y)){
            System.out.print("A");
        }
        else{
            System.out.print("B");
        }

    }
}

