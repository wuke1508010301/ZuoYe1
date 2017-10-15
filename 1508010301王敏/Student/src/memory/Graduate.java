/**   
* @Title: Graduate.java
* @Package memory
* @Description: TODO(用一句话描述该文件做什么)
* @author 王敏
* @date 2017年10月15日 下午7:06:55
* @version V1.0
*/ 
package memory;

/** 
* @ClassName: Graduate
* @Description: 设计一个学生类，设置其属性，并由属性派生出本科生类和研究生类，并为其添加属性。为每个类添加构造方法和输出方法。
* @author 王敏
* @date 2017年10月15日 下午7:06:55
* 
*/
public class Graduate extends student {        //研究生类
    private String direction;   //研究方向 
    
    
	public Graduate(String name,int age,String education,String direction){
    	super(name,age,education);
    	this.direction=direction;
    }
	

}
