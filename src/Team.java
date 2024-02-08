import java.util.ArrayList;
import java.util.List;

public abstract class Team {
    String name;
    List<Member> members = new ArrayList<>();
    Double scour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public Double getScour() {
        return scour;
    }

    public void setScour(Double scour) {
        this.scour = scour;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", members=" + members +
                ", scour=" + scour +
                '}' + '\n';
    }
}
