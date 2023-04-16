package toClone;

public class Person implements Cloneable {
    String name;
    public int age;
    Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = new Address(address.street, address.city, address.state, address.zipCode);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        Person person = (Person) super.clone();
        person.address = (Address) person.address.clone();
        return person;
    }


}
