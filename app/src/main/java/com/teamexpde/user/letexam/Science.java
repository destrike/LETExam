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

public class Science extends Activity {

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
        setContentView(R.layout.activity_science);

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


        quiz.setText("1. When a gas is turned into a liquid, the process is called");

        A1.setText("condensation");
        A2.setText("evaporation");
        A3.setText("deposition");
        A4.setText("sublimation");

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
            if (answerContent.equals("sublimation")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("2. Which of the following parts of the sun is easily visible only during a total solar eclipse?");

                A1.setText("core");
                A2.setText("photosphere");
                A3.setText("sunspots");
                A4.setText("corona");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is sublimation",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("2. Which of the following parts of the sun is easily visible only during a total solar eclipse?");

                A1.setText("core");
                A2.setText("photosphere");
                A3.setText("sunspots");
                A4.setText("corona");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 1) {
            if (answerContent.equals("corona")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("3. Earth's seasons are caused by which of the following?");

                A1.setText("The tilt of the earth's rotation relative to the ecliptic as earth revolves around the sun");
                A2.setText("The varying amount of sunspot activity");
                A3.setText("The earth's orbit around the sun as an exlipse rather than a circle");
                A4.setText("The rotation of during a 24-hour day");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is corona",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("3. Earth's seasons are caused by which of the following?");

                A1.setText("The tilt of the earth's rotation relative to the ecliptic as earth revolves around the sun");
                A2.setText("The varying amount of sunspot activity");
                A3.setText("The earth's orbit around the sun as an exlipse rather than a circle");
                A4.setText("The rotation of during a 24-hour day");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 2) {
            if (answerContent.equals("The tilt of the earth's rotation relative to the ecliptic as earth revolves around the sun")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("4. Which of the following is most likely to cause a rise in the average temperature of earth's atmosphere in future?");

                A1.setText("Atomic warfare");
                A2.setText("CO2 from fossil fuels");
                A3.setText("Dust clouds from valcanoes");
                A4.setText("Depletion of earth's ozone layer");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is  The tilt of the earth's rotation relative to the ecliptic as earth revolves around the sun",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("4. Which of the following is most likely to cause a rise in the average temperature of earth's atmosphere in future?");

                A1.setText("Atomic warfare");
                A2.setText("CO2 from fossil fuels");
                A3.setText("Dust clouds from valcanoes");
                A4.setText("Depletion of earth's ozone layer");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 3) {
            if (answerContent.equals("CO2 from fossil fuels")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("5. The accumulation of stress along the boundaries of lithospheric plates results in which of the following?");

                A1.setText("Earthquakes");
                A2.setText("Magnetic reversals");
                A3.setText("Hurricanses");
                A4.setText("Increased deposition of deep-sea sediments");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is CO2 from fossil fuels",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("5. The accumulation of stress along the boundaries of lithospheric plates results in which of the following?");

                A1.setText("Earthquakes");
                A2.setText("Magnetic reversals");
                A3.setText("Hurricanses");
                A4.setText("Increased deposition of deep-sea sediments");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 4) {
            if (answerContent.equals("Earthquakes")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("6.Which of the following elements is a metal?");

                A1.setText("S");
                A2.setText("Se");
                A3.setText("I");
                A4.setText("Ga");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is Earthquakes",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("6.Which of the following elements is a metal?");

                A1.setText("S");
                A2.setText("Se");
                A3.setText("I");
                A4.setText("Ga");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 5) {
            if (answerContent.equals("Ga")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("7. Which of the following items will be attracted to the north pole of a permanent magnet by a magnet force?");

                A1.setText("The north pole of another permanent magnet");
                A2.setText("A piece of iron that is not a permanent magnet");
                A3.setText("A positively charged glass rod");
                A4.setText("A negatively charged rubber rod");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is Ga",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("7. Which of the following items will be attracted to the north pole of a permanent magnet by a magnet force?");

                A1.setText("The north pole of another permanent magnet");
                A2.setText("A piece of iron that is not a permanent magnet");
                A3.setText("A positively charged glass rod");
                A4.setText("A negatively charged rubber rod");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 6) {
            if (answerContent.equals("A piece of iron that is not a permanent magnet")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("8. Pollination by birds is called");

                A1.setText("autogamy");
                A2.setText("ornithophily");
                A3.setText("entomophily");
                A4.setText("anemophily");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is A piece of iron that is not a permanent magnet",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("8. Pollination by birds is called");

                A1.setText("autogamy");
                A2.setText("ornithophily");
                A3.setText("entomophily");
                A4.setText("anemophily");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 7) {
            if (answerContent.equals("ornithophily")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("9. The fastest-running terrestrial animal is?");

                A1.setText("cheetah");
                A2.setText("lion");
                A3.setText("man");
                A4.setText("jaguar");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is ornithophily",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("9. The fastest-running terrestrial animal is?");

                A1.setText("cheetah");
                A2.setText("lion");
                A3.setText("man");
                A4.setText("jaguar");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 8) {
            if (answerContent.equals("cheetah")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("10. As you go down into a well, your weight");

                A1.setText("increases slightly");
                A2.setText("decreases slightly");
                A3.setText("remains exactly the same");
                A4.setText("None of the above");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is cheetah",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("10. As you go down into a well, your weight");

                A1.setText("increases slightly");
                A2.setText("decreases slightly");
                A3.setText("remains exactly the same");
                A4.setText("None of the above");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 9) {
            if (answerContent.equals("decreases slightly")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("11. Which prefix is often used with scientific terms to indicate that something is the same, equal or constant?");

                A1.setText("iso");
                A2.setText("mega");
                A3.setText("meta");
                A4.setText("quasi");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is decreases slightly",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("11. Which prefix is often used with scientific terms to indicate that something is the same, equal or constant?");

                A1.setText("iso");
                A2.setText("mega");
                A3.setText("meta");
                A4.setText("quasi");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 10) {
            if (answerContent.equals("iso")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("12. The study of phenomena at very low temperatures is called ");

                A1.setText("heat transfer");
                A2.setText("morphology");
                A3.setText("crystallography");
                A4.setText("cryogenics");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is iso",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("12. The study of phenomena at very low temperatures is called ");

                A1.setText("heat transfer");
                A2.setText("morphology");
                A3.setText("crystallography");
                A4.setText("cryogenics");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 11) {
            if (answerContent.equals("cryogenics")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("13. The branch of medical science which is concerned with the study of disease as it affects a community of people is called");

                A1.setText("epidemiology");
                A2.setText("oncology");
                A3.setText("paleontogy");
                A4.setText("pathology");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is cryogenics",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("13. The branch of medical science which is concerned with the study of disease as it affects a community of people is called");

                A1.setText("epidemiology");
                A2.setText("oncology");
                A3.setText("paleontogy");
                A4.setText("pathology");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 12) {
            if (answerContent.equals("epidemiology")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("14. Superconductivity is a material property associated with");

                A1.setText("cooling a substance without a phase change");
                A2.setText("frictionless liquid flow");
                A3.setText("a loss of thermal resistance");
                A4.setText("a loss of electrical resistance");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is epidemiology",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("14. Superconductivity is a material property associated with");

                A1.setText("cooling a substance without a phase change");
                A2.setText("frictionless liquid flow");
                A3.setText("a loss of thermal resistance");
                A4.setText("a loss of electrical resistance");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 13) {
            if (answerContent.equals("a loss of electrical resistance")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("15. If a metal can be drawn into wires relatively easily it is called ");

                A1.setText("malleable");
                A2.setText("ductile");
                A3.setText("extractive");
                A4.setText("tactile");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is a loss of electrical resistance",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("15. If a metal can be drawn into wires relatively easily it is called ");

                A1.setText("malleable");
                A2.setText("ductile");
                A3.setText("extractive");
                A4.setText("tactile");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 14) {
            if (answerContent.equals("ductile")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("16. Cystitis is the infection of which of the following? ");

                A1.setText("liver");
                A2.setText("urinary bladder");
                A3.setText("pancreas");
                A4.setText("lung");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is ductile",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("16. Cystitis is the infection of which of the following? ");

                A1.setText("liver");
                A2.setText("urinary bladder");
                A3.setText("pancreas");
                A4.setText("lung");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 15) {
            if (answerContent.equals("urinary bladder")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("17. Which of the following is primarily composed of calcium carbonate? ");

                A1.setText("Fish scales");
                A2.setText("Shark teeth");
                A3.setText("Oyster Shells");
                A4.setText("Whale bones");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is urinary bladder",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("17. Which of the following is primarily composed of calcium carbonate? ");

                A1.setText("Fish scales");
                A2.setText("Shark teeth");
                A3.setText("Oyster Shells");
                A4.setText("Whale bones");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 16) {
            if (answerContent.equals("Oyster Shells")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("18. Water flows through a horizontal pipe at a constant volumetric rate. At a location where the cross sectional area decreases, the velocity of the fluid ");

                A1.setText("increases");
                A2.setText("decreases");
                A3.setText("stays the same");
                A4.setText("none of the above");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is Oyster Shells",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("18. Water flows through a horizontal pipe at a constant volumetric rate. At a location where the cross sectional area decreases, the velocity of the fluid ");

                A1.setText("increases");
                A2.setText("decreases");
                A3.setText("stays the same");
                A4.setText("none of the above");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 17) {
            if (answerContent.equals("increases")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("19. Yeast, used in making bread is a ");

                A1.setText("fungus");
                A2.setText("plant");
                A3.setText("bacteria");
                A4.setText("seed");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is increases",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("19. Yeast, used in making bread is a ");

                A1.setText("fungus");
                A2.setText("plant");
                A3.setText("bacteria");
                A4.setText("seed");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 18) {
            if (answerContent.equals("fungus")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("20. A cyclone is an engineering device that is used to ");

                A1.setText("transport materials");
                A2.setText("segregate particles");
                A3.setText("control switching devices");
                A4.setText("model fractals");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is fungus",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("20. A cyclone is an engineering device that is used to ");

                A1.setText("transport materials");
                A2.setText("segregate particles");
                A3.setText("control switching devices");
                A4.setText("model fractals");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 19) {
            if (answerContent.equals("segregate particles")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("21. Widespread resistance of malarial parasite to drugs like chloroquine has prompted attempts to develop a malarial vaccine to combat malaria. Why is it difficult to develop an effective malaria vaccine?");

                A1.setText("Malaria is caused by several species of Plasmodium.");
                A2.setText("Man does not develop immunity to malaria during natural infection.");
                A3.setText("Vaccines can be developed only against bacteria.");
                A4.setText("Man is only an intermediate host and not the definitive host.");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is segregate particles",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("21. Widespread resistance of malarial parasite to drugs like chloroquine has prompted attempts to develop a malarial vaccine to combat malaria. Why is it difficult to develop an effective malaria vaccine?");

                A1.setText("Malaria is caused by several species of Plasmodium.");
                A2.setText("Man does not develop immunity to malaria during natural infection.");
                A3.setText("Vaccines can be developed only against bacteria.");
                A4.setText("Man is only an intermediate host and not the definitive host.");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 20) {
            if (answerContent.equals("Malaria is caused by several species of Plasmodium.")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("22. With reference to the soil conservation, consider the following practices: 1.Crop relation, 2.Sand fences, 3.Terracing, 4.Wind breaks. Which of the above are considered appropriate methods for soil conservation in India?");

                A1.setText("1, 2 and 3 only");
                A2.setText("2 and 4 only");
                A3.setText("1, 3 and 4 only");
                A4.setText("1, 2, 3 and 4");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is Malaria is caused by several species of Plasmodium.",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("22. With reference to the soil conservation, consider the following practices: 1.Crop relation, 2.Sand fences, 3.Terracing, 4.Wind breaks. Which of the above are considered appropriate methods for soil conservation in India?");

                A1.setText("1, 2 and 3 only");
                A2.setText("2 and 4 only");
                A3.setText("1, 3 and 4 only");
                A4.setText("1, 2, 3 and 4");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 21) {
            if (answerContent.equals("1, 3 and 4 only")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("23. Biodiversity forms the basis for human existence in the following ways: 1.Soil formation, 2.Prevention of soil erosion, 3.Recycling of waste, 4.Pollination of crops");

                A1.setText("1, 2 and 3 only");
                A2.setText("2, 3 and 4 only");
                A3.setText("1 and 4 only");
                A4.setText("1, 2, 3 and 4");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is 1, 3 and 4 only",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("23. Biodiversity forms the basis for human existence in the following ways: 1.Soil formation, 2.Prevention of soil erosion, 3.Recycling of waste, 4.Pollination of crops");

                A1.setText("1, 2 and 3 only");
                A2.setText("2, 3 and 4 only");
                A3.setText("1 and 4 only");
                A4.setText("1, 2, 3 and 4");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 22) {
            if (answerContent.equals("1, 2, 3 and 4")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("A gas used as a disinfectant in drinking water is");

                A1.setText("Hydrogen");
                A2.setText("Oxygen");
                A3.setText("Fluorine");
                A4.setText("Chlorine");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is 1, 2, 3 and 4",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("A gas used as a disinfectant in drinking water is");

                A1.setText("Hydrogen");
                A2.setText("Oxygen");
                A3.setText("Fluorine");
                A4.setText("Chlorine");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 23) {
            if (answerContent.equals("Chlorine")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("25. A genetically engineered form of brinjal, known as the Bt-brinjal, has been developed. The objective of this is");

                A1.setText("To make it pest-resistant");
                A2.setText("To improve its taste and nutritive qualities");
                A3.setText("To make it drought-resistant");
                A4.setText("To make its shelf-life longer");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is Chlorine",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("25. A genetically engineered form of brinjal, known as the Bt-brinjal, has been developed. The objective of this is");

                A1.setText("To make it pest-resistant");
                A2.setText("To improve its taste and nutritive qualities");
                A3.setText("To make it drought-resistant");
                A4.setText("To make its shelf-life longer");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 24) {
            if (answerContent.equals("To make it pest-resistant")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("26. A married couple adopted a male child. A few years later, twin boys were born to them. The blood group of the couple is AB positive and O negative. The blood group of the three sons is A positive, B positive, and O positive. The blood group of the adopted son is");

                A1.setText("O positive");
                A2.setText("A positive");
                A3.setText("B positive");
                A4.setText("Cannot be determined on the basis of the given data");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is To make it pest-resistant",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("26. A married couple adopted a male child. A few years later, twin boys were born to them. The blood group of the couple is AB positive and O negative. The blood group of the three sons is A positive, B positive, and O positive. The blood group of the adopted son is");

                A1.setText("O positive");
                A2.setText("A positive");
                A3.setText("B positive");
                A4.setText("Cannot be determined on the basis of the given data");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 25) {
            if (answerContent.equals("O positive")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("27.  A new optical disc format known as the Blu-ray Disc (BD) is becoming popular. In what way is it different from the traditional DVD? 1. DVD supports standard Definition video while BD supports High definition Video. 2. Compared to a DVD, the BD format has several times more storage capacity. 3. Thickness of BD is 2.4 mm while that of DVD is 1.2 mm.");

                A1.setText("1 only");
                A2.setText("1 and 2 only");
                A3.setText("2 and 3 only");
                A4.setText("1, 2 and 3");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is O positive",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("27.  A new optical disc format known as the Blu-ray Disc (BD) is becoming popular. In what way is it different from the traditional DVD? 1. DVD supports standard Definition video while BD supports High definition Video. 2. Compared to a DVD, the BD format has several times more storage capacity. 3. Thickness of BD is 2.4 mm while that of DVD is 1.2 mm.");

                A1.setText("1 only");
                A2.setText("1 and 2 only");
                A3.setText("2 and 3 only");
                A4.setText("1, 2 and 3");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 26) {
            if (answerContent.equals("1 only")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("28. A sandy and saline area is the natural habitat of an Indian animal species. The animal has no predators in that area but its existence is threatened due to the destruction of its habitat. Which one of the following could be that animal?");

                A1.setText("Indian wild buffalo");
                A2.setText("Indian wild ass");
                A3.setText("Indian wild boar");
                A4.setText("Indian gazelle");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is 1 only",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("28. A sandy and saline area is the natural habitat of an Indian animal species. The animal has no predators in that area but its existence is threatened due to the destruction of its habitat. Which one of the following could be that animal?");

                A1.setText("Indian wild buffalo");
                A2.setText("Indian wild ass");
                A3.setText("Indian wild boar");
                A4.setText("Indian gazelle");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 27) {
            if (answerContent.equals("Indian wild ass")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("29. Aspartame is an artificial sweetener sold in the market. It consists of amino acids and provides calories like other amino acids. Yet, it is used as a low-calorie sweetening agent in food items. What is the basis of this use?");

                A1.setText("Aspartame is as sweet as table sugar, but unlike table sugar, it is not readily oxidized in human body due to lack of requisite enzymes");
                A2.setText("When aspartame is used in food processing, the sweet taste remains, but it becomes resistant to oxidation");
                A3.setText("Aspartame is as sweet as sugar, but after ingestion into the body, it is converted into metabolites that yield no calories");
                A4.setText("Aspartame is several times sweeter than table sugar, hence food items made with small quantities of aspartame yield fewer calories on oxidation");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is Indian wild ass",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("29. Aspartame is an artificial sweetener sold in the market. It consists of amino acids and provides calories like other amino acids. Yet, it is used as a low-calorie sweetening agent in food items. What is the basis of this use?");

                A1.setText("Aspartame is as sweet as table sugar, but unlike table sugar, it is not readily oxidized in human body due to lack of requisite enzymes");
                A2.setText("When aspartame is used in food processing, the sweet taste remains, but it becomes resistant to oxidation");
                A3.setText("Aspartame is as sweet as sugar, but after ingestion into the body, it is converted into metabolites that yield no calories");
                A4.setText("Aspartame is several times sweeter than table sugar, hence food items made with small quantities of aspartame yield fewer calories on oxidation");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 28) {
            if (answerContent.equals("When aspartame is used in food processing, the sweet taste remains, but it becomes resistant to oxidation")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("30. At present, scientists can determine the arrangement or relative positions of genes of DNA sequences on a chromosome. How does this knowledge benefit us? 1.It is possible to know the pedigree of livestock. 2. It is possible to understand the causes of all human diseases. 3. It is possible to develop disease-resistant animal breeds. Which of the statements given above is/are correct?");

                A1.setText("1 and 2 only");
                A2.setText("2 only");
                A3.setText("1 and 3 only");
                A4.setText("1, 2 and 3");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is When aspartame is used in food processing, the sweet taste remains, but it becomes resistant to oxidation",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("30. At present, scientists can determine the arrangement or relative positions of genes of DNA sequences on a chromosome. How does this knowledge benefit us? 1.It is possible to know the pedigree of livestock. 2. It is possible to understand the causes of all human diseases. 3. It is possible to develop disease-resistant animal breeds. Which of the statements given above is/are correct?");

                A1.setText("1 and 2 only");
                A2.setText("2 only");
                A3.setText("1 and 3 only");
                A4.setText("1, 2 and 3");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 29) {
            if (answerContent.equals("1, 2 and 3")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("31. Vacuoles are bound by a definite membrane in plant cells called");

                A1.setText("Plasma membrane");
                A2.setText("Tonoplast");
                A3.setText("Cell wall");
                A4.setText("none of the above");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is 1, 2 and 3",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("31. Vacuoles are bound by a definite membrane in plant cells called");

                A1.setText("Plasma membrane");
                A2.setText("Tonoplast");
                A3.setText("Cell wall");
                A4.setText("none of the above");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 30) {
            if (answerContent.equals("Tonoplast")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("32. Titan is the largest natural satellite of planet");

                A1.setText("Mercury");
                A2.setText("Venus");
                A3.setText("Saturn");
                A4.setText("Neptune");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is Tonoplast",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("32. Titan is the largest natural satellite of planet");

                A1.setText("Mercury");
                A2.setText("Venus");
                A3.setText("Saturn");
                A4.setText("Neptune");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 31) {
            if (answerContent.equals("Saturn")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("33. Thermometer is related to degree in the same way as clock is related to");

                A1.setText("Wall");
                A2.setText("Tower");
                A3.setText("Hour");
                A4.setText("Cock");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is Saturn",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("33. Thermometer is related to degree in the same way as clock is related to");

                A1.setText("Wall");
                A2.setText("Tower");
                A3.setText("Hour");
                A4.setText("Cock");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 32) {
            if (answerContent.equals("Hour")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("34. There are rings around which of the following?");

                A1.setText("Uranus");
                A2.setText("Mars");
                A3.setText("Jupiter");
                A4.setText("Saturn");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is Hour",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("34. There are rings around which of the following?");

                A1.setText("Uranus");
                A2.setText("Mars");
                A3.setText("Jupiter");
                A4.setText("Saturn");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 33) {
            if (answerContent.equals("Saturn")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("35. The theory which advocates that living beings can arise only from other living beings is termed");

                A1.setText("Bio-genesis");
                A2.setText("Abiogenesis");
                A3.setText("Catastrophism");
                A4.setText("Cosmozoic");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is Saturn",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("35. The theory which advocates that living beings can arise only from other living beings is termed");

                A1.setText("Bio-genesis");
                A2.setText("Abiogenesis");
                A3.setText("Catastrophism");
                A4.setText("Cosmozoic");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 34) {
            if (answerContent.equals("Bio-genesis")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("36. There are how many strains of H & N proteins that cumulatively make up the HN breed of flu virus (eg. being the presently famous H1N1 virus)");

                A1.setText("16 & 9 respectively");
                A2.setText("9 & 16 respectively");
                A3.setText("16 & 16 respectively");
                A4.setText("9 & 9 respectively");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is Bio-genesis",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("36. There are how many strains of H & N proteins that cumulatively make up the HN breed of flu virus (eg. being the presently famous H1N1 virus)");

                A1.setText("16 & 9 respectively");
                A2.setText("9 & 16 respectively");
                A3.setText("16 & 16 respectively");
                A4.setText("9 & 9 respectively");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 35) {
            if (answerContent.equals("16 & 9 respectively")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("37. The wonder pigment chlorophyll is present in");

                A1.setText("Mitochondria");
                A2.setText("Centrosomes");
                A3.setText("Quantosomes");
                A4.setText("Lysosomes");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is 16 & 9 respectively",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("37. The wonder pigment chlorophyll is present in");

                A1.setText("Mitochondria");
                A2.setText("Centrosomes");
                A3.setText("Quantosomes");
                A4.setText("Lysosomes");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 36) {
            if (answerContent.equals("Quantosomes")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("38. The vestiges of hind limbs are present in");

                A1.setText("Cobra");
                A2.setText("Sea snake");
                A3.setText("Krait");
                A4.setText("Python");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is Quantosomes",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("38. The vestiges of hind limbs are present in");

                A1.setText("Cobra");
                A2.setText("Sea snake");
                A3.setText("Krait");
                A4.setText("Python");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 37) {
            if (answerContent.equals("Python")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("39. The use of which of the following devices has given the modern biologist a better insight into the internal structure of cells");

                A1.setText("Super Computer");
                A2.setText("Electron microscope");
                A3.setText("Spectrophotometer");
                A4.setText("Ultracentrifuge");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is Python",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("39. The use of which of the following devices has given the modern biologist a better insight into the internal structure of cells");

                A1.setText("Super Computer");
                A2.setText("Electron microscope");
                A3.setText("Spectrophotometer");
                A4.setText("Ultracentrifuge");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 38) {
            if (answerContent.equals("Electron microscope")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("40. The two diseases that most often kill AIDS victims are: 1.Kaposi's sarcoma, 2.Lymphangioma, 3.Pneumocystis carinii pneumonia, 4.Systemic Lupus erythromatosus");

                A1.setText("1 and 2");
                A2.setText("2 and 3");
                A3.setText("1 and 3");
                A4.setText("3 and 4");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is Electron microscope",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("40. The two diseases that most often kill AIDS victims are: 1.Kaposi's sarcoma, 2.Lymphangioma, 3.Pneumocystis carinii pneumonia, 4.Systemic Lupus erythromatosus");

                A1.setText("1 and 2");
                A2.setText("2 and 3");
                A3.setText("1 and 3");
                A4.setText("3 and 4");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 39) {
            if (answerContent.equals("1 and 3")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("41. The solar eclipse occurs when");

                A1.setText("the sun comes in between the moon and the earth");
                A2.setText("the earth comes in the between the sun and the moon");
                A3.setText("the moon comes in between the sun and the earth");
                A4.setText("None of the above");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is 1 and 3",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("41. The solar eclipse occurs when");

                A1.setText("the sun comes in between the moon and the earth");
                A2.setText("the earth comes in the between the sun and the moon");
                A3.setText("the moon comes in between the sun and the earth");
                A4.setText("None of the above");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 40) {
            if (answerContent.equals("the moon comes in between the sun and the earth")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("42. The smallest functional and structural unit of kidney is called as");

                A1.setText("Neuron");
                A2.setText("Nephron");
                A3.setText("Granulocyte");
                A4.setText("Reticulocyte");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is the moon comes in between the sun and the earth",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("42. The smallest functional and structural unit of kidney is called as");

                A1.setText("Neuron");
                A2.setText("Nephron");
                A3.setText("Granulocyte");
                A4.setText("Reticulocyte");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 41) {
            if (answerContent.equals("Nephron")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("43. The removal of top soil by water or wind is called");

                A1.setText("Soil wash");
                A2.setText("Soil erosion");
                A3.setText("Soil creep");
                A4.setText("Silting of soil");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is Nephron",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("43. The removal of top soil by water or wind is called");

                A1.setText("Soil wash");
                A2.setText("Soil erosion");
                A3.setText("Soil creep");
                A4.setText("Silting of soil");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 42) {
            if (answerContent.equals("Soil erosion")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("44. In a certain electronic circuit the output is positive if input 1 is positive and input 2 is zero. If both inputs are positive the output is zero. This is");

                A1.setText("an AND circuit");
                A2.setText("a NOR circuit");
                A3.setText("an OR circuit");
                A4.setText("a high-pass filter");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is Soil erosion.",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("44. In a certain electronic circuit the output is positive if input 1 is positive and input 2 is zero. If both inputs are positive the output is zero. This is");

                A1.setText("an AND circuit");
                A2.setText("a NOR circuit");
                A3.setText("an OR circuit");
                A4.setText("a high-pass filter");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 43) {
            if (answerContent.equals("an OR circuit")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("45. The speed of light with the rise in the temperature of the medium");

                A1.setText("Increases");
                A2.setText("Decreases");
                A3.setText("Remains unaltered");
                A4.setText("Drops sharply");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is an OR circuit",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("45. The speed of light with the rise in the temperature of the medium");

                A1.setText("Increases");
                A2.setText("Decreases");
                A3.setText("Remains unaltered");
                A4.setText("Drops sharply");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 44) {
            if (answerContent.equals("Remains unaltered")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("46. The Panda belongs to the same family as that of");

                A1.setText("Bear");
                A2.setText("Cat");
                A3.setText("Dog");
                A4.setText("Rabbit");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is Remains unaltered",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("46. The Panda belongs to the same family as that of");

                A1.setText("Bear");
                A2.setText("Cat");
                A3.setText("Dog");
                A4.setText("Rabbit");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 45) {
            if (answerContent.equals("Bear")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("47. The oxide of Nitrogen used in medicine as anaesthetic is");

                A1.setText("Nitrogen dioxide");
                A2.setText("Nitric oxide");
                A3.setText("Nitrous oxide");
                A4.setText("Nitrogen pentoxide");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is Bear",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("47. The oxide of Nitrogen used in medicine as anaesthetic is");

                A1.setText("Nitrogen dioxide");
                A2.setText("Nitric oxide");
                A3.setText("Nitrous oxide");
                A4.setText("Nitrogen pentoxide");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 46) {
            if (answerContent.equals("Nitrogen pentoxide")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("48. The marine animal called dugong which is vulnerable to extinction is a/an ");

                A1.setText("Amphibian");
                A2.setText("Bony fish");
                A3.setText("Shark");
                A4.setText("Mammal");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is Nitrogen pentoxide.",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("48. The marine animal called dugong which is vulnerable to extinction is a/an ");

                A1.setText("Amphibian");
                A2.setText("Bony fish");
                A3.setText("Shark");
                A4.setText("Mammal");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 47) {
            if (answerContent.equals("Amphibian")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("49. The intencity of Earthquakes is measured on");

                A1.setText("Richter scale");
                A2.setText("Secant scale");
                A3.setText("Mercalli scale");
                A4.setText("Beaufort scale");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is Amphibian.",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("49. The intencity of Earthquakes is measured on");

                A1.setText("Richter scale");
                A2.setText("Secant scale");
                A3.setText("Mercalli scale");
                A4.setText("Beaufort scale");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 48) {
            if (answerContent.equals("Richter scale")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("50. The hardest substance available on earth is");

                A1.setText("Platinum");
                A2.setText("Diamond");
                A3.setText("Quartz");
                A4.setText("Gold");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is Richter scale.",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("50. The hardest substance available on earth is");

                A1.setText("Platinum");
                A2.setText("Diamond");
                A3.setText("Quartz");
                A4.setText("Gold");



                scoreTxt.setText(score+0+"");

            }
        }




        if (n == 49) {
            Button endbutton =(Button) findViewById(R.id.gohome);
            Button e1 =(Button) findViewById(R.id.b0);
            Button e2 =(Button) findViewById(R.id.b1);
            Button e4 =(Button) findViewById(R.id.b2);
            Button e5 =(Button) findViewById(R.id.b3);
            Button e3 =(Button) findViewById(R.id.erase);
            if (answerContent.equals("Platinum")){
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
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is Platinum.",
                        Toast.LENGTH_SHORT).show();

                endbutton.setEnabled(false);
                e1.setEnabled(false);
                e2.setEnabled(false);
                e4.setEnabled(false);
                e5.setEnabled(false);
                e3.setEnabled(false);







            }
        }

        if (n == 50) {

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
