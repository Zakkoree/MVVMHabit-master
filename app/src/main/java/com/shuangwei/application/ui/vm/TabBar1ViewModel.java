package com.shuangwei.application.ui.vm;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;

import com.shuangwei.application.R;
import com.shuangwei.application.ui.tab_bar.activity.TabBarActivity;
import com.shuangwei.application.ui.tab_bar.fragment.TabBar2Fragment;

import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;

public class TabBar1ViewModel extends BaseViewModel {

    public TabBar1ViewModel(Context context) {
        //要使用父类的context相关方法,记得加上这一句
        super(context);
    }
}
