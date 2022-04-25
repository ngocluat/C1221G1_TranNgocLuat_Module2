package bai_tap_1.service;

import bai_tap_1.models.CostomerNN;
import bai_tap_1.models.CostomerVN;
import bai_tap_1.models.Peson;
import bai_tap_1.util.ReadWriteFIle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunctionCosstomer implements ICostomer, IAddCostomerNN, IAddCostomerVn {

    Scanner scanner = new Scanner(System.in);

    static List<Peson> pesonList = null;

    static {
        pesonList = ReadWriteFIle.readCostomer();
    }

    @Override
    public void display() {
        for (Peson s : pesonList) {
            System.out.println(s);
        }
    }

    @Override
    public void seaching() {
        System.out.println("nhập tên bạn muốn timf");
        String ten = scanner.nextLine();
        List<Peson> pesons = new ArrayList<>();
        for (Peson peson : pesonList) {
            if (peson.getNameCostomer().contains(ten)) {
                pesons.add(peson);
            }
        }
        for (Peson item : pesons) {
            System.out.println(item);
        }
    }

    @Override
    public void addNN() {

        System.out.println(" nhập id ");
        int iD = Integer.parseInt(scanner.nextLine());
        System.out.println(" nhập tên khách hàng ");
        String name = scanner.nextLine();
        System.out.println(" nhập thông tinh khachs hàng ");
        String nationality = scanner.nextLine();

        CostomerNN costomerNN = new CostomerNN(iD, name, nationality);
        pesonList.add(costomerNN);
        ReadWriteFIle.writeListString("src\\bai_tap_1\\data\\costomer.csv", pesonList, false);
    }

    @Override
    public void addVN() {
        System.out.println(" nhập id ");
        int iD = Integer.parseInt(scanner.nextLine());
        System.out.println(" nhập tên khách hàng ");
        String name = scanner.nextLine();
        System.out.println(" nhập loại khkachs hàng ");
        String costomerType = scanner.nextLine();
        System.out.println("nhập định mức tiêu thụ");
        double consumptionNorms = Double.parseDouble(scanner.nextLine());
        CostomerVN costomerVN = new CostomerVN(iD, name, costomerType, consumptionNorms);
        pesonList.add(costomerVN);
        ReadWriteFIle.writeListString("src\\bai_tap_1\\data\\costomer.csv", pesonList, false);
    }
}
