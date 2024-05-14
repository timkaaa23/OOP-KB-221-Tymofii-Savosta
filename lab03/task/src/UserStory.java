import java.util.ArrayList;
import java.util.List;

public class UserStory extends Ticket{
    private List<UserStory> dependencies;

    public UserStory(int id, int estimate, String name, List<UserStory> dependencies) {
        super(id, estimate, name);
        this.dependencies = dependencies;
    }

    public List<UserStory>getDependencies(){
        return new ArrayList<>(dependencies);
    }

    public void complete(){
        boolean allDependenciesCompleted = true;
        for (Ticket dependency : dependencies) {
            if (!dependency.isCompleted()) {
                allDependenciesCompleted = false;
                break;
            }
        }
        if (allDependenciesCompleted)
            super.complete();
    }

    public String toString(){
        return "[US " + getId() + "] " + getName();
    }
}
