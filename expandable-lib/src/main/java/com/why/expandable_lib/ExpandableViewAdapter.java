package com.why.expandable_lib;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;


/**
 * Created by wuhongyun on 17-8-9.
 */

public class ExpandableViewAdapter<GVH extends GroupViewHolder,CVH extends ChildViewHolder> extends RecyclerView.Adapter<BaseHolder> implements OnGroupClickListener {

    private ItemController itemController;
    @Override
    public BaseHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType){
            case ItemType.TYPE_GROUP:
                GroupViewHolder groupViewHolder = onCreateGroupViewHolder(parent,viewType);
                groupViewHolder.setOnGroupClickListener(this);
                break;
            case ItemType.TYPE_CHILD:
                ChildViewHolder childViewHolder = onCreateChildViewHolder(parent,viewType);
                break;
        }

        return null;
    }


    @Override
    public void onBindViewHolder(BaseHolder holder, int position) {
        int viewType = getItemViewType(position);
        switch (viewType){
            case ItemType.TYPE_GROUP:

                break;
            case ItemType.TYPE_CHILD:

                break;
        }

    }

    @Override
    public int getItemCount() {
        return itemController.getItemCount();
    }

    @Override
    public int getItemViewType(int position) {

        return itemController.getItemViewType(position);
    }


    @Override
    public boolean onGroupClick(int position) {


        return false;
    }

    /********************************************************/

    private ChildViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    private GroupViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

}
