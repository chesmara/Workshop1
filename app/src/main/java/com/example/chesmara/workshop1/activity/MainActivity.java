package com.example.chesmara.workshop1.activity;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.chesmara.workshop1.R;
import com.example.chesmara.workshop1.adapter.UserAdapter;
import com.example.chesmara.workshop1.dao.mock.UserDao;
import com.example.chesmara.workshop1.model.User;
import com.example.chesmara.workshop1.protocol.UserSelectedListener;

public class MainActivity extends AppCompatActivity implements UserSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        final UserAdapter adapter = new UserAdapter( this , UserDao.fetchUsers(), (UserSelectedListener) this);
        recyclerView.setAdapter(adapter);

        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent =
                        new Intent (MainActivity.this, NewUserActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void userSelected(User user){
    }


}
