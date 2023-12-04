import java.io.Serializable;

public class Student implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	private int student_id;
	private String student_name;
	private double student_result;
	private String student_rank;
	Student left, right;

	public Student(int student_id, String student_name) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.left = null;
		this.right = null;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public double getStudent_result() {
		return student_result;
	}

	public void setStudent_result(double student_result) {
		this.student_result = student_result;
		setStudent_rank(student_result);
	}

	public String getStudent_rank() {
		return student_rank;
	}

	public void setStudent_rank(double student_result) {
		if (student_result < 5)
			this.student_rank = "FAIL";
		else
			this.student_rank = "PASS";
	}

}
