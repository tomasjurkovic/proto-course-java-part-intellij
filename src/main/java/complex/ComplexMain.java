package complex;

import example.complex.ComplexOuterClass;

import java.util.Arrays;

public class ComplexMain {


    // this is an utility function to set Dummy
    private static ComplexOuterClass.Dummy newDummy(int id, String name) {
        return ComplexOuterClass.Dummy.newBuilder()
                .setId(id)
                .setName(name)
                .build();
    }

    public static void main(String[] args) {
        ComplexOuterClass.Complex message = ComplexOuterClass.Complex.newBuilder()
                .setOneDummy(newDummy(55, "One Dummy"))
                .addAllDummies(
                        Arrays.asList(
                                newDummy(66, "Second Dummy"),
                                newDummy(67, "Third Dummy"),
                                newDummy(68, "Fourth Dummy")
                        )
                )
                .build();

        System.out.println(message);
    }
}
