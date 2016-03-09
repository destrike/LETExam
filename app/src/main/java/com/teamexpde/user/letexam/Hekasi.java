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

public class Hekasi extends Activity {
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
        setContentView(R.layout.activity_hekasi);

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


        quiz.setText("1. Sumiklab ang digmaan sa pagitan ng Amerikano at Kastila. Saan ito nagsimula?");

        A1.setText("sa Cuba");
        A2.setText("sa Pilipinas");
        A3.setText("sa Amerika");
        A4.setText("sa Espanya");

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
            if (answerContent.equals("sa Cuba")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("2. Bakit pumanig ang mga Amerikano sa bansang Cuba noong panahon ng digmaang Amerikano-Kastila?");

                A1.setText("upang mapangalagaan ang kanilang mga puhunan");
                A2.setText("upang hindi sila guluhin ng mga Cubano sakaling gumanti ang mga ito");
                A3.setText("upang lumawak ang kanilang nasasakupan");
                A4.setText("upang lumakas ang kanilang pwersang military");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay sa Cuba",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("2. Bakit pumanig ang mga Amerikano sa bansang Cuba noong panahon ng digmaang Amerikano-Kastila?");

                A1.setText("upang mapangalagaan ang kanilang mga puhunan");
                A2.setText("upang hindi sila guluhin ng mga Cubano sakaling gumanti ang mga ito");
                A3.setText("upang lumawak ang kanilang nasasakupan");
                A4.setText("upang lumakas ang kanilang pwersang military");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 1) {
            if (answerContent.equals("upang mapangalagaan ang kanilang mga puhunan")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("3. Sa digmaang Amerikano-Kastila, isinara ang buong Maynila upang pigilan ang pagpasok ng anumang bagay at ng sinumang pangkat o grupo ng anumang samahan na tinawag na _____.");

                A1.setText("apartheid");
                A2.setText("blockade");
                A3.setText("cold war");
                A4.setText("parity rights");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay upang mapangalagaan ang kanilang mga puhunan",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("3. Sa digmaang Amerikano-Kastila, isinara ang buong Maynila upang pigilan ang pagpasok ng anumang bagay at ng sinumang pangkat o grupo ng anumang samahan na tinawag na _____.");

                A1.setText("apartheid");
                A2.setText("blockade");
                A3.setText("cold war");
                A4.setText("parity rights");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 2) {
            if (answerContent.equals("blockade")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("4. Bakit kaya hindi nakadalo sa deklarasyon ng kalayaan ng Pilipinas si Komandante George Dewey noon? Ano kaya ang maaaring dahilan nito?");

                A1.setText("Nagtungo siya sa bansang Cuba upang ipagpatuloy ang kaniyang naantalang layunin");
                A2.setText("Nakipag-usap siya sa mga diplomatiko ng bansa upang pag-usapan ang mga usaping pangkapayapaan");
                A3.setText("Nagkaroon siya ng kasunduan sa pagitan ng Espanya upang ipasa ang pamumuno sa bansa");
                A4.setText("Nagtungo siya sa Malolos upang kausapin ang mga katipunero doon");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay blockade",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("4. Bakit kaya hindi nakadalo sa deklarasyon ng kalayaan ng Pilipinas si Komandante George Dewey noon? Ano kaya ang maaaring dahilan nito?");

                A1.setText("Nagtungo siya sa bansang Cuba upang ipagpatuloy ang kaniyang naantalang layunin");
                A2.setText("Nakipag-usap siya sa mga diplomatiko ng bansa upang pag-usapan ang mga usaping pangkapayapaan");
                A3.setText("Nagkaroon siya ng kasunduan sa pagitan ng Espanya upang ipasa ang pamumuno sa bansa");
                A4.setText("Nagtungo siya sa Malolos upang kausapin ang mga katipunero doon");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 3) {
            if (answerContent.equals("Nagkaroon siya ng kasunduan sa pagitan ng Espanya upang ipasa ang pamumuno sa bansa")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("5. Ang mga sumusunod ay kabilang sa mahahalagang nagawa ng kongreso ng Malolos maliban sa isa.");

                A1.setText("Pagpapatibay ng kalayaan ng Pilipinas noong Setyembre 29, 1878");
                A2.setText("Pagpapahayag ng isang batas na nagpapautang para sa pamahalaan ng 20, 000, 000");
                A3.setText("Pagtatatag ng Philippine Women's Red Cross Assosiacion");
                A4.setText("Pagtatatag ng Pamantasan ng Panitikan ng Pilipinas");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay Nagkaroon siya ng kasunduan sa pagitan ng Espanya upang ipasa ang pamumuno sa bansa",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("5. Ang mga sumusunod ay kabilang sa mahahalagang nagawa ng kongreso ng Malolos maliban sa isa.");

                A1.setText("Pagpapatibay ng kalayaan ng Pilipinas noong Setyembre 29, 1878");
                A2.setText("Pagpapahayag ng isang batas na nagpapautang para sa pamahalaan ng 20, 000, 000");
                A3.setText("Pagtatatag ng Philippine Women's Red Cross Assosiacion");
                A4.setText("Pagtatatag ng Pamantasan ng Panitikan ng Pilipinas");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 4) {
            if (answerContent.equals("Pagpapatibay ng kalayaan ng Pilipinas noong Setyembre 29, 1878")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("6.Sa kauna-unahang pagkakataon, iwinagayway ang watawat ng Pilipinas kasabay ang pagtugtog ng Marcha Nacional Filipina. Anong banda ang tumugtog nito?");

                A1.setText("San Francisco de Malabon");
                A2.setText("San Agustin de Intramuros");
                A3.setText("Banda Nacional de Filipina");
                A4.setText("Banda de Emilio Aguinaldo");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay Pagpapatibay ng kalayaan ng Pilipinas noong Setyembre 29, 1878",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("6.Sa kauna-unahang pagkakataon, iwinagayway ang watawat ng Pilipinas kasabay ang pagtugtog ng Marcha Nacional Filipina. Anong banda ang tumugtog nito?");

                A1.setText("San Francisco de Malabon");
                A2.setText("San Agustin de Intramuros");
                A3.setText("Banda Nacional de Filipina");
                A4.setText("Banda de Emilio Aguinaldo");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 5) {
            if (answerContent.equals("San Francisco de Malabon")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("7. Sinong diplomatiko ng bansa ang nagtungo sa Paris upang pigilan ang kasunduan sa pagitan ng Amerika at Espanya?");

                A1.setText("Julian Felipe");
                A2.setText("Felipe Agoncillo");
                A3.setText("Melchora Agoncillo");
                A4.setText("Juan Luna");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay San Francisco de Malabon",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("7. Sinong diplomatiko ng bansa ang nagtungo sa Paris upang pigilan ang kasunduan sa pagitan ng Amerika at Espanya?");

                A1.setText("Julian Felipe");
                A2.setText("Felipe Agoncillo");
                A3.setText("Melchora Agoncillo");
                A4.setText("Juan Luna");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 6) {
            if (answerContent.equals("Felipe Agoncillo")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("8. Bakit pamahalaang military ang itinatag ng Amerika sa Kamaynilaan matapos silang lusubin ng mga Hapones?");

                A1.setText("upang di makapasok ang mga Hapones");
                A2.setText("dahil hindi pa maayos ang lahat at kailangan ng agad na mangangalaga sa buong kapuluan dulot ng digmaan");
                A3.setText("upang magilan ang pagpasok ng sinumang mananakop");
                A4.setText("dahil nais ng Amerika na mapasakamay nila ang bansa");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay Felipe Agoncillo",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("8. Bakit pamahalaang military ang itinatag ng Amerika sa Kamaynilaan matapos silang lusubin ng mga Hapones?");

                A1.setText("upang di makapasok ang mga Hapones");
                A2.setText("dahil hindi pa maayos ang lahat at kailangan ng agad na mangangalaga sa buong kapuluan dulot ng digmaan");
                A3.setText("upang magilan ang pagpasok ng sinumang mananakop");
                A4.setText("dahil nais ng Amerika na mapasakamay nila ang bansa");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 7) {
            if (answerContent.equals("dahil hindi pa maayos ang lahat at kailangan ng agad na mangangalaga sa buong kapuluan dulot ng digmaan")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("9. Noong Hunyo 12, 1898 ipinahayag ang ating kalayaan sa Kawit, Cavite. Sino ang nagbasa ng sulat sa pagpapahayag ng ating kalayaan?");

                A1.setText("Felipe Agoncillo");
                A2.setText("Ambrocio Rianzares Bautista");
                A3.setText("Pedro Paterno");
                A4.setText("Daniel Tirona");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay dahil hindi pa maayos ang lahat at kailangan ng agad na mangangalaga sa buong kapuluan dulot ng digmaan",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("9. Noong Hunyo 12, 1898 ipinahayag ang ating kalayaan sa Kawit, Cavite. Sino ang nagbasa ng sulat sa pagpapahayag ng ating kalayaan?");

                A1.setText("Felipe Agoncillo");
                A2.setText("Ambrocio Rianzares Bautista");
                A3.setText("Pedro Paterno");
                A4.setText("Daniel Tirona");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 8) {
            if (answerContent.equals("Ambrocio Rianzares Bautista")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("10. Ang kongresong panghimagsikan ay binuo ng mga kinatawan mula sa iba't-ibang panig ng Pilipinas ay tinawag na _____.");

                A1.setText("Philippine Congress");
                A2.setText("Malolos Congress");
                A3.setText("Biak na Bato Congress");
                A4.setText("Kongreso ng Estados Unidos");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay Ambrocio Rianzares Bautista",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("10. Ang kongresong panghimagsikan ay binuo ng mga kinatawan mula sa iba't-ibang panig ng Pilipinas ay tinawag na _____.");

                A1.setText("Philippine Congress");
                A2.setText("Malolos Congress");
                A3.setText("Biak na Bato Congress");
                A4.setText("Kongreso ng Estados Unidos");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 9) {
            if (answerContent.equals("Malolos Congress")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("11. Sa digmaang Amerikano-Pilipino itinatag niya ang Republikang Tagalog na nagpalabas na walang susuko sa mga Amerikano. Sino siya?");

                A1.setText("Hen. Miguel Malvar");
                A2.setText("Hen. Gregorio del Pilar");
                A3.setText("Macario Sakay");
                A4.setText("Hen. Vicente Lukban");


                scoreTxt.setText(score+1+"");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay Malolos Congress",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("11. Sa digmaang Amerikano-Pilipino itinatag niya ang Republikang Tagalog na nagpalabas na walang susuko sa mga Amerikano. Sino siya?");

                A1.setText("Hen. Miguel Malvar");
                A2.setText("Hen. Gregorio del Pilar");
                A3.setText("Macario Sakay");
                A4.setText("Hen. Vicente Lukban");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 10) {
            if (answerContent.equals("Macario Sakay")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("12. Ang mga sumusunod ay itinakda ng Batas Cooper ng 1902 maliban sa isa.");

                A1.setText("Pagbuo ng isang Asemblea na binuo ng mga Pilipino");
                A2.setText("Pagkakaroon ng katipunan ng karapatan");
                A3.setText("Paghirang ng dalawang komisyonado na kakatawan sa Pilipinas");
                A4.setText("Paglinang ng likas na yaman ng Pilipinas para sa kapakanan ng mga Pilipino at Amerikano");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay Macario Sakay",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("12. Ang mga sumusunod ay itinakda ng Batas Cooper ng 1902 maliban sa isa.");

                A1.setText("Pagbuo ng isang Asemblea na binuo ng mga Pilipino");
                A2.setText("Pagkakaroon ng katipunan ng karapatan");
                A3.setText("Paghirang ng dalawang komisyonado na kakatawan sa Pilipinas");
                A4.setText("Paglinang ng likas na yaman ng Pilipinas para sa kapakanan ng mga Pilipino at Amerikano");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 11) {
            if (answerContent.equals("Paglinang ng likas na yaman ng Pilipinas para sa kapakanan ng mga Pilipino at Amerikano")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("13.  Ang Batas Jones ay nagtalaga ng mga probisyon na dapat tanggapin ng mga Pilipino bilang paghahanda sa sariling pamamahala maliban sa isa.");

                A1.setText("Pagtatalaga ng isang Gobernador Heneral na Amerikano na gaganap ng kapangyarihang tagapagpaganap");
                A2.setText("Paglikha ng batasang binubuo ng dalawang kapulungan.");
                A3.setText("Ang Korte Suprema at mga mababang hukuman ang may kapangyarihang panghukom.");
                A4.setText("Ang karapatan ng mamamayan ay di nakapaloob sa Katipunan ng karapatan");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay Paglinang ng likas na yaman ng Pilipinas para sa kapakanan ng mga Pilipino at Amerikano",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("13.  Ang Batas Jones ay nagtalaga ng mga probisyon na dapat tanggapin ng mga Pilipino bilang paghahanda sa sariling pamamahala maliban sa isa.");

                A1.setText("Pagtatalaga ng isang Gobernador Heneral na Amerikano na gaganap ng kapangyarihang tagapagpaganap");
                A2.setText("Paglikha ng batasang binubuo ng dalawang kapulungan.");
                A3.setText("Ang Korte Suprema at mga mababang hukuman ang may kapangyarihang panghukom.");
                A4.setText("Ang karapatan ng mamamayan ay di nakapaloob sa Katipunan ng karapatan");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 12) {
            if (answerContent.equals("Ang karapatan ng mamamayan ay di nakapaloob sa Katipunan ng karapatan")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("14. Anong batas na itinatag ng mga Amerikano ang natakda ng sampung taong transisyon bago mapasalin sa mga Pilipino ang pamamahala?");

                A1.setText("Batas Jones");
                A2.setText("Batas Hare-Hawes-Cutting");
                A3.setText("Batas Pilipinas");
                A4.setText("Batas Tyding-Mcduffie");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay Ang karapatan ng mamamayan ay di nakapaloob sa Katipunan ng karapatan",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("14. Anong batas na itinatag ng mga Amerikano ang natakda ng sampung taong transisyon bago mapasalin sa mga Pilipino ang pamamahala?");

                A1.setText("Batas Jones");
                A2.setText("Batas Hare-Hawes-Cutting");
                A3.setText("Batas Pilipinas");
                A4.setText("Batas Tyding-Mcduffie");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 13) {
            if (answerContent.equals("Batas Hare-Hawes-Cutting")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("15. Sumiklab ang Ikalawang Digmaang Pandaigdig na kinaaniban ng ilan pang bansa sa Europa na pinamunuan ni Adolf Hitler. Anong bansa ang nanguna sa paglusob sa Asya?");

                A1.setText("Japan");
                A2.setText("Thailand");
                A3.setText("Vietnam");
                A4.setText("China");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay Batas Hare-Hawes-Cutting",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("15. Sumiklab ang Ikalawang Digmaang Pandaigdig na kinaaniban ng ilan pang bansa sa Europa na pinamunuan ni Adolf Hitler. Anong bansa ang nanguna sa paglusob sa Asya?");

                A1.setText("Japan");
                A2.setText("Thailand");
                A3.setText("Vietnam");
                A4.setText("China");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 14) {
            if (answerContent.equals("Japan")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("16. Ano ang ibig sabihin ng Greater East Asia Co-Properity Sphere ng bansang Hapon?");

                A1.setText("ito ang planong magtatag ng bagong kaayusan sa Asya");
                A2.setText("ito ang planong magtatag ng malakihang industriya sa bansa");
                A3.setText("ito ang pagpapatupad ng pangkabuhayang pagtutulungan ng mga bansa sa Asya");
                A4.setText("ito ay ang makilalang lider ng mga Asyano at pairalin ang mga paniniwalang Asyano.");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay Japan",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("16. Ano ang ibig sabihin ng Greater East Asia Co-Properity Sphere ng bansang Hapon?");

                A1.setText("ito ang planong magtatag ng bagong kaayusan sa Asya");
                A2.setText("ito ang planong magtatag ng malakihang industriya sa bansa");
                A3.setText("ito ang pagpapatupad ng pangkabuhayang pagtutulungan ng mga bansa sa Asya");
                A4.setText("ito ay ang makilalang lider ng mga Asyano at pairalin ang mga paniniwalang Asyano.");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 15) {
            if (answerContent.equals("ito ang planong magtatag ng bagong kaayusan sa Asya")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("17. Ang mga sumusunod ay mga layunin ng bansang Hapon sa kanilang pananakop at magpalaganap ng paniniwalang Asyano maliban sa isa.");

                A1.setText("Paghahanap ng mapagdadalhan ng kanyang mga produkto");
                A2.setText("Pagtatatag ng pangkabuhayang pagtutulungan ng mga bansa sa Asya");
                A3.setText("Mapabagsak ang pwersang Amerikano at sakupin ang Pilipinas");
                A4.setText("Makilalang lider ng mga Asyano para sa Asyano lamang");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay ito ang planong magtatag ng bagong kaayusan sa Asya",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("17. Ang mga sumusunod ay mga layunin ng bansang Hapon sa kanilang pananakop at magpalaganap ng paniniwalang Asyano maliban sa isa.");

                A1.setText("Paghahanap ng mapagdadalhan ng kanyang mga produkto");
                A2.setText("Pagtatatag ng pangkabuhayang pagtutulungan ng mga bansa sa Asya");
                A3.setText("Mapabagsak ang pwersang Amerikano at sakupin ang Pilipinas");
                A4.setText("Makilalang lider ng mga Asyano para sa Asyano lamang");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 16) {
            if (answerContent.equals("Mapabagsak ang pwersang Amerikano at sakupin ang Pilipinas")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("18. Naging matulungin ang pamahalaang Amerikano ngunit naging mapilit sila sa paghiling na pagtibayin ang pantay na karapatan ng Pilipino at Amerikano sa paglinang ng likas na yaman ng bansa. Ito ay tinatawag na _____.");

                A1.setText("Parity Rights");
                A2.setText("Bill of Rights");
                A3.setText("Party List");
                A4.setText("Benevolent Assimilation");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay Mapabagsak ang pwersang Amerikano at sakupin ang Pilipinas",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("18. Naging matulungin ang pamahalaang Amerikano ngunit naging mapilit sila sa paghiling na pagtibayin ang pantay na karapatan ng Pilipino at Amerikano sa paglinang ng likas na yaman ng bansa. Ito ay tinatawag na _____.");

                A1.setText("Parity Rights");
                A2.setText("Bill of Rights");
                A3.setText("Party List");
                A4.setText("Benevolent Assimilation");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 17) {
            if (answerContent.equals("Parity Rights")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("19. Isang samahan ang itinatag ni Pangulong Macapagal para sa mabuting pakikipag-uganayan sa mga karatig bansang Malaysia at Indonesia. Ito ay ang tinawag na ____");

                A1.setText("MAPHILINDO");
                A2.setText("ASEAN");
                A3.setText("APEC");
                A4.setText("SEATO");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay Parity Rights",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("19. Isang samahan ang itinatag ni Pangulong Macapagal para sa mabuting pakikipag-uganayan sa mga karatig bansang Malaysia at Indonesia. Ito ay ang tinawag na ____");

                A1.setText("MAPHILINDO");
                A2.setText("ASEAN");
                A3.setText("APEC");
                A4.setText("SEATO");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 18) {
            if (answerContent.equals("object of the preposition")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("20. Ito ay sangay ng pamahalaan na siyang naghahabol sa mga yaman ng bansa na nakamit ninuman sa hindi legal at tamang paraan.");

                A1.setText("PACSA");
                A2.setText("PACT");
                A3.setText("PCGG");
                A4.setText("NBI");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is object of the preposition",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("20. Ito ay sangay ng pamahalaan na siyang naghahabol sa mga yaman ng bansa na nakamit ninuman sa hindi legal at tamang paraan.");

                A1.setText("PACSA");
                A2.setText("PACT");
                A3.setText("PCGG");
                A4.setText("NBI");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 19) {
            if (answerContent.equals("PCGG")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("21. Anong pangyayari ang naging hudyat ng paghihimagsik ng mga Pilipino noong panahon ng Kastila?");

                A1.setText("pagkakatatag ng La Liga Filipina");
                A2.setText("ang unang sigaw sa Pugad Lawin");
                A3.setText("ang pagkamatay ng GOMBURZA");
                A4.setText("pagpatay kay Rizal");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay PCGG",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("21. Anong pangyayari ang naging hudyat ng paghihimagsik ng mga Pilipino noong panahon ng Kastila?");

                A1.setText("pagkakatatag ng La Liga Filipina");
                A2.setText("ang unang sigaw sa Pugad Lawin");
                A3.setText("ang pagkamatay ng GOMBURZA");
                A4.setText("pagpatay kay Rizal");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 20) {
            if (answerContent.equals("ang unang sigaw sa Pugad Lawin")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("22. Itinatag ang Katipunan noong Hulyo 7, 1892 sa pamumuno ni Bonifacio na kinapapalooban ng tatlong saligang layunin. Ito ay ang _____.");

                A1.setText("pampulitikal, sosyal at pinansyal");
                A2.setText("sosyal, sibiko at pulitikal");
                A3.setText("pulitikal, moral at sibiko");
                A4.setText("moral, ispirituwal, sosyal, pinansyal at sibiko");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay ang unang sigaw sa Pugad Lawin",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("22. Itinatag ang Katipunan noong Hulyo 7, 1892 sa pamumuno ni Bonifacio na kinapapalooban ng tatlong saligang layunin. Ito ay ang _____.");

                A1.setText("pampulitikal, sosyal at pinansyal");
                A2.setText("sosyal, sibiko at pulitikal");
                A3.setText("pulitikal, moral at sibiko");
                A4.setText("moral, ispirituwal, sosyal, pinansyal at sibiko");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 21) {
            if (answerContent.equals("pulitikal, moral at sibiko")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("23. Naging katuwang siya ni Andres Bonifacio sa pakikipaglaban at naataang tagapag-ingat sa mga kasulatang at dokumentong may kaugnayan sa kilusan. Siya ay si ____.");

                A1.setText("Marina Dizon Santiago");
                A2.setText("Teresa Magbanua");
                A3.setText("Melchora Aquino");
                A4.setText("Gregoria de Jesus");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay pulitikal, moral at sibiko",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("23. Naging katuwang siya ni Andres Bonifacio sa pakikipaglaban at naataang tagapag-ingat sa mga kasulatang at dokumentong may kaugnayan sa kilusan. Siya ay si ____.");

                A1.setText("Marina Dizon Santiago");
                A2.setText("Teresa Magbanua");
                A3.setText("Melchora Aquino");
                A4.setText("Gregoria de Jesus");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 22) {
            if (answerContent.equals("Gregoria de Jesus")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("24. Sino ang pumatay kay Andres Bonifacio? ");

                A1.setText("Emilio Aguinaldo");
                A2.setText("Major Lazaro Makapagal");
                A3.setText("Heneral Noriel");
                A4.setText("Heneral Mamerto Natividad");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay Gregoria de Jesus",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("24. Sino ang pumatay kay Andres Bonifacio? ");

                A1.setText("Emilio Aguinaldo");
                A2.setText("Major Lazaro Makapagal");
                A3.setText("Heneral Noriel");
                A4.setText("Heneral Mamerto Natividad");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 23) {
            if (answerContent.equals("Major Lazaro Makapagal")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("25. Di lahat ng mga Kastila sa bansa ay kaaway ng mga Pilipino noong panahon ng Kastila. Sila ay tinatawag na mga _____");

                A1.setText("Mestizo");
                A2.setText("Peninsulares");
                A3.setText("Pilipinong Kastila");
                A4.setText("Insulares");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay Major Lazaro Makapagal",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("25. Di lahat ng mga Kastila sa bansa ay kaaway ng mga Pilipino noong panahon ng Kastila. Sila ay tinatawag na mga _____");

                A1.setText("Mestizo");
                A2.setText("Peninsulares");
                A3.setText("Pilipinong Kastila");
                A4.setText("Insulares");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 24) {
            if (answerContent.equals("Insulares")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("26. Ang Pilipinas ay isang bansa na kumikilala sa kahalagahan ng mabuting pakikipag-ugnayan. Ang \"The State shall pursue an independent foreign policy\" ay nakasaad sa _____");

                A1.setText("Saligang Batas 1987, Artikulo II, Seksyon 7");
                A2.setText("Saligang Batas 1935, Artikulo II, Seksyon 7");
                A3.setText("Saligang Batas 1973, Artikulo II, Seksyon 6");
                A4.setText("Saligang Batas 1987, Artikulo I, Seksyon 7");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay Insulares",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("26. Ang Pilipinas ay isang bansa na kumikilala sa kahalagahan ng mabuting pakikipag-ugnayan. Ang \"The State shall pursue an independent foreign policy\" ay nakasaad sa _____");

                A1.setText("Saligang Batas 1987, Artikulo II, Seksyon 7");
                A2.setText("Saligang Batas 1935, Artikulo II, Seksyon 7");
                A3.setText("Saligang Batas 1973, Artikulo II, Seksyon 6");
                A4.setText("Saligang Batas 1987, Artikulo I, Seksyon 7");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 25) {
            if (answerContent.equals("Saligang Batas 1987, Artikulo II, Seksyon 7")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("27. Ang naging pangunahing layunin ng samahang ito ay ang pangangalaga ng bawat kasapi nito sa larangan ng militar para sa  kaligtasan at katahimikan.");

                A1.setText("SEATO");
                A2.setText("UNO");
                A3.setText("WHO");
                A4.setText("APEC");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay Saligang Batas 1987, Artikulo II, Seksyon 7",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("27. Ang naging pangunahing layunin ng samahang ito ay ang pangangalaga ng bawat kasapi nito sa larangan ng militar para sa  kaligtasan at katahimikan.");

                A1.setText("SEATO");
                A2.setText("UNO");
                A3.setText("WHO");
                A4.setText("APEC");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 26) {
            if (answerContent.equals("life jackets")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("28. Ang samahang ito sa Asya ay nagpapakita ng pagbabawas ng pag-asa sa tulong ng Estados Unidos na higit na pinahalagahan ni Pangulong Carlos P. Garcia.");

                A1.setText("APEC");
                A2.setText("SEATO");
                A3.setText("ASA");
                A4.setText("UNO");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Correct Answer is life jackets",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("28. Ang samahang ito sa Asya ay nagpapakita ng pagbabawas ng pag-asa sa tulong ng Estados Unidos na higit na pinahalagahan ni Pangulong Carlos P. Garcia.");

                A1.setText("APEC");
                A2.setText("SEATO");
                A3.setText("ASA");
                A4.setText("UNO");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 27) {
            if (answerContent.equals("ASA")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("29. Ang samahang ASEAN ay nagtatakda ng mga batas na sinusunod ng bawat kasapi. Binubuo ng mga pangulo ng mga kasaping bansa na siyang may pinakamataas na posisyon sa samahan. Ito ay _____");

                A1.setText("ASEAN Ministerial Meeting");
                A2.setText("ASEAN Heads of Government");
                A3.setText("ASEAN Standing Committee");
                A4.setText("ASEAN Ad Hoc Committee");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay ASA",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("29. Ang samahang ASEAN ay nagtatakda ng mga batas na sinusunod ng bawat kasapi. Binubuo ng mga pangulo ng mga kasaping bansa na siyang may pinakamataas na posisyon sa samahan. Ito ay _____");

                A1.setText("ASEAN Ministerial Meeting");
                A2.setText("ASEAN Heads of Government");
                A3.setText("ASEAN Standing Committee");
                A4.setText("ASEAN Ad Hoc Committee");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 28) {
            if (answerContent.equals("ASEAN Heads of Government")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("30. Ang mga sumusunod ay pangunahing layunin ng UNO maliban sa isa.");

                A1.setText("Ang paggalang sa karapatan ng tao na walang kinikilalang lahi,kulay,wika,kasarian at pananampalataya.");
                A2.setText("Ang pagtatatag ng mabuting pagkakaibigan ng mga bansa.");
                A3.setText("Ang pagpapanatili ng katahimikan at katiwasayan ng mga piling lugar lamang.");
                A4.setText("Ang pangunahan ang mga gawain o maging sentro upang matupad ang layuning tinakda.");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay ASEAN Heads of Government",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("30. Ang mga sumusunod ay pangunahing layunin ng UNO maliban sa isa.");

                A1.setText("Ang paggalang sa karapatan ng tao na walang kinikilalang lahi,kulay,wika,kasarian at pananampalataya.");
                A2.setText("Ang pagtatatag ng mabuting pagkakaibigan ng mga bansa.");
                A3.setText("Ang pagpapanatili ng katahimikan at katiwasayan ng mga piling lugar lamang.");
                A4.setText("Ang pangunahan ang mga gawain o maging sentro upang matupad ang layuning tinakda.");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 29) {
            if (answerContent.equals("Ang pagpapanatili ng katahimikan at katiwasayan ng mga piling lugar lamang.")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("31. Sino ang humawak sa dalawang ahensiya ng pananalapi ng UNO? ");

                A1.setText("Rafael Salas");
                A2.setText("Miguel Cuaderno");
                A3.setText("Blas Ople");
                A4.setText("Estefana Aldaba Lim");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay Ang pagpapanatili ng katahimikan at katiwasayan ng mga piling lugar lamang.",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("31. Sino ang humawak sa dalawang ahensiya ng pananalapi ng UNO? ");

                A1.setText("Rafael Salas");
                A2.setText("Miguel Cuaderno");
                A3.setText("Blas Ople");
                A4.setText("Estefana Aldaba Lim");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 30) {
            if (answerContent.equals("Miguel Cuaderno")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("32. Siya ang naging pangalawang kalihim ng Social Development and Humanitarian Affairs. Sino siya?");

                A1.setText("Cesar Bengson");
                A2.setText("Felixberto Serrano");
                A3.setText("Estefania Aldaba Lim");
                A4.setText("Dr. Juan Salcedo");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay Miguel Cuaderno",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("32. Siya ang naging pangalawang kalihim ng Social Development and Humanitarian Affairs. Sino siya?");

                A1.setText("Cesar Bengson");
                A2.setText("Felixberto Serrano");
                A3.setText("Estefania Aldaba Lim");
                A4.setText("Dr. Juan Salcedo");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 31) {
            if (answerContent.equals("Estefania Aldaba Lim")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("33. Ang samahang ito ay binubuo ng 18 kasapi na ang layunin ay magkaroon ng magandang ugnayanang mga papaunlad na bansa sa mga mauunlad nang bansa.");

                A1.setText("SEATO");
                A2.setText("UNO");
                A3.setText("APEC");
                A4.setText("WHO");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay Estefania Aldaba Lim",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("33. Ang samahang ito ay binubuo ng 18 kasapi na ang layunin ay magkaroon ng magandang ugnayanang mga papaunlad na bansa sa mga mauunlad nang bansa.");

                A1.setText("SEATO");
                A2.setText("UNO");
                A3.setText("APEC");
                A4.setText("WHO");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 32) {
            if (answerContent.equals("APEC")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("34. Ang sumusunod ang mga bansang kasapi sa APEC maliban sa ilan.");

                A1.setText("Egypt, Eutopia at Mali");
                A2.setText("Malaysia, Thailand at Vietnam ");
                A3.setText("China, Singapore at Japan");
                A4.setText("Indonesia, Japan, Canada");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay APEC",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("34. Ang sumusunod ang mga bansang kasapi sa APEC maliban sa ilan.");

                A1.setText("Egypt, Eutopia at Mali");
                A2.setText("Malaysia, Thailand at Vietnam ");
                A3.setText("China, Singapore at Japan");
                A4.setText("Indonesia, Japan, Canada");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 33) {
            if (answerContent.equals("Egypt, Eutopia at Mali")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("35. Saan matatagpuan ang punong himpilan ng Nagkakaisang Bansa o United Nations Organizations?");

                A1.setText("Manila, Philipines");
                A2.setText("Geneva, Switzerland");
                A3.setText("New York City, New York, USA");
                A4.setText("Paris, France");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay Egypt, Eutopia at Mali",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("35. Saan matatagpuan ang punong himpilan ng Nagkakaisang Bansa o United Nations Organizations?");

                A1.setText("Manila, Philipines");
                A2.setText("Geneva, Switzerland");
                A3.setText("New York City, New York, USA");
                A4.setText("Paris, France");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 34) {
            if (answerContent.equals("New York City, New York, USA")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("36. Anong kasunduan ang nagsalin ng pamamahala sa Pilipinas sa mga Amerikano na mula sa mga Kastila?");

                A1.setText("Military Bases Agreement");
                A2.setText("Parity Rights");
                A3.setText("Treaty of Paris");
                A4.setText("Mutual Agreement Pack");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay New York City, New York, USA",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("36. Anong kasunduan ang nagsalin ng pamamahala sa Pilipinas sa mga Amerikano na mula sa mga Kastila?");

                A1.setText("Military Bases Agreement");
                A2.setText("Parity Rights");
                A3.setText("Treaty of Paris");
                A4.setText("Mutual Agreement Pack");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 35) {
            if (answerContent.equals("Treaty of Paris")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("37. Ito ay isang mahalagang pangyayari sa kasaysayan ng ating bansa kung saan naging hudyat ito ng himagsikan laban sa mga Kastila. Saan ito naganap?");

                A1.setText("sa Balintawak");
                A2.setText("sa Mandaluyong");
                A3.setText("sa Tondo, Maynila");
                A4.setText("sa Malolos, Bulacan");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay Treaty of Paris",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("37. Ito ay isang mahalagang pangyayari sa kasaysayan ng ating bansa kung saan naging hudyat ito ng himagsikan laban sa mga Kastila. Saan ito naganap?");

                A1.setText("sa Balintawak");
                A2.setText("sa Mandaluyong");
                A3.setText("sa Tondo, Maynila");
                A4.setText("sa Malolos, Bulacan");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 36) {
            if (answerContent.equals("sa Balintawak")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("38. Alin sa mga sumusunod ang nagpapahayag tungkol sa kaunlaran?");

                A1.setText("Ang kaunlaran ay isang kondisyon ng isang bansa kung saan makikita ang kasiyahan at kapayapaan ng bawat mamamayan.");
                A2.setText("Ang kaunlaran ay nakabatay lamang sa kung anong mayroon ang isang bansa");
                A3.setText("Ang kaunlaran ay bahagi lamang ng kasaysayan ng isang bansang malaya kung saan maraming pakikipag-ugnayan sa ibang bansa ang ginagawa ng pamahalaan.");
                A4.setText("Ang kaunlaran ay nababatay sa kung paano pinahahalagahan ng pamahalaan at mamamayan ang kalikasan at kalusugan ng bawat isa.");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay sa Balintawak",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("38. Alin sa mga sumusunod ang nagpapahayag tungkol sa kaunlaran?");

                A1.setText("Ang kaunlaran ay isang kondisyon ng isang bansa kung saan makikita ang kasiyahan at kapayapaan ng bawat mamamayan.");
                A2.setText("Ang kaunlaran ay nakabatay lamang sa kung anong mayroon ang isang bansa");
                A3.setText("Ang kaunlaran ay bahagi lamang ng kasaysayan ng isang bansang malaya kung saan maraming pakikipag-ugnayan sa ibang bansa ang ginagawa ng pamahalaan.");
                A4.setText("Ang kaunlaran ay nababatay sa kung paano pinahahalagahan ng pamahalaan at mamamayan ang kalikasan at kalusugan ng bawat isa.");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 37) {
            if (answerContent.equals("Ang kaunlaran ay nababatay sa kung paano pinahahalagahan ng pamahalaan at mamamayan ang kalikasan at kalusugan ng bawat isa.")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("39. Kailan naihalal si Joseph Estrada bilang pangulo ng Pilipinas?");

                A1.setText("Mayo 11, 1998");
                A2.setText("Mayo 3, 1979");
                A3.setText("Mayo 12, 1997");
                A4.setText("Mayo 10, 1998");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay Ang kaunlaran ay nababatay sa kung paano pinahahalagahan ng pamahalaan at mamamayan ang kalikasan at kalusugan ng bawat isa.",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("39. Kailan naihalal si Joseph Estrada bilang pangulo ng Pilipinas?");

                A1.setText("Mayo 11, 1998");
                A2.setText("Mayo 3, 1979");
                A3.setText("Mayo 12, 1997");
                A4.setText("Mayo 10, 1998");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 38) {
            if (answerContent.equals("Mayo 11, 1998")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("40. Siya ang ikalabintatlong pangulo n gating bansa na nanumpa sa kanyang tungkulin bilang Pangulo ng Pilipinas sa Barasoain Church, Malolos, Bulacan");

                A1.setText("Fidel V. Ramos");
                A2.setText("Corazon C. Aquino");
                A3.setText("Joseph E. Estrada");
                A4.setText("Gloria M. Arroyo");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay Mayo 11, 1998",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("40. Siya ang ikalabintatlong pangulo n gating bansa na nanumpa sa kanyang tungkulin bilang Pangulo ng Pilipinas sa Barasoain Church, Malolos, Bulacan");

                A1.setText("Fidel V. Ramos");
                A2.setText("Corazon C. Aquino");
                A3.setText("Joseph E. Estrada");
                A4.setText("Gloria M. Arroyo");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 39) {
            if (answerContent.equals("Joseph E. Estrada")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("41. Ano ang bumubuo sa populasyon?");

                A1.setText("mga lupain");
                A2.setText("mga pagkain");
                A3.setText("mga kagubatan");
                A4.setText("mga mamamayan");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay Joseph E. Estrada",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("41. Ano ang bumubuo sa populasyon?");

                A1.setText("mga lupain");
                A2.setText("mga pagkain");
                A3.setText("mga kagubatan");
                A4.setText("mga mamamayan");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 40) {
            if (answerContent.equals("mga mamamayan")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("42. Mabisang kasama sa produksyon ang mga mangagagawa kung");

                A1.setText("sakitin");
                A2.setText("palaasa");
                A3.setText("mapagsarili");
                A4.setText("malalakas at matatalino");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay mga mamamayan",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("42. Mabisang kasama sa produksyon ang mga mangagagawa kung");

                A1.setText("sakitin");
                A2.setText("palaasa");
                A3.setText("mapagsarili");
                A4.setText("malalakas at matatalino");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 41) {
            if (answerContent.equals("malalakas at matatalino")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("43. Ano ang tawag sa bilang at dami ng tao sa isang lugar?");

                A1.setText("polusyon");
                A2.setText("nutrisyon");
                A3.setText("populasyon");
                A4.setText("intitusyon");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay malalakas at matatalino",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("43. Ano ang tawag sa bilang at dami ng tao sa isang lugar?");

                A1.setText("polusyon");
                A2.setText("nutrisyon");
                A3.setText("populasyon");
                A4.setText("intitusyon");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 42) {
            if (answerContent.equals("populasyon")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("44. Paano nasusukat ang kapal ng populasyon?");

                A1.setText("kilometrong parisukat");
                A2.setText("metrong parisukat");
                A3.setText("milyang parisukat");
                A4.setText("ektaryang parisukat");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay populasyon",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("44. Paano nasusukat ang kapal ng populasyon?");

                A1.setText("kilometrong parisukat");
                A2.setText("metrong parisukat");
                A3.setText("milyang parisukat");
                A4.setText("ektaryang parisukat");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 43) {
            if (answerContent.equals("ektaryang parisukat")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("45. Ang distribusyon ng populasyon ay nasusukat sa pamamagitan ng");

                A1.setText("kapal ng populasyon");
                A2.setText("kilometrong parisukat");
                A3.setText("distribusyon");
                A4.setText("dami ng tao");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay ektaryang parisukat",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("45. Ang distribusyon ng populasyon ay nasusukat sa pamamagitan ng");

                A1.setText("kapal ng populasyon");
                A2.setText("kilometrong parisukat");
                A3.setText("distribusyon");
                A4.setText("dami ng tao");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 44) {
            if (answerContent.equals("kapal ng populasyon")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("46. Ang isang katangian ng populasyon ng Pilipinas ay");

                A1.setText("pantay na distribusyon");
                A2.setText("hindi pantay na distribusyon");
                A3.setText("walang distribusyon");
                A4.setText("maraming distribusyon");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay kapal ng populasyon",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("46. Ang isang katangian ng populasyon ng Pilipinas ay");

                A1.setText("pantay na distribusyon");
                A2.setText("hindi pantay na distribusyon");
                A3.setText("walang distribusyon");
                A4.setText("maraming distribusyon");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 45) {
            if (answerContent.equals("hindi pantay na distribusyon")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("47. Ang populasyon ng Pilipinas ayon sa gulang at kasarian ay");

                A1.setText("magulang");
                A2.setText("matanda");
                A3.setText("bata");
                A4.setText("binata");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay hindi pantay na distribusyon",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("47. Ang populasyon ng Pilipinas ayon sa gulang at kasarian ay");

                A1.setText("magulang");
                A2.setText("matanda");
                A3.setText("bata");
                A4.setText("binata");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 46) {
            if (answerContent.equals("bata")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("48. Sila ay bumubuo ng populasyon malakas sa paggawa");

                A1.setText("65 pataas");
                A2.setText("0-14");
                A3.setText("0-13");
                A4.setText("15-64");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay bata",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("48. Sila ay bumubuo ng populasyon malakas sa paggawa");

                A1.setText("65 pataas");
                A2.setText("0-14");
                A3.setText("0-13");
                A4.setText("15-64");



                scoreTxt.setText(score+0+"");

            }
        }

        if (n == 47) {
            if (answerContent.equals("15-64")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("49. Ang kabuuang populasyon sa taong 2016 ay");

                A1.setText("mahigit 97 milyon");
                A2.setText("mahigit 100 milyon");
                A3.setText("mahigit 77 milyon");
                A4.setText("mahigit 37 milyon");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay 15-64",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("49. Ang kabuuang populasyon sa taong 2016 ay");

                A1.setText("mahigit 97 milyon");
                A2.setText("mahigit 100 milyon");
                A3.setText("mahigit 77 milyon");
                A4.setText("mahigit 37 milyon");



                scoreTxt.setText(score+0+"");

            }
        }


        if (n == 48) {
            if (answerContent.equals("mahigit 100 milyon")) {
                Toast.makeText(getApplicationContext(), "Correct",
                        Toast.LENGTH_SHORT).show();
                quiz.setText("50. Ang pagcensus ng populayon ay isinisigawa kada");

                A1.setText("10 araw");
                A2.setText("10 linggo");
                A3.setText("10 buwan");
                A4.setText("10 taon");


                scoreTxt.setText(score + 1 + "");

            } else {
                //incorrect
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay mahigit 100 milyon",
                        Toast.LENGTH_SHORT).show();

                quiz.setText("50. Ang pagcensus ng populayon ay isinisigawa kada");

                A1.setText("10 araw");
                A2.setText("10 linggo");
                A3.setText("10 buwan");
                A4.setText("10 taon");



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
            if (answerContent.equals("10 araw")){
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
                Toast.makeText(getApplicationContext(), "Wrong, Tamang sagot ay 10 araw",
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
