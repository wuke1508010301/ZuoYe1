/**   
* @Title: Undergraduate.java
* @Package memory
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @author ����
* @date 2017��10��15�� ����7:06:24
* @version V1.0
*/ 
package memory;

/** 
* @ClassName: Undergraduate
* @Description: ���һ��ѧ���࣬���������ԣ�������������������������о����࣬��Ϊ��������ԡ�Ϊÿ������ӹ��췽�������������
* @author ����
* @date 2017��10��15�� ����7:06:24
* 
*/
public class Undergraduate extends student {  //��������
    private String specialty; //רҵ
    

	public Undergraduate(String name,int age,String education,String specialty){
    	super(name,age,education);
    	this.specialty=specialty;
    }

}
