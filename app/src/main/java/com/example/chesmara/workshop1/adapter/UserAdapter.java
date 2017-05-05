package com.example.chesmara.workshop1.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.example.chesmara.workshop1.generic.RecyclerViewAdapterBase;
import com.example.chesmara.workshop1.generic.ViewWrapper;
import com.example.chesmara.workshop1.model.User;
import com.example.chesmara.workshop1.protocol.UserSelectedListener;
import com.example.chesmara.workshop1.view.UserItemView;

import java.util.List;

/**
 * Created by Alen on 29-Apr-17.
 */


public class UserAdapter extends RecyclerViewAdapterBase<User, UserItemView> {

    private final UserSelectedListener userSelectedListener;

    public UserAdapter(Context context, List<User> items, UserSelectedListener userSelectedListener) {
        super(context, items);
        this.userSelectedListener = userSelectedListener;
    }

    @Override
    protected UserItemView onCreateItemView(ViewGroup parent, int viewType) {
        return  new UserItemView(context, userSelectedListener);
    }

    @Override
    public void onBindViewHolder(ViewWrapper<UserItemView> viewHolder, int position) {
        final UserItemView view = viewHolder.getView();
        final User user = items.get(position);

        view.bind(user);
    }

}
