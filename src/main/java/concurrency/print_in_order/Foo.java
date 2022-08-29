package concurrency.print_in_order;

import java.util.concurrent.Semaphore;

public class Foo {

    private Semaphore first;
    private Semaphore second;

    public Foo() {
        first = new Semaphore(0);
        second = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        first.release();

    }

    public void second(Runnable printSecond) throws InterruptedException {
        first.acquire();
        printSecond.run();
        second.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        second.acquire();
        printThird.run();
    }
}
