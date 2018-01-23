package example.codeclan.com.wordcounterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {

    Button countButton;
    TextView countResult;
    EditText userInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);
        countButton = findViewById(R.id.countButton);
        countResult = findViewById(R.id.countResult);
        userInput = findViewById((R.id.userInput));
    }

    public void presentCount(View view) {
        WordCount counter = new WordCount();
        int count = counter.getWordCount(userInput.getText().toString());
        String countAsString = Integer.toString(count);
        countResult.setText(countAsString);
    }
}
