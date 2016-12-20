package me.didik.autovaluesample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User didik = User.builder()
                .firstName("Didik")
                .lastName("Ismawanto")
                .gender("Male")
                .age(21)
                .email("didik@me.xyz")
                .phone("089682040618")
                .address("Yogyakarta")
                .build();

        Log.d("didik", didik.toString());
    }

    public void submit(View view) {

    }
}
