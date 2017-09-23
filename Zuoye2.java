/**   
* @Title: Zuoye2.java
* @Package 
* @Description: TODO(用一句话描述该文件做什么)
* @author 王敏
* @date 2017年9月23日 下午7:13:18
* @version V1.0
*/

/** 
* @ClassName: Zuoye2
* @Description: 输出如图所示的6*6数字旋转方阵，希望编出N*N的数字旋转方阵4<=N<=10
* @Solution:用分治算法和递归进行求解
* @author 王敏
* @date 2017年9月23日 下午7:13:18
* 
*/
public class Zuoye2 {

	/** 
	* @Title: main
	* @Description: 输出如图所示的6*6数字旋转方阵，希望编出N*N的数字旋转方阵4<=N<=10
	* @param @param args
	* @return void
	* @throws 
	*/
	public static int n=7;//定义为7*7数字旋转矩阵
	int[][] result=new int[n][n];
	public static void main(String[] args) {
		Zuoye2 rm=new Zuoye2();
		rm.generateRotate(1,0,n);
		rm.printResult();

	}
	//生成数字旋转矩阵
    public void generateRotate(int number,int one,int size){
    	//定义参数 number：表示矩阵第一个元素的值；one：为矩阵的下标；size：为矩阵阶数
    	if(size==1){
    		//阶数为1
    		result[one][one]=number;
    		return;
    	}
    	if(size==0){
    		//阶数为0
    		return;
    	}
    	//依次生成第一列size-1即6个数
    	int i=one;
    	int j=one;
    	for(int k=0;k<size-1;k++){
    		result[i][j]=number;
    		number++;
    		i++;
    	}
    	//依次生成最后一行size-1即6个数
    	for(int k=0;k<size-1;k++){
    		result[i][j]=number;
    		number++;
    		j++;
    	}
    	//依次生成最后一列由下往上size-1即6个数
    	for(int k=0;k<size-1;k++){
    		result[i][j]=number;
    		number++;
    		i--;
    	}
    	//依次生成第一行由右往左size-1即6个数
    	for(int k=0;k<size-1;k++){
    		result[i][j]=number;
    		number++;
    		j--;
    	}
    	//递归调用
    	generateRotate(number,one+1,size-2);
    }
    //输出结果
    public void printResult(){
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			System.out.print(result[i][j]+"\t");//使输出的结果对齐
    			if(j==n-1){
    				System.out.println();//控制输出个数
    			}
    		}
    	}
    }
}
