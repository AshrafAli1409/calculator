package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import org.mariuszgromada.math.mxparser.*;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edit);
        editText.setShowSoftInputOnFocus(false);
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getString(R.string.display).equals(editText.getText().toString())) {
                    editText.setText("");
                }
            }
        });

    }


    public void updateText(String StrToAdd) {
        String oldString = editText.getText().toString();
        int cursorPos = editText.getSelectionStart();
        String leftStr = oldString.substring(0, cursorPos);
        String rightStr = oldString.substring(cursorPos);
        if(getString(R.string.display).equals(editText.getText().toString())){
       editText.setText(StrToAdd);
            editText.setSelection(cursorPos+1);
        }else{
            editText.setText(String.format("%s%s%s", leftStr, StrToAdd, rightStr));
editText.setSelection(cursorPos+1);
        }

    }
    public void zero(View view){
        updateText("0");

    }

    public void exponensial(View view){
        updateText("^");

    }
    public void parenthses(View view){


    }
    public void dot(View view){
        updateText(".");
    }
    public void equal(View view){
String userExp=editText.getText().toString();
Expression expression=new Expression(userExp);
String result=String.valueOf(expression.calculate());
editText.setText(result);
editText.setSelection(result.length());

    }
   public void divide(View view){
updateText("/");
    }
    public void multi(View view){
updateText("*");
    }
    public void three(View view){
        updateText("3");
    }
   public void two(View view){
        updateText("2");
    }
    public void one(View view){
        updateText("1");
    }
    public void clear(View view){
        editText.getText().toString();
        editText.setText("");

    }
    public void subtract(View view){
        updateText("-");

    }
    public void six(View view){
        updateText("6");
    }
    public void five(View view){
        updateText("5");
    }
    public void four(View view){
        updateText("4");
    }
    public void backspace(View view){
        int cursorPos=editText.getSelectionStart();
        int testLen=editText.getText().length();
        if(cursorPos!=0 && testLen!=0){
            SpannableStringBuilder selection=(SpannableStringBuilder)editText.getText();
            selection.replace(cursorPos-1,cursorPos,"");
            editText.setText(selection);
            editText.setSelection(cursorPos-1);

        }


    }
   public void addition(View view){
        updateText("+");



    }
    public void nine(View view){
        updateText("9");
    }
   public void eight(View view){
        updateText("8");
    }
    public void seven(View view){
        updateText("7");
    }









}