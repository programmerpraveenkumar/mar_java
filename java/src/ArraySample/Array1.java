package ArraySample;
/*
    Array->to store the multiple values.
    in java, array can be created using values or size of the array.
    array starts with 0th position.
 */
public class Array1 {
    public static void main(String[] args) {
        int[] ageArray = new int[10];
        ageArray[0]= 15;//0 th position
        ageArray[1]= 25;//1st position
        ageArray[2]= 35;//2nd position
        System.out.println(ageArray[0]);//print the 0th pos
        System.out.println(ageArray[1]);//print the 1st pos
        System.out.println(ageArray[2]);//print the 2nd pos
        System.out.println(ageArray[3]);//print the 3rd pos

        /*
            syntax for arrayiteration
            for(Array_datatype variablename : arrayaname){

            }
         */
        System.out.println("Total length of the array is "+ageArray.length);
        System.out.println("---for loop iteration----");
        //iteration of the array.
        for(int age : ageArray){
            System.out.println(age);
        }
        System.out.println("---for loop iteration2----");
        for(int start = 0;start< ageArray.length;start++){
            System.out.println(ageArray[start]);
        }
    }
}
