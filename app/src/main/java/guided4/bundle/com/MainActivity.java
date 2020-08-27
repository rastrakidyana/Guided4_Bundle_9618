package guided4.bundle.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText edtNama;
    public EditText edtNIM;
    public EditText edtFakultas;
    public EditText edtProdi;
    public Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNama = (EditText) findViewById(R.id.edtNama);
        edtNIM = (EditText) findViewById(R.id.edtNIM);
        edtFakultas = (EditText) findViewById(R.id.edtFakultas);
        edtProdi = (EditText) findViewById(R.id.edtProdi);
        btnRegister = (Button) findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NextActivity.class);
                Bundle mBundle = new Bundle();

                mBundle.putString("nama", edtNama.getText().toString());
                mBundle.putString("nim", edtNIM.getText().toString());
                mBundle.putString("fakultas", edtFakultas.getText().toString());
                mBundle.putString("prodi", edtProdi.getText().toString());

                intent.putExtra("register", mBundle);

                startActivity(intent);

            }
        });
    }
}