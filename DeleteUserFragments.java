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
public class DeleteUserFragments extends Fragment {

    private EditText et_user_id;
    private Button btnDelete;


    public DeleteUserFragments() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_delete_user_fragments, container, false);

        et_user_id = (EditText) view.findViewById(R.id.et_user_id);

        btnDelete = (Button) view.findViewById(R.id.btnDelete);

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = Integer.parseInt(et_user_id.getText().toString());

                User user = new User();
                user.setId(id);

                MainActivity.myAppDatabase.myDao().deleteUser(user);
                Toast.makeText(getActivity(), "Delete user SuccessFully", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}
