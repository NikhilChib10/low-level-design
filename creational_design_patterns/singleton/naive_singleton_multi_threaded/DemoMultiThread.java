package creational_design_patterns.singleton.naive_singleton_multi_threaded;

/**
 * The same class behaves incorrectly in a multithreaded environment.
 * Multiple threads can call the creation method simultaneously and get several instances of Singleton class.
 */
public class DemoMultiThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
        Singleton singleton = Singleton.getInstance("FOO-MAIN");
        System.out.println("Main Method's Singleton" + singleton.value);
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println("ThreadFoo's singleton" + singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println("ThreadBar's singleton" + singleton.value);
        }
    }
}
