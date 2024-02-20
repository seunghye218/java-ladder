package domain;

import java.util.Objects;

public class Name {

    private final String name;


    public Name(final String name) {
        if (name.length() < 1 || name.length() > 5) {
            throw new IllegalArgumentException("이름의 길이는 1 ~ 5 자 이어야 합니다.");
        }

        this.name = name;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
