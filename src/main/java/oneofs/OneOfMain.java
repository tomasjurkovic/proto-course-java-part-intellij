package oneofs;

import example.oneofs.Oneofs;

public class OneOfMain {
    public static void main(String[] args) {
        Oneofs.Result message = Oneofs.Result.newBuilder()
                .setMessage("The message")
                .build();

        // this prints message field, id was not set
        System.out.println("Has message: " + message.hasMessage());
        System.out.println("Has id: " + message.hasId());
        System.out.println(message);

        Oneofs.Result message2 = Oneofs.Result.newBuilder(message)
                .setId(404)
                .build();

        // now it prints only id '404', not a 'message' field, even if it was set
        System.out.println(message2);
        System.out.println("Has message: " + message2.hasMessage());
        System.out.println("Has id: " + message2.hasId());


        Oneofs.Result message3 = Oneofs.Result.newBuilder(message)
                .setMessage("changed message")
                .setId(1000)
                .build();

        // according to order, this has only id, not a message - message was cleared
        System.out.println(message3);
        System.out.println("Has message: " + message3.hasMessage());
        System.out.println("Has id: " + message3.hasId());
    }
}
