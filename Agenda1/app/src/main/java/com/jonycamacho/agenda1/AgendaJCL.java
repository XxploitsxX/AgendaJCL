package com.jonycamacho.agenda1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AgendaJCL extends AppCompatActivity {
EditText nm,em,tw,tl,nc;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda_jcl);
        nm=(EditText)findViewById(R.id.nombre);
        em=(EditText)findViewById(R.id.email);
        tw=(EditText)findViewById(R.id.twitter);
        tl=(EditText)findViewById(R.id.tel);
        nc=(EditText)findViewById(R.id.fecha);
        bt=(Button)findViewById(R.id.nac);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent();
                ContactA user=new ContactA(nm.getText().toString(),em.getText().toString(),tw.getText().toString(),tl.getText().toString(),nc.getText().toString());
                myIntent.putExtra("Joni",user);
                setResult(RESULT_OK,myIntent);
                finish();
            }
        });
    }
}
