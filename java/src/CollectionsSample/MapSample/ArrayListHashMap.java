package CollectionsSample.MapSample;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListHashMap {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> obj = new ArrayList<>();

        HashMap<String,String> hmap1 = new HashMap<String, String>();
        hmap1.put("name","map1");
        hmap1.put("email","testemail");
        hmap1.put("city","testcity");

        HashMap<String,String> hmap2 = new HashMap<String, String>();
        hmap2.put("name","map2");
        hmap2.put("email","testemail2");
        hmap2.put("city","testcity2");

        HashMap<String,String> hmap3 = new HashMap<String, String>();
        hmap3.put("name","map3");
        hmap3.put("city","testcity3");

        //adding hashmaps to arraylist
        obj.add(hmap1);
        obj.add(hmap2);
        obj.add(hmap3);

        //access the hashmap by key
        System.out.println(obj.get(0).get("name"));//get hashmap obj from arraylist.then get value from the hashmap
        System.out.println("--for iteration---");
        obj.forEach((o)->{
            //System.out.println(o);
            System.out.println("------");
            o.forEach((k,v)->{
                System.out.println(k+"--"+v);
            });
        });

    }

}
