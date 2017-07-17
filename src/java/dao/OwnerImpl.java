/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.City;
import model.ImageUrl;
import model.OwnerStatus;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Deeptha Senanayake
 */
public class OwnerImpl implements Owner {

    public static final Logger logger = LoggerFactory.getLogger(OwnerImpl.class);

    private static SessionFactory sf;
    private final Session session;

    public OwnerImpl() {
        if (sf == null) {
            sf = setSessionFactory(controller.Connection.getSessionFactory());
        }
        session = sf.openSession();
    }

    public SessionFactory setSessionFactory(SessionFactory sf) {
        OwnerImpl.sf = sf;
        return sf;
    }

    public Session getSession() {
        return this.session;
    }

    public static void main(String[] args) {
        try {
            OwnerImpl oi = new OwnerImpl();
            model.Owner o = new model.Owner();

            Session ses = oi.getSession();

            o.setOwnerId("951733083v");
            o.setFirstName("Deeptha");
            o.setLastName("Senanayake");
            o.setAddress("Kuliyapitiya");
            o.setCity((City) ses.load(model.City.class, 2));
            o.setImageUrl((ImageUrl) ses.load(model.ImageUrl.class, 1));
            o.setMobile("+94771105130");
            o.setPassword("123456");
            o.setOwnerStatus((OwnerStatus) ses.load(model.OwnerStatus.class, Owner.ACTIVE));

            oi.addOwner(o);
            List<model.Owner> l = oi.listOwners();
            System.out.println(l.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addOwner(model.Owner o) {
        Transaction tr = session.beginTransaction();
        try {
            session.saveOrUpdate(o);
            tr.commit();
            logger.info("Owner saved!, Owner details=" + o);
        } catch (Exception e) {
            e.printStackTrace();
            tr.rollback();
        }
    }

    @Override
    public void updateOwner(model.Owner o) {
        Transaction tr = session.beginTransaction();
        try {
            session.update(o);
            tr.commit();
        } catch (Exception e) {
            e.printStackTrace();
            tr.rollback();
        }
    }

    @Override
    public List<model.Owner> listOwners() {
        Criteria cr = session.createCriteria(model.Owner.class);

        cr.add(Restrictions.ne("ownerStatus", (model.OwnerStatus) session.load(model.OwnerStatus.class, Owner.REMOVED)));

        List<model.Owner> list = cr.list();
        return list;
    }

    @Override
    public model.Owner getOwnerByID(String id) {
        model.Owner o = (model.Owner) session.load(model.Owner.class, id);
        return o;
    }

    @Override
    public void removePerson(String id) {
        Transaction tr = session.beginTransaction();
        try {
            session.delete((model.Owner) session.load(model.Owner.class, id));
            tr.commit();
        } catch (Exception e) {
            e.printStackTrace();
            tr.rollback();
        }
    }

    public boolean login(model.Owner o) {
        Transaction tr = session.beginTransaction();
        try {
            Criteria cr = session.createCriteria(model.Owner.class);
            cr.add(Restrictions.and(Restrictions.eq("ownerId", o.getOwnerId()), Restrictions.eq("password", o.getPassword())));
            model.Owner owner = (model.Owner) cr.uniqueResult();
            if (owner != null) {
                return owner.getOwnerId().equals(o.getOwnerId()) && owner.getPassword().equals(o.getPassword());
            }
        } catch (Exception e) {
            e.printStackTrace();
            tr.rollback();
        }
        return false;
    }

}
