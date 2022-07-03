package tku.csie2020.a20200602;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_add = (Button) findViewById(R.id.btn_add);
        Button btn_mul = (Button) findViewById(R.id.btn_mul);
        final EditText et_input_numberA = (EditText) findViewById(R.id.et_input_number1);
        final EditText et_input_numberB = (EditText) findViewById(R.id.et_input_number2);

        btn_add.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("numberA", Integer.valueOf(et_input_numberA.getText().toString()));
                bundle.putInt("numberB", Integer.valueOf(et_input_numberB.getText().toString()));
                intent.putExtras(bundle);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });
        btn_mul.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MulActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("numberA", Integer.valueOf(et_input_numberA.getText().toString()));
                bundle.putInt("numberB", Integer.valueOf(et_input_numberB.getText().toString()));
                intent.putExtras(bundle);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });
    }
}
