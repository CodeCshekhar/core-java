package OOPS.Inheritance.Types.Hierarchical;

public class TestHierarchical {
    public static void main(String[] args) {
        B B1 = new B();
        C C2 = new C();
        D D3 = new D();
        System.out.println(B1.s1+B1.s2+"\n"+C2.s1+C2.s3+"\n"+D3.s1+D3.s4);
    }
}
