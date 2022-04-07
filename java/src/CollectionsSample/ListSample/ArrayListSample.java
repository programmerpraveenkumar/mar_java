package CollectionsSample.ListSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListSample {
    public static void main(String[] args) {
            //data type has to be mentioned in the diamond operator.
            ArrayList<String> obj = new ArrayList<String>();//string arraylist
            obj.add("test");//position is 0
            obj.add("test1");//position is 1
            obj.add("test2");//position is 2
            obj.add("test3");//position is 3
            //obj.add(1);//error as it is integer
        System.out.println(obj.get(0));//access by position
        System.out.println(obj.get(2));
        System.out.println("Total size of the arraylist "+obj.size());
        obj.add("test4");//position is 4
        obj.add("test4");//position is 5
        System.out.println("Total size of the arraylist "+obj.size());
        ///System.out.println(obj.get(10));//index out of bound exception.
        obj.remove(1);//remove by the position.
        obj.remove("test31");//remove by the value.
        System.out.println("iteration of arraylist");

        ArrayList<String> obj2 = new ArrayList<String>();//string arraylist
        obj2.add("test2");
        obj2.add("test21");
        obj2.add("test22");
        obj2.add("test23");


        //merging the arraylist obj2 with obj
        obj.addAll(obj2);//merging the arraylist.
        Collections.sort(obj);//sorting the data..will be apply only for wrapper classes
        for(String tmp:obj){
            System.out.println(tmp);
        }
        int index =  obj.indexOf("test3");
        System.out.println(index+" is the index for test3");
        System.out.println(obj.contains("test34"));//true or false bases on the value
        obj.clear();//clear all the elements
        System.out.println("after clearing "+obj.size());



        ArrayList<Integer> objInt  = new ArrayList<Integer>();//integer arraylist.
        objInt.add(1);//0
        objInt.add(15);//1
        objInt.add(25);//2
        System.out.println(objInt.get(0));
        System.out.println(objInt.get(2));
        Iterator<Integer> intlist = objInt.iterator();
        while(intlist.hasNext()){
            System.out.println(intlist.next());
        }
    }
}
