public class Topic {
    /**
     * Session19Topic
     * Session20Topic
     *
     * Whenever we create a Java class there is one default builder or constructor which helps us to build
     * or create object of that class
     * */
    // Array of topics
    // String[] listOfTopics = new String[7];
    /**
     * Method Vs Constructor
     * Void/return type
     * Method Name can be anything
     * Constructor name has to be same as class name
     *
     * */
//    public Topic(){
//        System.out.println("I am a constructor, you need my help to create an object of Topic Class");
//    }

    public static void main(String[] args) {
        // Lets create Session20Topic Object so that we can add, update, delete items/topic in the topic list
        // TypeOfObject namOfObject = new TypeOfObject();
        // ClassName objectName = new ClassName();
        Topic session20Topic = new Topic(); // Topic() --> Constructor (Someone who has ability to construct/build)
        // Add a topic into session20Topic
        // How to call a method? objectName.methodName()
        // Add topic to the list
        session20Topic.addTopic("String class", 0);
        session20Topic.addTopic("Constructor", 1);
        session20Topic.addTopic("Constructor", 2);

    }

    public void addTopic(String topic, int indexNumber){
        String[] listOfTopics = new String[7];
        System.out.println("Add an item to the topic");
        System.out.println("Size of the list of topic before insertion: " + listOfTopics[0]);
        listOfTopics[indexNumber] = topic;
         // Get item form the list after insertion
//        System.out.println("Size of the list of topic at index 0: " + listOfTopics[0]);
//        System.out.println("Size of the list of topic at index 1: " + listOfTopics[1]);
//        System.out.println("Size of the list of topic at index 2: " + listOfTopics[2]);
        int i;
        // FromWhereToStart, WhereToStop, HowToIncrement or HowToGoToNextStep
        for(i = 0; i< listOfTopics.length; i++){
          // All our operation for a given iteration need to be written here
            String item = listOfTopics[i]; //
            System.out.println("Index " + i + " Topic form the list " + item);
        }

    }

    public void deleteTopic(){
        System.out.println("Delete an item from the topic");
    }

    public void updateTopic(){
        System.out.println("Update an item from the topic");
    }
}
