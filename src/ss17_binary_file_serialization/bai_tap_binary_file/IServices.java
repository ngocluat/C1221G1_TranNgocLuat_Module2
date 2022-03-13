package ss17_binary_file_serialization.bai_tap_binary_file;

import java.util.List;

public interface IServices {
    void add (Product product);
    List<Product> search(String search, List<Product> products);
    void display(List<Product> products);

}
