/**   
* @Title: Zuoye.java
* @Package 
* @Description: TODO(用一句话描述该文件做什么)
* @author 王敏
* @date 2017年9月23日 下午6:38:53
* @version V1.0
*/

/** 
* @ClassName: Zuoye1
* @Description:  一个整数，大于0，不用循环和本地变量，按照n,2n,4n,8n的顺序递增。
* 当值大于5000时，把值按照指定顺序输出。
* 例如，输入1237
* 输出为：1237,2474,4948,9896,9896,4948,2474,1237
* @Solution:采用递归的方法
* @author 王敏
* @date 2017年9月23日 下午6:38:53
* 
*/
public class Zuoye {

	/** 
	* @Title: main
	* @Description:  一个整数，大于0，不用循环和本地变量，按照n,2n,4n,8n的顺序递增。
	* 当值大于5000时，把值按照指定顺序输出。
	* 例如，输入1237
	* 输出为：1237,2474,4948,9896,9896,4948,2474,1237
	* @Solution:采用递归的方法
	* @param @param args
	* @return void
	* @throws 
	*/
	public static void main(String[] args) {
		// 创建一个长度为392的double类型的数组
		doubleNum(392);

	}
	public static void doubleNum(int n){
		System.out.println(n);//输出392和它的2n,4n,8n,知道大于5000
		if(n<=5000){
			doubleNum(n*2);
			System.out.println(n);//从大于5000开始以1/2,1/4,1/8输出，直到数值等于392
		}
	}

}
