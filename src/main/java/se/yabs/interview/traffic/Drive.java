package se.yabs.interview.traffic;

import java.util.ArrayList;
import java.util.List;

public class Drive {

    final List<Position> positions;

    public Drive() {
        positions = new ArrayList<>();
    }

    public void addPosition(final Position position) {
        positions.add(position);
    }

    public List<Position> getPositions() {
        return positions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Drive drive = (Drive) o;

        return !(positions != null ? !positions.equals(drive.positions) : drive.positions != null);

    }

    @Override
    public int hashCode() {
        return positions != null ? positions.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Drive{" +
                "positions=" + positions +
                '}';
    }
}

