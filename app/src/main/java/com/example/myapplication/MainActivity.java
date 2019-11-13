package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.provider.Settings;
import android.view.View;

public class MainActivity extends AppCompatActivity {
private Button btnProducts;
private Button btnAboutUs;

    @Override

        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            btnProducts=(Button)findViewById(R.id.btnEnter);
            btnAboutus=(Button)findViewById(R.id.btnAboutUs);
            btnProducts.setOnClicklistener(new View.OnClickListener(){
                public void onClick(View v){
                    log.i(Settings.INFO, "Products");
                    Inten i=new Intent(MainActivity.this,ProductListAtivity.class);
                    startActivity(i);

                }

            });
            btnAboutUs.setOnClicklistener(new View.OnClickListener(){
                public void onClick(View v){
                    log.i(Settings.INFO, "Abouts us");
                    Inten i=new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);


                }


            });


        }

    }
    @Override
    protected void onResume(){
        super.onResume(); //este codigo se ejecuta antes de todos
//en este punto la aplicaion ya cargó.
//this en un activity: es la esencia de un activity (de una pantalla)
//this es de tipo contexto
        Toast.makeText(this,
                "Aplicacion Stopeada",
                Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this,
                "Aplicacion Stopeada",
                Toast.LENGTH_LONG).show();
    }
}

