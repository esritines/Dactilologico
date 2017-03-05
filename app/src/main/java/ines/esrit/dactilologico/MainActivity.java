package ines.esrit.dactilologico;

import android.graphics.PixelFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnTranslate;
    private Button btnDecode;
    private Button btnAbout;
    private Button btnPeculiarities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setControls();
    }

    //region Methods

    public void setControls(){
        btnTranslate = (Button) findViewById(R.id.btnTranslate);
        btnTranslate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnTranslate_onClick(v);
            }
        });

        btnDecode = (Button) findViewById(R.id.btnDecode);
        btnDecode.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnDecode_onClick(v);
            }
        });

        btnAbout = (Button) findViewById(R.id.btnAbout);
        btnAbout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnAbout_onClick(v);
            }
        });

        btnPeculiarities = (Button) findViewById(R.id.btnPeculiarities);
        btnPeculiarities.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {btnPeculiarities_onClick(v);
            }
        });
    }

    //region Buttons

    protected void btnTranslate_onClick(View v){

    }

    protected void btnDecode_onClick(View v){

    }

    protected void btnAbout_onClick(View v){

    }

    protected void btnPeculiarities_onClick(View v){

    }

    //endregion

    //endregion
}
