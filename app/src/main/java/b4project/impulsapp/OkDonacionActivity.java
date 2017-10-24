package b4project.impulsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class OkDonacionActivity extends AppCompatActivity {
    RadioButton radio1, radio2;
    EditText text1, text2, text3; //Textos de la tarjeta
    EditText text4, text5;   //Textos de PayPal
    Button buttonSave, buttonCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ok_donacion);
        radio1= (RadioButton) findViewById(R.id.radioButton3);
        radio2= (RadioButton) findViewById(R.id.radioButton4);
        text1= (EditText) findViewById(R.id.editText14);
        text2= (EditText) findViewById(R.id.editText17);
        text3= (EditText) findViewById(R.id.editText18);
        text4= (EditText) findViewById(R.id.editText19);
        text5= (EditText) findViewById(R.id.editText20);

        buttonSave= (Button) findViewById(R.id.button5);
        buttonCancel= (Button) findViewById(R.id.button6);

        //text1.setFocusable(false);       //Desactiva los EditText para que, al entrar en el if se activen
        text1.setEnabled(false);         //sólo las casillas necesarias
        text2.setEnabled(false);
        text3.setEnabled(false);
        text4.setEnabled(false);
        text5.setEnabled(false);

        radio1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //radio2.setClickable(false);
                radio2.setEnabled(false);         // Desactiva el radio2 para que no sea seleccionado

                text1.setEnabled(true);           //Activa sus EditText para insertar la info necesaria
                text2.setEnabled(true);
                text3.setEnabled(true);
            }
        });

        radio2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //radio1.setClickable(false);
                radio1.setEnabled(false);         // Desactiva el radio1 para que no sea seleccionado

                text4.setEnabled(true);
                text5.setEnabled(true);
            }
        });

        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(OkDonacionActivity.this,MisProyectosActivity.class);
                startActivity(intent);
            }
        });

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(OkDonacionActivity.this,MisProyectosActivity.class);
                Toast.makeText(getApplicationContext(), "Has donado con éxito", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

    }




}