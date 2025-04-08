package coe528.lab1;

public class NonMember extends Passenger {

public NonMember(String name, int age) {
        super(name, age);
}
 
    
    
@Override
public double applyDiscount(double p){

    if(age > 65){
        p =  p - (p * 0.1);
        
    }
    return p;
}

}
