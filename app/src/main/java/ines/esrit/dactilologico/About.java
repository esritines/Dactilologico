package ines.esrit.dactilologico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About extends AppCompatActivity {

    private Button btnBackAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void setControls(){
        btnBackAbout = (Button) findViewById(R.id.btnBackDecode);
        btnBackAbout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnBackAbout_onClick(v);
            }
        });

    }

    protected void btnBackAbout_onClick(View v){

    }
}
