package eventticketissuer;

public class Ticket {
    private static int nextID;
    
    private final int id;
    private final String name;
    private final Event event;

    public Ticket(String name, Event event) {
        this.id = nextID++;
        this.name = name;
        this.event = event;
    }
        
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Event getEvent() {
        return event;
    }
    
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(name);
        builder.append(" asiste al evento ").append(event.getName());
        builder.append(" entre el ").append(event.getStartDate());
        builder.append(" y el ").append(event.getEndDate());
        return builder.toString();
    }
}