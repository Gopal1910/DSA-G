import java.util.*;

public class ItineraryFromTickets {

    // Find starting city → which never appears as destination
    public static String getStart(HashMap<String, String> map) {

        HashSet<String> dest = new HashSet<>(map.values());

        for (String city : map.keySet()) {
            if (!dest.contains(city)) return city;
        }
        return null;
    }

    public static void main(String[] args) {

        HashMap<String, String> tickets = new HashMap<>();

        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        // Start of journey
        String start = getStart(tickets);

        // Follow path using map
        while (start != null) {
            System.out.print(start + " -> ");
            start = tickets.get(start);
        }
    }
}
