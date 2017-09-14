package com.skarora.didyouknow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declaring view variables and fields (Can be thought of global variables)
    private FactBook mFactBook = new FactBook();
    private Colorwheel mColor = new Colorwheel();
    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign the views from the layout files to corresponding variables
        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mShowFactButton = (Button) findViewById(R.id.showFactButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

       View.OnClickListener listener = new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String fact = mFactBook.getFact();
               int color = mColor.getColor();
               //update the screen with dynamic fact
               mFactTextView.setText(fact);
               mRelativeLayout.setBackgroundColor(color);
               mShowFactButton.setTextColor(color);
           }
       };

       mShowFactButton.setOnClickListener(listener);

        Toast.makeText(MainActivity.this, "My Fun Fact App", Toast.LENGTH_LONG).show();
    }
}

