import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Circle implements Comparable<Circle> {
    int x;
    int y;
    int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle circle = (Circle) obj;
        return x == circle.x && y == circle.y && radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, radius);
    }

    @Override
    public int compareTo(Circle other) {
        if (this.radius != other.radius) {
            return Integer.compare(this.radius, other.radius);
        }
        if (this.x != other.x) {
            return Integer.compare(this.x, other.x);
        }
        return Integer.compare(this.y, other.y);
    }

    @Override
    public String toString() {
        return "Circle(" + "x=" + x + ", y=" + y + ", radius=" + radius + ")";
    }
}

public class Fourtyone {
    public static void main(String[] args) {
        Set<Circle> hashSet = new HashSet<>();
        hashSet.add(new Circle(1, 1, 5));
        hashSet.add(new Circle(1, 1, 5)); 
        hashSet.add(new Circle(2, 2, 10));
        hashSet.add(new Circle(3, 3, 15));

        System.out.println("HashSet contents:");
        for (Circle c : hashSet) {
            System.out.println(c);
        }

        Set<Circle> treeSet = new TreeSet<>();
        treeSet.add(new Circle(1, 1, 5));
        treeSet.add(new Circle(1, 1, 5));
        treeSet.add(new Circle(2, 2, 10));
        treeSet.add(new Circle(3, 3, 15));

        System.out.println("TreeSet contents:");
        for (Circle c : treeSet) {
            System.out.println(c);
        }
    }
}
