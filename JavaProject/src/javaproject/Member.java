/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *
 * @author Jamie
 */
public class Member {
    
    char memberType;
    int memberID;
    String name;
    double fees;
    
    Member(char pMemberType, int pMemberID, String pName, double pFees){
    
        memberType = pMemberType;
        memberID = pMemberID;
        name = pName;
        fees = pFees;               
    }

    public void setMemberType(char pMemberType)
    {
        memberType = pMemberType;
    }
    
    public char getMemberType()
    {
        return memberType;
    }
    
    public void setMemberID(int pMemberID)
    {
        memberID = pMemberID;
    }
    
    public int getMemberID()
    {
        return memberID;
    }
    
     public void setName(String pName)
    {
        name = pName;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setFees(double pFees)
    {
        fees = pFees;
    }
    
    public double getFees()
    {
        return fees;
    }

    @Override
    public String toString(){
       return memberType + ", " + memberID + ", " + name + ", " + fees;
    }

}
