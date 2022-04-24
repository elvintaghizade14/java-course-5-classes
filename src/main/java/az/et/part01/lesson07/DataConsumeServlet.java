package az.et.part01.lesson07;

import static az.et.part01.lesson07.DataSupplyServlet.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

public class DataConsumeServlet extends HttpServlet {
    private static final ObjectMapper MAPPER = new ObjectMapper();


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        try {
            BufferedReader body = req.getReader();
            System.out.println(body.readLine());
            Student student = MAPPER.readValue(body, Student.class);
            System.out.println(student);
        } catch (IOException e) {
            e.printStackTrace();
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
    }

}
