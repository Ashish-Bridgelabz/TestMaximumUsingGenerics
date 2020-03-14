public class Maximum<E extends Comparable<E>> {
    E firstValue;
    E secondValue;
    E thirdValue;

    //Default constructor
    public Maximum() {
    }

    //Paramrtrized constructor
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

    //Internal call find maximum number
    public <E extends Comparable<E>> E findMaximum() {
        printMax(findMaximum(firstValue, secondValue, thirdValue));
        return (E) findMaximum(firstValue, secondValue, thirdValue);
    }

    public void printMax(E findMaximum) {
        System.out.println("Maximum is:" + findMaximum);
    }
}
