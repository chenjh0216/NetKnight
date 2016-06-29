package com.pencilbox.netknight.view;

import android.widget.BaseAdapter;


/**
 * Created by tang on 2016/6/29.
 */
public interface GraspBagView {

    //联网应用的初始化
    void onLoadApp(BaseAdapter baseAdapter);

    //操作类型和错误信息
    void onOptionFailed(int typeId,String msg);

    //抓包数据的不断更新
    void onDataShowRefresh();
}
