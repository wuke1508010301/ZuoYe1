/**   
* @Title: Zuoye.java
* @Package 
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @author ����
* @date 2017��9��23�� ����6:38:53
* @version V1.0
*/

/** 
* @ClassName: Zuoye1
* @Description:  һ������������0������ѭ���ͱ��ر���������n,2n,4n,8n��˳�������
* ��ֵ����5000ʱ����ֵ����ָ��˳�������
* ���磬����1237
* ���Ϊ��1237,2474,4948,9896,9896,4948,2474,1237
* @Solution:���õݹ�ķ���
* @author ����
* @date 2017��9��23�� ����6:38:53
* 
*/
public class Zuoye {

	/** 
	* @Title: main
	* @Description:  һ������������0������ѭ���ͱ��ر���������n,2n,4n,8n��˳�������
	* ��ֵ����5000ʱ����ֵ����ָ��˳�������
	* ���磬����1237
	* ���Ϊ��1237,2474,4948,9896,9896,4948,2474,1237
	* @Solution:���õݹ�ķ���
	* @param @param args
	* @return void
	* @throws 
	*/
	public static void main(String[] args) {
		// ����һ������Ϊ392��double���͵�����
		doubleNum(392);

	}
	public static void doubleNum(int n){
		System.out.println(n);//���392������2n,4n,8n,֪������5000
		if(n<=5000){
			doubleNum(n*2);
			System.out.println(n);//�Ӵ���5000��ʼ��1/2,1/4,1/8�����ֱ����ֵ����392
		}
	}

}
