/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectorienteddemo;

/**
 *
 * @author Jamie
 */
public class ObjectOrientedDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Staff staff1 = new Staff("Peter");
        staff1.setHoursWorked(160);
        int pay = staff1.calculatePay(1000, 400);
        System.out.println("Pay = " + pay);

        //staff1.hoursWorked = 160;
        
        
        /*Staff staff2 = new Staff("Jane", "Lee");
        staff2.setHoursWorked(160);
        pay = staff2.calculatePay();
        System.out.println("Pay = " + pay);*/
        
        /*System.out.println("\n\nUpdating Jane's Hours Worked to -10");        
        staff2.setHoursWorked(-10);
        System.out.println("\nHours Worked =  " + staff2.getHoursWorked());
        pay = staff2.calculatePay();
        System.out.println("Pay = " + pay);*/

        
    }
    
}
