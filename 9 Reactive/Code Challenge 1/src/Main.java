import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class Main {
    // TODO Return an empty Flux
    static Flux<String> emptyFlux() {
        Flux<String> flux = Flux.empty();

        flux.subscribe(
                System.out::println,
                error -> System.out.println("Error: " + error),
                () -> System.out.println("Completed")
        );
        return flux;
    }

    // TODO Return a Flux that contains 2 values "foo" and "bar" without using an array or a collection
    static Flux<String> fooBarFluxFromValues() {
        Flux<String> flux = Flux.just("foo", "bar");
        flux.subscribe(System.out::println);
        return flux;
    }

    // TODO Create a Flux from a List that contains 2 values "foo" and "bar"
    static Flux<String> fooBarFluxFromList(List<String> list) {
        Flux<String> flux = Flux.fromIterable(list);
        flux.subscribe(System.out::println);
        return flux;
    }

    // TODO Create a Flux that emits an IllegalStateException
    static Flux<String> errorFlux() {
        Flux<String> flux = Flux.error(new IllegalStateException("Illegal state"));
        flux.subscribe(
                System.out::println,
                error -> {
                    if (error instanceof IllegalStateException) {
                        System.out.println("Caught IllegalStateException: " + error.getMessage());
                    } else {
                        System.out.println("Caught other error: " + error.getMessage());
                    }
                }
        );
        return flux;
    }

    // TODO Create a Flux that emits increasing values from 0 to 9 each 100ms
    static Flux<Long> counter() {
        Flux<Long> flux = Flux.interval(Duration.ofMillis(100))
                .take(10);

        flux.subscribe(System.out::println);

        // Delaying the termination of the main thread to observe the values
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return flux;
    }

    public static void main(String[] args) {
        emptyFlux();
        fooBarFluxFromValues();
        List<String> list = Arrays.asList("foo", "bar");
        fooBarFluxFromList(list);
        errorFlux();
        counter();
    }
}