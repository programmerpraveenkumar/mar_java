package Loopscondtion;

public class ForLoopSampleDivBy2 {
    public static void main(String[] args) {
        for(int num = 1;num<10;num++){
            //if num is 1.print the text one.else print the values.
            if(num % 2 == 0){
                System.out.println(num+"  is an even number");
            }else{
                System.out.println(num);
            }
        }
    }
}
