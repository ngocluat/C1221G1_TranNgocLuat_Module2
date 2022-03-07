package test_example.vi_du_nho.add_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductMamager {
    Scanner scanner = new Scanner(System.in);
    List<Product> productMamagers = new ArrayList<>();

    public ProductMamager(List<Product> productMamagers) {
        this.productMamagers = productMamagers;
    }

    public ProductMamager() {
    }

    public List<Product> getProductMamagers() {
        return productMamagers;
    }

    public void setProductMamagers(List<Product> productMamagers) {
        this.productMamagers = productMamagers;
    }


    public void add(Product product) {
        productMamagers.add(product);

    }


    public void update(Product product) {
        int index = productMamagers.indexOf(product);
        if (index == -1) {
            this.productMamagers.add(product);
        } else {
            this.productMamagers.set(index, product);
        }
    }

    public void delete(int index) {
        if (index < 0 || index >= productMamagers.size()) {
            System.out.println(" index not exist");
        } else {
            this.productMamagers.remove(index);
        }
    }
}
