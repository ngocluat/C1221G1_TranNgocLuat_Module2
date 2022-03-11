package on_tap.customer_manager.service;



import on_tap.customer_manager.models.Customer;
import on_tap.customer_manager.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    private Scanner scanner = new Scanner(System.in);
    private static final boolean GHI_TIEP =true;// nghi tiếp
    private static final boolean GHI_DE =true;// nghi đè


    @Override
    public void add() {
        // nhập thông tin từ bàn phìm
        System.out.println("nhập tin thông tin của khách hàng");
        System.out.println("nhập id");
        int id= Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên KH");
        String name = scanner.nextLine();
        System.out.println("nhập SDT");
        String phone = scanner.nextLine();
        Customer customer = new Customer(id,name,phone);

        List<Customer> customerList = new ArrayList<>();
        customerList.add(customer);
        // lưu list Customer vào CSV
        ReadAndWrite.writeListCustomerToCSV(customerList,GHI_TIEP);

    }

    @Override
    public void display() {
        List<Customer> customerList = ReadAndWrite.readCustomerListFromCSV();
        for (int i = 0; i <customerList.size() ; i++) {
            System.out.println((1+i)+"."+ customerList.get(i));
        }
    }

    @Override
    public void delete() {

    }

    @Override
    public void edit() {

    }
}
