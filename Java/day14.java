// Day 14 - Scope

public Difference(int[] elements) {
        this.elements = elements;
}

public void computeDifference() {
        int maximum = 0;
        for (int i = 0; i < elements.length - 1; i++) {
                for (int c = i + 1; c < elements.length; c++) {
                        int difference = Math.abs(elements[i] - elements[c]);
                        if (difference > maximum) {
                                maximum = difference;
                        }
                }
        }
        maximumDifference = maximum;
}
