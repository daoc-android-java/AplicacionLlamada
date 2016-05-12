package dordonez.aplicacionllamada;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class CalledActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	    Intent intent = getIntent();
	    String recibido = intent.getStringExtra("nombre");
	    
	    Intent resultado = new Intent();
	    resultado.putExtra("saludo", "Hola " + recibido);
	    setResult(Activity.RESULT_OK, resultado);
	    finish();
	}


}
