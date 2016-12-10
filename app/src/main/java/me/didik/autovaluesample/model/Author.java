package me.didik.autovaluesample.model;

import com.google.auto.value.AutoValue;

/**
 * Created by didik on 12/10/16.
 * Author
 */
@AutoValue
public abstract class Author {
    public abstract String firstName();
    public abstract String lastName();

    public static Author create(String firstName, String lastName) {
        return new AutoValue_Author(firstName, lastName);
    }
}
