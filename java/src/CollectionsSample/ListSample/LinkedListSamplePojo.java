package CollectionsSample.ListSample;

import java.util.LinkedList;

public class LinkedListSamplePojo {
    public static void main(String[] args) {
        LinkedList<City> obj = new LinkedList<City>();//string vector

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


        for(City c:obj){
            System.out.println(c.getId()+" "+c.getName());
        }
    }
}
