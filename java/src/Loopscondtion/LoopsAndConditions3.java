package Loopscondtion;

public class LoopsAndConditions3 {

    public static void main(String[] args) {
        /*
        if condtion..->when condtion is true..
         */
        int age = 20;
        if(age <=5 ){
            System.out.println("this is Infant");
        }
        if(age >5 && age <=10){
            System.out.println("this is child");
        }else if(age >10 && age <25){
            System.out.println("this is adult");
        }
    }
}
