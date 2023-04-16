package toClone;

public class Address implements Cloneable{
     String street;
     String city;
     String state;
     String zipCode;

    Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        Address address = (Address) super.clone();
        return address;
    }
}
