package com.imooc.animal;
/**
 * 宠物猫类
 * @author admin
 *
 */

public class Cat {

	//属性：昵称、年龄、体重、品种
	String name;//昵称 默认值为null
	int month;//年龄  默认值为 0
	double weight;//体重 默认值为0.0
	String speices;//品种 默认值为null
	
	//方法：跑动、吃东西
	//跑动的方法
	public void run() {
		System.out.println("小猫快跑");
	}
	//方法重载
	public void run(String name) {
		System.out.println(name + "小猫快跑");
	}
	//吃东西的方法
	public void eat() {
		System.out.println("小猫吃鱼");
	}

}
