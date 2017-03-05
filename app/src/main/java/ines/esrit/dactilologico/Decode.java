package ines.esrit.dactilologico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Decode extends AppCompatActivity {

    private Button btnBackDecode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decode);

        this.setControls();
    }

    public void setControls(){
        btnBackDecode = (Button) findViewById(R.id.btnBackDecode);
        btnBackDecode.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnBackDecode_onClick(v);
            }
        });

    }

    protected void btnBackDecode_onClick(View v){

    }
}
