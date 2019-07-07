import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.ResourceBundle;
public class ReceiverActivity extends AppCompatActivity {
    private static final android.R.attr R = ;
    TextView tvName;
    TextView tvAge;
    String names;
    String ages;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tvName = findViewById(R.id.tvName);
        tvAge = findViewById(android.R.attr.id.tvAge);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("etName");
            String age = extras.getString("etAge");
            tvName.setText(name);
            tvAge.setText(age);
        }
    }
}
