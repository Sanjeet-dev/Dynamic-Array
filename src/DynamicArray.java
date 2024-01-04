public class DynamicArray {
    int size;
    int capacity=3;
    Object[] arr;

    DynamicArray(){
        this.arr = new Object[capacity];

    }
    DynamicArray(int capacity){
        this.capacity = capacity;
        this.arr = new Object[capacity];

    }
    // adding elements to the array
    public void add(Object element){
        if(size >= capacity){
            grow();
        }
        arr[size] = element;
        size++;

    }
    public void insert(int index, Object element){
        if(size >= capacity){
            grow();
        }
        for(int i = size; i>index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = element;
        size++;

    }
    public void delete(Object element){
        for(int i =0; i<size; i++){
            if(arr[i] == element){
                for(int j=0; j<(size-i-1); j++){
                    arr[i+j]=arr[i+j+1];
                }
                arr[size-1] = null;
                size--;
                if(size <= (int)(capacity/3)){
                    shrink();
                }
            }
        }

    }
    public int search(Object element){
        for(int i=0; i<size; i++){
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }

    private void grow(){
        int newCapacity = (int)(capacity*2);
        Object[] newArr = new Object[newCapacity];

        for(int i=0; i<size; i++){
            newArr[i]=arr[i];
        }
        capacity = newCapacity;
        arr = newArr;


    }
    private void shrink(){
        int newCapacity = (int)(capacity/2);
        Object[] newArr = new Object[newCapacity];

        for(int i=0; i<size; i++){
            newArr[i]=arr[i];
        }
        capacity = newCapacity;
        arr = newArr;

    }
    
    public boolean isEmpty(){
        return size == 0;
    }

    public String printArray(){
        String str = "";
        for(int i = 0; i<capacity; i++){
            str += arr[i] + ", ";
        }
        if(str != ""){
            str = "[" + str.substring(0, str.length()-2) + "]";
        }
        else{
            str = "[]";
        }
        return str;
    }
}
