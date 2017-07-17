package dao;

import java.util.Date;
import model.Claim;
import model.ClaimStatus;
import model.Company;
import model.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ClaimImpl implements dao.Claim {

    private static SessionFactory sf;
    private final Session session;
    private final int NA = -2;

    public ClaimImpl() {
        if (sf == null) {
            sf = controller.Connection.getSessionFactory();
        }
        session = sf.openSession();
    }

    public int makeNewClaim(double lng, double lat, Date datetime, String vehicle, String... photos) throws Exception {
        Transaction tr = session.beginTransaction();
        try {
            model.Claim c = new model.Claim();

            c.setClaimStatus((ClaimStatus) session.load(model.ClaimStatus.class, dao.Claim.STATUS_SENT));
            c.setCompany((Company) session.load(model.Company.class, 1));
            c.setDatetime(datetime);
            c.setLatitude(lat);
            c.setLongitude(lng);
            c.setVehicle((Vehicle) session.load(model.Vehicle.class, vehicle));

            session.save(c);

            for (String url : photos) {
                if (url != null) {
                    model.ClaimPhoto p = new model.ClaimPhoto();
                    p.setClaim(c);
                    p.setPerspective(null);
                    p.setPhotoUrl(url);
                    session.save(p);
                }
            }

            tr.commit();
            return c.getClaimId();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    private void addNewPhoto(int claimId, String url, String desc) throws Exception {
        Transaction tr = session.beginTransaction();
        try {
            model.ClaimPhoto photo = new model.ClaimPhoto();

            photo.setClaim((model.Claim) session.load(model.Claim.class, claimId));
            photo.setPerspective(desc);
            photo.setPhotoUrl(url);

            session.save(photo);
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            e.printStackTrace();
            throw e;
        }
    }

}
