package test_example.vi_du_nho.test_bai_tap.sevicer;

import test_example.vi_du_nho.test_bai_tap.model.Product1;

import java.util.ArrayList;
import java.util.List;

public class ChucNang implements IChucNang {
    List<Product1> product1s = new ArrayList<>();
    @Override
    public void them(Product1 product1) {
        product1s.add(product1);
    }

    @Override
    public void hienThi() {
        for (Product1 a : product1s) {
            System.out.println(a);
        }
    }
}
