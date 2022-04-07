package CollectionsSample.SetSample;

import java.util.LinkedHashSet;

/*
it will not allow for the duplicates.
insertion order will  maintain
 */
public class LinkedHashSetSample {
    public static void main(String[] args) {
        LinkedHashSet<String> obj = new LinkedHashSet<String>();
        obj.add("test");
        obj.add("test4");
        obj.add("test4");//will not throw any error.but it will not add also.
        obj.add("test");//will not throw any error.but it will not add also.
        obj.add("test3");
        for(String tmp:obj){
            System.out.println(tmp);
        }
    }
}
