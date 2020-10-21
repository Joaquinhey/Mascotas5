package com.example.mascotas.Menus;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mascotas.R;
import com.google.android.material.textfield.TextInputEditText;

//import javax.mail.Session;

public class ActivityMascota extends AppCompatActivity {

    private TextInputEditText Cajanombre;
    private TextInputEditText Cajamail;
    private TextInputEditText Cajadescripcion;
    //Session session;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
        Button boton1     =  (Button) findViewById(R.id.button);
        Cajanombre       =  findViewById(R.id.textonombre);
        Cajamail         =  findViewById(R.id.textocorreo);
        Cajadescripcion  =  findViewById(R.id.textodescripcion);

        boton1.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                sendMail();

            }
        });

    }
    private void sendMail() {

        String subject = "Mascotas" ;
        String mail = Cajamail.getText().toString();
        String descripcion = Cajadescripcion.getText().toString().trim();

        //Send Mail
        //JavaMailAPI javaMailAPI = new JavaMailAPI(this,mail,subject,descripcion);
        //javaMailAPI.execute();

    }
}

