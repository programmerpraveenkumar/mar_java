package OopsSample;

//encapsulation
//pojo class
public class City {
    private int peopleCount;
    private String cityName;

    public void setPeopleCount(int peopleCount){
            this.peopleCount = peopleCount;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public String getCityName() {
        return cityName;
    }
}
