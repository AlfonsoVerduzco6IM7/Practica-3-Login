package alfonsoverduzco.a6im7.ipn.log;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText password,usuario;
    String contra, use;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = (EditText) findViewById(R.id.usuario);
        password = (EditText) findViewById(R.id.password);
    }

    public void reserva(View v) {
         use = usuario.getText().toString().trim();
         contra = password.getText().toString().trim();

         if(use.equals("Veta") && contra.equals("123")) {
             amonos(v);
         }
            else{
             Toast toast1 = Toast.makeText(getApplicationContext(), "Usuario o Password incorrectos", Toast.LENGTH_LONG);
             toast1.setGravity(Gravity.CENTER, 0,0);
             toast1.show();
         }
    }

    public void amonos(View v){
        Intent envia = new Intent(this, OkActivity.class);
        Bundle datos = new Bundle();
        datos.putString("usuario", usuario.getText().toString().trim());
        envia.putExtras(datos);
        finish();
        startActivity(envia);
    }

}
