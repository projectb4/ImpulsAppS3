package b4project.impulsapp;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MisProyectosActivity extends AppCompatActivity {
    private ArrayList<String> Coleccion;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projectsofmine);


        Coleccion=new ArrayList<String>();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


               Coleccion=new ArrayList<>();
                Coleccion.add("vale");
        final ListView mList2= (ListView) findViewById(R.id.projectsList);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Coleccion);
        mList2.setAdapter(adapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MisProyectosActivity.this,NuevoProyectoActivity.class); //Llama a la activity Projects of Mine
                startActivity(intent);
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
            }
        });



        mList2.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                abre_dialogo(view);
                int item = position;
                String itemval = (String)mList2.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "Position: "+ item+" - Valor: "+itemval, Toast.LENGTH_LONG).show();
            }
        });


    }

public void abre_dialogo (View v){

    AlertDialog.Builder builder = new AlertDialog.Builder(this);
    builder.setTitle(R.string.selec).setItems(R.array.opciones, new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            if(which==0){
                    Intent intent=new Intent(MisProyectosActivity.this,VistaProyectoActivity.class); //Llama a la activity Ver Proyecto
                    startActivity(intent);
            }

            if(which==1){
                Intent intent=new Intent(MisProyectosActivity.this,EditaProyectoActivity.class); //Llama a la activity Edita Proyecto
                startActivity(intent);
            }

            if(which==2){
                Intent intent=new Intent(MisProyectosActivity.this,OkDonacionActivity.class); //Llama a la activity Dona Proyecto
                startActivity(intent);
            }
        }

    });
    Dialog dialog = builder.create();
    dialog.show();
}

}
