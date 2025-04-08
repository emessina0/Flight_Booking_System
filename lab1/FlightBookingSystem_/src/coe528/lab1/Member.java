package coe528.lab1;

public class Member extends Passenger {
    
public int yearsOfMembership;    

    public Member(int yearsOfMembership, String name, int age) {
        super(name, age);
        this.yearsOfMembership = yearsOfMembership;
    }
        


@Override
public double applyDiscount(double p){

if(yearsOfMembership > 5){  
 p =  p - (p * 0.5);
}
if (yearsOfMembership > 1 && yearsOfMembership <= 5){
    p =  p - (p * 0.1);
} 
else{
 p = p;    
}
return p;}}
