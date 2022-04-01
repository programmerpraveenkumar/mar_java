package ArraySample;
/*
    Array->to store the multiple values.
    in java, array can be created using values or size of the array.
    array starts with 0th position.
 */
public class Array2 {
    public static void main(String[] args) {
//        int[] ageArray = new int[10];/array created using the size.but no values.
        int[] ageArray = {10,15,10,81};//array created using the values
        System.out.println(ageArray[0]);//print the 0th pos
        System.out.println(ageArray[1]);//print the 1st pos
        System.out.println(ageArray[2]);//print the 2nd pos
        System.out.println(ageArray[3]);//print the 2nd pos
        //string array
        String [] nameList = {"test","test1","test2"};
        System.out.println(nameList[0]);
        System.out.println(nameList[1]);
      //  System.out.println(nameList[15]);//error will Create as Array Index Out Of BoundsException..

        System.out.println("Total length of the array is "+ageArray.length);
        System.out.println("---for loop iteration----");
        //iteration of the array.
        for(String name : nameList){
            System.out.println(name);
        }
        System.out.println("---for loop iteration2----");
        for(int start = 2;start< nameList.length;start++){
            System.out.println(nameList[start]);
        }
    }
}
