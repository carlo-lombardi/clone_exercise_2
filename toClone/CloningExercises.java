package toClone;
import toSum.Sum;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CloningExercises {
    public static void main(String[] args){
        
        final Logger logger = LogManager.getLogger(CloningExercises.class);

        Address myAddress = new Address("new yourk", "Manhatan", "USA","TE25 TVCSA");
        Person person1 = new Person("Lopez", 29, myAddress);
        Person person2 = null;
        
        try {
            person2 = (Person) person1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        logger.info("This is an info message " + person1.address.city);
        logger.warn("This is a warning message");
        logger.error("This is an error message", new Exception("Something went wrong"));
        
        System.out.println("Original City: " + person1.address.city);
        System.out.println("Clone City: " + person2.address.city); 
        
        person2.address.city = "San borja";
        
        System.out.println("Modified City: " + person1.address.city);
        System.out.println("Clone City: " + person2.address.city); 

        Sum suma = new Sum(5, 6);
        System.out.println("Sum " + suma.suma());


        

    }
}