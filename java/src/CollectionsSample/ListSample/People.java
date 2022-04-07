package CollectionsSample.ListSample;



public class People implements Comparable<People> {
    private int id;
    private String name;

    public People(int id, String name){
            this.id = id;
            this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullCourseName(){
        return this.id+" "+this.name;//concat integer and string.
    }


    @Override
    public int compareTo(People o) {
        return Integer.compare(this.getId(),o.getId());
    }
}
