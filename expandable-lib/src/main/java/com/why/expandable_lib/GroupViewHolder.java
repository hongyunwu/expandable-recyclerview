package com.why.expandable_lib;

import android.view.View;


/**
 * Created by wuhongyun on 17-8-9.
 */

public class GroupViewHolder extends BaseHolder implements View.OnClickListener{



    private OnGroupClickListener onGroupClickListener;
    /**
     * 此处使用butterKnife进行了view绑定操作
     *
     * @param itemView
     */
    public GroupViewHolder(View itemView) {
        super(itemView);
        setListeners(this,itemView);
    }


    @Override
    public void onClick(View v) {
        if (onGroupClickListener!=null){
            if (onGroupClickListener.onGroupClick(getAdapterPosition())){//打开状态

                collapse();
            }else{

                expand();
            }
        }
    }

    /**
     * 打开当前组
     */
    public void expand() {


    }

    /**
     * 关闭当前组
     */
    public void collapse() {

    }

    /**
     * 设置组点击事件
     * @param onGroupClickListener
     */
    public void setOnGroupClickListener(OnGroupClickListener onGroupClickListener) {
        this.onGroupClickListener = onGroupClickListener;
    }
}
