package OOPS.Inheritance.Animal;


class Animal{

    public void eat(){
        System.out.println("the food has been eaten");
    }

    public void bark(){
        System.out.println("Bow bow");
    }

}

class Dog extends Animal{
    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void bark() {
        super.bark();
    }
}

