package ru.startandroid.cookdev1.FragmentTask;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import ru.startandroid.cookdev1.R;

public class Task10Fragment extends Fragment {
    Fragment fragmentzad10;
    Fragment fragmentzad11;
    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentzad10 = new Task11Fragment();

        View v = inflater.inflate(R.layout.fragment_task10, null);


        final Button button1 = (Button) v.findViewById(R.id.buttonzadnext10);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, fragmentzad10);
                transaction.commit();}

        });


        Button button2 = (Button) v.findViewById(R.id.buttonzadBack10);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentzad11 = new Task9Fragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.add(R.id.fragment_container, fragmentzad11);
                transaction.commit();
            }
        });


        final EditText textTolkushka = (EditText) v.findViewById(R.id.shumovka);

        final Button buttonCheck = (Button) v.findViewById(R.id.buttonzadcheck10);
        buttonCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String answer2 = "Половник";
                String answer1 = "Половник";
                boolean answer = false;
                if(TextUtils.isEmpty(textTolkushka.getText().toString())){
                    Toast toast = Toast.makeText(getContext(),"Ты не ответил!",Toast.LENGTH_LONG);
                    toast.show();
                    button1.setClickable(false);
                }
                else if (textTolkushka.getText().toString().equals("гречка")){
                    Toast toast = Toast.makeText(getContext(),"Верно!",Toast.LENGTH_LONG);
                    toast.show();
                    button1.setClickable(true);
                }else {
                    Toast toast = Toast.makeText(getContext(),"Подсказка: гречка",Toast.LENGTH_LONG);
                    toast.show();
                    button1.setClickable(false);
                }
            }
        });
        return v;



    }
}