package cat.itb.testingpresso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText etUser, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        etUser = findViewById(R.id.et1);
        etPassword = findViewById(R.id.et2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // button.setText("Logged");
                Intent i = new Intent(MainActivity.this, WelcomeActivity.class);
                i.putExtra("username", etUser.getText().toString());
                etUser.getText().clear();
                etPassword.getText().clear();
                startActivity(i);
            }
        });
    }
}