package com.zhuyj.gpedu.factory.factorymethod;

import com.zhuyj.gpedu.factory.IFruit;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/11 18:09
 * @Description:
 * @Version 1.0
 */
public class FactoryMethodTets {

    public static void main(String[] args) {
        IFruitFactory appleFactory = new AppleFruitFactory();
        IFruit apple = appleFactory.create();
        apple.showName();

        IFruitFactory orangeFactory = new OrangeFruitFactory();
        IFruit orange = orangeFactory.create();
        orange.showName();
    }
}
