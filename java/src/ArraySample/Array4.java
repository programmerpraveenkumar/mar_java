package ArraySample;
/*
    Array->to store the multiple values.
    in java, array can be created using values or size of the array.
    array starts with 0th position.
 */
public class Array4 {
    public static void main(String[] args) {

        Sample[] sampleArray = new Sample[10];//createing array for object.
//
//        Sample sample1 = new Sample();
//        sample1.setName("test1");
//        sample1.setId(1);
//
//        Sample sample2 = new Sample();
//        sample2.setName("test2");
//        sample2.setId(2);
//
//        Sample sample3 = new Sample();
//        sample3.setName("test3");
//        sample3.setId(3);

        sampleArray[0] = new Sample(10,"test");
        sampleArray[1] = new Sample(15,"test15");
        sampleArray[2] = new Sample(20,"test20");

        //assignment : access the object array with position.
        /*
        in sample array declared with size of 10.but it has only data for upto 3 positions.
        so from 3rd index till 10th index it becomes null.
        So using null object,
        trying to access the getName..so null pointer exception will come
         */
        //iteration of the array.
        for(Sample obj : sampleArray){
            if(obj != null){
                System.out.println(obj.getName()+" -- "+obj.getId());
            }
        }
    }
}
