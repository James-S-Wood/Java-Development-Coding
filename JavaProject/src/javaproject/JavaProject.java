/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;
import java.util.LinkedList;
/**
 *
 * @author Jamie
 */
public class JavaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String mem;
        
        MembershipManagement mm = new MembershipManagement();
        FileHandler fh = new FileHandler();

        LinkedList<Member> members = fh.readFile();        
        int choice = mm.getChoice();     

        while (choice != -1)
        {

            switch (choice)
            {
                case 1:
                    mem = mm.addMembers(members);
                    fh.appendFile(mem);
                    break;
                case 2:
                    mm.removeMember(members);
                    fh.overwriteFile(members);
                    break;
                case 3:
                    mm.printMemberInfo(members);
                    break;
                default:
                    System.out.print("\nYou have selected an invalid option.\n\n");  
                    break;
                    
            }
	
            choice = mm.getChoice();

        }
        
        System.out.println("\nGood Bye");


        
    }
    
}
