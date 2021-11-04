package com.example.tp_sayhi;

import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);

        Button heyButton = findViewById(R.id.buttonSayHi);
      final  TextView textViewDisplay = findViewById(R.id.textViewDisplay);
      final  EditText editTextName = findViewById(R.id.editTextName);


        heyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editTextName.getText().toString();

                if(name.isEmpty())
                    textViewDisplay.setText("Pleaze provide a name ");
                else
                textViewDisplay.setText("hello"+ name);
                editTextName.setText("");
            }

        });

    }
}
