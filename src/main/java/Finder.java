public class Finder {

    // Function to find the minimum value given an integer array.
    // Empty/null arrays should return null.
    public static int indMin(int[] intArray) {

        // check if array is null or empty.
        if (intArray == null || intArray.length == 0) {
            return Integer.parseInt(null);
        }

        // initialize minimum value.
        int minValue = intArray[0];

        // loop through remaining elements.
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] < minValue) {
                    minValue = intArray[i];
            }
        }

        // return final value
        return minValue;
    }

}
