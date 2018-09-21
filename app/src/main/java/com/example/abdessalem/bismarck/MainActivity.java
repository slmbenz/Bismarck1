package com.example.abdessalem.bismarck;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

import static com.example.abdessalem.bismarck.R.id.circle_menu;

public class MainActivity extends AppCompatActivity {

    String arrayName[]={"AZK",
                        "dienstpaln",
                        "uploaddoc",
                        "lohn",
                        "kontakt",
                        "verfugbar"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CircleMenu circleMenu = (CircleMenu)findViewById(R.id.circle_menu);
        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"), R.drawable.login, R.drawable.logout)
                .addSubMenu(Color.parseColor("#258CFF"), R.drawable.azk)
                .addSubMenu(Color.parseColor("#6d4c41"), R.drawable.adienstplan)
                .addSubMenu(Color.parseColor("#6d4c41"), R.drawable.uploaddokument)
                .addSubMenu(Color.parseColor("#ff0000"), R.drawable.lohn)
                .addSubMenu(Color.parseColor("#03a9f4"), R.drawable.disp_kontakt)
                .addSubMenu(Color.parseColor("#1a237a"), R.drawable.verfugbar)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
            @Override
            public void onMenuSelected(int i) {

                Toast.makeText(MainActivity.this, "You selected "+arrayName[i], Toast.LENGTH_SHORT).show();

            }
        });
    }
}
