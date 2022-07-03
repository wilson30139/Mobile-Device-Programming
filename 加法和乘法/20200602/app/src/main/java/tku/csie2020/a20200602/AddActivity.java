package tku.csie2020.a20200602;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        Button btn_add_back = (Button) findViewById(R.id.btn_add_back);

        ConstraintLayout layout_add = (ConstraintLayout) findViewById(R.id.layout_add);

        TextView tv_numberA1 = new TextView(AddActivity.this);
        tv_numberA1.setLayoutParams(new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
        ));
        layout_add.addView(tv_numberA1);
        tv_numberA1.setTextSize(50);
        tv_numberA1.setX(tv_numberA1.getX() + 350);
        tv_numberA1.setY(tv_numberA1.getY() + 350);

        TextView tv_numberA2 = new TextView(AddActivity.this);
        tv_numberA2.setLayoutParams(new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
        ));
        layout_add.addView(tv_numberA2);
        tv_numberA2.setTextSize(50);
        tv_numberA2.setX(tv_numberA2.getX() + 450);
        tv_numberA2.setY(tv_numberA2.getY() + 350);

        TextView tv_numberA3 = new TextView(AddActivity.this);
        tv_numberA3.setLayoutParams(new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
        ));
        layout_add.addView(tv_numberA3);
        tv_numberA3.setTextSize(50);
        tv_numberA3.setX(tv_numberA3.getX() + 550);
        tv_numberA3.setY(tv_numberA3.getY() + 350);

        TextView tv_numberA4 = new TextView(AddActivity.this);
        tv_numberA4.setLayoutParams(new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
        ));
        layout_add.addView(tv_numberA4);
        tv_numberA4.setTextSize(50);
        tv_numberA4.setX(tv_numberA4.getX() + 650);
        tv_numberA4.setY(tv_numberA4.getY() + 350);

        TextView tv_numberB1 = new TextView(AddActivity.this);
        tv_numberB1.setLayoutParams(new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
        ));
        layout_add.addView(tv_numberB1);
        tv_numberB1.setTextSize(50);
        tv_numberB1.setX(tv_numberB1.getX() + 350);
        tv_numberB1.setY(tv_numberB1.getY() + 480);

        TextView tv_numberB2 = new TextView(AddActivity.this);
        tv_numberB2.setLayoutParams(new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
        ));
        layout_add.addView(tv_numberB2);
        tv_numberB2.setTextSize(50);
        tv_numberB2.setX(tv_numberB2.getX() + 450);
        tv_numberB2.setY(tv_numberB2.getY() + 480);

        TextView tv_numberB3 = new TextView(AddActivity.this);
        tv_numberB3.setLayoutParams(new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
        ));
        layout_add.addView(tv_numberB3);
        tv_numberB3.setTextSize(50);
        tv_numberB3.setX(tv_numberB3.getX() + 550);
        tv_numberB3.setY(tv_numberB3.getY() + 480);

        TextView tv_numberB4 = new TextView(AddActivity.this);
        tv_numberB4.setLayoutParams(new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
        ));
        layout_add.addView(tv_numberB4);
        tv_numberB4.setTextSize(50);
        tv_numberB4.setX(tv_numberB4.getX() + 650);
        tv_numberB4.setY(tv_numberB4.getY() + 480);

        TextView tv_results1 = new TextView(AddActivity.this);
        tv_results1.setLayoutParams(new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
        ));
        layout_add.addView(tv_results1);
        tv_results1.setTextSize(50);
        tv_results1.setX(tv_results1.getX() + 250);
        tv_results1.setY(tv_results1.getY() + 660);

        TextView tv_results2 = new TextView(AddActivity.this);
        tv_results2.setLayoutParams(new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
        ));
        layout_add.addView(tv_results2);
        tv_results2.setTextSize(50);
        tv_results2.setX(tv_results2.getX() + 350);
        tv_results2.setY(tv_results2.getY() + 660);

        TextView tv_results3 = new TextView(AddActivity.this);
        tv_results3.setLayoutParams(new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
        ));
        layout_add.addView(tv_results3);
        tv_results3.setTextSize(50);
        tv_results3.setX(tv_results3.getX() + 450);
        tv_results3.setY(tv_results3.getY() + 660);

        TextView tv_results4 = new TextView(AddActivity.this);
        tv_results4.setLayoutParams(new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
        ));
        layout_add.addView(tv_results4);
        tv_results4.setTextSize(50);
        tv_results4.setX(tv_results4.getX() + 550);
        tv_results4.setY(tv_results4.getY() + 660);

        TextView tv_results5 = new TextView(AddActivity.this);
        tv_results5.setLayoutParams(new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
        ));
        layout_add.addView(tv_results5);
        tv_results5.setTextSize(50);
        tv_results5.setX(tv_results5.getX() + 650);
        tv_results5.setY(tv_results5.getY() + 660);

        TextView tv_Line = new TextView(AddActivity.this);
        tv_Line.setLayoutParams(new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
        ));
        layout_add.addView(tv_Line);
        tv_Line.setTextSize(50);
        tv_Line.setX(tv_Line.getX() + 210);
        tv_Line.setY(tv_Line.getY() + 560);

        TextView tv_Add = new TextView(AddActivity.this);
        tv_Add.setLayoutParams(new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
        ));
        layout_add.addView(tv_Add);
        tv_Add.setTextSize(50);
        tv_Add.setX(tv_Add.getX() + 240);
        tv_Add.setY(tv_Add.getY() + 500);

        Bundle bundle = getIntent().getExtras();
        int numberA = bundle.getInt("numberA");
        int numberB = bundle.getInt("numberB");
        int decidability_value = numberA + numberB;
        String results = String.valueOf(numberA + numberB);

        if(numberA >= 0 && numberA < 10){
            tv_numberA1.setText("");
            tv_numberA2.setText("");
            tv_numberA3.setText("");
            tv_numberA4.setText(String.valueOf(numberA));
        }else if(numberA >= 10 && numberA < 100){
            tv_numberA1.setText("");
            tv_numberA2.setText("");
            tv_numberA3.setText(String.valueOf(numberA / 10));
            tv_numberA4.setText(String.valueOf(numberA % 10));
        }else if(numberA >= 100 && numberA < 1000){
            tv_numberA1.setText("");
            tv_numberA2.setText(String.valueOf(numberA / 100));
            tv_numberA3.setText(String.valueOf(numberA % 100 / 10));
            tv_numberA4.setText(String.valueOf(numberA % 10));
        }else if(numberA >= 1000 && numberA < 10000){
            tv_numberA1.setText(String.valueOf(numberA / 1000));
            tv_numberA2.setText(String.valueOf(numberA % 1000 / 100));
            tv_numberA3.setText(String.valueOf(numberA % 100 / 10));
            tv_numberA4.setText(String.valueOf(numberA % 10));
        }
        if(numberB >= 0 && numberB < 10){
            tv_numberB1.setText("");
            tv_numberB2.setText("");
            tv_numberB3.setText("");
            tv_numberB4.setText(String.valueOf(numberB));
        }else if(numberB >= 10 && numberB < 100){
            tv_numberB1.setText("");
            tv_numberB2.setText("");
            tv_numberB3.setText(String.valueOf(numberB / 10));
            tv_numberB4.setText(String.valueOf(numberB % 10));
        }else if(numberB >= 100 && numberB < 1000){
            tv_numberB1.setText("");
            tv_numberB2.setText(String.valueOf(numberB / 100));
            tv_numberB3.setText(String.valueOf(numberB % 100 / 10));
            tv_numberB4.setText(String.valueOf(numberB % 10));
        }else if(numberB >= 1000 && numberB < 10000){
            tv_numberB1.setText(String.valueOf(numberB / 1000));
            tv_numberB2.setText(String.valueOf(numberB % 1000 / 100));
            tv_numberB3.setText(String.valueOf(numberB % 100 / 10));
            tv_numberB4.setText(String.valueOf(numberB % 10));
        }
        if(decidability_value >= 0 && decidability_value < 10){
            tv_results1.setText("");
            tv_results2.setText("");
            tv_results3.setText("");
            tv_results4.setText("");
            tv_results5.setText(String.valueOf(decidability_value));
        }else if(decidability_value >= 10 && decidability_value < 100){
            tv_results1.setText("");
            tv_results2.setText("");
            tv_results3.setText("");
            tv_results4.setText(String.valueOf(decidability_value / 10));
            tv_results5.setText(String.valueOf(decidability_value % 10));
        }else if(decidability_value >= 100 && decidability_value < 1000){
            tv_results1.setText("");
            tv_results2.setText("");
            tv_results3.setText(String.valueOf(decidability_value / 100));
            tv_results4.setText(String.valueOf(decidability_value % 100 / 10));
            tv_results5.setText(String.valueOf(decidability_value % 10));
        }else if(decidability_value >= 1000 && decidability_value < 10000){
            tv_results1.setText("");
            tv_results2.setText(String.valueOf(decidability_value / 1000));
            tv_results3.setText(String.valueOf(decidability_value % 1000 / 100));
            tv_results4.setText(String.valueOf(decidability_value % 100 / 10));
            tv_results5.setText(String.valueOf(decidability_value % 10));
        }else if(decidability_value >= 10000 && decidability_value < 100000){
            tv_results1.setText(String.valueOf(decidability_value / 10000));
            tv_results2.setText(String.valueOf(decidability_value % 10000 / 1000));
            tv_results3.setText(String.valueOf(decidability_value % 1000 / 100));
            tv_results4.setText(String.valueOf(decidability_value % 100 / 10));
            tv_results5.setText(String.valueOf(decidability_value % 10));
        }
        tv_Line.setText("----------------");
        tv_Add.setText("+");

        btn_add_back.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddActivity.this, MainActivity.class);
                startActivity(intent);
                AddActivity.this.finish();
            }
        });
    }
}
