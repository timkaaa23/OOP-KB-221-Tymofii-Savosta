public class Bug extends Ticket{
    UserStory userStory;

	public Bug(int id, String name, int estimate, UserStory userStory){
        super(id, estimate, name);
        this.userStory = userStory;
    }
    public static Bug createBug(int id, String name, int estimate, UserStory userStory){
        if(userStory != null || !userStory.isCompleted())
            return new Bug(id, name, estimate, userStory);
        return null;
    }
    public String toString(){
        return "[Bug " + getId() + "] " + userStory.getName() + ": " + getName();
    }
}
