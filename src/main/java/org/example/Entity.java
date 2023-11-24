package org.example;

import java.util.List;

public class Entity<E> {
    public static <Root> List<? extends Entity<Root>> combineAll(List<? extends Entity<Root>>... subtypes) {
        return null;
    }
}
