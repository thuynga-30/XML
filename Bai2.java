
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import org.w3c.dom.Document;

public class Bai2 {
		public static void main(String[] args) {
			List<Student> students = new ArrayList<>();
	        students.add(new Student("Huy", 20, 3.8));
	        students.add(new Student("My", 20, 3.8));
	        students.add(new Student("Nga", 19, 3.9));
			students.add(new Student("Tung", 19, 3.9));

	        // Tạo XML từ danh sách sinh viên và ghi vào tệp
	        try {
	            FileWriter writer = new FileWriter("students.xml");
	            writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
	            writer.write("<students>\n");
	            for (Student student : students) {
	                writer.write("  <sinhvien>\n");
	                writer.write("    <name>" + student.getName() + "</name>\n");
	                writer.write("    <age>" + student.getTuoi() + "</age>\n");
	                writer.write("    <gpa>" + student.getGpa() + "</gpa>\n");
	                writer.write("  </sinhvien>\n");
	            }
	            writer.write("</students>");
	            writer.close();
	            System.out.println("File XML đã được tạo thành công.");
	        } catch (IOException e) {
	            System.out.println("Lỗi khi ghi file XML.");
	            e.printStackTrace();
	        }
		}
}
