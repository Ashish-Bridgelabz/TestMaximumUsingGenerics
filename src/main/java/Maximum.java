public class Maximum<E extends Comparable<E>> {
    E firstValue;
    E secondValue;
    E thirdValue;

    public Maximum() {
    }

    public Maximum(E firstValue, E secondValue, E thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    //Generic method for finding maximum three elements
    public E findMaximum(E firstValue, E secondValue, E thirdValue) {
        if (firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(thirdValue) > 0)
            return firstValue;
        else if (secondValue.compareTo(thirdValue) > 0 && secondValue.compareTo(firstValue) > 0)
            return secondValue;
        else
            return thirdValue;
    }

    //Test method to internally call
    public <E extends Comparable<E>> E findMaximum() {
        return (E) findMaximum(firstValue, secondValue, thirdValue);
    }
}
