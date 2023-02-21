class Project {
    // Create a Project class that has the fields of name and description.

    private String Name;
    private String Description;
    private double Cost;
    private double cost;

    // Create an instance method called elevatorPitch that will return the name and description separated by a colon.
    
    public String elevatorPitch(String name, String description, String string) {
        return name + ": " + description + " @ " + string; 
    }

    public double initialCost(double cost) {
        return cost;
    }

    // Overload the constructor method in three different ways.

    public Project() { }
    public Project(String Name) { }
    public Project(String Name, String Description) { }
    public Project(String Name, String Description, double Cost) { }

    // Create getter and setters for each field

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost() {
        Cost = cost;
    }

    // Create a ProjectTest file that will test all the functionality.

}
