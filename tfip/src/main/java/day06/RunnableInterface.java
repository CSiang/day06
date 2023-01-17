package day06;

@FunctionalInterface
public interface RunnableInterface <T> {

    // void printMessage(T a);
    
        T process(T a, T b);
        // note that there is no implementation in ths interface.
        // Only specify the method and its signature.
        // T means generic, which stand for any type of data.

    }
