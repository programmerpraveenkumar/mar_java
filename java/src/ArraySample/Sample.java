package ArraySample;

/*
    pojo class->plain object java object
    it does not have any main function or business logic
    just to store the data and get the data.

 */

public class Sample {
    Sample(){

    }
    Sample(int id,String name){
        this.id = id;
        this.name = name;
    }
    private int id;
    private  String name;
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


}
