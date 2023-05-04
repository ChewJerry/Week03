package sg.edu.rp.c346.id22025566.week03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Step 1 - Declare variables
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //all codes here will be executed
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);

        btnDisplay.setOnClickListener(new View.OnClickListener() { //must be inside onCreate()
            @Override
            public void onClick(View v) { // onClick method
                // Code for the action
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);



            }
        });


    }
}