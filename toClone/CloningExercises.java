package toClone;

public class CloningExercises {
    public static void main(String[] args){
        
        Address myAddress = new Address("new yourk", "Manhatan", "USA","TE25 TVCSA");
        Person person1 = new Person("Lopez", 29, myAddress);
        Person person2 = null;
        
        try {
            person2 = (Person) person1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Original City: " + person1.address.city);
        System.out.println("Clone City: " + person2.address.city); 
        
        person2.address.city = "San borja";
        
        System.out.println("Modified City: " + person1.address.city);
        System.out.println("Clone City: " + person2.address.city); 
        

    }
}