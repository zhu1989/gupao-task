package com.zhuyj.gpedu.factory.factorymethod;

import com.zhuyj.gpedu.factory.AppleFruit;
import com.zhuyj.gpedu.factory.IFruit;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/11 18:07
 * @Description:
 * @Version 1.0
 */
public class AppleFruitFactory implements IFruitFactory {

    public IFruit create() {
        return new AppleFruit();
    }
}
