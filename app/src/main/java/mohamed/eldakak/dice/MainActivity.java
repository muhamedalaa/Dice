package mohamed.eldakak.dice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button roll =(Button)findViewById(R.id.roll);
        final ImageView left_Dice =(ImageView)findViewById(R.id.image_left);
        final ImageView right_dice=(ImageView)findViewById(R.id.image_right);

       final int array_num []={R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random Random_number =  new Random();
                int number =Random_number.nextInt(6);
                Log.d("dice","the button is click :"+ number);
                left_Dice.setImageResource(array_num[number]);
                number =Random_number.nextInt(6);
                right_dice.setImageResource(array_num[number]);

            }
        });


    }
}
