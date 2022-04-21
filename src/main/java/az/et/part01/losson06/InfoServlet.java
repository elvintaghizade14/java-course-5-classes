package az.et.part01.losson06;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class InfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        try (PrintWriter pw = resp.getWriter()) {
            System.out.println("GET method called ->" + LocalDateTime.now());
            pw.write("Hello, Java EE!");
        } catch (Exception e) {
            e.printStackTrace();
        }

//        try (OutputStream os = resp.getOutputStream()) {
//            System.out.println("GET method called ->" + LocalDateTime.now());
//            os.write("Hello, World!".getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}