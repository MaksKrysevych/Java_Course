package advanced.practice6.decorator;

import java.util.Iterator;
import java.util.List;

public class Decorators{
    public static List<String> evenIndexElementsSubList(List<String> sourceList) {
        throw new UnsupportedOperationException();
    }
}

class ListDecorator extends Decorators{
    List<String> sourceList;


    public ListDecorator(List<String> sourceList) {
        this.sourceList = sourceList;
    }

    public String get(int index){
        return sourceList.get(index);
    }
    public int size(){
        return sourceList.size();
    }

    public Iterator<String> iterator(){
        return sourceList.iterator();
    }
}
