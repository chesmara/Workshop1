package com.example.chesmara.workshop1.dao.mock;

import com.example.chesmara.workshop1.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alen on 29-Apr-17.
 */

public class UserDao {

    public static List<User> fetchUsers() {
        final List<User> users = new ArrayList<>();
        for (int i = 0; i < 42; i++) {
            users.add(new User(i % 2 == 0 ? "Pero" : "Vlade",
                    i % 2 == 0 ? "Roki" : "Marcano",
                    i % 2 == 0 ? "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQBK3FmyjIENz16NWEl1iJcIWj8I5n8hs-rl5JPixzw-XppNfKx"
                            : "https://www.smashingmagazine.com/wp-content/uploads/2015/06/10-dithering-opt.jpg"));
        }
        return users;
    }
}
