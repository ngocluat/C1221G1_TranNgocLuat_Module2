package ss10_danh_sach.bai_tap.trien_khai_phuong_thuc_aray_list;

import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            element = new Object[capacity];
        } else {
            throw new IllegalArgumentException(" capacity " + capacity);
        }

    }

    public int size() {
        return this.size;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < element.length; i++)
            element[i] = null;
    }

    public boolean add(E elements) {
        if (element.length == size) {
            this.ensureCapacity(5);
        }
        element[size] = elements;
        size++;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > 0) {
            int newSize = this.element.length + minCapacity;
            element = Arrays.copyOf(element, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);

        }
    }

    public void add(E elements, int index) {
        if (index > element.length) {
            throw new IllegalArgumentException("index: " + index);
        } else if (element.length == size) {
            this.ensureCapacity(5);
            if (element[index] == null) {
                element[index] = element;
                size++;
            } else {
                for (int i = size + 1; i >= index; i--) {
                    element[i] = element[i - 1];
                    element[index] = elements;
                    size++;
                }
            }

        }
    }


}