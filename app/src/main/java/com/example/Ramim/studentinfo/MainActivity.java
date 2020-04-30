package com.example.Ramim.studentinfo;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.muddzdev.styleabletoastlibrary.StyleableToast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView Scheduler, cardNotes, cardCgpa, cardrating;
    private static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        //action bar hide

        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        //find the button
        Scheduler = findViewById(R.id.cardScheduler);
        cardNotes = findViewById(R.id.cardNotes);
        cardCgpa = findViewById(R.id.cardCgpa);
        cardrating = findViewById(R.id.cardrating);




        Scheduler.setOnClickListener(this);
        cardNotes.setOnClickListener(this);
        cardCgpa.setOnClickListener(this);
        cardrating.setOnClickListener(this);


        MainActivity.context = getApplicationContext();
    }



    public static Context getAppContext() {
        return MainActivity.context;
    }

    public static int getPx(Context context, int dimensionDp) {
        float density = context.getResources().getDisplayMetrics().density;
        return (int) (dimensionDp * density + 0.5f);
    }




    //intent the button
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cardScheduler:
                startActivity(new Intent(this, SchedulerActivity.class));

                StyleableToast.makeText(this,"Scheduler Button Is Click !",R.style.exampleToast).show();

                break;

            case R.id.cardNotes:
                startActivity(new Intent(this, NotesActivity.class));
                StyleableToast.makeText(this,"Notes Button Is Click !",R.style.exampleToast2).show();
                break;

            case R.id.cardCgpa:
                startActivity(new Intent(this, CgpaActivity.class));
                StyleableToast.makeText(this,"Cgpa Button Is Click !",R.style.exampleToast1).show();
                break;

            case R.id.cardrating:
                startActivity(new Intent(this, feedback.class));
                StyleableToast.makeText(this,"feedback Button Is Click !",R.style.exampleToast1).show();
                break;

        }

    }

}


