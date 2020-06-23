package com.example.joc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PlayersFragment fragment = new PlayersFragment();
        final Button startButton = findViewById(R.id.button);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayersFragment fragment = new PlayersFragment();
                FragmentManager manager = getSupportFragmentManager();//aici iau un fragment de la ei
                manager.beginTransaction().replace(findViewById(R.id.playersLayout).getId(),fragment,fragment.getTag()).commit();//layoutul ce vreau sal pun pe fragment,fragmentul ,Tagul fragmentului
                startButton.setVisibility(View.INVISIBLE);
            }
        });

    }




}
