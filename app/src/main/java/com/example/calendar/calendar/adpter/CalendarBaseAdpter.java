package com.example.calendar.calendar.adpter;

import android.view.View;

import androidx.viewpager.widget.PagerAdapter;

/**
 * Created by Administrator on 2016/6/13 0013.
 */
public class CalendarBaseAdpter extends PagerAdapter {

    /**
     * 选中时间：xx-xx-xx
     * */
    public static String selectTime = "";
    /**
     * 是否拦截事件
     * */
    public static boolean is=false;

    public static boolean is() {
        return is;
    }

    @Override
    public int getCount() {//无所谓
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {//无所谓
        return false;
    }
}
