/**   
* @Title: Zuoye2.java
* @Package 
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @author ����
* @date 2017��9��23�� ����7:13:18
* @version V1.0
*/

/** 
* @ClassName: Zuoye2
* @Description: �����ͼ��ʾ��6*6������ת����ϣ�����N*N��������ת����4<=N<=10
* @Solution:�÷����㷨�͵ݹ�������
* @author ����
* @date 2017��9��23�� ����7:13:18
* 
*/
public class Zuoye2 {

	/** 
	* @Title: main
	* @Description: �����ͼ��ʾ��6*6������ת����ϣ�����N*N��������ת����4<=N<=10
	* @param @param args
	* @return void
	* @throws 
	*/
	public static int n=7;//����Ϊ7*7������ת����
	int[][] result=new int[n][n];
	public static void main(String[] args) {
		Zuoye2 rm=new Zuoye2();
		rm.generateRotate(1,0,n);
		rm.printResult();

	}
	//����������ת����
    public void generateRotate(int number,int one,int size){
    	//������� number����ʾ�����һ��Ԫ�ص�ֵ��one��Ϊ������±ꣻsize��Ϊ�������
    	if(size==1){
    		//����Ϊ1
    		result[one][one]=number;
    		return;
    	}
    	if(size==0){
    		//����Ϊ0
    		return;
    	}
    	//�������ɵ�һ��size-1��6����
    	int i=one;
    	int j=one;
    	for(int k=0;k<size-1;k++){
    		result[i][j]=number;
    		number++;
    		i++;
    	}
    	//�����������һ��size-1��6����
    	for(int k=0;k<size-1;k++){
    		result[i][j]=number;
    		number++;
    		j++;
    	}
    	//�����������һ����������size-1��6����
    	for(int k=0;k<size-1;k++){
    		result[i][j]=number;
    		number++;
    		i--;
    	}
    	//�������ɵ�һ����������size-1��6����
    	for(int k=0;k<size-1;k++){
    		result[i][j]=number;
    		number++;
    		j--;
    	}
    	//�ݹ����
    	generateRotate(number,one+1,size-2);
    }
    //������
    public void printResult(){
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			System.out.print(result[i][j]+"\t");//ʹ����Ľ������
    			if(j==n-1){
    				System.out.println();//�����������
    			}
    		}
    	}
    }
}
