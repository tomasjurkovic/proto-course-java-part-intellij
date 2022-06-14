package json;

import example.simple.SimpleOuterClass;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;

import java.util.Arrays;


public class JsonMain {

    // this allows change Simple message to Json
    private static String toJSON(SimpleOuterClass.Simple message) throws InvalidProtocolBufferException {
        return JsonFormat.printer()
                .omittingInsignificantWhitespace() // json will be in just 1 line
                .includingDefaultValueFields() // we can see also unfilled fields in json
                .print(message);
    }

    // this allows create new Simple message from Json
    private static SimpleOuterClass.Simple fromJSON(String json) throws InvalidProtocolBufferException {
        SimpleOuterClass.Simple.Builder builder = SimpleOuterClass.Simple.newBuilder();

        JsonFormat.parser().merge(json, builder);
        return builder.build();
    }

    public static void main(String[] args) throws InvalidProtocolBufferException {
        SimpleOuterClass.Simple message = SimpleOuterClass.Simple.newBuilder()
                .setId(12)
                .setName("New Name")
                .setIsSimple(true)
                .addAllSimpleList(Arrays.asList(1, 23, 798))
                .build();

        // this allows to create json from simple message
        String json = toJSON(message);
        // this prints out simple message in json format
        System.out.println(json);
        // this creates new simple message which was in json format before fromJSON function was used
        System.out.println(fromJSON(json));

    }
}
