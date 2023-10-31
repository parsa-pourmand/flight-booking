
/**
 *
 * @author parsapourmand
 */
//Sub-class of Passenger class
public class NonMember extends Passenger{
    public NonMember(int age, String name){
        super(age, name);
    }
    
    @Override
    public double applyDiscount(double p){
        if(super.getAge() > 65){
            return p - p * 0.1;
        }else{
            return p;
        }     
    }
}
