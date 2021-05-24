/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgp.ca.businesslogic;

import java.util.ArrayList;
import sgp.ca.domain.Member;

/**
 *
 * @author Esteban
 */
public interface IMemberDao {
    public int Member(Member member);
    public ArrayList<Member> searchMember(String nameMember);
    public int deleteMember(String user);
    public ArrayList<Member> displayMembers();
}
