public class Maximum {

    public static <E extends Comparable> E maximum(E[] maxInteger) {
        E maximum = maxInteger[0];
        for (E index : maxInteger) {
            if (index.compareTo(maximum) > 0)
                maximum = index;
        }
        return maximum;
    }
}
