package com.hkm.swipeback.app;

import com.hkm.swipeback.SwipeBackLayout;

/**
 * Created by hesk on 5/8/15.
 */

public interface SwipeBackBase {
    /**
     * @return the SwipeBackLayout associated with this activity.
     */
    public abstract SwipeBackLayout getSwipeBackLayout();

    public abstract void setSwipeBackEnable(boolean enable);

    /**
     * Scroll out contentView and finish the activity
     */
    public abstract void scrollToFinishActivity();

}
