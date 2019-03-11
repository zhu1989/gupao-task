package com.zhuyj.gpedu.factory.factorymethod;

import com.zhuyj.gpedu.factory.IFruit;
import com.zhuyj.gpedu.factory.OrangeFruit;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/11 18:09
 * @Description:
 * @Version 1.0
 */
public class OrangeFruitFactory implements IFruitFactory{

    public IFruit create() {
        return new OrangeFruit();
    }
}
