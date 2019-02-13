package alfonsoverduzco.a6im7.ipn.log;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OkActivity extends AppCompatActivity {

    TextView hola;
    String usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ok);

        hola = (TextView) findViewById(R.id.hola);

        Bundle recibe = new Bundle();
        recibe = this.getIntent().getExtras();

        usuario = recibe.getString("usuario");
        hola.setText("Hola " + usuario);
    }

    public void amonos(View v){
        Intent envia = new Intent(this, MainActivity.class);
        finish();
        startActivity(envia);
    }
}
