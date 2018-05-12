package com.roomexample.roomdatabasedemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddUserFragments extends Fragment {

    private EditText et_user_id,et_user_name,et_user_email;
    private Button btnSave;

    public AddUserFragments() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.add_user_fragments, container, false);

        et_user_id = (EditText) view.findViewById(R.id.et_user_id);
        et_user_name = (EditText) view.findViewById(R.id.et_user_name);
        et_user_email = (EditText) view.findViewById(R.id.et_user_email);

        btnSave =(Button) view.findViewById(R.id.btnSave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = Integer.parseInt(et_user_id.getText().toString());
                String username = et_user_name.getText().toString();
                String  useremail = et_user_email.getText().toString();

                User user = new User();
                user.setId(id);
                user.setName(username);
                user.setEmail(useremail);

                MainActivity.myAppDatabase.myDao().addUser(user);

                Toast.makeText(getActivity(), "User Added Successfully", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}
