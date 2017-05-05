package com.example.chesmara.workshop1.view;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.chesmara.workshop1.R;
import com.example.chesmara.workshop1.model.User;
import com.example.chesmara.workshop1.protocol.UserSelectedListener;
import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Created by Alen on 29-Apr-17.
 */

public class UserItemView extends RelativeLayout {

    private User user;
    private final TextView firstName;
    private final TextView lastName;
    private final SimpleDraweeView thumbnail;

    public UserItemView(Context context, final UserSelectedListener userSelectedListener) {
        super(context);
        inflate(context, R.layout.item_view_user,this);

        final CardView cardView= (CardView) findViewById(R.id.card);
        firstName = (TextView) findViewById(R.id.first_name);
        lastName = (TextView) findViewById(R.id.last_name);
        thumbnail = (SimpleDraweeView) findViewById(R.id.thumbnail);

        cardView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                userSelectedListener.userSelected(user);
            }
        });
    }

    public void bind(User user) {
        this.user = user;
        firstName.setText(user.getFirstName());
        lastName.setText(user.getLastName());
        thumbnail.setImageURI(user.getIconUrl());

    }
}
