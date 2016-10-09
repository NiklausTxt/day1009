package com.day1009.examPart1;

import java.util.Arrays;

public class Part1 {
	/**
	 * @author 童晓彤
	 * @date 2016-10-09
	 * 
	 * 1.对于String对象，可以用“=”赋值，也可以使用new关键字赋值，两种方法有什么区别
	 * 		用"="赋值,不会创建字符串对象
	 * 		用new关键字赋值相当于创建了一个String对象。
	 * 
	 * 2.String类和StringBuffer类有什么区别
	 * 		String类创建的对象是不可变的，如果要对其进行修改，又会重新new一个对象
	 * 		StringBuffer创建的对象是可变的，发生修改时，修改的是对象本身
	 * 
	 * 3.for循环中break语句和continue语句的使用
	 * 		使用break，程序会跳出当前循环
	 * 		使用continue，程序会跳出本次循环，进行下一次循环
	 * 
	 * 4.使用代码，创建一个长度为5的String类型数组，并使用for循环迭代数组打印数组中的元素
	 * 		String[] str = new String[5];		//创建数组
	 *			for (String s : str) {			//使用foreach打印
	 *			System.out.println(s);
	 *		}
	 * 
	 * 
	 * 5.说明Arrays类的作用,并举例
	 * 		为数组的工具类，为操作数组提供一些方法
	 * 		例如： Arrays.sort(); 	可以对数组进行排序
	 * 			  Arrays.binarySearch(a, key)  可以找到数组a中，值为key的元素的下标
	 * 
	 * 6.Overload 和 Override 的区别，Overload的方法是否可以改变返回值的类型
	 * 		Overload是重载，是一个类中的方法，方法名不变，方法的返回值，参数类型，个数，顺序都可以不一样
	 * 		Override是重写，子类重写父类中的方法，其参数类型，个数，顺序，返回值类型必须与父类保持一致
	 * 		Overload可以改变返回值类型
	 * 
	 * 
	 * 7.(1)Class A:a=11  b=2.0
	 * 	 (2)Class A:a=11  b=2.0
	 * 		Class B:a=3.0 d="Java program"
	 * 
	 * 
	 * 8.什么是抽象类，抽象类的作用是什么？
	 * 		在声明中用abstract修饰的类就是抽象类，一般抽象类中都有至少一个
	 * 		抽象方法（用abstract修饰，有返回值，参数，但是没有方法体，没有方法的实现）
	 * 		抽象方法必须在子类中实现
	 * 		抽象类的作用是更好的把一类的事物的特征抽象出来
	 * 
	 * 
	 * 9.final类和final方法的作用
	 * 		final类不能被继承，final方法不能被重写
	 * 
	 * 10.Object类中equals方法和hashcode方法
	 * 		没有对equals重写是，其实是调用了Object的equals方法，比较的两个对象的地址，贩毒案两个对象是否是同一个对象；
	 * 		重写之后一般是判断两个对象的内容是否相等
	 * 		hashCode() 的作用是获取哈希码，也称为散列码；它实际上是返回一个int整数。
	 * 		这个哈希码的作用是确定该对象在哈希表中的索引位置。
	 * 
	 * 11.throws关键字和throw关键字有什么区别和练习
	 * 		两个关键字都与抛出异常有关
	 * 		throws用在方法中，说明可能抛出的异常
	 * 
	 * 12.List和Set集合有什么区别
	 * 		List集合是有序的，可重复，Set集合是无序的，不可重复
	 * 
	 * 13.Collection和Collections有什么区别
	 * 		Collection是集合的父接口
	 * 		Collections是集合的一个包装类，里面提供了一些集合操作的方法
	 * 
	 * 14.java的多态是什么？
	 * 		java的多态是指相同的方法有不同的形式，例如子类可以覆写父类的方法，同一方法可以有不同
	 * 		的参数，返回值
	 * 
	 * 15.列举Java中八种基本数据类型，并说明数据类型的含义及长度
	 * 		类型		   	长度 		含义
	 * 		boolean		16位			布尔值，只有true，false两个值
	 * 		char		16位			字符
	 * 		byte		8位			字节	
	 * 		short		16位			短整型-128-127
	 * 		int			32位			整型
	 * 		long		64位			长整型
	 * 		float		32位			单精度浮点型
	 * 		double		64位			双精度浮点型
	 * 
	 * 
	 * 16.面向对象的特征
	 * 		封装性
	 * 		继承
	 * 		多态
	 * 		抽象
	 * 
	 * 
	 * 17.public,private,protected,以及不写时的区别
	 * 		public 本项目中所用包和类中都可以使用
	 * 		private 只有在本类中可以使用
	 * 		protected 只有在本包中和他的子类中可以使用
	 * 		default 只有在本包中可以使用
	 * 
	 * 18.见程序com.day1009.examPart2.Exam18.java
	 * 
	 * 
	 * 19.说明try/catch/finally语句块的作用
	 * 		捕捉异常处理异常，try中包含有可能出现异常的语句，如果有异常，
	 * 		则用catch中的语句进行处理，finally中的语句是不管有没有异常都要执行的语句。
	 * 
	 * 20."beijing".equalsIgnoreCase(new String("beijing"))的返回值是什么
	 * 		返回值是true
	 * 
	 * 
	 */

	public static void main(String[] args) {
		System.out.println("简答题");
	}
}
