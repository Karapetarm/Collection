package school;

public class Main {

    public static void main(String [] ags){

        Population worldPopulation =new Population();

        worldPopulation.addPerson(new Person("Ender","Wiggin",1122,PhoneType.HOME,"555-1111"));
        worldPopulation.addPerson(new Person("Maria","Macarena",7788,PhoneType.MOBILE,"555-2222"));
        worldPopulation.addPerson(new Person("Harry","Potter",9955,PhoneType.WORK,"555-3333"));
        worldPopulation.addPerson(new Person("Honor","Harrington",8888,PhoneType.HOME,"555-4444"));
        worldPopulation.addPerson(new Person("R.Daneel","Olivaw",5555,PhoneType.MOBILE,"555-5555"));
        worldPopulation.addPerson(new Person("Peter","Parker",1234,PhoneType.WORK,"555-6666"));
        worldPopulation.addPerson(new Person("Jim","Kerry",7788,PhoneType.MOBILE,"555-7777"));

    }
}