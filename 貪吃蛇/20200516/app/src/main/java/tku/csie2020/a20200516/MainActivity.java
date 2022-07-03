package tku.csie2020.a20200516;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    Button Up_Btn;
    Button Down_Btn;
    Button Right_Btn;
    Button Left_Btn;
    ImageView[] icon = new ImageView[6];
    RelativeLayout.LayoutParams[] parms = new RelativeLayout.LayoutParams[6];
    private int m_nTime = 0;
    private Handler mHandlerTime = new Handler();
    int[] prev_button = new int[6];
    int next_button = 1;
    int count = 0;

    @Override
    public void onDestroy(){
        mHandlerTime.removeCallbacks(timerRun);
        super.onDestroy();
    }

    private final Runnable timerRun = new Runnable() {
        @Override
        public void run() {
            int[] width = new int[6];
            int[] height = new int[6];
            ++m_nTime;
            mHandlerTime.postDelayed(this, 700);
            for(int i=0 ; i<6 ; i++) {
                width[i] = icon[i].getWidth();
                height[i] = icon[i].getHeight();
                parms[i] = new RelativeLayout.LayoutParams(width[i], height[i]);
            }

            if(count == 0){
                prev_button[count] = next_button;
                count++;
            }
            if(count < 42){
                if(count == 7 || count == 14 || count == 21 || count == 28 || count == 35)
                    prev_button[count / 7] = next_button;
                count++;
            }

            for(int i=0 ; i<6 ; i++){
                switch(prev_button[i]){
                    case 1:
                        right(i);
                        break;
                    case 2:
                        left(i);
                        break;
                    case 3:
                        up(i);
                        break;
                    case 4:
                        down(i);
                        break;
                }
            }

            for(int i=0 ; i<6 ; i++)
                icon[i].setLayoutParams(parms[i]);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Up_Btn = (Button) findViewById(R.id.btn_up);
        Down_Btn = (Button) findViewById(R.id.btn_down);
        Right_Btn = (Button) findViewById(R.id.btn_right);
        Left_Btn = (Button) findViewById(R.id.btn_left);
        icon[0] = (ImageView) findViewById(R.id.head);
        icon[1] = (ImageView) findViewById(R.id.body);
        icon[2] = (ImageView) findViewById(R.id.body2);
        icon[3] = (ImageView) findViewById(R.id.body3);
        icon[4] = (ImageView) findViewById(R.id.body4);
        icon[5] = (ImageView) findViewById(R.id.body5);
        for (int i=0 ; i<6 ; i++)
            prev_button[i] = 1;
        mHandlerTime.postDelayed(timerRun, 300);

        Right_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next_button = 1;
                count = 0;
                mHandlerTime.postDelayed(timerRun, 300);
            }
        });
        Left_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next_button = 2;
                count = 0;
                mHandlerTime.postDelayed(timerRun, 300);
            }
        });
        Up_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next_button = 3;
                count = 0;
                mHandlerTime.postDelayed(timerRun, 300);
            }
        });
        Down_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next_button = 4;
                count = 0;
                mHandlerTime.postDelayed(timerRun, 300);
            }
        });
    }
    public void right(int number){
        icon[number].setImageResource(R.drawable.arrow_right);
        parms[number].topMargin = (int) icon[number].getY();
        parms[number].leftMargin = (int) icon[number].getX() + 10;
    }
    public void left(int number){
        icon[number].setImageResource(R.drawable.arrow_left);
        parms[number].topMargin = (int) icon[number].getY();
        parms[number].leftMargin = (int) icon[number].getX() - 10;
    }
    public void up(int number){
        icon[number].setImageResource(R.drawable.arrow_up);
        parms[number].topMargin = (int) icon[number].getY() - 10;
        parms[number].leftMargin = (int) icon[number].getX();
    }
    public void down(int number){
        icon[number].setImageResource(R.drawable.arrow_down);
        parms[number].topMargin = (int) icon[number].getY() + 10;
        parms[number].leftMargin = (int) icon[number].getX();
    }
}
