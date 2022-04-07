package CollectionsSample.ListSample;

import java.util.Iterator;
import java.util.Vector;

public class VectorListSamplePojo {
    public static void main(String[] args) {
        Vector<City> obj = new Vector<City>();//string vector

        City london = new City();
        london.setId(1);
        london.setName("London");

        City mumbai = new City();
        mumbai.setId(2);
        mumbai.setName("Mumbai");

        City banglore = new City();
        banglore.setId(3);
        banglore.setName("Banglore");

        obj.add(london);
        obj.add(mumbai);
        obj.add(banglore);

        Iterator<City> itr = obj.iterator();
        while(itr.hasNext()){
            City c = itr.next();
            System.out.println(c.getId()+c.getName());
        }

        for(City c:obj){
            System.out.println(c.getId()+" "+c.getName());
        }
    }
}
