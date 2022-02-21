package OOP;

public class Person implements PersonInterface {
	
   String pname;
   int page;
   char pgender;
      
    //constructor empty
    
    public Person(String name, int age, char gender){
    {
    	pname=name;
    	page=age;
    	pgender=gender;
    }
    
    public String printMsg(String pname){
    	return  "Hello, "+ pname+ "!";
}