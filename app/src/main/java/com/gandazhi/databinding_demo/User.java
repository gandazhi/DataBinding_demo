package com.gandazhi.databinding_demo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;



/**
 * Created by gandazhiPc on 2016/12/19.
 * 给DataBinding添加可观察模式
 * 1.bean类继承BaseObservable，成员一个可被观察的Observable
 * 2.在getter方法添加@Bindable注解
 * 3.在setter方法里通知notifyPropertyChanged()，当属性发生改变时，通知DataBinding框架
 */

public class User extends BaseObservable {
    private String name;
    private String btn_name;

    public User(String name) {
        this.name = name;
    }

    public User(String name, String btn_name) {
        this.name = name;
        this.btn_name = btn_name;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }



    @Bindable
    public String getBtn_name() {
        return btn_name;
    }

    public void setBtn_name(String btn_name) {
        this.btn_name = btn_name;
        notifyPropertyChanged(BR.btn_name);
    }
}
