/**   
* @Title: student.java
* @Package memory
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @author ����
* @date 2017��10��15�� ����7:03:44
* @version V1.0
*/ 
package memory;

/** 
* @ClassName: student
* @Description: ���һ��ѧ���࣬���������ԣ�������������������������о����࣬��Ϊ��������ԡ�Ϊÿ������ӹ��췽�������������
* @author ����
* @date 2017��10��15�� ����7:03:44
* 
*/
public class student {    //ѧ����
    private String name;   //����
    private int age;       //����
    private String education;  //ѧ��
	/** 
	* @return name
	*/
	public String getName() {
		return name;
	}
	/** 
	* @param name Ҫ���õ� name
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
	* @param age Ҫ���õ� age
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
	* @param education Ҫ���õ� education
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
		System.out.println("������"+name+"  ���䣺"+age+"   ѧ��"+education);
	}
	 

}




