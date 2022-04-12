package CollectionsSample.MapSample;

import CollectionsSample.ListSample.City;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListHashMapPojo {
    public static void main(String[] args) {
        ArrayList<HashMap<String,City>> obj = new ArrayList<>();

        HashMap<String,City> cH1 = new HashMap<String,City>();
        cH1.put("city1",new City(10,"abc"));
        cH1.put("city2",new City(11,"abc11"));
        cH1.put("city3",new City(12,"abc12"));

        HashMap<String,City> cH2 = new HashMap<String,City>();
        cH2.put("city1",new City(10,"abc"));
        cH2.put("city2",new City(11,"abc11"));
        cH2.put("city3",new City(12,"abc12"));

        obj.add(cH1);
        obj.add(cH2);
        for(HashMap<String,City> itr:obj){
            for(City city:itr.values()){
                System.out.println(city.getId()+" "+city.getName());
            }
        }

    }

}
