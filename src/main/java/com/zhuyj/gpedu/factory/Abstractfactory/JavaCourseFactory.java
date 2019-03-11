package com.zhuyj.gpedu.factory.Abstractfactory;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/11 18:39
 * @Description:
 * @Version 1.0
 */
public class JavaCourseFactory implements ICourseFactory {
    public INote createNote() {
        return new JavaNote();
    }

    public IVideo createVideo() {
        return new JavaVideo();
    }
}
