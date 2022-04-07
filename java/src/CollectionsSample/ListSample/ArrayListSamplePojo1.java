package CollectionsSample.ListSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSamplePojo1 {
    public static void main(String[] args) {
        ArrayList<People> obj = new ArrayList<People>();//string arraylist
        obj.add(new People(4,"test3"));
        obj.add(new People(3,"test3"));
        obj.add(new People(1,"test1"));
        obj.add(new People(5,"test2"));
        obj.add(new People(3,"test3"));
        System.out.println("before sorting...");
        Collections.sort(obj);//pojo class is implmented by the Comparable interterce.no need to use Comparator.
        for(People c:obj){
            System.out.println(c.getId()+" "+c.getName());
        }


    }
}

