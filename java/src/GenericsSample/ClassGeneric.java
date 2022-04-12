package GenericsSample;

/*
generics defined by the diamond operator <>
 */
public class ClassGeneric {
    public static void main(String[] args) {
        ClassGenericSample<Integer> s1 = new ClassGenericSample<Integer>();
        s1.printVal(10);
        ClassGenericSample<String> s2 = new ClassGenericSample<String>();
        s2.printVal("test");

        ClassGenericSample<Double> s3 = new ClassGenericSample<Double>();
        s3.printVal(10.52);

    }
}
class ClassGenericSample<T> {
    T val;

    public void printVal(T v){
        System.out.println(v);
    }

}



