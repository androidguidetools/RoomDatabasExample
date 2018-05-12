package com.roomexample.roomdatabasedemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReadUserFragments extends Fragment {

    private TextView txt_display_info;


    public ReadUserFragments() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_read_user_fragments, container, false);

        txt_display_info = (TextView) view.findViewById(R.id.txt_display_info);
        List<User> users = MainActivity.myAppDatabase.myDao().getUser();

        String info = "";

        for(User user : users)
        {
            int id = user.getId();
            String name = user.getName();
            String email = user.getEmail();

            info = info+"\n\n"+"Id: "+id+"\nName: "+name+"\nEmail: "+email;
        }

        txt_display_info.setText(info);
        return  view;
    }

}
