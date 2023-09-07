package com.y4j.oops.kranthi;

public class College {

	 private String name;
	    private String address;
	    private int studentsCount;
	    private String courses;
	    private boolean isLibraryAvailable;
	    private boolean isCafeteriaAvailable;

	    public College(String name, String address, int studentsCount, String courses, boolean isLibraryAvailable, boolean isCafeteriaAvailable) {
	        this.name = name;
	        this.address = address;
	        this.studentsCount = studentsCount;
	        this.courses = courses;
	        this.isLibraryAvailable = isLibraryAvailable;
	        this.isCafeteriaAvailable = isCafeteriaAvailable;
}
	    
	    public void enrollStudent(String studentName, String course) {
	        System.out.println("Enrolling " + studentName + " in " + course + " at " + name + " College.");
	    }
}