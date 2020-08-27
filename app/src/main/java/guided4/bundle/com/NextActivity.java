package guided4.bundle.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class NextActivity extends AppCompatActivity {

    public EditText edtNama;
    public EditText edtNIM;
    public EditText edtFakultas;
    public EditText edtProdi;

    public String viewName;
    public String viewNIM;
    public String viewFakultas;
    public String viewProdi;
    public Bundle mBundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        edtNama = (EditText) findViewById(R.id.viewName);
        edtNIM = (EditText) findViewById(R.id.viewNIM);
        edtFakultas = (EditText) findViewById(R.id.viewFakultas) ;
        edtProdi = (EditText) findViewById(R.id.viewProdi);

        getBundle();
        setText();
    }

    public void getBundle(){
        mBundle = getIntent().getBundleExtra("register");

        viewName = mBundle.getString("nama");
        viewNIM = mBundle.getString("nim");
        viewFakultas = mBundle.getString("fakultas");
        viewProdi = mBundle.getString("prodi");
    }

    public void setText(){
        edtNama.setText(viewName);
        edtNIM.setText(viewNIM);
        edtFakultas.setText(viewFakultas);
        edtProdi.setText(viewProdi);
    }
}