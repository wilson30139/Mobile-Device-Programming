package tku.csie2020.a20200428;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ActionActivity extends AppCompatActivity {
    private ImageButton up_btn, down_btn, right_btn, left_btn;
    private ImageView penguin_iv;
    private Button returnback_btn;
    private TextView tv_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);
        up_btn = (ImageButton) findViewById(R.id.up);
        down_btn = (ImageButton) findViewById(R.id.down);
        right_btn = (ImageButton) findViewById(R.id.right);
        left_btn = (ImageButton) findViewById(R.id.left);
        penguin_iv = (ImageView) findViewById(R.id.penguin);
        tv_3 = (TextView) findViewById(R.id.tv_3);

        up_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                penguin_iv.setY(penguin_iv.getY() - 50);
                tv_3.setText("Up");
            }
        });
        down_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                penguin_iv.setY(penguin_iv.getY() + 50);
                tv_3.setText("Down");
            }
        });
        right_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                penguin_iv.setX(penguin_iv.getX() + 50);
                tv_3.setText("Right");
            }
        });
        left_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                penguin_iv.setX(penguin_iv.getX() - 50);
                tv_3.setText("Left");
            }
        });

        returnback_btn = (Button) findViewById(R.id.returnback);
        returnback_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActionActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
