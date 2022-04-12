package GenericsSample;

class MethodGenericSample {

    public static void main(String[] args) {
        MethodGenericSample m1 = new MethodGenericSample();
        m1.printMessage("asdf");//string
        m1.printMessage(234);//int
        m1.printMessage(23.2524);//double
    }
    public <T> void printMessage(T val){
        System.out.println(val);
    }

}





