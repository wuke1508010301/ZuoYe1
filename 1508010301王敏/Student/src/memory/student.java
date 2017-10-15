/**   
* @Title: student.java
* @Package memory
* @Description: TODO(用一句话描述该文件做什么)
* @author 王敏
* @date 2017年10月15日 下午7:03:44
* @version V1.0
*/ 
package memory;

/** 
* @ClassName: student
* @Description: 设计一个学生类，设置其属性，并由属性派生出本科生类和研究生类，并为其添加属性。为每个类添加构造方法和输出方法。
* @author 王敏
* @date 2017年10月15日 下午7:03:44
* 
*/
public class student {    //学生类
    private String name;   //姓名
    private int age;       //年龄
    private String education;  //学历
	/** 
	* @return name
	*/
	public String getName() {
		return name;
	}
	/** 
	* @param name 要设置的 name
	*/
	public void setName(String name) {
		this.name = name;
	}
	/** 
	* @return age
	*/
	public int getAge() {
		return age;
	}
	/** 
	* @param age 要设置的 age
	*/
	public void setAge(int age) {
		this.age = age;
	}
	/** 
	* @return education
	*/
	public String getEducation() {
		return education;
	}
	/** 
	* @param education 要设置的 education
	*/
	public void setEducation(String education) {
		this.education = education;
	}
	
	public student(String name,int age,String education){
		setName(name);
		setAge(age);
		setEducation(education);
	}
	
	public void show(){
		System.out.println("姓名："+name+"  年龄："+age+"   学历"+education);
	}
	 

}




