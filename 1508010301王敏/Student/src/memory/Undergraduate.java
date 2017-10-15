/**   
* @Title: Undergraduate.java
* @Package memory
* @Description: TODO(用一句话描述该文件做什么)
* @author 王敏
* @date 2017年10月15日 下午7:06:24
* @version V1.0
*/ 
package memory;

/** 
* @ClassName: Undergraduate
* @Description: 设计一个学生类，设置其属性，并由属性派生出本科生类和研究生类，并为其添加属性。为每个类添加构造方法和输出方法。
* @author 王敏
* @date 2017年10月15日 下午7:06:24
* 
*/
public class Undergraduate extends student {  //本科生类
    private String specialty; //专业
    

	public Undergraduate(String name,int age,String education,String specialty){
    	super(name,age,education);
    	this.specialty=specialty;
    }

}
