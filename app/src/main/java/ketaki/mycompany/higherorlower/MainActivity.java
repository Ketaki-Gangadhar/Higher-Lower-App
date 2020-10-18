package ketaki.mycompany.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomnumber;
    public void guess(View view)
    {
        EditText editText = (EditText) findViewById(R.id.editText);

        int guessvalue = Integer.parseInt(editText.getText().toString());
        String message;
        if(guessvalue > randomnumber)
        {
            message = "Higher!";
        }
        else if(guessvalue<randomnumber)
        {
            message = "Lower!";
        }
        else
        {
            message = "You got it !";
            Random rand = new Random();
            randomnumber = rand.nextInt(20)+1;
        }
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
        Log.i(" Entered number", editText.getText().toString());

        Log.i("Random number",Integer.toString(randomnumber));

    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
         randomnumber = rand.nextInt(20)+1;

    }
}
