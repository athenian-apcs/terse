import java.util.*;
import java.util.stream.Collectors;

public class MyMain {
    // Calculate the sum of all numbers in the collection using the reduce method
    public static int sumAll(Collection<Integer> numbers) {
        return 0;
    }

    // Calculate the product of all numbers in the collection using the reduce method
    // If the collection is empty, return 1
    public static int productAll(Collection<Integer> numbers) {
        return 0;
    }

    // Find the maximum value in the collection using the reduce method
    // If the collection is empty, return an empty Optional
    public static Optional<Integer> findMax(Collection<Integer> numbers) {
        return Optional.empty();
    }

    // Count how many strings in the collection have the given length using the reduce method
    public static long countStringsWithLength(Collection<String> strings, int length) {
        return 0;
    }

    // Find the average of all numbers, but if any number is negative, return an empty Optional
    // If the collection is empty, return an empty Optional
    public static Optional<Double> averageIfAllPositive(Collection<Integer> numbers) {
        return Optional.empty();
    }

    // Find the longest string(s) in the collection
    // Return a list of all strings that have the maximum length
    // If multiple strings tie for the longest, return all of them sorted alphabetically
    public static List<String> findLongestStrings(Collection<String> strings) {
        return Collections.emptyList();
    }

    // Process a list of user IDs and return a list of valid ones
    // A valid user ID starts with "USER_" followed by exactly 5 digits
    // Return the list of valid IDs sorted by the numeric portion (ascending)
    public static List<String> extractValidUserIds(Collection<String> ids) {
        return Collections.emptyList();
    }
}