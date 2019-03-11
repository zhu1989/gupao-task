package com.zhuyj.gpedu.factory.Abstractfactory;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/11 18:41
 * @Description: 抽象工厂
 * 提供一个创建一系列相关或依赖对象的接口，将一个系列的产品族统一到一起创建
 * 增加产品族产品时需要修改抽象工厂接口，不符合开闭原则
 * 抽象工厂关注产品族
 * @Version 1.0
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        factory.createNote().edit();
        factory.createVideo().recode();
    }
}
