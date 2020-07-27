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
public class SingleClubMember extends Member{
    
    private int club;
    
    SingleClubMember(char pMemberType, int pMemberID, String pName, double pFees, int pClub){
        super(pMemberType, pMemberID, pName, pFees);
        club = pClub;
    }

    public void setClub(int pClub){
        club = pClub;
    }
    
    public int getClub(){
        return club;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", " + club;
    }

    
}
