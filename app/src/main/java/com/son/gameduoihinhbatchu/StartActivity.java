package com.son.gameduoihinhbatchu;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.son.gameduoihinhbatchu.databinding.MainActivityBinding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class StartActivity extends Activity implements View.OnClickListener {
    private static final String RESULD = "RESULD ";
    private static final String TAG = StartActivity.class.getSimpleName();
    private MainActivityBinding binding;
    private final Vector<Button> btnMng = new Vector<>();
    private final ArrayList<Button> btnAnsMng = new ArrayList<>();
    private final ArrayList<Question> questionsMng = new ArrayList<>();
    private static final int HEART = 5;


    //    private ImageView ivPicture;
//    private TextView tvResult, tvScore, tvHeart;
    private Random rd;
    private int count;
    private int heart;
    private int score;
    private String answer;
    private String question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = MainActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        init();
        starQuestion();
    }

    private void init() {
        count = 0;
        heart = HEART;
        rd = new Random();
        answer = "";
        question = "";
        binding.btnNext.setOnClickListener(this);
        btnMng.add(binding.btn1);
        btnMng.add(binding.btn2);
        btnMng.add(binding.btn3);
        btnMng.add(binding.btn4);
        btnMng.add(binding.btn5);
        btnMng.add(binding.btn6);
        btnMng.add(binding.btn7);
        btnMng.add(binding.btn8);
        btnMng.add(binding.btn9);
        btnMng.add(binding.btn10);
        btnMng.add(binding.btn11);
        btnMng.add(binding.btn12);
        btnMng.add(binding.btn13);
        btnMng.add(binding.btn14);
        btnMng.add(binding.btn15);
        btnMng.add(binding.btn16);
        for (int i = 0; i < btnMng.size(); i++) {
            btnMng.get(i).setOnClickListener(this);
            Log.i(TAG, "i = " + i + "..." + btnMng.get(i));
        }

//        btnAnsMng = [btnAnswer1, btnAnswer2,....btnAnswer16]
        btnAnsMng.add(binding.btnAnswer1);
        btnAnsMng.add(binding.btnAnswer2);
        btnAnsMng.add(binding.btnAnswer3);
        btnAnsMng.add(binding.btnAnswer4);
        btnAnsMng.add(binding.btnAnswer5);
        btnAnsMng.add(binding.btnAnswer6);
        btnAnsMng.add(binding.btnAnswer7);
        btnAnsMng.add(binding.btnAnswer8);
        btnAnsMng.add(binding.btnAnswer9);
        btnAnsMng.add(binding.btnAnswer10);
        btnAnsMng.add(binding.btnAnswer11);
        btnAnsMng.add(binding.btnAnswer12);
        btnAnsMng.add(binding.btnAnswer13);
        btnAnsMng.add(binding.btnAnswer14);
        btnAnsMng.add(binding.btnAnswer15);
        btnAnsMng.add(binding.btnAnswer16);

        for (int i = 0; i < btnAnsMng.size(); i++) {
            btnAnsMng.get(i).setVisibility(View.GONE);
            btnAnsMng.get(i).setOnClickListener(this);
        }

        Question Q1 = new Question(R.drawable.aomua, "AOMUA");
        Question Q2 = new Question(R.drawable.baocao, "BAOCAO");
        Question Q3 = new Question(R.drawable.canthiep, "CANTHIEP");
        Question Q4 = new Question(R.drawable.cattuong, "CATTUONG");
        Question Q5 = new Question(R.drawable.chieutre, "CHIEUTRE");
        Question Q6 = new Question(R.drawable.danhlua, "DANHLUA");
        Question Q7 = new Question(R.drawable.danong, "DANONG");
        Question Q8 = new Question(R.drawable.giandiep, "GIANDIEP");
        Question Q9 = new Question(R.drawable.giangmai, "GIANGMAI");
        Question Q10 = new Question(R.drawable.xaphong, "XÀPHÒNG");
        Question Q11 = new Question(R.drawable.baocao, "BAOCAO");
        Question Q12 = new Question(R.drawable.hongtam, "HONGTAM");
        Question Q13 = new Question(R.drawable.khoailang, "KHOAILANG");
        Question Q14 = new Question(R.drawable.kiemchuyen, "KIEMCHUYEN");
        Question Q15 = new Question(R.drawable.lancan, "LANCAN");
        Question Q16 = new Question(R.drawable.masat, "MASAT");
        Question Q17 = new Question(R.drawable.hoidong, "HOIDONG");
        Question Q18 = new Question(R.drawable.nambancau, "NAMBANCAU");
        Question Q19 = new Question(R.drawable.oto, "OTO");
        Question Q20 = new Question(R.drawable.quyhang, "QUYHANG");
        Question Q21 = new Question(R.drawable.xedapdien, "XEDAPDIEN");
        Question Q22 = new Question(R.drawable.xaphong, "XAPHONG");
        Question Q23 = new Question(R.drawable.xakep, "XAKEP");
        Question Q24 = new Question(R.drawable.vuonbachthu, "VUONBACHTHU");
        Question Q25 = new Question(R.drawable.vuaphaluoi, "VUAPHALUOI");
        Question Q26 = new Question(R.drawable.tranhthu, "TRANHTHU");
        Question Q27 = new Question(R.drawable.totien, "TOTIEN");
        Question Q28 = new Question(R.drawable.tohoai, "TOHOAI");
        Question Q29 = new Question(R.drawable.tichphan, "TICHPHAN");
        Question Q30 = new Question(R.drawable.thothe, "THOTHE");
        Question Q31 = new Question(R.drawable.songsong, "SONGSONG");
        Question Q32 = new Question(R.drawable.thattinh, "THATTINH");

        questionsMng.add(Q1);
        questionsMng.add(Q2);
        questionsMng.add(Q3);
        questionsMng.add(Q4);
        questionsMng.add(Q5);
        questionsMng.add(Q6);
        questionsMng.add(Q7);
        questionsMng.add(Q8);
        questionsMng.add(Q9);
        questionsMng.add(Q10);
        questionsMng.add(Q11);
        questionsMng.add(Q12);
        questionsMng.add(Q13);
        questionsMng.add(Q14);
        questionsMng.add(Q15);
        questionsMng.add(Q16);
        questionsMng.add(Q17);
        questionsMng.add(Q18);
        questionsMng.add(Q19);
        questionsMng.add(Q20);
        questionsMng.add(Q21);
        questionsMng.add(Q22);
        questionsMng.add(Q23);
        questionsMng.add(Q24);
        questionsMng.add(Q25);
        questionsMng.add(Q26);
        questionsMng.add(Q27);
        questionsMng.add(Q28);
        questionsMng.add(Q29);
        questionsMng.add(Q30);
        questionsMng.add(Q31);
        questionsMng.add(Q32);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_1:
                btnUser(binding.btn1);
                count++;
                checkAnswer();
                break;

            case R.id.btn_2:
                btnUser(binding.btn2);
                count++;
                checkAnswer();
                break;

            case R.id.btn_3:
                btnUser(binding.btn3);
                count++;
                checkAnswer();
                break;

            case R.id.btn_4:
                btnUser(binding.btn4);
                count++;
                checkAnswer();
                break;

            case R.id.btn_5:
                btnUser(binding.btn5);
                count++;
                checkAnswer();
                break;

            case R.id.btn_6:
                btnUser(binding.btn6);
                count++;
                checkAnswer();
                break;

            case R.id.btn_7:
                btnUser(binding.btn7);
                count++;
                checkAnswer();
                break;

            case R.id.btn_8:
                btnUser(binding.btn8);
                count++;
                checkAnswer();
                break;

            case R.id.btn_9:
                btnUser(binding.btn9);
                count++;
                checkAnswer();
                break;

            case R.id.btn_10:
                btnUser(binding.btn10);
                count++;
                checkAnswer();
                break;

            case R.id.btn_11:
                btnUser(binding.btn11);
                count++;
                checkAnswer();
                break;

            case R.id.btn_12:
                btnUser(binding.btn12);
                count++;
                checkAnswer();
                break;

            case R.id.btn_13:
                btnUser(binding.btn13);
                count++;
                checkAnswer();
                break;

            case R.id.btn_14:
                btnUser(binding.btn14);
                count++;
                checkAnswer();
                break;
            case R.id.btn_15:
                btnUser(binding.btn15);
                count++;
                checkAnswer();
                break;
            case R.id.btn_16:
                btnUser(binding.btn16);
                count++;
                checkAnswer();
                break;
            case R.id.btn_next:
                answer = "";
                resetButton();
                starQuestion();
                count = 0;
                break;
            case R.id.btn_Answer1:
                if (binding.btnAnswer2.getText() == "") {
                    dropButton(binding.btnAnswer1);
                }
                break;
            case R.id.btn_Answer2:
                if (binding.btnAnswer3.getText() == "") {
                    dropButton(binding.btnAnswer2);
                }
                break;
            case R.id.btn_Answer3:
                if (binding.btnAnswer4.getText() == "") {
                    dropButton(binding.btnAnswer3);
                }
                break;
            case R.id.btn_Answer4:
                if (binding.btnAnswer5.getText() == "") {
                    dropButton(binding.btnAnswer4);
                }
                break;
            case R.id.btn_Answer5:
                if (binding.btnAnswer6.getText() == "") {
                    dropButton(binding.btnAnswer5);
                }
                break;
            case R.id.btn_Answer6:
                if (binding.btnAnswer7.getText() == "") {
                    dropButton(binding.btnAnswer6);
                }
                break;
            case R.id.btn_Answer7:
                if (binding.btnAnswer8.getText() == "") {
                    dropButton(binding.btnAnswer7);
                }
                break;
            case R.id.btn_Answer8:
                if (binding.btnAnswer9.getText() == "") {
                    dropButton(binding.btnAnswer8);
                }
                break;
            case R.id.btn_Answer9:
                if (binding.btnAnswer10.getText() == "") {
                    dropButton(binding.btnAnswer9);
                }
                break;
            case R.id.btn_Answer10:
                if (binding.btnAnswer11.getText() == "") {
                    dropButton(binding.btnAnswer10);
                }
                break;
            case R.id.btn_Answer11:
                if (binding.btnAnswer12.getText() == "") {
                    dropButton(binding.btnAnswer11);
                }
                break;
            case R.id.btn_Answer12:
                if (binding.btnAnswer13.getText() == "") {
                    dropButton(binding.btnAnswer12);
                }
                break;
            case R.id.btn_Answer13:
                if (binding.btnAnswer14.getText() == "") {
                    dropButton(binding.btnAnswer13);
                }
                break;
            case R.id.btn_Answer14:
                if (binding.btnAnswer15.getText() == "") {
                    dropButton(binding.btnAnswer14);
                }
                break;
            case R.id.btn_Answer15:
                if (binding.btnAnswer16.getText() == "") {
                    dropButton(binding.btnAnswer15);
                }
                break;
            case R.id.btn_Answer16:
                dropButton(binding.btnAnswer16);
                break;

        }
    }

    private String makeAnswer(String str) {
        ArrayList<String> stringResult = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {    //XAPHONG i < 7
            stringResult.add(String.valueOf(str.charAt(i)));
            Log.i(TAG, "makeAnswer--stringResult = " + stringResult + "vi tri...." + i);
        }

        String string = String.valueOf((char) (rd.nextInt(35) + 65));
        while (stringResult.size() < 16){
            string = String.valueOf((char) rd.nextInt(35) + 65);
            if (!stringResult.contains(string)){
//                for (int i = 0; i < 16 - str.length(); i++) { //16-7 = 9
//                    Log.i(TAG, "i = " + i);
//                    Log.i(TAG, "string..." + string);
//                for (int index = stringResult.size()-1 ; index >= 0; index--) {
//                    Log.i(TAG, "index = " + index);
                    stringResult.add(string);
                    Log.i(TAG, "stringResult..." + stringResult);
//                }
//                }
            }
        }



        Collections.shuffle(stringResult);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < stringResult.size(); i++) {
            result.append(stringResult.get(i));
        }
        Log.i(TAG, "result: " + result);
        return result.toString();
    }

    public void starQuestion() {
        int temp = rd.nextInt(questionsMng.size());
        binding.ivPicture.setImageResource(questionsMng.get(temp).getPicture());
        answer = questionsMng.get(temp).getAnswer();
        Log.i(TAG, "answer...." + answer);
        question = makeAnswer(answer);
        Log.i(TAG, "question...." + question);  //NANGOD
        for (int i = 0; i < btnMng.size(); i++) {
            btnMng.get(i).setText(String.valueOf(question.charAt(i)));
        }
        for (int i = 0; i < answer.length(); i++) {
            btnAnsMng.get(i).setVisibility(View.VISIBLE);
        }
        binding.tvResult.setVisibility(View.GONE);
        binding.btnNext.setVisibility(View.GONE);
    }

    public void btnUser(Button btn) {
        String input = btn.getText().toString();
        btnAnsMng.get(count).setText(input);
        btn.setVisibility(View.GONE);
    }

    @SuppressLint({"ObsoleteSdkInt", "SetTextI18n", "UseCompatLoadingForDrawables"})
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    public void checkAnswer() {
        for (int i = 0; i < answer.length(); i++) {
            if (btnAnsMng.get(i).getText().toString().equals("")) {
                return;
            }
        }
        StringBuilder answerUser = new StringBuilder();
        for (int i = 0; i < answer.length(); i++) {
            Log.i(TAG, "ANSWER: " + answer);
            answerUser.append(btnAnsMng.get(i).getText().toString());
            Log.i(TAG, "checkAnswer: " + answerUser + "" + i);
        }
        if (answerUser.toString().equals(answer)) {
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            for (int i = 0; i < btnAnsMng.size(); i++) {
                btnAnsMng.get(i).setBackground(this.getResources().getDrawable(R.drawable.tile_true));
            }
            binding.tvResult.setVisibility(View.VISIBLE);
            binding.tvResult.setTextColor(Color.GREEN);
            binding.tvResult.setText("Dap an dung roi ^-^ ");
            binding.btnNext.setVisibility(View.VISIBLE);
            score += 100;
            binding.tvScore.setText("\t" + score);
        } else {
            Toast.makeText(this, "Dap an sai -_-", Toast.LENGTH_SHORT).show();
            for (int i = 0; i < btnAnsMng.size(); i++) {
                btnAnsMng.get(i).setBackground(this.getResources().getDrawable(R.drawable.tile_false));
            }
            binding.tvResult.setVisibility(View.VISIBLE);
            binding.tvResult.setTextColor(Color.RED);
            binding.tvResult.setText("Dap an sai -_- ");
            heart--;
            binding.tvHeart.setText(heart + "\t\t");
            if (heart == 0) {
                Toast.makeText(this, "YOU LOSE!!!", Toast.LENGTH_SHORT).show();
                finish();
            }
        }

    }

    public void dropButton(Button btn) {
        if (btn.getText().toString().equals("")) {
            return;
        }
        String temp = btn.getText().toString();
        btn.setText("");
        for (int i = 0; i < btnMng.size(); i++) {
            if (btnMng.get(i).getVisibility() == View.GONE) {
                btnMng.get(i).setText(temp);
                btnMng.get(i).setVisibility(View.VISIBLE);
                count--;
                break;
            }
        }
        Log.i(RESULD, temp);
    }

    @SuppressWarnings("deprecation")
    @SuppressLint("UseCompatLoadingForDrawables")
    public void resetButton() {
        for (int i = 0; i < btnAnsMng.size(); i++) {
            btnAnsMng.get(i).setText("");
            btnAnsMng.get(i).setVisibility(View.GONE);
            btnAnsMng.get(i).setBackground(this.getResources().getDrawable(R.drawable.tile_question));
        }
        for (int i = 0; i < btnMng.size(); i++) {
            btnMng.get(i).setVisibility(View.VISIBLE);
        }
    }
}
