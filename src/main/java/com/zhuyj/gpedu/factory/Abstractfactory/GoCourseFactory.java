package com.zhuyj.gpedu.factory.Abstractfactory;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/11 18:40
 * @Description:
 * @Version 1.0
 */
public class GoCourseFactory implements ICourseFactory {
    public INote createNote() {
        return new GoNote();
    }

    public IVideo createVideo() {
        return new GoVideo();
    }
}
