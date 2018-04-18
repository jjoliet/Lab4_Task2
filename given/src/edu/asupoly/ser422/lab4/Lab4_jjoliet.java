package edu.asupoly.ser422.lab4;

import java.util.ArrayList;
import java.util.Random;

public  class Lab4_jjoliet {
    private static final String[] __MAJORS = { "History", "Engineering", "English", "Nursing", "Psychology" };
    private static final String[] __YEARS  = { "Freshman", "Sophomore", "Junior", "Senior", "Graduate" };
    private static final String[] __SUBJECTS = { "HIS 101", "PSY 101", "EGR 303", "MAT 343", "ENG 400", "ENG 321", "NUR 200", "HEA 220", "SPA 201"};
    private static final int __NUM_STUDENTS= 100;
    // Singleton pattern
    private static Lab4_jjoliet __theService = null;
    private ArrayList<Student> __students = null;
    
    private Lab4_jjoliet() throws Exception {
    	Random random = new Random(System.currentTimeMillis());
    	// Create a bunch of dummy students :)
    	__students = new ArrayList<Student>();
    	for (int i = 0; i < __NUM_STUDENTS; i++) {
    	    __students.add(new Student("fname_"+i, "lname_"+i,
    				       __YEARS[random.nextInt(__YEARS.length)],
    				       __MAJORS[random.nextInt(__MAJORS.length)],
    				       50.0+50.0*random.nextDouble()));
    	}
    }
    
    public String[] getSubjects() {
    	return __SUBJECTS;
    }
    
    public static final Lab4_jjoliet getService() throws Exception {
	if (__theService == null) {
	    __theService = new Lab4_jjoliet();
	}
	return __theService;
    }

   

    public double calculateGrade(String year, String subject) {
	double grade = 0.0;
	int count = 0;
	for (Student s : __students) {
	    if ((year == null || year.equalsIgnoreCase(s.getYear())) &&
		(subject == null || subject.equalsIgnoreCase(s.getMajor()))) {
		grade += s.getGrade();
		count++;
	    }
	}
	if (count > 0) return grade/count;
	else return 0.0;
    }
    
    public final String mapToLetterGrade(double grade) {
	if (grade >= 98.0) return "A+";
	if (grade >= 93.0) return "A";
	if (grade >= 90.0) return "A-";
	if (grade >= 88.0) return "B+";
	if (grade >= 83.0) return "B";
	if (grade >= 80.0) return "B-";
	if (grade >= 77.0) return "C+";
	if (grade >= 70.0) return "C";
	if (grade >= 60.0) return "D";
	if (grade < 0.0) return "I";
	return "E";
    }
}

