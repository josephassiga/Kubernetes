import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList<T>{

    private Object list[];


    public void MyList(){
        this.list = new Object[0];
    }

    public void MyList(int size){
        this.list = new Object[size];
    }


    public void add(final T value){
        final int newSize = list.length * 2 ;
        list = Arrays.copyOf(list,newSize);
        list[list.length] = value;
    }



    public void remove(final int index){

        System.arraycopy(list,index + 1 , list,index,list.length - index - 1);

    }


    public int size(){

        return this.list.length;
    }


    public  T get(final int index){

        return (T) list[index];
    }

}
