package grupo1.emprendedores.ortocrafia;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Ingreso extends AppCompatActivity {

    String nombre="brayner", pass="brayner";
    EditText name, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        name=(EditText)findViewById(R.id.editText);
        password=(EditText)findViewById(R.id.editText2);
    }

    public void login(View view)
    {
        if(name.getText().toString().equals(nombre)&&password.getText().toString().equals(pass))
        {
            Intent nueva= new Intent(this,MenuPrincipal.class);
            startActivity(nueva);
            finish();
        }
        else
        {
            Toast.makeText(this, "Error los valores ingresados son incorrectos.", Toast.LENGTH_SHORT).show();
        }

    }
    public void registrarse(View view)
    {
        Intent nueva= new Intent(this,Registro.class);
        startActivity(nueva);
        finish();


    }

}
