package simple;

import com.example.options.AnotherDummy;
import example.simple.SimpleOuterClass;

import java.util.Arrays;

public class SimpleMain {

    public static void main(String[] args) {
        SimpleOuterClass.Simple message = SimpleOuterClass.Simple.newBuilder()
                .setId(45)
                .setIsSimple(true)
                .setName("Tomas")
                .addSimpleList(1)
                .addSimpleList(2)
                .addSimpleList(3)
                .addAllSimpleList(Arrays.asList(4, 5, 6))
                .build();

        System.out.println(message);

        // here we can access this class directly
        AnotherDummy message2 = AnotherDummy.newBuilder()
                .setId(123)
                .build();

        System.out.println(message2);
    }
}
