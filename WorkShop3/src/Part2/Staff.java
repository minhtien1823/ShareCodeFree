
package Part2;

public class Staff extends Person {
    private String school; 
    private double pay; 

    public Staff(String name, String address,String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setShool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff Name: " + getName() + "\nAddress: " + getAddress() + 
                "\nShcool: " + getSchool() + "\nPay: " +getPay();
    }
    
    
}
