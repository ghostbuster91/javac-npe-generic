package org.example;

import java.util.List;

public class Entity<E> {
    public static <Root> List<? extends Entity<Root>> combineAll(Entity<Root>... subtypes) {
        return null;
    }
}
