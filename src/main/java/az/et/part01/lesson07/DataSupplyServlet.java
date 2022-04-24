package az.et.part01.lesson07;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.jetty.http.HttpStatus;

public class DataSupplyServlet extends HttpServlet {
    private static final ObjectMapper MAPPER
//          = new XmlMapper();
            = new ObjectMapper();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        List<Student> students = Arrays.asList(
                new Student("Elvin", 23, "CS"),
                new Student("Zohrab", 30, "IT"),
                new Student("Veli", 50, "Fizika")
        );

        Student alan = new Student("Alan Turing", 40, "ICT");
        alan.setCourses(Arrays.asList("A", "B", "C"));
        // serialize: Java object -> binary data (JSON)

        MyData myData = new MyData(alan, students);

//        String representation
//            = "User not found!";
        byte[] bytes = MAPPER.writeValueAsBytes(myData);
//    resp.setStatus(HttpStatus.NOT_FOUND_404);
        resp.setStatus(HttpStatus.FOUND_302);

//        try (PrintWriter pw = resp.getWriter()) {
//            pw.write(representation);
//        }

        try (OutputStream os = resp.getOutputStream()) {
            os.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static class MyData {
        private final Student student;
        private final List<Student> students;

        public MyData(Student student, List<Student> students) {
            this.student = student;
            this.students = students;
        }

        public Student getStudent() {
            return student;
        }

        public List<Student> getStudents() {
            return students;
        }
    }

}