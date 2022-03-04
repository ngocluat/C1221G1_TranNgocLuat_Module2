package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung.quan_ly_sach;

import ss12_java_collection_framework.bai_tap.luyen_tap_su_dung.Product;

import java.util.Comparator;

public class SapXepTheoTen implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (o2.getTenSanPham().compareTo(o1.getTenSanPham()));
    }
}
