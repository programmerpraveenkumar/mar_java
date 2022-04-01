package OopsSample;

public class CityMain {
    public static void main(String[] args) {
        City city = new City();
        city.setCityName("london");
        city.setPeopleCount(1500);
        System.out.println(city.getCityName());
        System.out.println(city.getPeopleCount());


        City city1 = new City();
        city1.setCityName("test2");
        city1.setPeopleCount(2500);
        System.out.println(city1.getCityName());
        System.out.println(city1.getPeopleCount());
    }
    
}
