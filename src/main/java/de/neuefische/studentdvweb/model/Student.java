package de.neuefische.studentdvweb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    private String name;
    private String id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(getName(), student.getName()) &&
                Objects.equals(getId(), student.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId());
    }
}

