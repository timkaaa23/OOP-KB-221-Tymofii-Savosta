public class Ticket {
    private int id, estimate;
    private String name;
    private boolean isComplited;

    public Ticket(int id, int estimate, String name) {
        this.id = id;
        this.estimate = estimate;
        this.name = name;
        this.isComplited = false;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getEstimate(){
        return estimate;
    }
    public boolean isCompleted() {
        return isComplited;
    }
    public void complete(){
        isComplited = true;
    }
}
