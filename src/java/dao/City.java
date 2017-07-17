package dao;

import java.util.List;

/**
 *
 * @author Deeptha Senanayake
 */
public interface City {

    public void addCity(model.City c);

    public void updateCity(model.City c);

    public List<model.City> listCities();

    public void getCityByID(int id);

    public void removeCity(int c);
}
