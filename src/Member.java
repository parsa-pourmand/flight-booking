
/**
 *
 * @author parsapourmand
 */
////Sub-class of Passenger class

public class Member extends Passenger{
    private int yearsOfMembership;
    
    
    public Member(int age, String name, int member_year){
        super(age, name);
        this.yearsOfMembership = member_year;
    }
    
    
    @Override
    public double applyDiscount(double p){
        if(this.yearsOfMembership > 5){
            return p*0.5;
        } else if(this.yearsOfMembership >1 && this.yearsOfMembership <=5 ){
            return p*0.9;
        }else {
            return p;
        }       
    }
}
