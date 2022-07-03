package tku.csie2020.a20200428;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Paint;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private LinearLayout ll_2;
    private TextView tv_2;
    private TextView tv_1;
    private Button btn_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll_2 = (LinearLayout) findViewById(R.id.ll_2);
        tv_2 = (TextView) findViewById(R.id.tv_2);
        ll_2.postDelayed(new Runnable() {
            @Override
            public void run() {
                ll_2.setVisibility(tv_2.VISIBLE);
                tv_2.setSelected(true);
            }
        }, 2000);

        tv_1 = (TextView) findViewById(R.id.tv_1);
        tv_1.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        tv_1.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);

        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActionActivity.class);
                startActivity(intent);
            }
        });
    }
}
