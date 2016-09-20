package com.example.vale.subactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //intent explícito, para estar seuguro de que se ejecuta la (sub)actividad que yo quiero
        //y no se produce un match aleatorio

        Intent i = new Intent(this, com.example.vale.subactivities.SubActividad.class);

        startActivityForResult(i, 237); //237 es un número para etiquetar la petición
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //en principio no es obligatorio invocar a la implementación del padre
        //según la documentación, salvo que estemos empleadon el subtipo de Actividad
        //FragmentActivity
        //super.onActivityResult(requestCode, resultCode, data);

        /**
         * Recupero y muestro
         */

        Log.d(getClass().getCanonicalName(), "Código de resultado devueto = " + resultCode);

        String cadena_nombre_resultado = data.getStringExtra("NOMBRE");

        Log.d(getClass().getCanonicalName(), "Nombre resultado devuelto = " + cadena_nombre_resultado);

        Log.d(getClass().getCanonicalName(), "Código de petición = " + requestCode);



    }
}
