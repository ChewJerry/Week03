package sg.edu.rp.c346.id22025566.week03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

//imported classes for use from line 16 to line 21
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //Step 1 - Declare variables
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tBtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //all codes here will be executed
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // declared variables. bind
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tBtn = findViewById(R.id.toggleButton);
        rgGender = findViewById(R.id.radioGroupGender);

        btnDisplay.setOnClickListener(new View.OnClickListener() { //must be inside onCreate()
            @Override
            public void onClick(View v) { // onClick method
                // Code for the action
                String stringResponse = etInput.getText().toString(); // get what user inputed and set it to string.

                int checkedRadioId = rgGender.getCheckedRadioButtonId(); // set to variable int checkedRadioId. returns identifier (selected radio button of radiogroup rgGender)
                if (checkedRadioId == R.id.radioButtonGenderMale){ // if equal to male
                    // Write the code when male selected
                    stringResponse = "He says " + stringResponse;
                    tvDisplay.setText(stringResponse); // display stringResponse. textViewDisplay shows what user enters.

                }
                else{
                    // Write the code when female selected
                    stringResponse = "She says " + stringResponse;
                    tvDisplay.setText(stringResponse);

                }

            }

        });



        tBtn.setOnClickListener(new View.OnClickListener() { // toggle button
            @Override
            public void onClick(View view) {
                // - Add code for the action

                // - get the state of the toggle button
                boolean isChecked = tBtn.isChecked();


                // - when toggle button is unchecked, disable the EditText, editTextInput when the toggle button is unchecked
                if (isChecked) {
                    etInput.setEnabled(true);
                }

               // -	enable it when it is checked
                else {
                    etInput.setEnabled(false);
                }








            }
        });



    }
}