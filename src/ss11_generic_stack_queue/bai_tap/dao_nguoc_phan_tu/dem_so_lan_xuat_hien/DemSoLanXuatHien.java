package ss11_generic_stack_queue.bai_tap.dao_nguoc_phan_tu.dem_so_lan_xuat_hien;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        System.out.println(" enter your letter ");
        Scanner scanner= new Scanner(System.in);
        String string = scanner.nextLine();

        Map<String, Integer> map = new TreeMap<>();
        String[] words = string.toLowerCase().split(" ");

        for (String word : words) {
            System.out.println(word);
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.replace(word, map.get(word) + 1);
            }
        }
        System.out.println("Count word in string:" + map);
    }
}
