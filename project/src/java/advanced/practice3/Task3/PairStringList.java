package advanced.practice3.Task3;

public class PairStringList {
    private String[] arr;
    private int size;

    public PairStringList(int size) {
        arr = new String[size];
        this.size = size;
    }

    public void addValue(String str){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null){
                arr[i] = str;
                arr[i+1] = str;
                break;
            }
        }
    }
    public void addByIndex(int index, String str){
        for (int i = 0; i < arr.length; i++) {
            if (i == index && arr[i] == null){
                arr[i] = str;
                arr[i+1] = str;
                break;
            }
            if (i == index && arr[i] != null){
                System.out.println("There are an element");

            }
        }
    }

    public void removeOfObject(String str){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == str){
                arr[i] = null;
            }
        }
    }
    public void removingByIndex(int index) {
        for (int i = 0; i < arr.length; i++) {
            if (i == index && arr[i] == arr[i + 1]) {
                arr[i] = null;
                arr[i + 1] = null;
                break;
            }
            if (i == index && arr[i] == arr[i - 1]) {
                arr[i] = null;
                arr[i - 1] = null;
                break;
            }
        }
    }

    public String gettingByIndex(int index){
        String str = null;
        for (int i = 0; i < arr.length; i++) {
            if (i == index){
                str = arr[i];
                break;
            }
        }
        return str;
    }

    public void settingByIndex(int index, String str) {
        if (arr[index] == null && arr[index + 1] == null) {
            arr[index] = str;
            arr[index + 1] = str;
        }
        else {
            String[] newArr = new String[arr.length + 2];
            for (int i = 0; i < newArr.length; i++) {
                if (i == index && arr[index + 1] == null){
                    newArr[i] = str;
                    newArr[i] = str;
                }
                newArr[i] = arr[i];
            }
            arr = newArr;
        }


    }

    public void addingOfCollection(String[] collection){
        String[] newArr = new String[arr.length + collection.length];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        System.arraycopy(collection, 0, newArr, arr.length, collection.length);
        arr = newArr;
    }
    public void addingOfCollectionByIndex(String[] collection, int index){
        String[] newArr = new String[arr.length + collection.length];
        System.arraycopy(arr, 0, newArr, 0, index-1);
        System.arraycopy(collection, 0, newArr, index, collection.length);
        System.arraycopy(arr, 0, newArr, 0, arr.length-index);

        arr = newArr;
    }

}
