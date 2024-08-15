package _25_10_2023_ObjectsAndClasses.Exersice.OrderByAge;

public class OrderByAge {
    String namePerson;
    String idPerson;
    int agePerson;

    public OrderByAge(String namePerson, String idPerson, int agePerson) {
        this.namePerson = namePerson;
        this.idPerson = idPerson;
        this.agePerson = agePerson;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public String getIdPerson() {
        return idPerson;
    }

    public int getAgePerson() {
        return agePerson;
    }
    public String toString(){
        //Stephan with ID: 524244 is 10 years old.
        return String.format("%s with ID: %s is %d years old.",getNamePerson(),getIdPerson(),getAgePerson());
    }
}
