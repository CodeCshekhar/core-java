package OOPS.Inheritance.Types.Multilevel;

class One {
    String s1 = "This is";
}


class Two extends One{
    String s2 = " Multilevel";
}


class Three extends Two {
    String s3 = " Inheritance";
}


public class Multilevel {
    public static void main(String[] args) {
       Three t3 = new Three();
        System.out.println(t3.s1+t3.s2+t3.s3);
    }
}

