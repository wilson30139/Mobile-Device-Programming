package tku.csie2020.a20200602;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MulActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mul);

        Button btn_mul_back = (Button) findViewById(R.id.btn_mul_back);
        btn_mul_back.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MulActivity.this, MainActivity.class);
                startActivity(intent);
                MulActivity.this.finish();
            }
        });

        Bundle bundle = getIntent().getExtras();
        int numberA = bundle.getInt("numberA");
        int numberB = bundle.getInt("numberB");
        int decidability_value = numberA * numberB;

        ConstraintLayout layout_mul = (ConstraintLayout) findViewById(R.id.layout_mul);
        Create_A_and_B(layout_mul, decidability_value, numberA, numberB);
        if(numberB >= 0 && numberB < 10){
            TextView tv_numberCR1 = new TextView(MulActivity.this);
            TextView tv_numberCR2 = new TextView(MulActivity.this);
            TextView tv_numberCR3 = new TextView(MulActivity.this);
            TextView tv_numberCR4 = new TextView(MulActivity.this);
            TextView tv_numberCR5 = new TextView(MulActivity.this);
            if(decidability_value >= 0 && decidability_value < 10){
                Create_Object(tv_numberCR1, layout_mul, "", 450, 300);
                Create_Object(tv_numberCR2, layout_mul, "", 550, 300);
                Create_Object(tv_numberCR3, layout_mul, "", 650, 300);
                Create_Object(tv_numberCR4, layout_mul, "", 750, 300);
                Create_Object(tv_numberCR5, layout_mul, String.valueOf(decidability_value), 850, 300);
            }else if(decidability_value >= 10 && decidability_value < 100){
                Create_Object(tv_numberCR1, layout_mul, "", 450, 300);
                Create_Object(tv_numberCR2, layout_mul, "", 550, 300);
                Create_Object(tv_numberCR3, layout_mul, "", 650, 300);
                Create_Object(tv_numberCR4, layout_mul, String.valueOf(decidability_value / 10), 750, 300);
                Create_Object(tv_numberCR5, layout_mul, String.valueOf(decidability_value % 10), 850, 300);
            }else if(decidability_value >= 100 && decidability_value < 1000){
                Create_Object(tv_numberCR1, layout_mul, "", 450, 300);
                Create_Object(tv_numberCR2, layout_mul, "", 550, 300);
                Create_Object(tv_numberCR3, layout_mul, String.valueOf(decidability_value / 100), 650, 300);
                Create_Object(tv_numberCR4, layout_mul, String.valueOf(decidability_value % 100 / 10), 750, 300);
                Create_Object(tv_numberCR5, layout_mul, String.valueOf(decidability_value % 10), 850, 300);
            }else if(decidability_value >= 1000 && decidability_value < 10000){
                Create_Object(tv_numberCR1, layout_mul, "", 450, 300);
                Create_Object(tv_numberCR2, layout_mul, String.valueOf(decidability_value / 1000), 550, 300);
                Create_Object(tv_numberCR3, layout_mul, String.valueOf(decidability_value % 1000 / 100), 650, 300);
                Create_Object(tv_numberCR4, layout_mul, String.valueOf(decidability_value % 100 / 10), 750, 300);
                Create_Object(tv_numberCR5, layout_mul, String.valueOf(decidability_value % 10), 850, 300);
            }else if(decidability_value >= 10000 && decidability_value < 100000){
                Create_Object(tv_numberCR1, layout_mul, String.valueOf(decidability_value / 10000), 450, 300);
                Create_Object(tv_numberCR2, layout_mul, String.valueOf(decidability_value % 10000 / 1000), 550, 300);
                Create_Object(tv_numberCR3, layout_mul, String.valueOf(decidability_value % 1000 / 100), 650, 300);
                Create_Object(tv_numberCR4, layout_mul, String.valueOf(decidability_value % 100 / 10), 750, 300);
                Create_Object(tv_numberCR5, layout_mul, String.valueOf(decidability_value % 10), 850, 300);
            }

        }else if(numberB >= 10 && numberB < 100){
            TextView tv_numberC1 = new TextView(MulActivity.this);
            TextView tv_numberC2 = new TextView(MulActivity.this);
            TextView tv_numberC3 = new TextView(MulActivity.this);
            TextView tv_numberC4 = new TextView(MulActivity.this);
            TextView tv_numberC5 = new TextView(MulActivity.this);
            TextView tv_numberD1 = new TextView(MulActivity.this);
            TextView tv_numberD2 = new TextView(MulActivity.this);
            TextView tv_numberD3 = new TextView(MulActivity.this);
            TextView tv_numberD4 = new TextView(MulActivity.this);
            TextView tv_numberD5 = new TextView(MulActivity.this);
            TextView tv_numberDR1 = new TextView(MulActivity.this);
            TextView tv_numberDR2 = new TextView(MulActivity.this);
            TextView tv_numberDR3 = new TextView(MulActivity.this);
            TextView tv_numberDR4 = new TextView(MulActivity.this);
            TextView tv_numberDR5 = new TextView(MulActivity.this);
            TextView tv_numberDR6 = new TextView(MulActivity.this);
            TextView tv_line2 = new TextView(MulActivity.this);
            if((numberA * (numberB % 10)) >= 0 && (numberA * (numberB % 10)) < 10){
                Create_Object(tv_numberC1, layout_mul, "", 450, 320);
                Create_Object(tv_numberC2, layout_mul, "", 550, 320);
                Create_Object(tv_numberC3, layout_mul, "", 650, 320);
                Create_Object(tv_numberC4, layout_mul, "", 750, 320);
                Create_Object(tv_numberC5, layout_mul, String.valueOf(numberA * (numberB % 10)), 850, 320);
            }else if((numberA * (numberB % 10)) >= 10 && (numberA * (numberB % 10)) < 100){
                Create_Object(tv_numberC1, layout_mul, "", 450, 320);
                Create_Object(tv_numberC2, layout_mul, "", 550, 320);
                Create_Object(tv_numberC3, layout_mul, "", 650, 320);
                Create_Object(tv_numberC4, layout_mul, String.valueOf(numberA * (numberB % 10) / 10), 750, 320);
                Create_Object(tv_numberC5, layout_mul, String.valueOf(numberA * (numberB % 10) % 10), 850, 320);
            }else if((numberA * (numberB % 10)) >= 100 && (numberA * (numberB % 10)) < 1000){
                Create_Object(tv_numberC1, layout_mul, "", 450, 320);
                Create_Object(tv_numberC2, layout_mul, "", 550, 320);
                Create_Object(tv_numberC3, layout_mul, String.valueOf(numberA * (numberB % 10) / 100), 650, 320);
                Create_Object(tv_numberC4, layout_mul, String.valueOf(numberA * (numberB % 10) % 100 / 10), 750, 320);
                Create_Object(tv_numberC5, layout_mul, String.valueOf(numberA * (numberB % 10) % 10), 850, 320);
            }else if((numberA * (numberB % 10)) >= 1000 && (numberA * (numberB % 10)) < 10000){
                Create_Object(tv_numberC1, layout_mul, "", 450, 320);
                Create_Object(tv_numberC2, layout_mul, String.valueOf(numberA * (numberB % 10) / 1000), 550, 320);
                Create_Object(tv_numberC3, layout_mul, String.valueOf(numberA * (numberB % 10) % 1000 / 100), 650, 320);
                Create_Object(tv_numberC4, layout_mul, String.valueOf(numberA * (numberB % 10) % 100 / 10), 750, 320);
                Create_Object(tv_numberC5, layout_mul, String.valueOf(numberA * (numberB % 10) % 10), 850, 320);
            }else if((numberA * (numberB % 10)) >= 10000 && (numberA * (numberB % 10)) < 100000){
                Create_Object(tv_numberC1, layout_mul, String.valueOf(numberA * (numberB % 10) / 10000), 450, 320);
                Create_Object(tv_numberC2, layout_mul, String.valueOf(numberA * (numberB % 10) % 10000 / 1000), 550, 320);
                Create_Object(tv_numberC3, layout_mul, String.valueOf(numberA * (numberB % 10) % 1000 / 100), 650, 320);
                Create_Object(tv_numberC4, layout_mul, String.valueOf(numberA * (numberB % 10) % 100 / 10), 750, 320);
                Create_Object(tv_numberC5, layout_mul, String.valueOf(numberA * (numberB % 10) % 10), 850, 320);
            }
            if((numberA * (numberB / 10)) >= 0 && (numberA * (numberB / 10)) < 10){
                Create_Object(tv_numberD1, layout_mul, "", 350, 430);
                Create_Object(tv_numberD2, layout_mul, "", 450, 430);
                Create_Object(tv_numberD3, layout_mul, "", 550, 430);
                Create_Object(tv_numberD4, layout_mul, "", 650, 430);
                Create_Object(tv_numberD5, layout_mul, String.valueOf(numberA * (numberB / 10)), 750, 430);
            }else if((numberA * (numberB / 10)) >= 10 && (numberA * (numberB / 10)) < 100){
                Create_Object(tv_numberD1, layout_mul, "", 350, 430);
                Create_Object(tv_numberD2, layout_mul, "", 450, 430);
                Create_Object(tv_numberD3, layout_mul, "", 550, 430);
                Create_Object(tv_numberD4, layout_mul, String.valueOf(numberA * (numberB / 10) / 10), 650, 430);
                Create_Object(tv_numberD5, layout_mul, String.valueOf(numberA * (numberB / 10) % 10), 750, 430);
            }else if((numberA * (numberB / 10)) >= 100 && (numberA * (numberB / 10)) < 1000){
                Create_Object(tv_numberD1, layout_mul,"", 350, 430);
                Create_Object(tv_numberD2, layout_mul, "", 450, 430);
                Create_Object(tv_numberD3, layout_mul, String.valueOf(numberA * (numberB / 10) / 100), 550, 430);
                Create_Object(tv_numberD4, layout_mul, String.valueOf(numberA * (numberB / 10) % 100 / 10), 650, 430);
                Create_Object(tv_numberD5, layout_mul, String.valueOf(numberA * (numberB / 10) % 10), 750, 430);
            }else if((numberA * (numberB / 10)) >= 1000 && (numberA * (numberB / 10)) < 10000){
                Create_Object(tv_numberD1, layout_mul, "", 350, 430);
                Create_Object(tv_numberD2, layout_mul, String.valueOf(numberA * (numberB / 10) / 1000), 450, 430);
                Create_Object(tv_numberD3, layout_mul, String.valueOf(numberA * (numberB / 10) % 1000 / 100), 550, 430);
                Create_Object(tv_numberD4, layout_mul, String.valueOf(numberA * (numberB / 10) % 100 / 10), 650, 430);
                Create_Object(tv_numberD5, layout_mul, String.valueOf(numberA * (numberB / 10) % 10), 750, 430);
            }else if((numberA * (numberB / 10)) >= 10000 && (numberA * (numberB / 10)) < 100000){
                Create_Object(tv_numberD1, layout_mul, String.valueOf(numberA * (numberB / 10) / 10000), 350, 430);
                Create_Object(tv_numberD2, layout_mul, String.valueOf(numberA * (numberB / 10) % 10000 / 1000), 450, 430);
                Create_Object(tv_numberD3, layout_mul, String.valueOf(numberA * (numberB / 10) % 1000 / 100), 550, 430);
                Create_Object(tv_numberD4, layout_mul, String.valueOf(numberA * (numberB / 10) % 100 / 10), 650, 430);
                Create_Object(tv_numberD5, layout_mul, String.valueOf(numberA * (numberB / 10) % 10), 750, 430);
            }
            if(decidability_value >= 0 && decidability_value < 10){
                Create_Object(tv_numberDR1, layout_mul, "", 350, 560);
                Create_Object(tv_numberDR2, layout_mul, "", 450, 560);
                Create_Object(tv_numberDR3, layout_mul, "", 550, 560);
                Create_Object(tv_numberDR4, layout_mul, "", 650, 560);
                Create_Object(tv_numberDR5, layout_mul, "", 750, 560);
                Create_Object(tv_numberDR6, layout_mul, String.valueOf(decidability_value), 850, 560);
            }else if(decidability_value >= 10 && decidability_value < 100){
                Create_Object(tv_numberDR1, layout_mul, "", 350, 560);
                Create_Object(tv_numberDR2, layout_mul, "", 450, 560);
                Create_Object(tv_numberDR3, layout_mul, "", 550, 560);
                Create_Object(tv_numberDR4, layout_mul, "", 650, 560);
                Create_Object(tv_numberDR5, layout_mul, String.valueOf(decidability_value / 10), 750, 560);
                Create_Object(tv_numberDR6, layout_mul, String.valueOf(decidability_value % 10), 850, 560);
            }else if(decidability_value >= 100 && decidability_value < 1000){
                Create_Object(tv_numberDR1, layout_mul, "", 350, 560);
                Create_Object(tv_numberDR2, layout_mul, "", 450, 560);
                Create_Object(tv_numberDR3, layout_mul, "", 550, 560);
                Create_Object(tv_numberDR4, layout_mul, String.valueOf(decidability_value / 100), 650, 560);
                Create_Object(tv_numberDR5, layout_mul, String.valueOf(decidability_value % 100 / 10), 750, 560);
                Create_Object(tv_numberDR6, layout_mul, String.valueOf(decidability_value % 10), 850, 560);
            }else if(decidability_value >= 1000 && decidability_value < 10000){
                Create_Object(tv_numberDR1, layout_mul, "", 350, 560);
                Create_Object(tv_numberDR2, layout_mul, "", 450, 560);
                Create_Object(tv_numberDR3, layout_mul, String.valueOf(decidability_value / 1000), 550, 560);
                Create_Object(tv_numberDR4, layout_mul, String.valueOf(decidability_value % 1000 / 100), 650, 560);
                Create_Object(tv_numberDR5, layout_mul, String.valueOf(decidability_value % 100 / 10), 750, 560);
                Create_Object(tv_numberDR6, layout_mul, String.valueOf(decidability_value % 10), 850, 560);
            }else if(decidability_value >= 10000 && decidability_value < 100000){
                Create_Object(tv_numberDR1, layout_mul, "", 350, 560);
                Create_Object(tv_numberDR2, layout_mul, String.valueOf(decidability_value / 10000), 450, 560);
                Create_Object(tv_numberDR3, layout_mul, String.valueOf(decidability_value % 10000 / 1000), 550, 560);
                Create_Object(tv_numberDR4, layout_mul, String.valueOf(decidability_value % 1000 / 100), 650, 560);
                Create_Object(tv_numberDR5, layout_mul, String.valueOf(decidability_value % 100 / 10), 750, 560);
                Create_Object(tv_numberDR6, layout_mul, String.valueOf(decidability_value % 10), 850, 560);
            }else if(decidability_value >= 100000 && decidability_value < 1000000){
                Create_Object(tv_numberDR1, layout_mul, String.valueOf(decidability_value / 100000), 350, 560);
                Create_Object(tv_numberDR2, layout_mul, String.valueOf(decidability_value % 100000 / 10000), 450, 560);
                Create_Object(tv_numberDR3, layout_mul, String.valueOf(decidability_value % 10000 / 1000), 550, 560);
                Create_Object(tv_numberDR4, layout_mul, String.valueOf(decidability_value % 1000 / 100), 650, 560);
                Create_Object(tv_numberDR5, layout_mul, String.valueOf(decidability_value % 100 / 10), 750, 560);
                Create_Object(tv_numberDR6, layout_mul, String.valueOf(decidability_value % 10), 850, 560);
            }
            Create_Object(tv_line2, layout_mul, "------------------", 300, 490);

        }else if(numberB >= 1000 && numberB < 10000){
            TextView tv_numberC1 = new TextView(MulActivity.this);
            TextView tv_numberC2 = new TextView(MulActivity.this);
            TextView tv_numberC3 = new TextView(MulActivity.this);
            TextView tv_numberC4 = new TextView(MulActivity.this);
            TextView tv_numberC5 = new TextView(MulActivity.this);
            TextView tv_numberD1 = new TextView(MulActivity.this);
            TextView tv_numberD2 = new TextView(MulActivity.this);
            TextView tv_numberD3 = new TextView(MulActivity.this);
            TextView tv_numberD4 = new TextView(MulActivity.this);
            TextView tv_numberD5 = new TextView(MulActivity.this);
            TextView tv_numberE1 = new TextView(MulActivity.this);
            TextView tv_numberE2 = new TextView(MulActivity.this);
            TextView tv_numberE3 = new TextView(MulActivity.this);
            TextView tv_numberE4 = new TextView(MulActivity.this);
            TextView tv_numberE5 = new TextView(MulActivity.this);
            TextView tv_numberF1 = new TextView(MulActivity.this);
            TextView tv_numberF2 = new TextView(MulActivity.this);
            TextView tv_numberF3 = new TextView(MulActivity.this);
            TextView tv_numberF4 = new TextView(MulActivity.this);
            TextView tv_numberF5 = new TextView(MulActivity.this);
            TextView tv_numberFR1 = new TextView(MulActivity.this);
            TextView tv_numberFR2 = new TextView(MulActivity.this);
            TextView tv_numberFR3 = new TextView(MulActivity.this);
            TextView tv_numberFR4 = new TextView(MulActivity.this);
            TextView tv_numberFR5 = new TextView(MulActivity.this);
            TextView tv_numberFR6 = new TextView(MulActivity.this);
            TextView tv_numberFR7 = new TextView(MulActivity.this);
            TextView tv_numberFR8 = new TextView(MulActivity.this);
            TextView tv_line4 = new TextView(MulActivity.this);
            if((numberA * (numberB % 10)) >= 0 && (numberA * (numberB % 10)) < 10){
                Create_Object(tv_numberC1, layout_mul, "", 450, 320);
                Create_Object(tv_numberC2, layout_mul, "", 550, 320);
                Create_Object(tv_numberC3, layout_mul, "", 650, 320);
                Create_Object(tv_numberC4, layout_mul, "", 750, 320);
                Create_Object(tv_numberC5, layout_mul, String.valueOf(numberA * (numberB % 10)), 850, 320);
            }else if((numberA * (numberB % 10)) >= 10 && (numberA * (numberB % 10)) < 100){
                Create_Object(tv_numberC1, layout_mul, "", 450, 320);
                Create_Object(tv_numberC2, layout_mul, "", 550, 320);
                Create_Object(tv_numberC3, layout_mul, "", 650, 320);
                Create_Object(tv_numberC4, layout_mul, String.valueOf(numberA * (numberB % 10) / 10), 750, 320);
                Create_Object(tv_numberC5, layout_mul, String.valueOf(numberA * (numberB % 10) % 10), 850, 320);
            }else if((numberA * (numberB % 10)) >= 100 && (numberA * (numberB % 10)) < 1000){
                Create_Object(tv_numberC1, layout_mul, "", 450, 320);
                Create_Object(tv_numberC2, layout_mul, "", 550, 320);
                Create_Object(tv_numberC3, layout_mul, String.valueOf(numberA * (numberB % 10) / 100), 650, 320);
                Create_Object(tv_numberC4, layout_mul, String.valueOf(numberA * (numberB % 10) % 100 / 10), 750, 320);
                Create_Object(tv_numberC5, layout_mul, String.valueOf(numberA * (numberB % 10) % 10), 850, 320);
            }else if((numberA * (numberB % 10)) >= 1000 && (numberA * (numberB % 10)) < 10000){
                Create_Object(tv_numberC1, layout_mul, "", 450, 320);
                Create_Object(tv_numberC2, layout_mul, String.valueOf(numberA * (numberB % 10) / 1000), 550, 320);
                Create_Object(tv_numberC3, layout_mul, String.valueOf(numberA * (numberB % 10) % 1000 / 100), 650, 320);
                Create_Object(tv_numberC4, layout_mul, String.valueOf(numberA * (numberB % 10) % 100 / 10), 750, 320);
                Create_Object(tv_numberC5, layout_mul, String.valueOf(numberA * (numberB % 10) % 10), 850, 320);
            }else if((numberA * (numberB % 10)) >= 10000 && (numberA * (numberB % 10)) < 100000){
                Create_Object(tv_numberC1, layout_mul, String.valueOf(numberA * (numberB % 10) / 10000), 450, 320);
                Create_Object(tv_numberC2, layout_mul, String.valueOf(numberA * (numberB % 10) % 10000 / 1000), 550, 320);
                Create_Object(tv_numberC3, layout_mul, String.valueOf(numberA * (numberB % 10) % 1000 / 100), 650, 320);
                Create_Object(tv_numberC4, layout_mul, String.valueOf(numberA * (numberB % 10) % 100 / 10), 750, 320);
                Create_Object(tv_numberC5, layout_mul, String.valueOf(numberA * (numberB % 10) % 10), 850, 320);
            }
            if((numberA * (numberB % 100 / 10)) >= 0 && (numberA * (numberB % 100 / 10)) < 10){
                Create_Object(tv_numberD1, layout_mul, "", 350, 430);
                Create_Object(tv_numberD2, layout_mul, "", 450, 430);
                Create_Object(tv_numberD3, layout_mul, "", 550, 430);
                Create_Object(tv_numberD4, layout_mul, "", 650, 430);
                Create_Object(tv_numberD5, layout_mul, String.valueOf(numberA * (numberB % 100 / 10)), 750, 430);
            }else if((numberA * (numberB % 100 / 10)) >= 10 && (numberA * (numberB % 100 / 10)) < 100){
                Create_Object(tv_numberD1, layout_mul, "", 350, 430);
                Create_Object(tv_numberD2, layout_mul, "", 450, 430);
                Create_Object(tv_numberD3, layout_mul, "", 550, 430);
                Create_Object(tv_numberD4, layout_mul, String.valueOf(numberA * (numberB % 100 / 10) / 10), 650, 430);
                Create_Object(tv_numberD5, layout_mul, String.valueOf(numberA * (numberB % 100 / 10) % 10), 750, 430);
            }else if((numberA * (numberB % 100 / 10)) >= 100 && (numberA * (numberB % 100 / 10)) < 1000){
                Create_Object(tv_numberD1, layout_mul,"", 350, 430);
                Create_Object(tv_numberD2, layout_mul, "", 450, 430);
                Create_Object(tv_numberD3, layout_mul, String.valueOf(numberA * (numberB % 100 / 10) / 100), 550, 430);
                Create_Object(tv_numberD4, layout_mul, String.valueOf(numberA * (numberB % 100 / 10) % 100 / 10), 650, 430);
                Create_Object(tv_numberD5, layout_mul, String.valueOf(numberA * (numberB % 100 / 10) % 10), 750, 430);
            }else if((numberA * (numberB % 100 / 10)) >= 1000 && (numberA * (numberB % 100 / 10)) < 10000){
                Create_Object(tv_numberD1, layout_mul, "", 350, 430);
                Create_Object(tv_numberD2, layout_mul, String.valueOf(numberA * (numberB % 100 / 10) / 1000), 450, 430);
                Create_Object(tv_numberD3, layout_mul, String.valueOf(numberA * (numberB % 100 / 10) % 1000 / 100), 550, 430);
                Create_Object(tv_numberD4, layout_mul, String.valueOf(numberA * (numberB % 100 / 10) % 100 / 10), 650, 430);
                Create_Object(tv_numberD5, layout_mul, String.valueOf(numberA * (numberB % 100 / 10) % 10), 750, 430);
            }else if((numberA * (numberB % 100 / 10)) >= 10000 && (numberA * (numberB % 100 / 10)) < 100000){
                Create_Object(tv_numberD1, layout_mul, String.valueOf(numberA * (numberB % 100 / 10) / 10000), 350, 430);
                Create_Object(tv_numberD2, layout_mul, String.valueOf(numberA * (numberB % 100 / 10) % 10000 / 1000), 450, 430);
                Create_Object(tv_numberD3, layout_mul, String.valueOf(numberA * (numberB % 100 / 10) % 1000 / 100), 550, 430);
                Create_Object(tv_numberD4, layout_mul, String.valueOf(numberA * (numberB % 100 / 10) % 100 / 10), 650, 430);
                Create_Object(tv_numberD5, layout_mul, String.valueOf(numberA * (numberB % 100 / 10) % 10), 750, 430);
            }
            if((numberA * (numberB % 1000 / 100)) >= 0 && (numberA * (numberB % 1000 / 100)) < 10){
                Create_Object(tv_numberE1, layout_mul, "", 250, 540);
                Create_Object(tv_numberE2, layout_mul, "", 350, 540);
                Create_Object(tv_numberE3, layout_mul, "", 450, 540);
                Create_Object(tv_numberE4, layout_mul, "", 550, 540);
                Create_Object(tv_numberE5, layout_mul, String.valueOf(numberA * (numberB % 1000 / 100)), 650, 540);
            }else if((numberA * (numberB % 1000 / 100)) >= 10 && (numberA * (numberB % 1000 / 100)) < 100){
                Create_Object(tv_numberE1, layout_mul, "", 250, 540);
                Create_Object(tv_numberE2, layout_mul, "", 350, 540);
                Create_Object(tv_numberE3, layout_mul, "", 450, 540);
                Create_Object(tv_numberE4, layout_mul, String.valueOf(numberA * (numberB % 1000 / 100) / 10), 550, 540);
                Create_Object(tv_numberE5, layout_mul, String.valueOf(numberA * (numberB % 1000 / 100) % 10), 650, 540);
            }else if((numberA * (numberB % 1000 / 100)) >= 100 && (numberA * (numberB % 1000 / 100)) < 1000){
                Create_Object(tv_numberE1, layout_mul,"", 250, 540);
                Create_Object(tv_numberE2, layout_mul, "", 350, 540);
                Create_Object(tv_numberE3, layout_mul, String.valueOf(numberA * (numberB % 1000 / 100) / 100), 450, 540);
                Create_Object(tv_numberE4, layout_mul, String.valueOf(numberA * (numberB % 1000 / 100) % 100 / 10), 550, 540);
                Create_Object(tv_numberE5, layout_mul, String.valueOf(numberA * (numberB % 1000 / 100) % 10), 650, 540);
            }else if((numberA * (numberB % 1000 / 100)) >= 1000 && (numberA * (numberB % 1000 / 100)) < 10000){
                Create_Object(tv_numberE1, layout_mul, "", 250, 540);
                Create_Object(tv_numberE2, layout_mul, String.valueOf(numberA * (numberB % 1000 / 100) / 1000), 350, 540);
                Create_Object(tv_numberE3, layout_mul, String.valueOf(numberA * (numberB % 1000 / 100) % 1000 / 100), 450, 540);
                Create_Object(tv_numberE4, layout_mul, String.valueOf(numberA * (numberB % 1000 / 100) % 100 / 10), 550, 540);
                Create_Object(tv_numberE5, layout_mul, String.valueOf(numberA * (numberB % 1000 / 100) % 10), 650, 540);
            }else if((numberA * (numberB % 1000 / 100)) >= 10000 && (numberA * (numberB % 1000 / 100)) < 100000){
                Create_Object(tv_numberE1, layout_mul, String.valueOf(numberA * (numberB % 1000 / 100) / 10000), 250, 540);
                Create_Object(tv_numberE2, layout_mul, String.valueOf(numberA * (numberB % 1000 / 100) % 10000 / 1000), 350, 540);
                Create_Object(tv_numberE3, layout_mul, String.valueOf(numberA * (numberB % 1000 / 100) % 1000 / 100), 450, 540);
                Create_Object(tv_numberE4, layout_mul, String.valueOf(numberA * (numberB % 1000 / 100) % 100 / 10), 550, 540);
                Create_Object(tv_numberE5, layout_mul, String.valueOf(numberA * (numberB % 1000 / 100) % 10), 650, 540);
            }
            if((numberA * (numberB / 1000)) >= 0 && (numberA * (numberB / 1000)) < 10){
                Create_Object(tv_numberF1, layout_mul, "", 150, 650);
                Create_Object(tv_numberF2, layout_mul, "", 250, 650);
                Create_Object(tv_numberF3, layout_mul, "", 350, 650);
                Create_Object(tv_numberF4, layout_mul, "", 450, 650);
                Create_Object(tv_numberF5, layout_mul, String.valueOf(numberA * (numberB / 1000)), 550, 650);
            }else if((numberA * (numberB / 1000)) >= 10 && (numberA * (numberB / 1000)) < 100){
                Create_Object(tv_numberF1, layout_mul, "", 150, 650);
                Create_Object(tv_numberF2, layout_mul, "", 250, 650);
                Create_Object(tv_numberF3, layout_mul, "", 350, 650);
                Create_Object(tv_numberF4, layout_mul, String.valueOf(numberA * (numberB / 1000) / 10), 450, 650);
                Create_Object(tv_numberF5, layout_mul, String.valueOf(numberA * (numberB / 1000) % 10), 550, 650);
            }else if((numberA * (numberB / 1000)) >= 100 && (numberA * (numberB / 1000)) < 1000){
                Create_Object(tv_numberF1, layout_mul,"", 150, 650);
                Create_Object(tv_numberF2, layout_mul, "", 250, 650);
                Create_Object(tv_numberF3, layout_mul, String.valueOf(numberA * (numberB / 1000) / 100), 350, 650);
                Create_Object(tv_numberF4, layout_mul, String.valueOf(numberA * (numberB / 1000) % 100 / 10), 450, 650);
                Create_Object(tv_numberF5, layout_mul, String.valueOf(numberA * (numberB / 1000) % 10), 550, 650);
            }else if((numberA * (numberB / 1000)) >= 1000 && (numberA * (numberB / 1000)) < 10000){
                Create_Object(tv_numberF1, layout_mul, "", 150, 650);
                Create_Object(tv_numberF2, layout_mul, String.valueOf(numberA * (numberB / 1000) / 1000), 250, 650);
                Create_Object(tv_numberF3, layout_mul, String.valueOf(numberA * (numberB / 1000) % 1000 / 100), 350, 650);
                Create_Object(tv_numberF4, layout_mul, String.valueOf(numberA * (numberB / 1000) % 100 / 10), 450, 650);
                Create_Object(tv_numberF5, layout_mul, String.valueOf(numberA * (numberB / 1000) % 10), 550, 650);
            }else if((numberA * (numberB / 1000)) >= 10000 && (numberA * (numberB / 1000)) < 100000){
                Create_Object(tv_numberF1, layout_mul, String.valueOf(numberA * (numberB / 1000) / 10000), 150, 650);
                Create_Object(tv_numberF2, layout_mul, String.valueOf(numberA * (numberB / 1000) % 10000 / 1000), 250, 650);
                Create_Object(tv_numberF3, layout_mul, String.valueOf(numberA * (numberB / 1000) % 1000 / 100), 350, 650);
                Create_Object(tv_numberF4, layout_mul, String.valueOf(numberA * (numberB / 1000) % 100 / 10), 450, 650);
                Create_Object(tv_numberF5, layout_mul, String.valueOf(numberA * (numberB / 1000) % 10), 550, 650);
            }
            if(decidability_value >= 0 && decidability_value < 10){
                Create_Object(tv_numberFR1, layout_mul, "", 150, 790);
                Create_Object(tv_numberFR2, layout_mul, "", 250, 790);
                Create_Object(tv_numberFR3, layout_mul, "", 350, 790);
                Create_Object(tv_numberFR4, layout_mul, "", 450, 790);
                Create_Object(tv_numberFR5, layout_mul, "", 550, 790);
                Create_Object(tv_numberFR6, layout_mul, "", 650, 790);
                Create_Object(tv_numberFR7, layout_mul, "", 750, 790);
                Create_Object(tv_numberFR8, layout_mul, String.valueOf(decidability_value), 850, 790);
            }else if(decidability_value >= 10 && decidability_value < 100){
                Create_Object(tv_numberFR1, layout_mul, "", 150, 790);
                Create_Object(tv_numberFR2, layout_mul, "", 250, 790);
                Create_Object(tv_numberFR3, layout_mul, "", 350, 790);
                Create_Object(tv_numberFR4, layout_mul, "", 450, 790);
                Create_Object(tv_numberFR5, layout_mul, "", 550, 790);
                Create_Object(tv_numberFR6, layout_mul, "", 650, 790);
                Create_Object(tv_numberFR7, layout_mul, String.valueOf(decidability_value / 10), 750, 790);
                Create_Object(tv_numberFR8, layout_mul, String.valueOf(decidability_value % 10), 850, 790);
            }else if(decidability_value >= 100 && decidability_value < 1000){
                Create_Object(tv_numberFR1, layout_mul, "", 150, 790);
                Create_Object(tv_numberFR2, layout_mul, "", 250, 790);
                Create_Object(tv_numberFR3, layout_mul, "", 350, 790);
                Create_Object(tv_numberFR4, layout_mul, "", 450, 790);
                Create_Object(tv_numberFR5, layout_mul, "", 550, 790);
                Create_Object(tv_numberFR6, layout_mul, String.valueOf(decidability_value / 100), 650, 790);
                Create_Object(tv_numberFR7, layout_mul, String.valueOf(decidability_value % 100 / 10), 750, 790);
                Create_Object(tv_numberFR8, layout_mul, String.valueOf(decidability_value % 10), 850, 790);
            }else if(decidability_value >= 1000 && decidability_value < 10000){
                Create_Object(tv_numberFR1, layout_mul, "", 150, 790);
                Create_Object(tv_numberFR2, layout_mul, "", 250, 790);
                Create_Object(tv_numberFR3, layout_mul, "", 350, 790);
                Create_Object(tv_numberFR4, layout_mul, "", 450, 790);
                Create_Object(tv_numberFR5, layout_mul, String.valueOf(decidability_value / 1000), 550, 790);
                Create_Object(tv_numberFR6, layout_mul, String.valueOf(decidability_value % 1000 / 100), 650, 790);
                Create_Object(tv_numberFR7, layout_mul, String.valueOf(decidability_value % 100 / 10), 750, 790);
                Create_Object(tv_numberFR8, layout_mul, String.valueOf(decidability_value % 10), 850, 790);
            }else if(decidability_value >= 10000 && decidability_value < 100000){
                Create_Object(tv_numberFR1, layout_mul, "", 150, 790);
                Create_Object(tv_numberFR2, layout_mul, "", 250, 790);
                Create_Object(tv_numberFR3, layout_mul, "", 350, 790);
                Create_Object(tv_numberFR4, layout_mul, String.valueOf(decidability_value / 10000), 450, 790);
                Create_Object(tv_numberFR5, layout_mul, String.valueOf(decidability_value % 10000 / 1000), 550, 790);
                Create_Object(tv_numberFR6, layout_mul, String.valueOf(decidability_value % 1000 / 100), 650, 790);
                Create_Object(tv_numberFR7, layout_mul, String.valueOf(decidability_value % 100 / 10), 750, 790);
                Create_Object(tv_numberFR8, layout_mul, String.valueOf(decidability_value % 10), 850, 790);
            }else if(decidability_value >= 100000 && decidability_value < 1000000){
                Create_Object(tv_numberFR1, layout_mul, "", 150, 790);
                Create_Object(tv_numberFR2, layout_mul, "", 250, 790);
                Create_Object(tv_numberFR3, layout_mul, String.valueOf(decidability_value / 100000), 350, 790);
                Create_Object(tv_numberFR4, layout_mul, String.valueOf(decidability_value % 100000 / 10000), 450, 790);
                Create_Object(tv_numberFR5, layout_mul, String.valueOf(decidability_value % 10000 / 1000), 550, 790);
                Create_Object(tv_numberFR6, layout_mul, String.valueOf(decidability_value % 1000 / 100), 650, 790);
                Create_Object(tv_numberFR7, layout_mul, String.valueOf(decidability_value % 100 / 10), 750, 790);
                Create_Object(tv_numberFR8, layout_mul, String.valueOf(decidability_value % 10), 850, 790);
            }else if(decidability_value >= 1000000 && decidability_value < 10000000){
                Create_Object(tv_numberFR1, layout_mul, "", 150, 690);
                Create_Object(tv_numberFR2, layout_mul, String.valueOf(decidability_value / 1000000), 250, 790);
                Create_Object(tv_numberFR3, layout_mul, String.valueOf(decidability_value % 1000000 / 100000), 350, 790);
                Create_Object(tv_numberFR4, layout_mul, String.valueOf(decidability_value % 100000 / 10000), 450, 790);
                Create_Object(tv_numberFR5, layout_mul, String.valueOf(decidability_value % 10000 / 1000), 550, 790);
                Create_Object(tv_numberFR6, layout_mul, String.valueOf(decidability_value % 1000 / 100), 650, 790);
                Create_Object(tv_numberFR7, layout_mul, String.valueOf(decidability_value % 100 / 10), 750, 790);
                Create_Object(tv_numberFR8, layout_mul, String.valueOf(decidability_value % 10), 850, 790);
            }else if(decidability_value >= 10000000 && decidability_value <= 100000000){
                Create_Object(tv_numberFR1, layout_mul, String.valueOf(decidability_value / 10000000), 150, 790);
                Create_Object(tv_numberFR2, layout_mul, String.valueOf(decidability_value % 10000000 / 1000000), 250, 790);
                Create_Object(tv_numberFR3, layout_mul, String.valueOf(decidability_value % 1000000 / 100000), 350, 790);
                Create_Object(tv_numberFR4, layout_mul, String.valueOf(decidability_value % 100000 / 10000), 450, 790);
                Create_Object(tv_numberFR5, layout_mul, String.valueOf(decidability_value % 10000 / 1000), 550, 790);
                Create_Object(tv_numberFR6, layout_mul, String.valueOf(decidability_value % 1000 / 100), 650, 790);
                Create_Object(tv_numberFR7, layout_mul, String.valueOf(decidability_value % 100 / 10), 750, 790);
                Create_Object(tv_numberFR8, layout_mul, String.valueOf(decidability_value % 10), 850, 790);
            }
            Create_Object(tv_line4, layout_mul, "-----------------------", 110, 710);
        }else if(numberB >= 100 && numberB < 1000){
            TextView tv_numberC1 = new TextView(MulActivity.this);
            TextView tv_numberC2 = new TextView(MulActivity.this);
            TextView tv_numberC3 = new TextView(MulActivity.this);
            TextView tv_numberC4 = new TextView(MulActivity.this);
            TextView tv_numberC5 = new TextView(MulActivity.this);
            TextView tv_numberD1 = new TextView(MulActivity.this);
            TextView tv_numberD2 = new TextView(MulActivity.this);
            TextView tv_numberD3 = new TextView(MulActivity.this);
            TextView tv_numberD4 = new TextView(MulActivity.this);
            TextView tv_numberD5 = new TextView(MulActivity.this);
            TextView tv_numberE1 = new TextView(MulActivity.this);
            TextView tv_numberE2 = new TextView(MulActivity.this);
            TextView tv_numberE3 = new TextView(MulActivity.this);
            TextView tv_numberE4 = new TextView(MulActivity.this);
            TextView tv_numberE5 = new TextView(MulActivity.this);
            TextView tv_numberER1 = new TextView(MulActivity.this);
            TextView tv_numberER2 = new TextView(MulActivity.this);
            TextView tv_numberER3 = new TextView(MulActivity.this);
            TextView tv_numberER4 = new TextView(MulActivity.this);
            TextView tv_numberER5 = new TextView(MulActivity.this);
            TextView tv_numberER6 = new TextView(MulActivity.this);
            TextView tv_numberER7 = new TextView(MulActivity.this);
            TextView tv_line3 = new TextView(MulActivity.this);
            if((numberA * (numberB % 10)) >= 0 && (numberA * (numberB % 10)) < 10){
                Create_Object(tv_numberC1, layout_mul, "", 450, 320);
                Create_Object(tv_numberC2, layout_mul, "", 550, 320);
                Create_Object(tv_numberC3, layout_mul, "", 650, 320);
                Create_Object(tv_numberC4, layout_mul, "", 750, 320);
                Create_Object(tv_numberC5, layout_mul, String.valueOf(numberA * (numberB % 10)), 850, 320);
            }else if((numberA * (numberB % 10)) >= 10 && (numberA * (numberB % 10)) < 100){
                Create_Object(tv_numberC1, layout_mul, "", 450, 320);
                Create_Object(tv_numberC2, layout_mul, "", 550, 320);
                Create_Object(tv_numberC3, layout_mul, "", 650, 320);
                Create_Object(tv_numberC4, layout_mul, String.valueOf(numberA * (numberB % 10) / 10), 750, 320);
                Create_Object(tv_numberC5, layout_mul, String.valueOf(numberA * (numberB % 10) % 10), 850, 320);
            }else if((numberA * (numberB % 10)) >= 100 && (numberA * (numberB % 10)) < 1000){
                Create_Object(tv_numberC1, layout_mul, "", 450, 320);
                Create_Object(tv_numberC2, layout_mul, "", 550, 320);
                Create_Object(tv_numberC3, layout_mul, String.valueOf(numberA * (numberB % 10) / 100), 650, 320);
                Create_Object(tv_numberC4, layout_mul, String.valueOf(numberA * (numberB % 10) % 100 / 10), 750, 320);
                Create_Object(tv_numberC5, layout_mul, String.valueOf(numberA * (numberB % 10) % 10), 850, 320);
            }else if((numberA * (numberB % 10)) >= 1000 && (numberA * (numberB % 10)) < 10000){
                Create_Object(tv_numberC1, layout_mul, "", 450, 320);
                Create_Object(tv_numberC2, layout_mul, String.valueOf(numberA * (numberB % 10) / 1000), 550, 320);
                Create_Object(tv_numberC3, layout_mul, String.valueOf(numberA * (numberB % 10) % 1000 / 100), 650, 320);
                Create_Object(tv_numberC4, layout_mul, String.valueOf(numberA * (numberB % 10) % 100 / 10), 750, 320);
                Create_Object(tv_numberC5, layout_mul, String.valueOf(numberA * (numberB % 10) % 10), 850, 320);
            }else if((numberA * (numberB % 10)) >= 10000 && (numberA * (numberB % 10)) < 100000){
                Create_Object(tv_numberC1, layout_mul, String.valueOf(numberA * (numberB % 10) / 10000), 450, 320);
                Create_Object(tv_numberC2, layout_mul, String.valueOf(numberA * (numberB % 10) % 10000 / 1000), 550, 320);
                Create_Object(tv_numberC3, layout_mul, String.valueOf(numberA * (numberB % 10) % 1000 / 100), 650, 320);
                Create_Object(tv_numberC4, layout_mul, String.valueOf(numberA * (numberB % 10) % 100 / 10), 750, 320);
                Create_Object(tv_numberC5, layout_mul, String.valueOf(numberA * (numberB % 10) % 10), 850, 320);
            }
            if((numberA * (numberB % 100 / 10)) >= 0 && (numberA * (numberB % 100 / 10)) < 10){
                Create_Object(tv_numberD1, layout_mul, "", 350, 430);
                Create_Object(tv_numberD2, layout_mul, "", 450, 430);
                Create_Object(tv_numberD3, layout_mul, "", 550, 430);
                Create_Object(tv_numberD4, layout_mul, "", 650, 430);
                Create_Object(tv_numberD5, layout_mul, String.valueOf(numberA * (numberB % 100 / 10)), 750, 430);
            }else if((numberA * (numberB % 100 / 10)) >= 10 && (numberA * (numberB % 100 / 10)) < 100){
                Create_Object(tv_numberD1, layout_mul, "", 350, 430);
                Create_Object(tv_numberD2, layout_mul, "", 450, 430);
                Create_Object(tv_numberD3, layout_mul, "", 550, 430);
                Create_Object(tv_numberD4, layout_mul, String.valueOf(numberA * (numberB % 100 / 10) / 10), 650, 430);
                Create_Object(tv_numberD5, layout_mul, String.valueOf(numberA * (numberB % 100 / 10) % 10), 750, 430);
            }else if((numberA * (numberB % 100 / 10)) >= 100 && (numberA * (numberB % 100 / 10)) < 1000){
                Create_Object(tv_numberD1, layout_mul,"", 350, 430);
                Create_Object(tv_numberD2, layout_mul, "", 450, 430);
                Create_Object(tv_numberD3, layout_mul, String.valueOf(numberA * (numberB % 100 / 10) / 100), 550, 430);
                Create_Object(tv_numberD4, layout_mul, String.valueOf(numberA * (numberB % 100 / 10) % 100 / 10), 650, 430);
                Create_Object(tv_numberD5, layout_mul, String.valueOf(numberA * (numberB % 100 / 10) % 10), 750, 430);
            }else if((numberA * (numberB % 100 / 10)) >= 1000 && (numberA * (numberB % 100 / 10)) < 10000){
                Create_Object(tv_numberD1, layout_mul, "", 350, 430);
                Create_Object(tv_numberD2, layout_mul, String.valueOf(numberA * (numberB % 100 / 10) / 1000), 450, 430);
                Create_Object(tv_numberD3, layout_mul, String.valueOf(numberA * (numberB % 100 / 10) % 1000 / 100), 550, 430);
                Create_Object(tv_numberD4, layout_mul, String.valueOf(numberA * (numberB % 100 / 10) % 100 / 10), 650, 430);
                Create_Object(tv_numberD5, layout_mul, String.valueOf(numberA * (numberB % 100 / 10) % 10), 750, 430);
            }else if((numberA * (numberB % 100 / 10)) >= 10000 && (numberA * (numberB % 100 / 10)) < 100000){
                Create_Object(tv_numberD1, layout_mul, String.valueOf(numberA * (numberB % 100 / 10) / 10000), 350, 430);
                Create_Object(tv_numberD2, layout_mul, String.valueOf(numberA * (numberB % 100 / 10) % 10000 / 1000), 450, 430);
                Create_Object(tv_numberD3, layout_mul, String.valueOf(numberA * (numberB % 100 / 10) % 1000 / 100), 550, 430);
                Create_Object(tv_numberD4, layout_mul, String.valueOf(numberA * (numberB % 100 / 10) % 100 / 10), 650, 430);
                Create_Object(tv_numberD5, layout_mul, String.valueOf(numberA * (numberB % 100 / 10) % 10), 750, 430);
            }
            if((numberA * (numberB / 100)) >= 0 && (numberA * (numberB / 100)) < 10){
                Create_Object(tv_numberE1, layout_mul, "", 250, 540);
                Create_Object(tv_numberE2, layout_mul, "", 350, 540);
                Create_Object(tv_numberE3, layout_mul, "", 450, 540);
                Create_Object(tv_numberE4, layout_mul, "", 550, 540);
                Create_Object(tv_numberE5, layout_mul, String.valueOf(numberA * (numberB / 100)), 650, 540);
            }else if((numberA * (numberB / 100)) >= 10 && (numberA * (numberB / 100)) < 100){
                Create_Object(tv_numberE1, layout_mul, "", 250, 540);
                Create_Object(tv_numberE2, layout_mul, "", 350, 540);
                Create_Object(tv_numberE3, layout_mul, "", 450, 540);
                Create_Object(tv_numberE4, layout_mul, String.valueOf(numberA * (numberB / 100) / 10), 550, 540);
                Create_Object(tv_numberE5, layout_mul, String.valueOf(numberA * (numberB / 100) % 10), 650, 540);
            }else if((numberA * (numberB / 100)) >= 100 && (numberA * (numberB / 100)) < 1000){
                Create_Object(tv_numberE1, layout_mul,"", 250, 540);
                Create_Object(tv_numberE2, layout_mul, "", 350, 540);
                Create_Object(tv_numberE3, layout_mul, String.valueOf(numberA * (numberB / 100) / 100), 450, 540);
                Create_Object(tv_numberE4, layout_mul, String.valueOf(numberA * (numberB / 100) % 100 / 10), 550, 540);
                Create_Object(tv_numberE5, layout_mul, String.valueOf(numberA * (numberB / 100) % 10), 650, 540);
            }else if((numberA * (numberB / 100)) >= 1000 && (numberA * (numberB / 100)) < 10000){
                Create_Object(tv_numberE1, layout_mul, "", 250, 540);
                Create_Object(tv_numberE2, layout_mul, String.valueOf(numberA * (numberB / 100) / 1000), 350, 540);
                Create_Object(tv_numberE3, layout_mul, String.valueOf(numberA * (numberB / 100) % 1000 / 100), 450, 540);
                Create_Object(tv_numberE4, layout_mul, String.valueOf(numberA * (numberB / 100) % 100 / 10), 550, 540);
                Create_Object(tv_numberE5, layout_mul, String.valueOf(numberA * (numberB / 100) % 10), 650, 540);
            }else if((numberA * (numberB / 100)) >= 10000 && (numberA * (numberB / 100)) < 100000){
                Create_Object(tv_numberE1, layout_mul, String.valueOf(numberA * (numberB / 100) / 10000), 250, 540);
                Create_Object(tv_numberE2, layout_mul, String.valueOf(numberA * (numberB / 100) % 10000 / 1000), 350, 540);
                Create_Object(tv_numberE3, layout_mul, String.valueOf(numberA * (numberB / 100) % 1000 / 100), 450, 540);
                Create_Object(tv_numberE4, layout_mul, String.valueOf(numberA * (numberB / 100) % 100 / 10), 550, 540);
                Create_Object(tv_numberE5, layout_mul, String.valueOf(numberA * (numberB / 100) % 10), 650, 540);
            }
            if(decidability_value >= 0 && decidability_value < 10){
                Create_Object(tv_numberER1, layout_mul, "", 250, 690);
                Create_Object(tv_numberER2, layout_mul, "", 350, 690);
                Create_Object(tv_numberER3, layout_mul, "", 450, 690);
                Create_Object(tv_numberER4, layout_mul, "", 550, 690);
                Create_Object(tv_numberER5, layout_mul, "", 650, 690);
                Create_Object(tv_numberER6, layout_mul, "", 750, 690);
                Create_Object(tv_numberER7, layout_mul, String.valueOf(decidability_value), 850, 690);
            }else if(decidability_value >= 10 && decidability_value < 100){
                Create_Object(tv_numberER1, layout_mul, "", 250, 690);
                Create_Object(tv_numberER2, layout_mul, "", 350, 690);
                Create_Object(tv_numberER3, layout_mul, "", 450, 690);
                Create_Object(tv_numberER4, layout_mul, "", 550, 690);
                Create_Object(tv_numberER5, layout_mul, "", 650, 690);
                Create_Object(tv_numberER6, layout_mul, String.valueOf(decidability_value / 10), 750, 690);
                Create_Object(tv_numberER7, layout_mul, String.valueOf(decidability_value % 10), 850, 690);
            }else if(decidability_value >= 100 && decidability_value < 1000){
                Create_Object(tv_numberER1, layout_mul, "", 250, 690);
                Create_Object(tv_numberER2, layout_mul, "", 350, 690);
                Create_Object(tv_numberER3, layout_mul, "", 450, 690);
                Create_Object(tv_numberER4, layout_mul, "", 550, 690);
                Create_Object(tv_numberER5, layout_mul, String.valueOf(decidability_value / 100), 650, 690);
                Create_Object(tv_numberER6, layout_mul, String.valueOf(decidability_value % 100 / 10), 750, 690);
                Create_Object(tv_numberER7, layout_mul, String.valueOf(decidability_value % 10), 850, 690);
            }else if(decidability_value >= 1000 && decidability_value < 10000){
                Create_Object(tv_numberER1, layout_mul, "", 250, 690);
                Create_Object(tv_numberER2, layout_mul, "", 350, 690);
                Create_Object(tv_numberER3, layout_mul, "", 450, 690);
                Create_Object(tv_numberER4, layout_mul, String.valueOf(decidability_value / 1000), 550, 690);
                Create_Object(tv_numberER5, layout_mul, String.valueOf(decidability_value % 1000 / 100), 650, 690);
                Create_Object(tv_numberER6, layout_mul, String.valueOf(decidability_value % 100 / 10), 750, 690);
                Create_Object(tv_numberER7, layout_mul, String.valueOf(decidability_value % 10), 850, 690);
            }else if(decidability_value >= 10000 && decidability_value < 100000){
                Create_Object(tv_numberER1, layout_mul, "", 250, 690);
                Create_Object(tv_numberER2, layout_mul, "", 350, 690);
                Create_Object(tv_numberER3, layout_mul, String.valueOf(decidability_value / 10000), 450, 690);
                Create_Object(tv_numberER4, layout_mul, String.valueOf(decidability_value % 10000 / 1000), 550, 690);
                Create_Object(tv_numberER5, layout_mul, String.valueOf(decidability_value % 1000 / 100), 650, 690);
                Create_Object(tv_numberER6, layout_mul, String.valueOf(decidability_value % 100 / 10), 750, 690);
                Create_Object(tv_numberER7, layout_mul, String.valueOf(decidability_value % 10), 850, 690);
            }else if(decidability_value >= 100000 && decidability_value < 1000000){
                Create_Object(tv_numberER1, layout_mul, "", 250, 690);
                Create_Object(tv_numberER2, layout_mul, String.valueOf(decidability_value / 100000), 350, 690);
                Create_Object(tv_numberER3, layout_mul, String.valueOf(decidability_value % 100000 / 10000), 450, 690);
                Create_Object(tv_numberER4, layout_mul, String.valueOf(decidability_value % 10000 / 1000), 550, 690);
                Create_Object(tv_numberER5, layout_mul, String.valueOf(decidability_value % 1000 / 100), 650, 690);
                Create_Object(tv_numberER6, layout_mul, String.valueOf(decidability_value % 100 / 10), 750, 690);
                Create_Object(tv_numberER7, layout_mul, String.valueOf(decidability_value % 10), 850, 690);
            }else if(decidability_value >= 1000000 && decidability_value < 10000000){
                Create_Object(tv_numberER1, layout_mul, String.valueOf(decidability_value / 1000000), 250, 690);
                Create_Object(tv_numberER2, layout_mul, String.valueOf(decidability_value % 1000000 / 100000), 350, 690);
                Create_Object(tv_numberER3, layout_mul, String.valueOf(decidability_value % 100000 / 10000), 450, 690);
                Create_Object(tv_numberER4, layout_mul, String.valueOf(decidability_value % 10000 / 1000), 550, 690);
                Create_Object(tv_numberER5, layout_mul, String.valueOf(decidability_value % 1000 / 100), 650, 690);
                Create_Object(tv_numberER6, layout_mul, String.valueOf(decidability_value % 100 / 10), 750, 690);
                Create_Object(tv_numberER7, layout_mul, String.valueOf(decidability_value % 10), 850, 690);
            }
            Create_Object(tv_line3, layout_mul, "---------------------", 200, 610);
        }


    }
    public void Create_Object(TextView textview, ConstraintLayout constraintlayout, String content_value, int X, int Y){
        textview.setLayoutParams(new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
        ));
        constraintlayout.addView(textview);
        textview.setTextSize(50);
        textview.setX(textview.getX() + X);
        textview.setY(textview.getY() + Y);
        textview.setText(content_value);
    }

    public void Create_A_and_B(ConstraintLayout layout_mul, int decidability_value, int numberA, int numberB){
        TextView tv_numberA1 = new TextView(MulActivity.this);
        TextView tv_numberA2 = new TextView(MulActivity.this);
        TextView tv_numberA3 = new TextView(MulActivity.this);
        TextView tv_numberA4 = new TextView(MulActivity.this);
        TextView tv_numberB1 = new TextView(MulActivity.this);
        TextView tv_numberB2 = new TextView(MulActivity.this);
        TextView tv_numberB3 = new TextView(MulActivity.this);
        TextView tv_numberB4 = new TextView(MulActivity.this);
        TextView tv_line1 = new TextView(MulActivity.this);
        Create_Object(tv_line1, layout_mul, "--------------", 450, 220);
        TextView tv_add = new TextView(MulActivity.this);
        Create_Object(tv_add, layout_mul, "x", 450, 160);
        if(numberA >= 0 && numberA < 10){
            Create_Object(tv_numberA1, layout_mul, "", 550, 50);
            Create_Object(tv_numberA2, layout_mul, "", 650, 50);
            Create_Object(tv_numberA3, layout_mul, "", 750, 50);
            Create_Object(tv_numberA4, layout_mul, String.valueOf(numberA), 850, 50);
        }else if(numberA >= 10 && numberA < 100){
            Create_Object(tv_numberA1, layout_mul, "", 550, 50);
            Create_Object(tv_numberA2, layout_mul, "", 650, 50);
            Create_Object(tv_numberA3, layout_mul, String.valueOf(numberA / 10), 750, 50);
            Create_Object(tv_numberA4, layout_mul, String.valueOf(numberA % 10), 850, 50);
        }else if(numberA >= 100 && numberA < 1000){
            Create_Object(tv_numberA1, layout_mul, "", 550, 50);
            Create_Object(tv_numberA2, layout_mul, String.valueOf(numberA / 100), 650, 50);
            Create_Object(tv_numberA3, layout_mul, String.valueOf(numberA % 100 / 10), 750, 50);
            Create_Object(tv_numberA4, layout_mul, String.valueOf(numberA % 10), 850, 50);
        }else if(numberA >= 1000 && numberA < 10000){
            Create_Object(tv_numberA1, layout_mul, String.valueOf(numberA / 1000), 550, 50);
            Create_Object(tv_numberA2, layout_mul, String.valueOf(numberA % 1000 / 100), 650, 50);
            Create_Object(tv_numberA3, layout_mul, String.valueOf(numberA % 100 / 10), 750, 50);
            Create_Object(tv_numberA4, layout_mul, String.valueOf(numberA % 10), 850, 50);
        }
        if(numberB >= 0 && numberB < 10){
            Create_Object(tv_numberB1, layout_mul, "", 550, 150);
            Create_Object(tv_numberB2, layout_mul, "", 650, 150);
            Create_Object(tv_numberB3, layout_mul, "", 750, 150);
            Create_Object(tv_numberB4, layout_mul, String.valueOf(numberB), 850, 150);
        }else if(numberB >= 10 && numberB < 100){
            Create_Object(tv_numberB1, layout_mul, "", 550, 150);
            Create_Object(tv_numberB2, layout_mul, "", 650, 150);
            Create_Object(tv_numberB3, layout_mul, String.valueOf(numberB / 10), 750, 150);
            Create_Object(tv_numberB4, layout_mul, String.valueOf(numberB % 10), 850, 150);
        }else if(numberB >= 100 && numberB < 1000){
            Create_Object(tv_numberB1, layout_mul, "", 550, 150);
            Create_Object(tv_numberB2, layout_mul, String.valueOf(numberB / 100), 650, 150);
            Create_Object(tv_numberB3, layout_mul, String.valueOf(numberB % 100 / 10), 750, 150);
            Create_Object(tv_numberB4, layout_mul, String.valueOf(numberB % 10), 850, 150);
        }else if(numberB >= 1000 && numberB < 10000){
            Create_Object(tv_numberB1, layout_mul, String.valueOf(numberB / 1000), 550, 150);
            Create_Object(tv_numberB2, layout_mul, String.valueOf(numberB % 1000 / 100), 650, 150);
            Create_Object(tv_numberB3, layout_mul, String.valueOf(numberB % 100 / 10), 750, 150);
            Create_Object(tv_numberB4, layout_mul, String.valueOf(numberB % 10), 850, 150);
        }
    }
}
