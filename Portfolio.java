import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Project> projects;
    
    ArrayList<Object>myArray = new ArrayList<Object>();

    public Portfolio() {
        projects = new ArrayList<Project>();
    }
    
    public void addProject(Project project) {
        projects.add(project);
    }
    
    public ArrayList<Project> getProjects() {
        return projects;
    }

    public ArrayList<Project> setProjects() {
        return projects;
    }

}