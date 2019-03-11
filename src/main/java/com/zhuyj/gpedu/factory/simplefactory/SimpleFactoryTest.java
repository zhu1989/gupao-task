package com.zhuyj.gpedu.factory.simplefactory;

import com.zhuyj.gpedu.factory.AppleFruit;
import com.zhuyj.gpedu.factory.IFruit;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/11 17:52
 * @Description:
 * @Version 1.0
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        FruitFactory factory = new FruitFactory();
        IFruit fruit = factory.getFruit(AppleFruit.class);
        fruit.showName();
    }
}
