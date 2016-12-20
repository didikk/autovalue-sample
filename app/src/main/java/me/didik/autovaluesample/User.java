package me.didik.autovaluesample;

import com.google.auto.value.AutoValue;

/**
 * Created by didik on 12/20/16.
 * User
 */
@AutoValue
public abstract class User {
    abstract String firstName();
    abstract String lastName();
    abstract String gender();
    abstract int age();
    abstract String email();
    abstract String phone();
    abstract String address();

    public static Builder builder() {
        return new AutoValue_User.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder firstName(String firstName);
        public abstract Builder lastName(String lastName);
        public abstract Builder gender(String gender);
        public abstract Builder age(int age);
        public abstract Builder email(String email);
        public abstract Builder phone(String phone);
        public abstract Builder address(String address);
        public abstract User build();
    }
}
