package concurrency.print_in_order;



import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.Executors;

public class FooTest {

    @Test
    void testFoo(){

        Foo foo = new Foo();
        Runnable first = () -> {
            try {
                foo.first(() -> {});
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable second = () -> {
            try {
                foo.second(() -> {});
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable third = () -> {
            try {
                foo.third(() -> {});
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        var list = List.of(first, second, third);

        var executorService = Executors.newFixedThreadPool(3);

        for(var runnable : list){
            executorService.execute(runnable);
        }
    }
}
