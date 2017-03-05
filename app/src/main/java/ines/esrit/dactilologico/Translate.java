package ines.esrit.dactilologico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Translate extends AppCompatActivity {

    private Button btnTranslateTranslate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate);
        this.setControls();
    }

    public void setControls(){
        btnTranslateTranslate = (Button) findViewById(R.id.btnTranslateTranslate);
        btnTranslateTranslate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {btnTranslateTranslate_onClick(v);
            }
        });

    }

    protected void btnTranslateTranslate_onClick(View v){

    }
}
