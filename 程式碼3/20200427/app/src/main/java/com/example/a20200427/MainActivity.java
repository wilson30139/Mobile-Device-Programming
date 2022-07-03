package com.example.a20200427;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button Right_Button;
    private Button Left_Button;
    private Button Up_Button;
    private Button Down_Button;
    private ImageView Car_Image_View;
    private float x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Right_Button = (Button) findViewById(R.id.right_btn);
        Left_Button = (Button) findViewById(R.id.left_btn);
        Up_Button = (Button) findViewById(R.id.up_btn);
        Down_Button = (Button) findViewById(R.id.down_btn);
        Car_Image_View = (ImageView) findViewById(R.id.car_imageview);

        Right_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = Car_Image_View.getX();
                x += 20;
            }
        });
    }
}
