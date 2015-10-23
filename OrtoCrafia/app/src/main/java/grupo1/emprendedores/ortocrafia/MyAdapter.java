package grupo1.emprendedores.ortocrafia;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Bray on 21/10/2015.
 */


public class MyAdapter extends BaseAdapter {
    private Activity activity;
    private static ArrayList<Node> mArray;
    private Context mContext;
    public MyAdapter (Context c){mContext = c;}
    Context Contexto;
    public void setArray(ArrayList<Node> arrayN)
    {
        mArray=arrayN;
    }
    public MyAdapter(Activity actividad,ArrayList<Node> arrayN, Context contexto)
    {
        super();
        this.activity=actividad;
        this.Contexto=contexto;
        mArray=new ArrayList<Node>(arrayN);
    }
    public int getCount() {
// TODO Auto-generated method stub
        return mArray.size();
    }
    public Object getItem(int position) {
// TODO Auto-generated method stub
        return mArray.get(position);
    }
    public long getItemId(int position) {
// TODO Auto-generated method stub
        return 0;
    }
    public static class Fila
    {
        TextView nameEj;
        Button ejercicioB;
        Button  ExamenB;
        CheckBox terminado;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
// TODO Auto-generated method stub
        //View view = null;
        Fila view = new Fila();
        LayoutInflater inflator = activity.getLayoutInflater();
        Node itm = mArray.get(position);
        if (convertView == null){
            convertView = inflator.inflate(R.layout.content_menu_ejercicios, parent, false);
            view.nameEj = (TextView) convertView.findViewById(R.id.Nombre);
            view.ejercicioB = (Button) convertView.findViewById(R.id.BotonEjercicio);
            view.ExamenB = (Button) convertView.findViewById(R.id.BotonExamen);
            view.terminado=(CheckBox)convertView.findViewById(R.id.EjercicioRealizado);
            convertView.setTag(view);
        }else{
            view = (Fila)convertView.getTag();
        }

        view.nameEj.setText(itm.NombreEjercicio);
        view.ejercicioB.setText(itm.BotonEJ);
        view.ejercicioB.setOnClickListener(new View.OnClickListener() {
            //Implementar el método onClick para este objeto OnClickListener
            public void onClick(View v) {
                //Escribir aquí el código a ejecutar al pulsar el botón
                Intent nuevo = new Intent().setClass(Contexto, Ejercicios.class);
                activity.startActivity(nuevo);

            }
        });
        view.ExamenB.setText(itm.BotonEX);
        view.ExamenB.setOnClickListener(new View.OnClickListener() {
            //Implementar el método onClick para este objeto OnClickListener
            public void onClick(View v) {
                //Escribir aquí el código a ejecutar al pulsar el botón
                Intent nuevo = new Intent().setClass(Contexto, Examenes.class);
                activity.startActivity(nuevo);

            }
        });
        view.terminado.setSelected(itm.realizado);

        // Retornamos la vista
        return convertView;
    }
}
