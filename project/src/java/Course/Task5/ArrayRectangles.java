package Course.Task5;

public class ArrayRectangles {
    private Rectangle[] rectangle_array;
    public ArrayRectangles(int n){
        rectangle_array = new Rectangle[n];
    }
    public ArrayRectangles(Rectangle[] array){
        rectangle_array = array;
    }
    public boolean AddRectangle(Rectangle rectangle){
        if (rectangle_array[rectangle_array.length-1] == null ){
            for (int i = 0; i < rectangle_array.length; i++) {
                if (rectangle_array[rectangle_array.length-1] == null){
                    rectangle_array[i] = rectangle;
                }
            }
            return true;
        }
        else return false;
    }
    public int numberMaxArea(){
        double[] arrOfAreas = new double[rectangle_array.length];
        for (int i = 0; i < rectangle_array.length; i++) {
            arrOfAreas[i] = rectangle_array[i].area();
        }
        int index = 0;
        for (int i = 0; i < arrOfAreas.length-1; i++) {
            if (arrOfAreas[i] < arrOfAreas[i+1]) index = i;
        }
        System.out.println("Max area: " + arrOfAreas[index]);

        return index;
    }
    public int numberMinPerimeter(){
        double[] arrOfPerimeter = new double[rectangle_array.length];
        for (int i = 0; i < rectangle_array.length; i++) {
            arrOfPerimeter[i] = rectangle_array[i].perimeter();
        }
        int index = 0;
        for (int i = 0; i < arrOfPerimeter.length-1; i++) {
            if (arrOfPerimeter[i] < arrOfPerimeter[i+1]) index = i;
        }
        System.out.println("Min perimeter: " + arrOfPerimeter[index]);

        return index;
    }
    public int numberSquare(){
        int counter = 0;
        for (int i = 0; i < rectangle_array.length; i++) {
            if (rectangle_array[i].isSquare() == true) counter++;
        }

        return counter;
    }
}
