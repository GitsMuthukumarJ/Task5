//create separate package SingleonClass
package SingletonClass;

//create class Teacher
public class Teacher
{
	//declare String values
	String name, teacher;
	public Teacher (String teachername)
	{
		//Current class activity calling
		this.name =teachername;
		School school = School.school;
		teacher = school.getTeacher();
	}
		public String getName() {
		return name;
	}
		
	public void setName(String name) {
		this.name = name;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	//main method
		public static void main(String[] args)
		{
			//enhanced for
	for(int i=0; i<10; i++)
	{
		//create object for Teacher class
		Teacher first = new Teacher("Singleton "+i);
		System.out.println(first.getName()+" has teacher: "+first.getTeacher());
		}
	}
}
