class ProjectTest {
    public static void main(String[] args) {

        Project project = new Project();
        LinkedList list = new LinkedList();
        
        String pitch = project.elevatorPitch("Jack Sawyer",  "Full Stack Java Developer", "$92K per annum");

        System.out.println(pitch);
            
            

            // Insert the values
            list = insert(list, 1);
            list = insert(list, 2);
            list = insert(list, 3);
            list = insert(list, 4);
            list = insert(list, 5);
            list = insert(list, 6);
            list = insert(list, 7);
            list = insert(list, 8);

            // Print the LinkedList
            printList(list);
    }

    private static LinkedList insert(LinkedList list, int i) {
        return list;
	}

	private static void printList(LinkedList list) {
    }
}
