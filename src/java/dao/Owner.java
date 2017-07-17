/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author Deeptha Senanayake
 */
public interface Owner {

    public static final int ACTIVE = 1, REMOVED = 2;

    public void addOwner(model.Owner o);

    public void updateOwner(model.Owner o);

    public List<model.Owner> listOwners();

    public model.Owner getOwnerByID(String id);

    public void removePerson(String id);
}
