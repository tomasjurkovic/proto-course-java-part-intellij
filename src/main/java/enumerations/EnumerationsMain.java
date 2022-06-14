package enumerations;

import example.enumerations.Enumerations;

public class EnumerationsMain {

    public static void main(String[] args) {
        Enumerations.Enumeration message = Enumerations.Enumeration.newBuilder()
                .setEyeColor(Enumerations.EyeColor.GRAY) // setting by its name
                .build();

        Enumerations.Enumeration message2 = Enumerations.Enumeration.newBuilder()
                .setEyeColorValue(2) // setting by its value
                .build();

        System.out.println(message);
        System.out.println(message2);

    }
}
