public class Maximum {
    //Find maximum integer value
    public static Integer maximumInteger(Integer[] maxInteger) {
        Integer maximum = 0;
        for (Integer index : maxInteger) {
            if (index.compareTo(maximum) > 0)
                maximum = index;
        }
        return maximum;
    }

    //Find maximum float value
    public static Float maximumFloat(Float[] maxFloat) {
        Float maximum = 0.0f;
        for (Float index : maxFloat) {
            if (index.compareTo(maximum) > 0)
                maximum = index;
        }
        return maximum;
    }

    //Find maximum string value
    public static String maximumString(String[] maxString) {
        String maximum = " ";
        for (String index : maxString) {
            if (index.compareTo(maximum) > 0)
                maximum = index;
        }
        return maximum;
    }
}
