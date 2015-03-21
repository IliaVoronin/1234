package com.example.voronin.numbergame;

import android.widget.TextView;

public class generateMethod {

    int a,b,c,stepOne,stepTwo,actOne,actTwo;

    public void genAndFill (TextView textView1) {

        //COUNTING
        while (true) {
            a = 1 + (int) (Math.random() * 3);
            b = 1 + (int) (Math.random() * 3);
            c = 1 + (int) (Math.random() * 3);
            actOne = 1 + (int) (Math.random() * 2);

            actTwo = 1 + (int) (Math.random() * 2);

            if (actOne == 1) stepOne = a + b;
            else stepOne = a - b;

            if (actTwo == 1) stepTwo = stepOne + c;
            else stepTwo = stepOne - c;

            if (stepTwo >= 1 && stepTwo <= 3) {
                break;
            }
        }
        // OUTPUT
        textView1.setText(String.valueOf(a));
        if (actOne == 1) textView1.setText(textView1.getText()+"+");
        else textView1.setText(textView1.getText()+"-");
        textView1.setText(textView1.getText()+String.valueOf(b));
        if (actTwo == 1) textView1.setText(textView1.getText()+"+");
        else textView1.setText(textView1.getText()+"-");
        textView1.setText(textView1.getText()+String.valueOf(c));

    }

    public int getStepTwo() {
        return stepTwo;
    }
}
