package school;


import java.util.*;

public class Population {

    private List<Person> personsList;


    public Population() {
        this.personsList = new ArrayList<>();
    }

    public Population(List<Person> personsList) {
        this.personsList = new ArrayList<>( personsList);
    }

    public void addPerson(Person person) {
        personsList.add(person);
    }

    public List<Person> getPersonsList() {
        return personsList;
    }

    public Map<String,List<Person >> mappingByLastName(){
        Map<String,List<Person >> lastNameMap =new HashMap<>();
        for (Person person : personsList) {
            if(!lastNameMap.containsKey(person.getLastName())){
                lastNameMap.put(person.getLastName(),new ArrayList<Person>());
            }
            lastNameMap.get(person.getLastName()).add(person);
        }

        return lastNameMap;
    }

    public Map<String,List<Person >> mappingByFirstName(){
        Map<String,List<Person >> firstNameMap =new HashMap<>();
        for (Person person : personsList) {
            if(!firstNameMap.containsKey(person.getLastName())){
                firstNameMap.put(person.getLastName(),new ArrayList<Person>());
            }
            firstNameMap.get(person.getLastName()).add(person);
        }

        return firstNameMap;
    }
    public Map<Integer,List<Person >> mappingByIdNumber(){
        Map<Integer,List<Person >> idNumberMap =new HashMap<>();
        for (Person person : personsList) {
            if(!idNumberMap.containsKey(person.getIdNumber())){
                idNumberMap.put(person.getIdNumber(),new ArrayList<Person>());
            }
            idNumberMap.get(person.getIdNumber()).add(person);
        }
        return idNumberMap;
    }

    public Map<String,Person> sortMapByLastName(List<Person> list){
        Map<String,Person> getByLastName=new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                str1 = str1.trim();
                str2 = str2.trim();
                return str1.substring(str1.indexOf(' ')).compareTo(str2.substring(str2.indexOf(' ')));
            }
        });
        for(Person person : personsList){
            getByLastName.put(person.getLastName(),person);
        }
        return getByLastName;
    }

    public Map<Integer,Person> sortMapByIdNumber(List<Person> list){
        Map<Integer,Person> getByIdNumber=new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer int1, Integer int2) {
                return int1.compareTo(int2);
            }
        });
        for(Person person : personsList){
            getByIdNumber.put(person.getIdNumber(),person);
        }
        return getByIdNumber;
    }

}
