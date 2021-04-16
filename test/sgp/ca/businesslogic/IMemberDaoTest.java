/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgp.ca.businesslogic;

import org.junit.Test;
import sgp.ca.domain.Member;

/**
 *
 * @author Esteban
 */
public class IMemberDaoTest {
    
    @Test
    public void testRegisterMember() {
        Member member = new Member("Juan","Fonseca","Perez","Juan24","123456","2291268574","Juanjose@gmail.com");
        MemberDao member1 = new MemberDao();
        member1.Member(member);
    }    
    
    @Test
    public void testDeleteMember(){
        MemberDao deleteMember = new MemberDao();
        deleteMember.deleteMember("Juan24");
    }
   
    @Test
    public void testSearchMember(){
        MemberDao searchMember = new MemberDao();
        searchMember.searchMember("Esteban");
    }
    @Test 
    public void testDisplayMembers(){
        MemberDao displayMembers = new MemberDao();
        displayMembers.diplayMembers();
    }
}
