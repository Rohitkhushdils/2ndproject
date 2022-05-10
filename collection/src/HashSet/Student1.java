package HashSet;

import java.util.Objects;

public class Student1 {
	
		int rollno;
		int class;
		String studName;
		String course;
		public Student1(int rollno, String studName, String course) {
			super();
			this.rollno = rollno;
			this.studName = studName;
			this.course = course;
		}
		public void Student1(int rollno2, String studName2, String course2) {
			// TODO Auto-generated constructor stub
		}
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getStudName() {
			return studName;
		}
		public void setStudName(String studName) {
			this.studName = studName;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		@Override
		public String toString() {
			return "Student [rollno=" + rollno + ", studName=" + studName + ", course=" + course + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(course, rollno, studName);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student1 other = (Student1) obj;
			return Objects.equals(course, other.course) && rollno == other.rollno
					&& Objects.equals(studName, other.studName);
		}
		
		
		
	}
	


