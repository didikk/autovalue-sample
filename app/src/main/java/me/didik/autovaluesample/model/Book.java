package me.didik.autovaluesample.model;

import com.google.auto.value.AutoValue;

/**
 * Created by didik on 12/10/16.
 * Book
 */
@AutoValue
public abstract class Book {
    public abstract String title();

    public abstract String published();

    public abstract Author author();

    public static Builder builder() {
        return new AutoValue_Book.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder title(String title);

        public abstract Builder published(String published);

        public abstract Builder author(Author author);

        public abstract Book build();
    }
}
