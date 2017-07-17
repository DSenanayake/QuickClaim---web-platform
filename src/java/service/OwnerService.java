package service;

import dao.OwnerImpl;
import model.City;
import model.ImageUrl;
import model.Owner;
import model.OwnerStatus;
import org.hibernate.Session;

/**
 *
 * @author Deeptha Senanayake
 */
public class OwnerService {

    private final OwnerImpl impl;
    private final Session session;

    public OwnerService() {
        impl = new OwnerImpl();
        session = impl.getSession();
    }

    public void AddOwner(String ownerID, String fname, String lname, String mobile, String password, String address, int city, int imageURL, int status) {

        model.Owner o = new model.Owner();

        o.setOwnerId(ownerID);
        o.setFirstName(fname);
        o.setLastName(lname);
        o.setMobile(mobile);
        o.setPassword(password);
        o.setAddress(address);
        o.setCity((City) session.load(model.City.class, city));
        o.setImageUrl((ImageUrl) session.load(model.ImageUrl.class, imageURL));
        o.setOwnerStatus((OwnerStatus) session.load(model.OwnerStatus.class, status));

        impl.addOwner(o);
    }

    String loginWithKey(String uname, String pword) {
        model.Owner o = new model.Owner();

        o.setOwnerId(uname);
        o.setPassword(pword);

        if (impl.login(o)) {
            try {
                return controller.Services.encrypt(uname);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "null";
    }

}
