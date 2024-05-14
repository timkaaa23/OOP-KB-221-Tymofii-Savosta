import java.util.ArrayList;
import java.util.List;

public class Sprint {
    private int ticketsLimit;
    private int temporalyCapacity;
    private List<Ticket> tickets;

    public Sprint(int ticketsLimit, int temporalyCapacity){
        this.ticketsLimit = ticketsLimit;
        this.temporalyCapacity = temporalyCapacity;
        this.tickets = new ArrayList<>();
    }
    public boolean addUserStory(UserStory userStory){
        if(userStory != null || !userStory.isCompleted() && !tickets.contains(userStory)) {
            int totalEstimate = getTotalEstimate() + userStory.getEstimate();
            if (totalEstimate <= temporalyCapacity && tickets.size() < ticketsLimit) {
                tickets.add(userStory);
                return true;
            }
            return true;
        }
        return false;
    }
    public boolean addBug(Bug bug){
        if(bug != null || !bug.isCompleted() && !tickets.contains(bug)) {
            int totalEstimate = getTotalEstimate() + bug.getEstimate();
            if (totalEstimate <= temporalyCapacity && tickets.size() < ticketsLimit) {
                tickets.add(bug);
                return true;
            }
        }
        return false;
    }
    public List<Ticket> getTickets(){
        return new ArrayList<>(tickets);
    }

    public int getTotalEstimate(){
        int totalEstimate = 0;
        for (Ticket ticket : tickets) {
            totalEstimate += ticket.getEstimate();
        }
        return totalEstimate;
    }
}
