package b4project.impulsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditaProyectoActivity extends AppCompatActivity {
    Button bGuada,bCancela,bBorra;
    EditText nombre,descripcion,cantidadMeta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edita_proyecto);

        bGuada= (Button) findViewById(R.id.button4);
        bCancela= (Button) findViewById(R.id.button3);
        bBorra= (Button) findViewById(R.id.button);
        nombre= (EditText) findViewById(R.id.editText);
        descripcion= (EditText) findViewById(R.id.editText2);
        cantidadMeta= (EditText) findViewById(R.id.editText3);

        bCancela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(EditaProyectoActivity.this,MisProyectosActivity.class);
                startActivity(intent);

            }
        });

        bGuada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(EditaProyectoActivity.this,MisProyectosActivity.class);
                startActivity(intent);
            }
        });

        bBorra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(EditaProyectoActivity.this,MisProyectosActivity.class);
                startActivity(intent);
            }
        });


    }
}
