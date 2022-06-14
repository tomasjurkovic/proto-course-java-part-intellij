package maps;

import example.maps.Maps;

public class MapsMain {

    private static Maps.IdWrapper newIdWrapper(int id) {
        // function for setting ids
        return Maps.IdWrapper.newBuilder()
                .setId(id)
                .build();
    }

    public static void main(String[] args) {
        Maps.MapExample message = Maps.MapExample.newBuilder()
                .putIds("myid", newIdWrapper(42)) // for adding single id
                .putIds("myid2", newIdWrapper(43)) // for adding single id
                .putIds("myid3", newIdWrapper(44)) // for adding single id
                .build();

        System.out.println(message);
    }
}
