package com.hkm.swipeback.app;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.hkm.swipeback.SwipeBackLayout;
import com.hkm.swipeback.Utils;

/**
 * Created by hesk on 5/8/15.
 */
public class SwipeBackActivity extends FragmentActivity implements SwipeBackBase {
    private SwipeBackActivityHelper mHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mHelper = new SwipeBackActivityHelper(this);
        mHelper.onActivityCreate();
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mHelper.onPostCreate();
    }

    @Override
    public View findViewById(int id) {
        View v = super.findViewById(id);
        if (v == null && mHelper != null) {
            View of = mHelper.findViewById(id);
            if (of != null) return of;
        }
        return v;
    }

    @Override
    public SwipeBackLayout getSwipeBackLayout() {
        return mHelper.getSwipeBackLayout();
    }

    @Override
    public void setSwipeBackEnable(boolean enable) {
        getSwipeBackLayout().setEnableGesture(enable);
    }

    @Override
    public void scrollToFinishActivity() {
        Utils.convertActivityToTranslucent(this);
        getSwipeBackLayout().scrollToFinishActivity();
    }
}

