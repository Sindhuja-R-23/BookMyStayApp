abstract class Room {
    String type;
    int price;

    Room(String type, int price) {
        this.type = type;
        this.price = price;
    }

    abstract void display();
}

class SingleRoom extends Room {
    SingleRoom() { super("Single", 1000); }
    void display() { System.out.println(type + " " + price); }
}

class DoubleRoom extends Room {
    DoubleRoom() { super("Double", 2000); }
    void display() { System.out.println(type + " " + price); }
}

class SuiteRoom extends Room {
    SuiteRoom() { super("Suite", 5000); }
    void display() { System.out.println(type + " " + price); }
}

public class UseCase2RoomInitialization {
    public static void main(String[] args) {
        new SingleRoom().display();
        new DoubleRoom().display();
        new SuiteRoom().display();
    }
}