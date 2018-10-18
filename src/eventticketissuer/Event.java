package eventticketissuer;

//import java.time.LocalDate;

public class Event {
    private final String name;
    private final String startDate;
    private final String endDate;
    private final Room room;
    
    public Event(String name, String startDate, String endDate, Room sala) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.room = sala;
    }

    public String getName() {
        return name;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public Room getRoom() {
        return room;
    }    
}
