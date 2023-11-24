package org.example;


import java.util.List;

public final class Builder {

    private Builder(Person person, String unused) {

    }

    public Builder withTypes(Entity<String>... entities) {
        return new Builder(Person.make(Entity.combineAll(List.of(entities))));
    }
}
