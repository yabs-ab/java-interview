package se.yabs.interview.traffic;

import java.util.ArrayList;
import java.util.List;

public class Person {

    final String id;
    final List<Drive> drives;

    public Person(String id) {
        this.id = id;
        this.drives = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public List<Drive> getDrives() {
        return drives;
    }

    public void addDrive(final Drive drive) {
        drives.add(drive);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != null ? !id.equals(person.id) : person.id != null) return false;
        return !(drives != null ? !drives.equals(person.drives) : person.drives != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (drives != null ? drives.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", drives=" + drives +
                '}';
    }
}
