
/**
 *
 * @author parsapourmand
 */
public abstract class Passenger {
    private String name;
    private int age;
    
    public Passenger(int age, String name){
        this.name = name;
        this.age = age;
    }
    
    public abstract double applyDiscount(double p);
    
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return this.age;
    }
    
}
