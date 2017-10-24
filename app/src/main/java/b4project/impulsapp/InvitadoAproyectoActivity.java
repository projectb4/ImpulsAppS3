package b4project.impulsapp;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class InvitadoAproyectoActivity extends AppCompatActivity {
    private ArrayList<String> Coleccion;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invitado_aproyecto);

        Coleccion=new ArrayList<String>();
        Coleccion=new ArrayList<>();
        Coleccion.add("Gatitos");

        final ListView mList2= (ListView) findViewById(R.id.invitadoAproyecto);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Coleccion);
        mList2.setAdapter(adapter);

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
        builder.setTitle(R.string.selec).setItems(R.array.opciones1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if(which==0){
                    Intent intent=new Intent(InvitadoAproyectoActivity.this,VistaProyectoActivity.class); //Llama a la activity Ver Proyecto
                    startActivity(intent);
                }

                if(which==1){
                    Intent intent=new Intent(InvitadoAproyectoActivity.this,OkDonacionActivity.class); //Llama a la activity Dona Proyecto
                    startActivity(intent);
                }

            }

        });
        Dialog dialog = builder.create();
        dialog.show();
        }
    }
