//create separate package SingletonClass
package SingletonClass;

import java.util.ArrayList;

//create class School
public class School {

	public final static School school = new School();
	private ArrayList<String> teachers;
	public School() {
		
	//assign array list
		teachers = new ArrayList<String>();
		teachers.add("bala");
		teachers.add("raj");
		teachers.add("arun");
		teachers.add("mani");
		teachers.add("muthu");
		teachers.add("satheesh");
		teachers.add("seenu");
		teachers.add("jothi");
	}
	
public String getTeacher() {
	if(teachers.size()>0)
		return teachers.remove(0);
	//return type method
	return "No Teachers";
}
}
