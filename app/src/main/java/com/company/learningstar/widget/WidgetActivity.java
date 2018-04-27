package com.company.learningstar.widget;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.company.learningstar.R;

public class WidgetActivity extends Activity {

    private AutoCompleteTextView autoCompleteTextView;
    private String[] res={"beijing1","beijing2","beijing3","shanghai1","shanghai2","shanghai3"};


    private MultiAutoCompleteTextView multiAutoCompleteTextView;

    private ImageView imageViewOne,imageViewTwo,imageViewThree;

    private ToggleButton toggleButton;
    private CheckBox checkBox;
    private RadioButton radioButton,radioButtonOne,radioButtonTwo;
    private RadioGroup radioGroup;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget);
        initAutoCompleteTextView();
        initMultiAutoCompleteTextView();
        initImageView();
        initToggleButton();
        initCheckBox();
        initRadio();

    }

    private void initRadio() {
        radioButton=findViewById(R.id.radioButton);
        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(WidgetActivity.this,"---isChecked-->"+isChecked,Toast.LENGTH_SHORT).show();

            }
        });
        radioGroup=findViewById(R.id.radioGroup);
        radioButtonOne=findViewById(R.id.radioButtonOne);
        radioButtonTwo=findViewById(R.id.radioButtonTwo);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radioButtonOne:
                        Toast.makeText(WidgetActivity.this,radioButtonOne.getText().toString(),Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButtonTwo:
                        Toast.makeText(WidgetActivity.this,radioButtonTwo.getText().toString(),Toast.LENGTH_SHORT).show();

                        break;

                }
            }
        });
    }

    private void initCheckBox() {
        checkBox=findViewById(R.id.checkBox);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(WidgetActivity.this,"isChecked-->"+isChecked,Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void initToggleButton() {
        toggleButton=findViewById(R.id.toggleButton);
        /**
         * 添加选择改变的监听器
         */
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(WidgetActivity.this,"isChecked-->"+isChecked,Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void initImageView() {
        imageViewOne=findViewById(R.id.imageView_one);
        imageViewTwo=findViewById(R.id.imageView_two);
        imageViewThree=findViewById(R.id.imageView_three);
    }

    private void initMultiAutoCompleteTextView() {
        multiAutoCompleteTextView=findViewById(R.id.multiAutoCompleteTextView);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,res);
        multiAutoCompleteTextView.setAdapter(arrayAdapter);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());//逗号
    }

    private void initAutoCompleteTextView() {
        autoCompleteTextView=findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,res);
        autoCompleteTextView.setAdapter(arrayAdapter);
    }
}
