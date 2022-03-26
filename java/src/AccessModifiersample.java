import MethodDeclaration.Method2;

public class AccessModifiersample {

    public static void main(String[] args) {
        Method2 m = new Method2();//object creation
      //  m.addition(10,15,10);//will throw the error. as it is private
        m.checkChildAge(15);//will not throw any error.as it is in public
        System.out.println(m.name);//public var
        //System.out.println(m.age);//error.as this var in private access
    }
}
