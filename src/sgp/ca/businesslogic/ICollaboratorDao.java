/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgp.ca.businesslogic;

import sgp.ca.domain.Collaborator;

/**
 *
 * @author Esteban
 */
public interface ICollaboratorDao {
    public int Collaborator(Collaborator collaborator);
    public Collaborator createCollaborator(String [] data);
    public boolean verifyCollaborator(Collaborator collaborator);
}
