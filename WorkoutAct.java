package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class WorkoutAct extends AppCompatActivity {
    ImageView img1;

    int[] layoutArray;

    TextView titlepage, subtitlepage, intropage, subintropage, btnexercise, fitonetitle, fitonedesc, fittwotitle, fittwodesc,
    fitthreetitle, fitthreedesc, fitfourtitle, fitfourdesc, fitfivetitle, fitfivedesc;

    View divpage, bgprogress;

    Animation bttone, bttwo, bttfour, bttfive, bttsix, bttseven, btteight, bttnine, bttten;

    LinearLayout fitone, fittwo, fitthree, fitfour, fitfive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        //Load Animation

        bttone = AnimationUtils.loadAnimation(this,R.anim.bttone);
        bttwo = AnimationUtils.loadAnimation(this,R.anim.bttwo);
        bttfour = AnimationUtils.loadAnimation(this,R.anim.bttfour);
        bttfive = AnimationUtils.loadAnimation(this,R.anim.bttfive);
        bttsix= AnimationUtils.loadAnimation(this,R.anim.bttsix);
        bttseven= AnimationUtils.loadAnimation(this,R.anim.bttseven);
        btteight= AnimationUtils.loadAnimation(this,R.anim.btteight);
        bttnine= AnimationUtils.loadAnimation(this,R.anim.bttnine);
        bttten= AnimationUtils.loadAnimation(this,R.anim.bttten);



        titlepage = (TextView) findViewById(R.id.titlepage);
        subtitlepage = (TextView) findViewById(R.id.subtitlepage);
        intropage = (TextView) findViewById(R.id.intropage);
        subintropage = (TextView) findViewById(R.id.subintropage);
        btnexercise = (TextView) findViewById(R.id.btnexercise);
        fitonetitle = (TextView) findViewById(R.id.fitonetitle);
        fitonedesc = (TextView) findViewById(R.id.fitonedesc);
        fittwotitle = (TextView) findViewById(R.id.fittwotitle);
        fittwodesc = (TextView) findViewById(R.id.fittowdesc);
        fitthreetitle = (TextView) findViewById(R.id.fitthreetitle);
        fitthreedesc = (TextView) findViewById(R.id.fitthreedesc);
        fitfourtitle = (TextView) findViewById(R.id.fitfourtitle);
        fitfourdesc = (TextView) findViewById(R.id.fitfourdesc);
        fitfivetitle = (TextView) findViewById(R.id.fitfivetitle);
        fitfivedesc = (TextView) findViewById(R.id.fitfivedesc);


        fitone = (LinearLayout) findViewById(R.id.fitone);
        fittwo = (LinearLayout) findViewById(R.id.fittwo);
        fitthree= (LinearLayout) findViewById(R.id.fitthree);
        fitfour=(LinearLayout) findViewById(R.id.fitfour);
        fitfive=(LinearLayout) findViewById(R.id.fitfive);


        divpage = (View) findViewById(R.id.subintropage);
        bgprogress = (View) findViewById(R.id.bgprogress);

        //assign the animation
        titlepage.startAnimation(bttone);
        subtitlepage.startAnimation(bttone);
        divpage.startAnimation(bttone);

        intropage.startAnimation(bttwo);
        subintropage.startAnimation(bttwo);

        fitone.startAnimation(bttten);
        fittwo.startAnimation(bttfour);
        fitthree.startAnimation(bttfive);
        fitfour.startAnimation(bttsix);
        fitfive.startAnimation(bttnine);

        btnexercise.startAnimation(btteight);
        bgprogress.startAnimation(bttseven);

        fitonetitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(WorkoutAct.this, ChestActivity.class);
                startActivity(c);
            }
        });


        fittwotitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(WorkoutAct.this, BicepActivity.class);
                startActivity(c);
            }
        });

        fitthreetitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(WorkoutAct.this, ShoulderActivity.class);
                startActivity(c);
            }
        });

        fitfourtitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(WorkoutAct.this, LegsActivity.class);
                startActivity(c);
            }
        });

        fitfivetitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(WorkoutAct.this, AbbsActivity.class);
                startActivity(c);
            }
        });

        btnexercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(WorkoutAct.this, MainActivity.class);
                startActivity(c);
            }
        });


    }
}