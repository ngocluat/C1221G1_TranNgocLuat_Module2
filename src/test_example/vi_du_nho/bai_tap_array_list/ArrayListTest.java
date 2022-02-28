package test_example.vi_du_nho.bai_tap_array_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {
  public static void main(String[] args) {


    List<String> stringList = new ArrayList<>();
    stringList.add("luật");
    stringList.add("linh");
    stringList.add("lúc ");
    stringList.add("lo");
    stringList.add("lu");
    stringList.remove(2);
    stringList.add(2," ô bi ô");

    for (int i = 0; i < stringList.size(); i++) {
      System.out.println(stringList.get(i));
    }

    List<Object> objectList = new LinkedList<>();






  }


}
