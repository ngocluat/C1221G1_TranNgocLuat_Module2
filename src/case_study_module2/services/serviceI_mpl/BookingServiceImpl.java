package case_study_module2.services.serviceI_mpl;

import case_study_module2.model.Booking;
import case_study_module2.model.Customer;
import case_study_module2.model.facility.Facility;
import case_study_module2.services.BookingCompater;
import case_study_module2.services.IBookingService;
import case_study_module2.services.IContractService;

import java.util.*;

public class BookingServiceImpl implements IBookingService, IContractService {
    static Set<Booking> bookingSet = new TreeSet<>(new BookingCompater());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility, Integer> facilityIntegerHap = new LinkedHashMap<>();
    static {
        System.out.println();
//        customerList.add(new Customer (1,);
    }

    @Override
    public void add() {
        //add
    }

    @Override
    public void display() {
       // display
    }

    @Override
    public void createNewContract() {
        //	Create new constracts
    }

    @Override
    public void displayListContract() {
        //4.	Display list contracts
    }

    @Override
    public void editContract() {

    }
}
