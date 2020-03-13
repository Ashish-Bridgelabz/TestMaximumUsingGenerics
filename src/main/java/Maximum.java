public class Maximum {
    public static Integer maximumInteger(Integer[] maxInteger) {
        Integer maximum = 0;
        for (Integer index : maxInteger) {
            if (index.compareTo(maximum) > 0)
                maximum = index;
        }
        return maximum;
    }
}