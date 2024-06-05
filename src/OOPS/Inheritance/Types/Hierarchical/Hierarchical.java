package OOPS.Inheritance.Types.Hierarchical;


class A{
    String s1 = "This is";
}

class B extends A{
    String s2 = " Hierarchical Inheritance";
}

class C extends A{
    String s3 = " Hierarchical Inheritance";
}

class D extends A{
    String s4 = " Hierarchical Inheritance";
}

public class Hierarchical {
    public static void main(String[] args) {
        B s2 = new B();
        C s3= new C();
        D s4 = new D();
        System.out.println(s2.s1+s2.s2 +"\n"+s3.s1+s3.s3+"\n"+s4.s1+s4.s4);
    }


}
