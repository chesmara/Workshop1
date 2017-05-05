package com.example.chesmara.workshop1.generic;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Alen on 29-Apr-17.
 */
public class ViewWrapper<V extends View> extends RecyclerView.ViewHolder {

        private V view;

        public ViewWrapper(V itemView) {
            super(itemView);
            view = itemView;
        }

        public V getView() {
            return view;
        }
    }
