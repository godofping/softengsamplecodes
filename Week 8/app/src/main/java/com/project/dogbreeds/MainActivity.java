package com.project.dogbreeds;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements  View.OnClickListener{

    Button activity_main_btn_shih_tzu, activity_main_btn_chihuahua, activity_main_btn_german_shepherd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity_main_btn_shih_tzu = findViewById(R.id.activity_main_btn_shih_tzu);
        activity_main_btn_chihuahua = findViewById(R.id.activity_main_btn_chihuahua);
        activity_main_btn_german_shepherd = findViewById(R.id.activity_main_btn_german_shepherd);

        activity_main_btn_shih_tzu.setOnClickListener(this);
        activity_main_btn_chihuahua.setOnClickListener(this);
        activity_main_btn_german_shepherd.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.activity_main_btn_shih_tzu:

                Intent i = new Intent(MainActivity.this, InformationActivity.class);
                i.putExtra("title","Shih Tzu");
                i.putExtra("information","Shi Tsu (pronounced in the West 'sheed-zoo' or 'sheet-su'; the Chinese say 'sher-zer'), weighing between 9 to 16 pounds, and standing between 8 and 11 inches, are surprisingly solid for dogs their size. The coat, which comes in many colors, is worth the time you will put into it'few dogs are as beautiful as a well-groomed Shih Tzu. Being cute is a way of life for this lively charmer. The Shih Tzu is known to be especially affectionate with children. As a small dog bred to spend most of their day inside royal palaces, they make a great pet if you live in an apartment or lack a big backyard. Some dogs live to dig holes and chase cats, but a Shih Tzu's idea of fun is sitting in your lap acting adorable as you try to watch TV.");
                startActivity(i);
                break;
            case R.id.activity_main_btn_chihuahua:

                Intent i1 = new Intent(MainActivity.this, InformationActivity.class);
                i1.putExtra("title","Chihuahua");
                i1.putExtra("information","The Chihuahua is a balanced, graceful dog of terrier-like demeanor, weighing no more than 6 pounds. The rounded \"apple\" head is a breed hallmark. The erect ears and full, luminous eyes are acutely expressive. Coats come in many colors and patterns, and can be long or short. The varieties are identical except for coat. Chihuahuas possess loyalty, charm, and big-dog attitude. Even tiny dogs require training, and without it this clever scamp will rule your household like a little Napoleon. Compact and confident, Chihuahuas are ideal city pets. They are too small for roughhousing with kids, and special care must be taken in cold weather, but Chihuahuas are adaptable'as long as they get lots of quality time in their preferred lap.");
                startActivity(i1);
                break;
            case R.id.activity_main_btn_german_shepherd:

                Intent i2 = new Intent(MainActivity.this, InformationActivity.class);
                i2.putExtra("title","German Shepherd");
                i2.putExtra("information","German Shepherd Dogs can stand as high as 26 inches at the shoulder and, when viewed in outline, presents a picture of smooth, graceful curves rather than angles. The natural gait is a free-and-easy trot, but they can turn it up a notch or two and reach great speeds. There are many reasons why German Shepherds stand in the front rank of canine royalty, but experts say their defining attribute is character: loyalty, courage, confidence, the ability to learn commands for many tasks, and the willingness to put their life on the line in defense of loved ones. German Shepherds will be gentle family pets and steadfast guardians, but, the breed standard says, there's a 'certain aloofness that does not lend itself to immediate and indiscriminate friendships.'");
                startActivity(i2);
                break;
            default:
                break;
        }
    }
}