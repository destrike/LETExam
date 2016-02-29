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

        A1.setText("butterfly");
        A2.setText("butterflies");
        A3.setText("butterflys");
        A4.setText("butter-flies");

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
            if (answerContent.equals("butterflies")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("2. Our _____ need love and guidance.");

                A1.setText("grandparent");
                A2.setText("garnd-parent");
                A3.setText("grand-parents");
                A4.setText("grandparents");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is butterflies",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("2. Our _____ need love and guidance.");

                A1.setText("grandparent");
                A2.setText("garnd-parent");
                A3.setText("grand-parents");
                A4.setText("grandparents");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 1) {
            if (answerContent.equals("grandparents")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("3. I love eating _____");

                A1.setText("strawberries");
                A2.setText("strawberrys");
                A3.setText("straw-berry");
                A4.setText("straw-berries");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is grandparents",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("3. I love eating _____");

                A1.setText("strawberries");
                A2.setText("strawberrys");
                A3.setText("straw-berry");
                A4.setText("straw-berries");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 2) {
            if (answerContent.equals("strawberries")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("4. Mathematics _____ a child a chance to think well.");

                A1.setText("give");
                A2.setText("gave");
                A3.setText("gives");
                A4.setText("giving");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is strawberries",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("4. Mathematics _____ a child a chance to think well.");

                A1.setText("give");
                A2.setText("gave");
                A3.setText("gives");
                A4.setText("giving");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 3) {
            if (answerContent.equals("gives")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("5. Athletics _____ good for everyone's health");

                A1.setText("is");
                A2.setText("was");
                A3.setText("am");
                A4.setText("are");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is gives",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("5. Athletics _____ good for everyone's health");

                A1.setText("is");
                A2.setText("was");
                A3.setText("am");
                A4.setText("are");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 4) {
            if (answerContent.equals("is")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("6.Billiards _____ become a popular game among filipinos.");

                A1.setText("had");
                A2.setText("have");
                A3.setText("has");
                A4.setText("having");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is is",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("6.Billiards _____ become a popular game among filipinos.");

                A1.setText("had");
                A2.setText("have");
                A3.setText("has");
                A4.setText("having");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 5) {
            if (answerContent.equals("has")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("7. Physics _____ best subject");

                A1.setText("is");
                A2.setText("are");
                A3.setText("was");
                A4.setText("were");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is has",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("7. Physics _____ best subject");

                A1.setText("is");
                A2.setText("are");
                A3.setText("was");
                A4.setText("were");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 6) {
            if (answerContent.equals("is")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("8. Tonsilitis _____ swelling of the throat.");

                A1.setText("cause");
                A2.setText("causes");
                A3.setText("caysed");
                A4.setText("caused");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is is",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("8. Tonsilitis _____ swelling of the throat.");

                A1.setText("cause");
                A2.setText("causes");
                A3.setText("caysed");
                A4.setText("caused");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 7) {
            if (answerContent.equals("causes")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("Measles _____ all over the body.");

                A1.setText("spreads");
                A2.setText("spread");
                A3.setText("spreading");
                A4.setText("none of the above");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is causes",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("Measles _____ all over the body.");

                A1.setText("spreads");
                A2.setText("spread");
                A3.setText("spreading");
                A4.setText("none of the above");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 8) {
            if (answerContent.equals("spreads")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("10. The Philippines _____ beautiful historical places and tourists spots.");

                A1.setText("has");
                A2.setText("have");
                A3.setText("had");
                A4.setText("was");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is spreads",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("10. The Philippines _____ beautiful historical places and tourists spots.");

                A1.setText("has");
                A2.setText("have");
                A3.setText("had");
                A4.setText("was");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 9) {
            if (answerContent.equals("has")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("11. Tuberculosis _____ one of the effects of excessive cigarettes smoking.");

                A1.setText("is");
                A2.setText("are");
                A3.setText("was");
                A4.setText("were");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is has",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("11. Tuberculosis _____ one of the effects of excessive cigarettes smoking.");

                A1.setText("is");
                A2.setText("are");
                A3.setText("was");
                A4.setText("were");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 10) {
            if (answerContent.equals("is")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("12. Concern with the affairs of the government.");

                A1.setText("news");
                A2.setText("politics");
                A3.setText("mumps");
                A4.setText("measies");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is is",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("12. Concern with the affairs of the government.");

                A1.setText("news");
                A2.setText("politics");
                A3.setText("mumps");
                A4.setText("measies");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 11) {
            if (answerContent.equals("politics")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("13. The art of performing an activity with body contortions");

                A1.setText("acrobatics");
                A2.setText("yoga");
                A3.setText("martial arts");
                A4.setText("karate");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is politics",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("13. The art of performing an activity with body contortions");

                A1.setText("acrobatics");
                A2.setText("yoga");
                A3.setText("martial arts");
                A4.setText("karate");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 12) {
            if (answerContent.equals("acrobatics")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("14. Daily happening heard over the radio and television.");

                A1.setText("politics");
                A2.setText("adds");
                A3.setText("news");
                A4.setText("commercial");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is acrobatics",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("14. Daily happening heard over the radio and television.");

                A1.setText("politics");
                A2.setText("adds");
                A3.setText("news");
                A4.setText("commercial");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 13) {
            if (answerContent.equals("news")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("15. An acute contagious disease marked by fever and by the swelling at the side of the face near the ear.");

                A1.setText("mumps");
                A2.setText("messeales");
                A3.setText("measies");
                A4.setText("virus");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is news",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("15. An acute contagious disease marked by fever and by the swelling at the side of the face near the ear.");

                A1.setText("mumps");
                A2.setText("messeales");
                A3.setText("measies");
                A4.setText("virus");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 14) {
            if (answerContent.equals("mumps")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("16. ..Baking.. delicious pastries is her favorite past time.");

                A1.setText("subject");
                A2.setText("direct object");
                A3.setText("object of the preposition");
                A4.setText("none of the above");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is mumps",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("16. ..Baking.. delicious pastries is her favorite past time.");

                A1.setText("subject");
                A2.setText("direct object");
                A3.setText("object of the preposition");
                A4.setText("none of the above");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 15) {
            if (answerContent.equals("subject")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("17. The preacher talks about ..praying.. without ceasing");

                A1.setText("subject");
                A2.setText("direct object");
                A3.setText("object of the preposition");
                A4.setText("none of the above");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is subject",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("17. The preacher talks about ..praying.. without ceasing");

                A1.setText("subject");
                A2.setText("direct object");
                A3.setText("object of the preposition");
                A4.setText("none of the above");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 16) {
            if (answerContent.equals("object of the preposition")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("18. I certainly love ..eating.. different kinds of chocolates.");

                A1.setText("subject");
                A2.setText("direct object");
                A3.setText("object of the preposition");
                A4.setText("none of the above");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is object of the preposition",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("18. I certainly love ..eating.. different kinds of chocolates.");

                A1.setText("subject");
                A2.setText("direct object");
                A3.setText("object of the preposition");
                A4.setText("none of the above");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 17) {
            if (answerContent.equals("direct object")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("19. My mother never considered ..cooking.. a tedious task.");

                A1.setText("subject");
                A2.setText("direct object");
                A3.setText("object of the preposition");
                A4.setText("none of the above");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is direct object",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("19. My mother never considered ..cooking.. a tedious task.");

                A1.setText("subject");
                A2.setText("direct object");
                A3.setText("object of the preposition");
                A4.setText("none of the above");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 18) {
            if (answerContent.equals("object of the preposition")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("20. ..Playing.. computer games doesn't help students to learn.");

                A1.setText("subject");
                A2.setText("direct object");
                A3.setText("object of the preposition");
                A4.setText("none of the above");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is object of the preposition",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("20. ..Playing.. computer games doesn't help students to learn.");

                A1.setText("subject");
                A2.setText("direct object");
                A3.setText("object of the preposition");
                A4.setText("none of the above");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 19) {
            if (answerContent.equals("subject")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("21. He congratulated his friend for ..winning.. first place in Quiz Bee.");

                A1.setText("subject");
                A2.setText("direct object");
                A3.setText("object of the preposition");
                A4.setText("none of the above");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is subject",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("21. He congratulated his friend for ..winning.. first place in Quiz Bee.");

                A1.setText("subject");
                A2.setText("direct object");
                A3.setText("object of the preposition");
                A4.setText("none of the above");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 20) {
            if (answerContent.equals("object of the preposition")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("22. ..Repair.. the bridges is the priority of the Department of Public Works and Highway after the strong typhoon.");

                A1.setText("subject");
                A2.setText("direct object");
                A3.setText("object of the preposition");
                A4.setText("none of the above");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is object of the preposition",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("22. ..Repair.. the bridges is the priority of the Department of Public Works and Highway after the strong typhoon.");

                A1.setText("subject");
                A2.setText("direct object");
                A3.setText("object of the preposition");
                A4.setText("none of the above");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 21) {
            if (answerContent.equals("subject")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("23. The Department of Health provides ..outstand.. health service for the filipino people.");

                A1.setText("subject");
                A2.setText("direct object");
                A3.setText("object of the preposition");
                A4.setText("none of the above");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is subject",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("23. The Department of Health provides ..outstand.. health service for the filipino people.");

                A1.setText("subject");
                A2.setText("direct object");
                A3.setText("object of the preposition");
                A4.setText("none of the above");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 22) {
            if (answerContent.equals("direct object")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("24. ..Educate.. an individual gives him a good future.");

                A1.setText("subject");
                A2.setText("direct object");
                A3.setText("object of the preposition");
                A4.setText("none of the above");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is direct object",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("24. ..Educate.. an individual gives him a good future.");

                A1.setText("subject");
                A2.setText("direct object");
                A3.setText("object of the preposition");
                A4.setText("none of the above");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 23) {
            if (answerContent.equals("subject")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("25. The Department of Tourism considers ..promote.. the Philippine products in Europe a big success.");

                A1.setText("subject");
                A2.setText("direct object");
                A3.setText("object of the preposition");
                A4.setText("none of the above");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is subject",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("25. The Department of Tourism considers ..promote.. the Philippine products in Europe a big success.");

                A1.setText("subject");
                A2.setText("direct object");
                A3.setText("object of the preposition");
                A4.setText("none of the above");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 24) {
            if (answerContent.equals("object of the preposition")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("26. The (policeman) _____ are the safety of everybody.");

                A1.setText("pulisman");
                A2.setText("policeman");
                A3.setText("policemen");
                A4.setText("none of the above");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is object of the preposition",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("26. The (policeman) _____ are the safety of everybody.");

                A1.setText("pulisman");
                A2.setText("policeman");
                A3.setText("policemen");
                A4.setText("none of the above");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 25) {
            if (answerContent.equals("policemen")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("27. People need (life jacket) _____ espicially when riding a boat.");

                A1.setText("lives jacket");
                A2.setText("lifes jacket");
                A3.setText("life jackets");
                A4.setText("none of the above");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is policemen",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("27. People need (life jacket) _____ espicially when riding a boat.");

                A1.setText("lives jacket");
                A2.setText("lifes jacket");
                A3.setText("life jackets");
                A4.setText("none of the above");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 26) {
            if (answerContent.equals("life jackets")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("28. Nowadays, people use (cellular phone) _____ for communication.");

                A1.setText("cellulars phone");
                A2.setText("cellulars phones");
                A3.setText("cellular phones");
                A4.setText("none of the above");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is life jackets",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("28. Nowadays, people use (cellular phone) _____ for communication.");

                A1.setText("cellulars phone");
                A2.setText("cellulars phones");
                A3.setText("cellular phones");
                A4.setText("none of the above");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 27) {
            if (answerContent.equals("cellular phones")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("29. The (maid-of-honor) _____ are ready for the rehearsal");

                A1.setText("maids-of-honor");
                A2.setText("maids of honor");
                A3.setText("maid of honor");
                A4.setText("none of the above");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is cellular phones",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("29. The (maid-of-honor) _____ are ready for the rehearsal");

                A1.setText("maids-of-honor");
                A2.setText("maids of honor");
                A3.setText("maid of honor");
                A4.setText("none of the above");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 28) {
            if (answerContent.equals("maids of honor")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("30. No one _____ the motion. Everyone voted for it. So…..");

                A1.setText("objects");
                A2.setText("object");
                A3.setText("objected");
                A4.setText("none of the above");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is maids of honor",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("30. No one _____ the motion. Everyone voted for it. So…..");

                A1.setText("objects");
                A2.setText("object");
                A3.setText("objected");
                A4.setText("none of the above");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 29) {
            if (answerContent.equals("objected")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("31. Mariel and Venna were the _____ for the secretary");

                A1.setText("nominee");
                A2.setText("nomineed");
                A3.setText("nominees");
                A4.setText("none of the above");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is objected",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("31. Mariel and Venna were the _____ for the secretary");

                A1.setText("nominee");
                A2.setText("nomineed");
                A3.setText("nominees");
                A4.setText("none of the above");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 30) {
            if (answerContent.equals("nominees")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("32. Its _____ peak seasons when thieves roam to find victims in  crowded places.");

                A1.setText("across");
                A2.setText("before");
                A3.setText("during");
                A4.setText("through");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is nominees",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("32. Its _____ peak seasons when thieves roam to find victims in  crowded places.");

                A1.setText("across");
                A2.setText("before");
                A3.setText("during");
                A4.setText("through");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 31) {
            if (answerContent.equals("during")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("33. Police officers must have gone _____ rigorous trainings before they are sent to capture bad elements.");

                A1.setText("across");
                A2.setText("before");
                A3.setText("during");
                A4.setText("through");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is during",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("33. Police officers must have gone _____ rigorous trainings before they are sent to capture bad elements.");

                A1.setText("across");
                A2.setText("before");
                A3.setText("during");
                A4.setText("through");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 32) {
            if (answerContent.equals("through")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("34. It is not safe to run _____ the streets espicially along busy roads.");

                A1.setText("across");
                A2.setText("before");
                A3.setText("during");
                A4.setText("through");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is through",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("34. It is not safe to run _____ the streets espicially along busy roads.");

                A1.setText("across");
                A2.setText("before");
                A3.setText("during");
                A4.setText("through");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 33) {
            if (answerContent.equals("across")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("35. Cedric became proud when he was chosen as the valuable basketbal player.");

                A1.setText("simple sentence");
                A2.setText("compound sentence");
                A3.setText("complex sentence");
                A4.setText("none of the above");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is across",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("35. Cedric became proud when he was chosen as the valuable basketbal player.");

                A1.setText("simple sentence");
                A2.setText("compound sentence");
                A3.setText("complex sentence");
                A4.setText("none of the above");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 34) {
            if (answerContent.equals("complex sentence")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("36. He is an active and cheerful boy.");

                A1.setText("simple sentence");
                A2.setText("compound sentence");
                A3.setText("complex sentence");
                A4.setText("none of the above");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is complex sentence",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("36. He is an active and cheerful boy.");

                A1.setText("simple sentence");
                A2.setText("compound sentence");
                A3.setText("complex sentence");
                A4.setText("none of the above");



                scoreTxt.setText(score+0+"");

            }
        }




        if (n == 9) {
            Button endbutton =(Button) findViewById(R.id.gohome);
            Button e1 =(Button) findViewById(R.id.b0);
            Button e2 =(Button) findViewById(R.id.b1);
            Button e4 =(Button) findViewById(R.id.b2);
            Button e5 =(Button) findViewById(R.id.b3);
            Button e3 =(Button) findViewById(R.id.erase);
            if (answerContent.equals("have")){
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
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is have",
                        Toast.LENGTH_SHORT).show();

                endbutton.setEnabled(false);
                e1.setEnabled(false);
                e2.setEnabled(false);
                e4.setEnabled(false);
                e5.setEnabled(false);
                e3.setEnabled(false);







            }
        }

        if (n == 10) {

            scoreTxt.setText(score + 0 + "");

            AlertDialog.Builder alertdialog = new AlertDialog.Builder(context);
            alertdialog.setTitle("  Congratulation! You Did It!!");
            alertdialog.setMessage("Your Score:    " + score);

            alertdialog.setNeutralButton("Return to Menu", new DialogInterface.OnClickListener() {
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
