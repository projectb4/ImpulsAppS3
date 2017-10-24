package b4project.impulsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class VistaProyectoActivity extends AppCompatActivity {
    Button bDona;
    EditText textTitulo,textDescripcion,textCantidadMeta,textCantidadDonada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_proyecto);

        bDona= (Button) findViewById(R.id.button7);
        textTitulo= (EditText) findViewById(R.id.editText6);
        textDescripcion= (EditText) findViewById(R.id.editText7);
        textCantidadMeta= (EditText) findViewById(R.id.editText8);
        textCantidadDonada= (EditText) findViewById(R.id.editText9);

        textTitulo.setEnabled(false);
        textDescripcion.setEnabled(false);
        textCantidadMeta.setEnabled(false);
        textCantidadDonada.setEnabled(false);

        bDona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(VistaProyectoActivity.this,OkDonacionActivity.class);
                startActivity(intent);

            }

        });


    }
}
