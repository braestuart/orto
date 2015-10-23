package grupo1.emprendedores.ortocrafia;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Examenes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examenes);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menuP:
                //metodoAdd()
                Intent nuevo1= new Intent(this,MenuPrincipal.class);
                startActivity(nuevo1);
                finish();
                return true;
            case R.id.menuJ:
                //metodoAdd()
                Intent nuevo2= new Intent(this,MenuEjercicios.class);
                startActivity(nuevo2);
                finish();
                return true;
            case R.id.opciones:
                //metodoAdd()
                Toast.makeText(this, "Se presionó Añadir", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.estadisticas:
                //metodoAdd()
                Toast.makeText(this, "Se presionó Añadir", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.salir:
                //metodoAdd()
                Intent nuevo5= new Intent(this,Ingreso.class);
                startActivity(nuevo5);
                finish();
                return true;
            case R.id.cerrar:
                //metodoAdd()
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

}
