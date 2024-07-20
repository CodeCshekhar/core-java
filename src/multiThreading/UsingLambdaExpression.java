package multiThreading;

class UsingLambdaExpression {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getId() + " Value " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getId() + " Value " + i);
            }
        });

        t1.start();
        t2.start();
    }
}

