/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgp.ca.businesslogic;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import sgp.ca.domain.Member;

/**
 *
 * @author Esteban
 */
public class MemberDaoTest {
   /*
    @Test
    public void testRegisterMember() {
        int confirmation;
        Member member = new Member("Juan","Fonseca","Perez","Juan24","123456","2291268574","Juanjose@gmail.com");
        MemberDao memberDao = new MemberDao();
        confirmation=memberDao.Member(member);
        Assert.assertEquals(confirmation,1);
    }  
    
    @Test
    public void testDeleteMember(){
        int confirmation;
        MemberDao deleteMember = new MemberDao();
        confirmation = deleteMember.deleteMember("");
        Assert.assertEquals(confirmation,1);
    }
    
    
    @Test 
    public void testDisplayMembers(){
        ArrayList<Member> MemberList = new ArrayList<Member>();
        MemberDao displayMembers = new MemberDao();
        MemberList=displayMembers.displayMembers();
        Assert.assertNotNull(MemberList);
        System.out.println(MemberList.get(0).getName());
    }

    */
   /*
    @Test
    public void testSearchMember(){
       ArrayList<Member> MemberList = new ArrayList<Member>();   
       MemberDao searchMember = new MemberDao();
       MemberList=searchMember.searchMember("Jose");
       Assert.assertNotNull(MemberList);
       System.out.println(MemberList.get(0).getName());
    }
    
    */
    @Test
    public void testVerifyMember(){
        boolean verify = false;
        MemberDao verifyMember = new MemberDao();
        Member member = new Member("Esteban","Martinez","Gonzalez","ElderBike4","123456","2285912362","estebanelder4@gmail.com",20,"Si","Inteligencia Artificial");
        verify=verifyMember.verifyMember(member);
        Assert.assertEquals(verify, true);
        
    }
}