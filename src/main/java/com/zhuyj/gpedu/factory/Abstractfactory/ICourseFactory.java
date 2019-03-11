package com.zhuyj.gpedu.factory.Abstractfactory;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/11 18:34
 * @Description:
 * @Version 1.0
 */
public interface ICourseFactory {

    INote createNote();

   IVideo createVideo();

}
