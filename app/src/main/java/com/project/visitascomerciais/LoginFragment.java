package com.project.visitascomerciais;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class LoginFragment extends Fragment {

    private TextView mRegister_button;

    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_login, container, false);

        mRegister_button = (TextView) rootView.findViewById(R.id.sign_up_login_button);
        mRegister_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegistrationActivity();
            }
        });

        return rootView;
    }

    private void openRegistrationActivity() {
        Intent intent = new Intent(this.getActivity(), RegisterActivity.class);
        startActivity(intent);
    }

}
