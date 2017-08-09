package com.why.expandable_lib;

/**
 * Created by wuhongyun on 17-8-9.
 */

public interface OnGroupClickListener
{

    /**
     * 当可扩展的view被点击时触发
     * @param position 被点击的位置
     * @return true表示当前为打开状态，false表示当前组为关闭状态
     */
    boolean onGroupClick(int position);
}
