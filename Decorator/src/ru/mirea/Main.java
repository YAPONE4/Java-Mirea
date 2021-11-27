package ru.mirea;

public class Main {

    public interface Simple {
        public void write();
    }

    public static class SimpleStart implements Simple {
        public SimpleStart() {};

        public void write() {
            System.out.println("Start Simple");
        }
    }

    public static class SimpleParent implements Simple {

        protected Simple wrapper;

        public SimpleParent(Simple source) {
            wrapper = source;
        }

        public void write() {
            wrapper.write();
        }
    }

    public static class SimpleFirst extends SimpleParent {
        public SimpleFirst(Simple source) {
            super(source);
        }

        public void write() {
            System.out.println("First Simple");
        }
    }

    public static class SimpleSecond extends SimpleFirst {
        public SimpleSecond(Simple source) {
            super(source);
        }

        public void write() {
            System.out.println("Second Simple");
        }
    }

    public static class SimpleThird extends SimpleSecond {
        public SimpleThird(Simple source) {
            super(source);
        }

        public void write() {
            System.out.println("Third Simple");
        }
    }

    public static class App {
        public App() {};

        public void usage() {
            Simple source = new SimpleStart();
            source.write();

            source = new SimpleFirst(source);
            source.write();

            source = new SimpleThird(source);
            source.write();

            source = new SimpleSecond(source);
            source.write();
        }
    }

    public static void main(String[] args) {
        App program = new App();
        program.usage();
    }
}
