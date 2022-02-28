package ss10_danh_sach.thuc_hanh;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListOrLinkedList {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("New York");
        arrayList.add("Atlanta");
        arrayList.add("Dallas");
        arrayList.add("Madison");
        System.out.println(arrayList);



        List<String> linkedList = new LinkedList<>();
        linkedList.add("New York");
        linkedList.add("Atlanta");
        linkedList.add("Dallas");
        linkedList.add("Madison");
        ListIterator<String> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
    }

}
