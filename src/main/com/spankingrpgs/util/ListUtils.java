package com.spankingrpgs.util;

import java.util.List;
import java.util.Random;

/**
 * Contains a bunch of utility methods to make it easier to work with lists.
 */
public class ListUtils {

    private static final Random GENERATOR = new Random();
    /**
     * Returns a random element a list.
     *
     * @param list  The list to choose from
     * @return A random element from the list
     */
    public static <T> T choice(List<T> list) {
        return list.get(GENERATOR.nextInt(list.size()));
    }
}
