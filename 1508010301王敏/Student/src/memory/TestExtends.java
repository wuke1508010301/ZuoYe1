/**   
* @Title: TestExtends.java
* @Package memory
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @author ����
* @date 2017��10��15�� ����7:23:41
* @version V1.0
*/ 
package memory;

/** 
* @ClassName: TestExtends
* @Description: ���һ��ѧ���࣬���������ԣ�������������������������о����࣬��Ϊ��������ԡ�Ϊÿ������ӹ��췽�������������
* @author ����
* @date 2017��10��15�� ����7:23:41
* 
*/
public class TestExtends {

	
	public static void main(String[] args) {
		student stu=new student("ɵ��",22,"����");
		stu.show();
		Undergraduate u=new Undergraduate("����",23,"��ѧ","�������");
		u.show();
		Graduate g=new Graduate("����",24,"�о���","�����ϵ");
		g.show();

	}

}
