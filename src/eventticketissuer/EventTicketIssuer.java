package eventticketissuer;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;

public class EventTicketIssuer {
    public static void main(String[] args) {
        Room room1 = new Room("aula 2-1", 100);
        Room room2 = new Room("lab 3-4", 40);
     
        Event e1 = new Event("Java 10 a Fondo",
                              getFormattedDate(LocalDate.of(2018, Month.MARCH, 1)),
                              getFormattedDate(LocalDate.of(2018, Month.MARCH, 2)), 
                              room1);
        Event e2 = new Event("Introducción a las Expresiones Lambda", 
                              getFormattedDate(LocalDate.of(2018, Month.OCTOBER, 15)),
                              getFormattedDate(LocalDate.of(2018, Month.OCTOBER, 16)), 
                              room2);
        
        List<Ticket> ticketList = new ArrayList<>();
     
        ticketList.add(getTicketFor("Laura", e1));
        ticketList.add(getTicketFor("Álvaro", e2));
        ticketList.add(getTicketFor("Carlos", e2));
        ticketList.add(getTicketFor("María", e1));
 
        System.out.println("=== Se imprimen tickets de forma estándar ===");
        for(Ticket t : ticketList) {
            System.out.println(t);
        }
        
        System.out.println("\n=== Se imprimen tickets usando expresión lambda ===");
        ticketList.forEach(e -> System.out.println(e));
    }
    
    private void print(Ticket t) {
        System.out.println(t);
    }
    
    private static Ticket getTicketFor(String name, Event event) {
        return new Ticket(name, event);
    }        
    
    private static String getFormattedDate(LocalDate date) {
        return date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    }
}
    
