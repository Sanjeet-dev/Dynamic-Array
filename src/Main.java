public class Main {
    public static void main(String[] args) {
        DynamicArray dyArr = new DynamicArray();
        dyArr.add("A");
        dyArr.add("B");
        dyArr.add("C");

        dyArr.insert(1, "Z");
        dyArr.insert(2,"j");

        dyArr.search("C");

        dyArr.delete("Z");
        
        System.out.println(dyArr.printArray());
        System.out.println("size: "+dyArr.size);
        System.out.println("capacity: "+dyArr.capacity);
        System.out.println("empty: "+dyArr.isEmpty());
    }
}