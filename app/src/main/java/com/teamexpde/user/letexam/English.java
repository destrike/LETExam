package com.teamexpde.user.letexam;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.*;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.String;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;


public class English extends Activity {
    private TextView Scr, scoreTxt;
    private ButtonClickListener btnClick;
    private int firstItem; //screen before operation
    private String dothis1;
    private Button enterBtn;
    private int level = 0;
    ImageView pics;
    TextView display;
    TextView quiz;
    TextView output;
    final Context context= this;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);



        Scr= (TextView) findViewById(R.id.answer);
        Scr.setEnabled(false);
        scoreTxt = (TextView)findViewById(R.id.scoredip);
        btnClick= new ButtonClickListener();

        pics = (ImageView) findViewById(R.id.pics);
        output = (TextView) findViewById(R.id.output);
        quiz = (TextView) findViewById(R.id.quiz);

        Button A1 =(Button) findViewById(R.id.b0);
        Button A2 =(Button) findViewById(R.id.b1);
        Button A3 =(Button) findViewById(R.id.b2);
        Button A4 =(Button) findViewById(R.id.b3);


        quiz.setText("1. Thone loves to draw different kinds of _____");

        A1.setText("A. butterfly");
        A2.setText("B. butterflies");
        A3.setText("C. butterflys");
        A4.setText("D. butter-flies");

        int idList[]={ R.id.b0, R.id.b1, R.id.b2, R.id.b3, R.id.erase, R.id.submit1,};
        for(int id:idList){ View v= findViewById(id);
            v.setOnClickListener(btnClick);

        }
    }




    public void GoHome(View view) {
        Intent gohome = new Intent (this, MainActivity.class);
        startActivity(gohome);
        finish();
    }



    public void getKeyboard(String str){
        String answerContent= Scr.getText().toString();
        if(answerContent.equals("0")) answerContent="";
        answerContent+= str;
        Scr.setText(answerContent);
    }








    private class ButtonClickListener implements OnClickListener{
        public void onClick(View v){

            switch(v.getId()){
                case R.id.erase: Scr.setText("0");
                    firstItem=0;
                    break;

                /*case R.id.submit1: dothis();
                    break;*/
                case R.id.submit1: dothis();
                    Scr.setText("0");
                    break;
                default: String numb= ((Button) v).getText().toString();
                    getKeyboard(numb);
                    break;

            }

        }

    }

    private void dothis() {
        String answerContent = Scr.getText().toString();
        int n = Integer.parseInt(output.getText().toString());
        output.setText(n + 1 + "");

        int score = Integer.parseInt(scoreTxt.getText().toString());
        scoreTxt.setText(n + 0+"");

        Button A1 =(Button) findViewById(R.id.b0);
        Button A2 =(Button) findViewById(R.id.b1);
        Button A3 =(Button) findViewById(R.id.b2);
        Button A4 =(Button) findViewById(R.id.b3);





        if (n == 0) {
            if (answerContent.equals("B. butterflies")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("2. Our _____ need love and guidance.");

                A1.setText("A. grandparent");
                A2.setText("B. garnd-parent");
                A3.setText("C. grand-parents");
                A4.setText("D. grandparents");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is B. butterflies",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("2. Our _____ need love and guidance.");

                A1.setText("A. grandparent");
                A2.setText("B. garnd-parent");
                A3.setText("C. grand-parents");
                A4.setText("D. grandparents");



                scoreTxt.setText(score+0+"");

            }
        }




        if (n == 1) {
            Button endbutton =(Button) findViewById(R.id.gohome);
            Button e1 =(Button) findViewById(R.id.b0);
            Button e2 =(Button) findViewById(R.id.b1);
            Button e4 =(Button) findViewById(R.id.b2);
            Button e5 =(Button) findViewById(R.id.b3);
            Button e3 =(Button) findViewById(R.id.erase);
            if (answerContent.equals("D. grandparents")){
                scoreTxt.setText(score + 1 + "");

                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();

                endbutton.setEnabled(false);
                e1.setEnabled(false);
                e2.setEnabled(false);
                e4.setEnabled(false);
                e5.setEnabled(false);
                e3.setEnabled(false);


            }else{

                scoreTxt.setText(score + 0 + "");
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is D. grandparents",
                        Toast.LENGTH_SHORT).show();

                endbutton.setEnabled(false);
                e1.setEnabled(false);
                e2.setEnabled(false);
                e4.setEnabled(false);
                e5.setEnabled(false);
                e3.setEnabled(false);







            }
        }

        if (n == 2) {

            scoreTxt.setText(score + 0 + "");

            AlertDialog.Builder alertdialog = new AlertDialog.Builder(context);
            alertdialog.setTitle("  Congratulation!..");
            alertdialog.setMessage("Your Score:    " + score);

            alertdialog.setNeutralButton("Next", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int which) {

                    Intent a = new Intent(context, MainActivity.class);
                    startActivity(a);
                    finish();
                }
            });

            alertdialog.show();

        }

    }












    //save instance state
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        //save score and level

        //superclass method
        super.onSaveInstanceState(savedInstanceState);
    }



}
