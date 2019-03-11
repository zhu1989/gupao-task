package com.zhuyj.gpedu.factory.simplefactory;

import com.zhuyj.gpedu.factory.IFruit;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/11 17:48
 * @Description:简单工厂模式：
 * 通过接收一个参数创建对应的对象，不需要关心具体的创建逻辑
 * 增加新的产品时需要修改工厂的代码
 * 在这里采用反射的方式可以避免修改代码
 * @Version 1.0
 */
public class FruitFactory{

    public IFruit getFruit(Class clas) {
        if(clas != null){
            try {
                return (IFruit)clas.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
