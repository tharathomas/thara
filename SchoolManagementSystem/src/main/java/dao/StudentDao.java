package dao;
import java.util.List;
import model.Student;
public interface StudentDao {
	public List<Student>getAllStudents();
	public Student getStudentById(Integer id);
	public Integer createStudent(Student student);
	public Integer deleteStudent(Integer id);
	public Integer updateStudent(Student student);

}
