package advanced.practice3.Task2;

public class IntStringCappedMap {
    private Object[] arr;
    private int size;

    public IntStringCappedMap(int size) {
        arr = new Object[size];
        this.size = size;
    }

    public void entrySet(){

    }

    public void put(int key, Object obj){
        if (arr[key] == null) {
            arr[key] = obj;
        }

        else {
            System.out.println("Collision");
        }
    }

    public Object get(int key){
        Object obj = null;
        for(int i = 0; i < arr.length; i++){
            if(i == key){
                obj = arr[i];
            }
        }
        return obj;
    }

    public int size(){
        int size = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != null){
                size++;
            }
        }
        return size;
    }

    public void remove(int key){
        for(int i = 0; i < arr.length; i++){
            if(i == key){
                arr[i] = null;
            }
        }
    }

    public void print(){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]!=null){
                System.out.print(i + " " + arr[i].toString() + "\t");
            }
        }
        System.out.println();
    }
}
