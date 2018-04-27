package com.company.learningstar.widget;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;

import com.company.learningstar.R;

public class LayoutActivity extends Activity implements View.OnClickListener {
    private LinearLayout linearLayout;
    private RelativeLayout relativeLayout;
    private FrameLayout frameLayout;
    private TableLayout tableLayout;
    private AbsoluteLayout absoluteLayout;
    private Button buttonLinearLayout, buttonRelativeLayout, buttonFrameLayout, buttonTableLayout, buttonAbsoluteLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
        initView();

    }

    private void initView() {
        buttonLinearLayout = findViewById(R.id.button_linearLayout);
        buttonLinearLayout.setOnClickListener(this);
        buttonRelativeLayout = findViewById(R.id.button_relativeLayout);
        buttonRelativeLayout.setOnClickListener(this);
        buttonFrameLayout = findViewById(R.id.button_frameLayout);
        buttonFrameLayout.setOnClickListener(this);
        buttonTableLayout = findViewById(R.id.button_tableLayout);
        buttonTableLayout.setOnClickListener(this);
        buttonAbsoluteLayout = findViewById(R.id.button_absoluteLayout);
        buttonAbsoluteLayout.setOnClickListener(this);
        linearLayout = findViewById(R.id.linearLayout);
        linearLayout.setVisibility(View.GONE);
        relativeLayout = findViewById(R.id.relativeLayout);
        relativeLayout.setVisibility(View.GONE);
        frameLayout = findViewById(R.id.frameLayout);
        frameLayout.setVisibility(View.GONE);
        tableLayout = findViewById(R.id.tableLayout);
        tableLayout.setVisibility(View.GONE);
        absoluteLayout = findViewById(R.id.absoluteLayout);
        absoluteLayout.setVisibility(View.GONE);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_linearLayout:
                linearLayout.setVisibility(View.VISIBLE);
                relativeLayout.setVisibility(View.GONE);
                frameLayout.setVisibility(View.GONE);
                tableLayout.setVisibility(View.GONE);
                absoluteLayout.setVisibility(View.GONE);
                break;
            case R.id.button_relativeLayout:
                linearLayout.setVisibility(View.GONE);
                relativeLayout.setVisibility(View.VISIBLE);
                frameLayout.setVisibility(View.GONE);
                tableLayout.setVisibility(View.GONE);
                absoluteLayout.setVisibility(View.GONE);
                break;
            case R.id.button_frameLayout:
                linearLayout.setVisibility(View.GONE);
                relativeLayout.setVisibility(View.GONE);
                frameLayout.setVisibility(View.VISIBLE);
                tableLayout.setVisibility(View.GONE);
                absoluteLayout.setVisibility(View.GONE);
                break;
            case R.id.button_tableLayout:
                linearLayout.setVisibility(View.GONE);
                relativeLayout.setVisibility(View.GONE);
                frameLayout.setVisibility(View.GONE);
                tableLayout.setVisibility(View.VISIBLE);
                absoluteLayout.setVisibility(View.GONE);
                break;
            case R.id.button_absoluteLayout:
                linearLayout.setVisibility(View.GONE);
                relativeLayout.setVisibility(View.GONE);
                frameLayout.setVisibility(View.GONE);
                tableLayout.setVisibility(View.GONE);
                absoluteLayout.setVisibility(View.VISIBLE);
                break;

        }
    }
}
