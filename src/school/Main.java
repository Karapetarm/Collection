package school;

public class Main {

    public static void main(String[] ags) {

        Population worldPopulation = new Population();

        worldPopulation.addPerson(new Person("Ender", "Wiggin", 1122, PhoneType.HOME, "555-1111"));
        worldPopulation.addPerson(new Person("Maria", "Macarena", 7788, PhoneType.MOBILE, "555-2222"));
        worldPopulation.addPerson(new Person("Harry", "Potter", 9955, PhoneType.WORK, "555-3333"));
        worldPopulation.addPerson(new Person("Honor", "Harrington", 8888, PhoneType.HOME, "555-4444"));
        worldPopulation.addPerson(new Person("R.Daneel", "Macarena", 5555, PhoneType.MOBILE, "555-5555"));
        worldPopulation.addPerson(new Person("Peter", "Parker", 1234, PhoneType.WORK, "555-6666"));
        worldPopulation.addPerson(new Person("Jim", "Kerry", 7788, PhoneType.MOBILE, "555-7777"));

        if (worldPopulation.mappingByLastName().get("Macarena") != null)
            for (Person person : worldPopulation.mappingByLastName().get("Macarena")) {
                System.out.println(person + "\n");
            }
        else System.out.print("not found");

        if (worldPopulation.mappingByLastName().get("Macarena") != null)
            for (Person person : worldPopulation.mappingByFirstName().get("Peter")) {
            System.out.println(person + "\n");
        }
        else System.out.print("not found");

        if (worldPopulation.mappingByLastName().get("Macarena") != null) {
            for (Person person : worldPopulation.mappingByIdNumber.get(1122))
                System.out.println(person + "\n");
        }
        else System.out.print("not found");



    }
}


        /*Guys,  homework.
        Book: 459-532 - Collections chapter.
        ##################### TASK 1 ##############################

        Using the Java Collection Framework

        Store a collection of Person objects in an ArrayList<Person> container. The Person class keeps: firstName, lastName, idNumber, phoneNumber.
        Create ordered Java Maps to quickly retrieve data using either lastName, or idNumber.

        STEPS
        1. Create the Person Class
        2. Populate the ArrayList<Person> with the data objects listed below.
        3. Create Maps for lastName and idNumber.
        4. Use the Maps to perform the search operations listed below
        a. Show the record of a person whose name is: Macarena.
        b. Repeat the experience locating a person whose last name is: Potter
        c. Retrieve from the arraylist the person whose idNumber is 1234;

        PERSON TEST DATA (to be stored in the ArrayList)
        Ender Wiggin      1122     555-1111
        Maria Macarena      7788      555-2222
        Harry Potter     9955      555-3333
        Honor Harrington 8888    555-4444
        R.Daneel Olivaw  5555    555-5555
        Peter Parker     1234    555-6666

        ##################### TASK 2 ##############################

        1. You have a number of teachers: Bertie Hansel; James McCoy; Anastacia Brooklyn; Jim Kerry;
        2. Each teacher gives a class to some students:
        Bertie Hansel: Hovo Hovoyan, Mko Mkoyan, Dmbo Dmboyan, Parandzem Parandzemyan, Varsik Varsikyan.
        James McCoy:  Vasil Vasilya, Sago Sagoyan, Karapet Karaptyan
        Anastacia Brooklyn: Hovo Hovoyan, Sago Sagoyan, Cactus Cactusyan, Taguhi Taguhyan;
        Jim Kerry: Parandzem Parandzemyan, Taguhi, Taguhyan, Harisa Harisyan.

        Task a. Find teachers that have common students.

        Task b. Scenario: Jim Kerry got fired for bad behaviour during the classes. A new teacher is hired in place of him. Please update your data structure to reflect it.

        Task 3. print on the screen teachers and their students sorted by their names in the format "teacher: strudent1, student2,..."
        Task4. Print on the screen all the students that have more than one teacher.

        Note: Please think how would you store the teacher + their students relationship. Do not create custom classes - use just strings for teacher names and student names. Focus on standard Java Collection Framework!!!! (edited)

        annav [1:20 PM]
        ##################### TASK 3 ##############################
        Make the Stack (from the previous homework) Iterable

        [1:21]
        On the approach, whether to throw an exception or return e "special" value, it will be useful to examine Dequeue:
        https://docs.oracle.com/javase/7/docs/api/java/util/Deque.html*/