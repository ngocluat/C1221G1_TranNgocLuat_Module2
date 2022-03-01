package ss10_danh_sach.bai_tap.trien_khai_phuong_thuc_aray_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if(capacity>0){
            elements = new Object[capacity];

        }else{
            throw new IllegalArgumentException("capacity: "+capacity);
        }
    }

    public int size(){
        return this.size;
    }

    public void clear(){
        size = 0;
        for(int i = 0; i<elements.length;i++){
            elements[i] = null;
        }
    }

    public boolean add(E element){
        if(elements.length == size){
            ensureCapacity(DEFAULT_CAPACITY);
        }
        elements[size] = element;
        size++;
        return true;
    }


    private void ensureCapacity(int minCapacity){
        if(minCapacity>=0){
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements,newSize);
        }else{
            throw new IllegalArgumentException("minCapacity: "+minCapacity);
        }

    }

    public void add(int index, E element){
        if(index > elements.length){
            throw new IllegalArgumentException("index: "+ index);
        }else if(elements.length == size){
            this.ensureCapacity(DEFAULT_CAPACITY);
        }

        if(elements[index] == null){
            elements[index] = element;
            size++;
        }else{
            for(int i = size+1 ; i >= index;i--){
                elements[i] = elements[i-1];
            }
            elements[index]=element;
            size++;
        }
    };

    public E get(int index){
        E element = null;
        for(int i = 0;i<elements.length;i++){
            if(i == index){
                element = (E) elements[i];
            }
        }
        return element;
    }

    public int indexOf(E element){
        boolean check = false;
        int checked = -1;
        for(int i = 0 ; i<size;i++){
            if(this.elements[i].equals(element)){
                check=true;
                checked = i;
            }
        }
        return check ? checked : -1;
    }

    public E remove (int index){
        if(index <0 || index>elements.length){
            throw  new IllegalArgumentException("Error index: "+index);
        }
        E element = (E) elements[index];
        for(int i = 0;i<size - 1;i++){
            elements[i] =elements[i+1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }

    public boolean contains(E e){
        return this.indexOf(e) >= 0;
    }

    public MyList<E> clone(){
        MyList<E> v = new MyList<>();
        v.elements = Arrays.copyOf(this.elements,this.size);
        v.size = this.size;
        return  v;
    }
}