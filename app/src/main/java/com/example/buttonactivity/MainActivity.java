package com.example.buttonactivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button button;
    ArrayList<String> quote;

    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = this.getWindow() .getDecorView(); //sets background color
        view.setBackgroundColor(Color.parseColor("#e7eecc"));
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });


        int random = (int)(Math.random() * 10); //random number generator from 0 to 9;

        quote = new ArrayList<>(); //list of quotes

        quote.add("What would you attempt to do if you knew you could not fail?"); // 0
        quote.add("The grass is greener where you water it."); // 1
        quote.add("Wherever life plants you, bloom with grace."); // 2
        quote.add("We may encounter many defeats but we must never be defeated."); // 3
        quote.add("Good, better, best. Never let it rest. 'Till your good is better and your better is best."); // 4
        quote.add("It always seems impossible until it's done."); // 5
        quote.add("Never regret a day in your life. Good days give you happiness and bad days give you experience."); // 6
        quote.add("Life is like riding a bicycle. To keep your balance, you must keep moving forward."); // 7
        quote.add("Pearls don't lie on the sea shore. If you want one, you must dive for it."); // 8
        quote.add("Hope is the only thing stronger than fear."); // 9
    }

    private void openActivity3() { //history button
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }

    public void openActivity2(){ //submit button
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }


}
