package ss17_binary_file_serialization.bai_tap_binary_file;

import java.util.ArrayList;
import java.util.List;

public class ProductImpl implements IServices {
    List<Product> productList = new ArrayList<>();

    public ProductImpl() {
    }

    public ProductImpl(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }


    public void add(Product product) {
        productList.add(product);
    }


    public List<Product> search(String search, List<Product> products) {
        List<Product> list = new ArrayList<>();
        for (Product product : products) {
            if (product.getHangSangXuat().contains(search)) {
                list.add(product);
            }
        }
        return list;
    }


    public void display(List<Product> products) {
        for ( Product element :products) {
            System.out.println(element);
        }
    }
}
