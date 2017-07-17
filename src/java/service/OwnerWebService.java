/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.HashMap;
import java.util.Map;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.json.simple.JSONArray;

/**
 *
 * @author Deeptha Senanayake
 */
@WebService(serviceName = "OwnerWebService")
public class OwnerWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "ownerLogin")
    public String ownerLogin(@WebParam(name = "uname") String uname, @WebParam(name = "pword") String pword) {
        String json = "";
        try {
            JSONArray array = new JSONArray();

            Map<String, String> map = new HashMap<String, String>();

            OwnerService service = new OwnerService();

            String key = service.loginWithKey(uname, pword);

            map.put("key", key);

            array.add(map);

            json = array.toJSONString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return json;
    }
}
