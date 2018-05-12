package com.roomexample.roomdatabasedemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragments extends Fragment implements View.OnClickListener {

    private Button btn_add_user, btn_view_user, btn_delete_user, btn_update_user;

    public HomeFragments() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_fragments, container, false);

        btn_add_user = (Button) view.findViewById(R.id.btn_add_user);
        btn_view_user = (Button) view.findViewById(R.id.btn_view_user);
        btn_delete_user = (Button) view.findViewById(R.id.btn_delete_user);
        btn_update_user = (Button) view.findViewById(R.id.btn_update_user);

        btn_add_user.setOnClickListener(this);
        btn_view_user.setOnClickListener(this);
        btn_delete_user.setOnClickListener(this);
        btn_update_user.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btn_add_user:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new AddUserFragments())
                        .addToBackStack(null).commit();
                break;
            case R.id.btn_view_user:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ReadUserFragments())
                        .addToBackStack(null).commit();
                break;
            case R.id.btn_delete_user:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new DeleteUserFragments())
                        .addToBackStack(null).commit();
                break;
            case R.id.btn_update_user:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new UpdateUserFragments())
                        .addToBackStack(null).commit();
                break;
        }
    }
}
