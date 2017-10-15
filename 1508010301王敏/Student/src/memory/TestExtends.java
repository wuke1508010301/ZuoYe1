/**   
* @Title: TestExtends.java
* @Package memory
* @Description: TODO(用一句话描述该文件做什么)
* @author 王敏
* @date 2017年10月15日 下午7:23:41
* @version V1.0
*/ 
package memory;

/** 
* @ClassName: TestExtends
* @Description: 设计一个学生类，设置其属性，并由属性派生出本科生类和研究生类，并为其添加属性。为每个类添加构造方法和输出方法。
* @author 王敏
* @date 2017年10月15日 下午7:23:41
* 
*/
public class TestExtends {

	
	public static void main(String[] args) {
		student stu=new student("傻蛋",22,"高中");
		stu.show();
		Undergraduate u=new Undergraduate("二蛋",23,"大学","软件工程");
		u.show();
		Graduate g=new Graduate("三蛋",24,"研究生","计算机系");
		g.show();

	}

}
