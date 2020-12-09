
package inheritence;

public class Person {
   
    private final int Age;
    private final String FirstName;
    private final String LastName;
    private final String MobileNumber;
    private final String HairColour;
    private final double Height;
    private final String Gender;
    
    public Person (int Age , String FirstName , String LastName , String MobileNumber , String HairColour , Double Height , String Gender){
    this.Age=Age;
    this.FirstName=FirstName;
    this.LastName=LastName;
    this.MobileNumber=MobileNumber;
    this.HairColour=HairColour;
    this.Height=Height;
    this.Gender=Gender;
    
          
}

    public Person(int Age, String FirstName, String LastName, String MobileNumber, String HairColour, double Height, String Gender) {
        this.Age = Age;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.MobileNumber = MobileNumber;
        this.HairColour = HairColour;
        this.Height = Height;
        this.Gender = Gender;
        
    }

    @Override
    public String toString() {
        return "Person{" + "\nAge=" + Age + ", FirstName=" + FirstName + ", LastName=" + LastName + ", MobileNumber=" + MobileNumber + ", HairColour=" + HairColour + ", Height=" + Height + ", Gender=" + Gender + '}';
    }
    
   






}