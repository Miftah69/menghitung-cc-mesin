package com.example.cah_ngganteng.menghitungccmesin;

import android.icu.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CCmesin extends AppCompatActivity {

    private EditText tDiameter;
    private EditText tStroke;
    private EditText tSelinder;
    private EditText tHasil;
    private Button tHitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ccmesin);

        tDiameter = (EditText)findViewById(R.id.diameterslinder);
        tStroke = (EditText)findViewById(R.id.stroke);
        tSelinder = (EditText)findViewById(R.id.jmlhselinder);
        tHasil = (EditText)findViewById(R.id.ehasil);
        tHitung = (Button)findViewById(R.id.Hitung);
    }


    public void hitungCC(View view){
        try {
            double diameter = Double.parseDouble(tDiameter.getText().toString());
            int stroke = Integer.parseInt(tStroke.getText().toString());
            int selinder = Integer.parseInt(tSelinder.getText().toString());
            double tMesin = 3.14 * diameter * diameter * stroke * selinder/4;
            tHasil.setText(String.valueOf(tMesin));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
