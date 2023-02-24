class Project {
    // Create a Project class that has the fields of name and description.


    private String Name;
    private String Description;
    private double Cost;
    private double cost;
    private Node head;
    private String list;

    // This inner class is made static so that main() can access it
    static class Node {
        int data;
        Node next;

        // Constructor
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Create an instance method called elevatorPitch that will return the name and
    // description separated by a colon.

    public String elevatorPitch(String name, String description, String string) {
        return name + ": " + description + " @ " + string;
    }

    public double initialCost(double cost) {
        return cost;
    }

    // Method to insert a new node
    public static Project insert(Project list, int data) {

        // Create a new node with given data
        Node newNode = new Node(data);

        // If the Linked List is empty, then make the new node as head
        if (list.head == null) {
            list.head = newNode;
        } else {
            // Else traverse till the last node and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = newNode;
        }

        // Return the list by head
        return list;
    }

    // Overload the constructor method in three different ways.

    public Project() {
    }

    public Project(String Name) {
    }

    public Project(String Name, String Description) {
    }

    public Project(String Name, String Description, double Cost) {
    }

    public LinkedList List(Object object, int i) {
        return null;
    }

    // Method to print the LinkedList.
    public static void printList(Project list) {
        Node currNode = list.head;
        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {

            // Print the data at current node
            System.out.print(currNode.data + ", ");

            // Go to next node
            currNode = currNode.next;
        }
    }

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

    public LinkedList getList() {
        return List(null, 0);
    }

    public void setList(String List) {
        List = list;
    }

    // Create a ProjectTest file that will test all the functionality.

}
