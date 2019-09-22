package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ProfileBundleActivity extends AppCompatActivity {
    private TextView usernameInput;
    private TextView nameInput;
    private TextView ageInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);

        // TODO: bind here
        usernameInput = findViewById(R.id.input_username);
        nameInput = findViewById(R.id.input_name);
        ageInput = findViewById(R.id.input_age);

        Bundle extras = getIntent().getExtras();
        String username = extras.getString(BundleActivity.USERNAME_KEY);
        String name = extras.getString(BundleActivity.NAME_KEY);
        String age = extras.getString(BundleActivity.AGE_KEY);
        if (extras != null) {
            // TODO: display value here
            usernameInput.setText(username);
            nameInput.setText(name);
            ageInput.setText(age);
        }
    }
}
