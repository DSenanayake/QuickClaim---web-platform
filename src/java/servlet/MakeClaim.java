package servlet;

import controller.WebTools;
import dao.ClaimImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Deeptha Senanayake
 */
public class MakeClaim extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            PrintWriter out = response.getWriter();
            String vehicle = request.getParameter("vehicle");
            String desc = request.getParameter("description");
            double longitude = Double.parseDouble(request.getParameter("longitude"));
            double latitude = Double.parseDouble(request.getParameter("latitude"));

            System.out.println(desc + "/" + vehicle + "/" + latitude + "/" + longitude);

            String urls[] = new String[5];
            urls[0] = request.getParameter("photo1");
            urls[1] = request.getParameter("photo2");
            urls[2] = request.getParameter("photo3");
            urls[3] = request.getParameter("photo4");
            urls[4] = request.getParameter("photo5");

            for (int i = 0; i < urls.length; i++) {
                if (urls[i] != null) {
                    String path = "images\\claim\\" + System.currentTimeMillis() + ".bmp";
                    try {
//                        WebTools.saveImageFile(urls[i], path + i + ".bmp");
                        urls[i] = path;
                    } catch (Exception e) {
                    }
                    System.out.println(urls[i]);
                }
            }
            ClaimImpl impl = new ClaimImpl();
            impl.makeNewClaim(longitude, latitude, new Date(), vehicle, urls);
            System.out.println("Info:Received");
            out.write("OK");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
