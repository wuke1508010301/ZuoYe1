/**   
* @Title: Graduate.java
* @Package memory
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @author ����
* @date 2017��10��15�� ����7:06:55
* @version V1.0
*/ 
package memory;

/** 
* @ClassName: Graduate
* @Description: ���һ��ѧ���࣬���������ԣ�������������������������о����࣬��Ϊ��������ԡ�Ϊÿ������ӹ��췽�������������
* @author ����
* @date 2017��10��15�� ����7:06:55
* 
*/
public class Graduate extends student {        //�о�����
    private String direction;   //�о����� 
    
    
	public Graduate(String name,int age,String education,String direction){
    	super(name,age,education);
    	this.direction=direction;
    }
	

}
