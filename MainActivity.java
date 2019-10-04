package com.example.tableassignment;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.GridLayout;
import android.os.Bundle;
import android.graphics.Color;
import android.widget.TextView;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Add Horizontal View Scroll
        HorizontalScrollView sv = new HorizontalScrollView(this);
        LinearLayout lv = new LinearLayout(this);
        lv.setOrientation(LinearLayout.HORIZONTAL);

        sv.addView(lv);

        // Grid layout
        GridLayout root = new GridLayout(this);
        ViewGroup.LayoutParams rParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        root.setLayoutParams(rParams);
        root.setOrientation(GridLayout.VERTICAL);
        root.setBackgroundColor(Color.GRAY);
        root.setColumnCount(4);
        root.setRowCount(11);
        root.setMinimumWidth(50);

        TextView tv = new TextView(this);
        tv.setText("2");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.GRAY);

        GridLayout.Spec row_spec = GridLayout.spec(1,1f);
        GridLayout.Spec col_spec = GridLayout.spec(1, 1f);
        GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(30, 0, 30, 0);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("1");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.GRAY);

        row_spec = GridLayout.spec(0,1f);
        col_spec = GridLayout.spec(0, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(30, 0, 30, 0);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        TextView tv2 = new TextView(this);
        tv2.setText("3");
        tv2.setTextSize(16);
        tv2.setBackgroundColor(Color.GRAY);

        row_spec = GridLayout.spec(2,1f);
        col_spec = GridLayout.spec(0, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(30, 0, 30, 0);
        tv2.setLayoutParams(cParams);
        root.addView(tv2);

        TextView tv3 = new TextView(this);
        tv3.setText("4");
        tv3.setTextSize(16);
        tv3.setBackgroundColor(Color.GRAY);

        row_spec = GridLayout.spec(3,1f);
        col_spec = GridLayout.spec(0, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(30, 0, 30, 0);
        tv3.setLayoutParams(cParams);
        root.addView(tv3);

        TextView tv4 = new TextView(this);
        tv4.setText("5");
        tv4.setTextSize(16);
        tv4.setBackgroundColor(Color.GRAY);

        row_spec = GridLayout.spec(4,1f);
        col_spec = GridLayout.spec(0, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(30, 0, 30, 0);
        tv4.setLayoutParams(cParams);
        root.addView(tv4);

        TextView tv5 = new TextView(this);
        tv5.setText("6");
        tv5.setTextSize(16);
        tv5.setBackgroundColor(Color.GRAY);

        row_spec = GridLayout.spec(5,1f);
        col_spec = GridLayout.spec(0, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(30, 0, 30, 0);
        tv5.setLayoutParams(cParams);
        root.addView(tv5);

        TextView tv6 = new TextView(this);
        tv6.setText("7");
        tv6.setTextSize(16);
        tv6.setBackgroundColor(Color.GRAY);

        row_spec = GridLayout.spec(6,1f);
        col_spec = GridLayout.spec(0, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(30, 0, 30, 0);
        tv6.setLayoutParams(cParams);
        root.addView(tv6);

        TextView tv7 = new TextView(this);
        tv7.setText("8");
        tv7.setTextSize(16);
        tv7.setBackgroundColor(Color.GRAY);

        row_spec = GridLayout.spec(7,1f);
        col_spec = GridLayout.spec(0, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(30, 0, 30, 0);
        tv7.setLayoutParams(cParams);
        root.addView(tv7);

        TextView tv8 = new TextView(this);
        tv8.setText("9");
        tv8.setTextSize(16);
        tv8.setBackgroundColor(Color.GRAY);

        row_spec = GridLayout.spec(8,1f);
        col_spec = GridLayout.spec(0, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(30, 0, 30, 0);
        tv8.setLayoutParams(cParams);
        root.addView(tv8);

        TextView tv9 = new TextView(this);
        tv9.setText("10");
        tv9.setTextSize(16);
        tv9.setBackgroundColor(Color.GRAY);

        row_spec = GridLayout.spec(9,1f);
        col_spec = GridLayout.spec(0, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(30, 0, 30, 0);
        tv9.setLayoutParams(cParams);
        root.addView(tv9);

        TextView tv10 = new TextView(this);
        tv10.setText("11");
        tv10.setTextSize(16);
        tv10.setBackgroundColor(Color.GRAY);

        row_spec = GridLayout.spec(10,1f);
        col_spec = GridLayout.spec(0, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(30, 0, 30, 0);
        tv10.setLayoutParams(cParams);
        root.addView(tv10);

        //

        TextView tv11 = new TextView(this);
        tv11.setText("");
        tv11.setTextSize(16);
        tv11.setBackgroundColor(Color.BLACK);
        tv11.setTextColor(Color.WHITE);
        tv11.setPadding(50,0,50,0);
        tv11.setWidth(300);

        row_spec = GridLayout.spec(0,10f);
        col_spec = GridLayout.spec(1, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tv11);

        TextView tv12 = new TextView(this);
        tv12.setText("");
        tv12.setTextSize(16);
        tv12.setBackgroundColor(Color.WHITE);
        tv12.setPadding(80, 0,80,0);
        tv12.setWidth(300);

        row_spec = GridLayout.spec(1);
        col_spec = GridLayout.spec(1, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tv12);

        TextView tv13 = new TextView(this);
        tv13.setText("properties");
        tv13.setTextSize(16);
        tv13.setBackgroundColor(Color.WHITE);
        tv13.setPadding(30, 0,0,0);
        tv13.setWidth(300);

        row_spec = GridLayout.spec(5,1f);
        col_spec = GridLayout.spec(1, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tv13);

        TextView tv14 = new TextView(this);
        tv14.setText("Rule");
        tv14.setTextSize(16);
        tv14.setBackgroundColor(Color.CYAN);
        tv14.setPadding(100, 0,0,10);
        tv14.setWidth(300);

        row_spec = GridLayout.spec(5,1f);
        col_spec = GridLayout.spec(1, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tv14);

        TextView tv15 = new TextView(this);
        tv15.setTextSize(16);
        tv15.setBackgroundColor(Color.CYAN);
        tv15.setPadding(0, 0,0,10);
        tv15.setWidth(300);

        row_spec = GridLayout.spec(5,1f);
        col_spec = GridLayout.spec(1, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tv15);

        TextView tv16 = new TextView(this);
        tv16.setTextSize(16);
        tv16.setBackgroundColor(Color.CYAN);
        tv16.setPadding(0, 0,0,10);
        tv16.setWidth(300);

        row_spec = GridLayout.spec(5,1f);
        col_spec = GridLayout.spec(1, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tv16);

        TextView tv17 = new TextView(this);
        tv17.setText("Rule");
        tv17.setTextSize(16);
        tv17.setBackgroundColor(Color.WHITE);
        tv17.setPadding(0, 0,0,10);
        tv17.setWidth(300);

        row_spec = GridLayout.spec(5,1f);
        col_spec = GridLayout.spec(1, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tv17);

        TextView tv18 = new TextView(this);
        tv18.setText("R10");
        tv18.setTextSize(16);
        tv18.setBackgroundColor(Color.WHITE);
        tv18.setPadding(0, 0,0,10);
        tv18.setWidth(300);

        row_spec = GridLayout.spec(5,1f);
        col_spec = GridLayout.spec(1, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tv18);

        TextView tv19 = new TextView(this);
        tv19.setText("R20");
        tv19.setTextSize(16);
        tv19.setBackgroundColor(Color.WHITE);
        tv19.setPadding(0, 0,0,10);
        tv19.setWidth(300);

        row_spec = GridLayout.spec(5,1f);
        col_spec = GridLayout.spec(1, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tv19);

        TextView tv20 = new TextView(this);
        tv20.setText("R30");
        tv20.setTextSize(16);
        tv20.setBackgroundColor(Color.WHITE);
        tv20.setPadding(0, 0,0,10);
        tv20.setWidth(300);

        row_spec = GridLayout.spec(5,1f);
        col_spec = GridLayout.spec(1, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tv20);

        TextView tv21 = new TextView(this);
        tv21.setText("R40");
        tv21.setTextSize(16);
        tv21.setBackgroundColor(Color.WHITE);
        tv21.setPadding(0, 0,0,10);
        tv21.setWidth(300);

        row_spec = GridLayout.spec(5,1f);
        col_spec = GridLayout.spec(1, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tv21);

        //

        TextView tvcol3 = new TextView(this);
        tvcol3.setText("Rules void hello1(int hour)");
        tvcol3.setTextSize(16);
        tvcol3.setBackgroundColor(Color.BLACK);
        tvcol3.setTextColor(Color.WHITE);
        tvcol3.setPadding(30, 0,0,10);
        tvcol3.setWidth(600);

        row_spec = GridLayout.spec(0,1f);
        col_spec = GridLayout.spec(2, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tvcol3);

        TextView tvcol3_1 = new TextView(this);
        tvcol3_1.setText("name");
        tvcol3_1.setTextSize(16);
        tvcol3_1.setBackgroundColor(Color.WHITE);
        tvcol3_1.setPadding(250, 0,0,10);
        tvcol3_1.setWidth(600);

        row_spec = GridLayout.spec(0,1f);
        col_spec = GridLayout.spec(2, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tvcol3_1);

        TextView tvcol3_2 = new TextView(this);
        tvcol3_2.setText("category");
        tvcol3_2.setTextSize(16);
        tvcol3_2.setBackgroundColor(Color.WHITE);
        tvcol3_2.setPadding(225, 0,0,10);
        tvcol3_2.setWidth(600);

        row_spec = GridLayout.spec(0,1f);
        col_spec = GridLayout.spec(2, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tvcol3_2);

        TextView tvcol3_3 = new TextView(this);
        tvcol3_3.setText("C1");
        tvcol3_3.setTextSize(16);
        tvcol3_3.setBackgroundColor(Color.CYAN);
        tvcol3_3.setPadding(280, 0,0,10);
        tvcol3_3.setWidth(600);

        row_spec = GridLayout.spec(0,1f);
        col_spec = GridLayout.spec(2, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tvcol3_3);

        TextView tvcol3_4 = new TextView(this);
        tvcol3_4.setText("min <= hour && hour <= max");
        tvcol3_4.setTextSize(16);
        tvcol3_4.setBackgroundColor(Color.CYAN);
        tvcol3_4.setPadding(20, 0,0,10);
        tvcol3_4.setWidth(600);

        row_spec = GridLayout.spec(0,1f);
        col_spec = GridLayout.spec(2, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tvcol3_4);

        TextView tvcol3_5 = new TextView(this);
        tvcol3_5.setText("int min         int max");
        tvcol3_5.setTextSize(16);
        tvcol3_5.setBackgroundColor(Color.CYAN);
        tvcol3_5.setPadding(100, 0,0,10);
        tvcol3_5.setWidth(600);

        row_spec = GridLayout.spec(0,1f);
        col_spec = GridLayout.spec(2, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tvcol3_5);

        TextView tvcol3_6 = new TextView(this);
        tvcol3_6.setText("From                     To");
        tvcol3_6.setTextSize(16);
        tvcol3_6.setBackgroundColor(Color.YELLOW);
        tvcol3_6.setPadding(10, 0,0,10);
        tvcol3_6.setWidth(600);

        row_spec = GridLayout.spec(0,1f);
        col_spec = GridLayout.spec(2, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tvcol3_6);

        TextView tvcol3_7 = new TextView(this);
        tvcol3_7.setText(" 0                     11");
        tvcol3_7.setTextSize(16);
        tvcol3_7.setBackgroundColor(Color.YELLOW);
        tvcol3_7.setPadding(280, 0,0,10);
        tvcol3_7.setWidth(600);

        row_spec = GridLayout.spec(0,1f);
        col_spec = GridLayout.spec(2, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tvcol3_7);

        TextView tvcol3_8 = new TextView(this);
        tvcol3_8.setText("12                   17");
        tvcol3_8.setTextSize(16);
        tvcol3_8.setBackgroundColor(Color.YELLOW);
        tvcol3_8.setPadding(280, 0,0,10);
        tvcol3_8.setWidth(600);

        row_spec = GridLayout.spec(0,1f);
        col_spec = GridLayout.spec(2, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tvcol3_8);

        TextView tvcol3_9 = new TextView(this);
        tvcol3_9.setText("18                   21");
        tvcol3_9.setTextSize(16);
        tvcol3_9.setBackgroundColor(Color.YELLOW);
        tvcol3_9.setPadding(280, 0,0,10);
        tvcol3_9.setWidth(600);

        row_spec = GridLayout.spec(0,1f);
        col_spec = GridLayout.spec(2, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tvcol3_9);

        TextView tvcol3_10 = new TextView(this);
        tvcol3_10.setText("22                   23");
        tvcol3_10.setTextSize(16);
        tvcol3_10.setBackgroundColor(Color.YELLOW);
        tvcol3_10.setPadding(280, 0,0,10);
        tvcol3_10.setWidth(600);

        row_spec = GridLayout.spec(0,1f);
        col_spec = GridLayout.spec(2, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tvcol3_10);

        //

        TextView tvcol4 = new TextView(this);
        tvcol4.setText("");
        tvcol4.setTextSize(16);
        tvcol4.setBackgroundColor(Color.BLACK);
        tvcol4.setTextColor(Color.WHITE);
        tvcol4.setPadding(30, 0,0,10);
        tvcol4.setWidth(900);

        row_spec = GridLayout.spec(0,1f);
        col_spec = GridLayout.spec(3, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tvcol4);

        TextView tvcol4_1 = new TextView(this);
        tvcol4_1.setText("Day Hour Classification");
        tvcol4_1.setTextSize(16);
        tvcol4_1.setBackgroundColor(Color.WHITE);
        tvcol4_1.setPadding(10, 0,0,10);
        tvcol4_1.setWidth(900);

        row_spec = GridLayout.spec(0,1f);
        col_spec = GridLayout.spec(3, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tvcol4_1);

        TextView tvcol4_2 = new TextView(this);
        tvcol4_2.setText("Day and Time");
        tvcol4_2.setTextSize(16);
        tvcol4_2.setBackgroundColor(Color.WHITE);
        tvcol4_2.setPadding(10, 0,0,10);
        tvcol4_2.setWidth(900);

        row_spec = GridLayout.spec(0,1f);
        col_spec = GridLayout.spec(3, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tvcol4_2);

        TextView tvcol4_3 = new TextView(this);
        tvcol4_3.setText("A1");
        tvcol4_3.setTextSize(16);
        tvcol4_3.setBackgroundColor(Color.CYAN);
        tvcol4_3.setPadding(400, 0,0,10);
        tvcol4_3.setWidth(900);

        row_spec = GridLayout.spec(0,1f);
        col_spec = GridLayout.spec(3, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tvcol4_3);

        TextView tvcol4_4 = new TextView(this);
        tvcol4_4.setText("System.out.println(greeting + \", World!\")");
        tvcol4_4.setTextSize(16);
        tvcol4_4.setBackgroundColor(Color.CYAN);
        tvcol4_4.setPadding(40, 0,0,10);
        tvcol4_4.setWidth(900);

        row_spec = GridLayout.spec(0,1f);
        col_spec = GridLayout.spec(3, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tvcol4_4);

        TextView tvcol4_5 = new TextView(this);
        tvcol4_5.setText("String greeting");
        tvcol4_5.setTextSize(16);
        tvcol4_5.setBackgroundColor(Color.CYAN);
        tvcol4_5.setPadding(260, 0,0,10);
        tvcol4_5.setWidth(900);

        row_spec = GridLayout.spec(0,1f);
        col_spec = GridLayout.spec(3, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tvcol4_5);

        TextView tvcol4_6 = new TextView(this);
        tvcol4_6.setText("Greeting");
        tvcol4_6.setTextSize(16);
        tvcol4_6.setBackgroundColor(Color.rgb(255, 165, 0));
        tvcol4_6.setPadding(10, 0,0,10);
        tvcol4_6.setWidth(900);

        row_spec = GridLayout.spec(0,1f);
        col_spec = GridLayout.spec(3, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tvcol4_6);

        TextView tvcol4_7 = new TextView(this);
        tvcol4_7.setText("Good Morning");
        tvcol4_7.setTextSize(16);
        tvcol4_7.setBackgroundColor(Color.rgb(255, 165, 0));
        tvcol4_7.setPadding(10, 0,0,10);
        tvcol4_7.setWidth(900);

        row_spec = GridLayout.spec(0,1f);
        col_spec = GridLayout.spec(3, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tvcol4_7);

        TextView tvcol4_8 = new TextView(this);
        tvcol4_8.setText("Good Afternoon");
        tvcol4_8.setTextSize(16);
        tvcol4_8.setBackgroundColor(Color.rgb(255, 165, 0));
        tvcol4_8.setPadding(10, 0,0,10);
        tvcol4_8.setWidth(900);

        row_spec = GridLayout.spec(0,1f);
        col_spec = GridLayout.spec(3, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tvcol4_8);

        TextView tvcol4_9 = new TextView(this);
        tvcol4_9.setText("Good Evening");
        tvcol4_9.setTextSize(16);
        tvcol4_9.setBackgroundColor(Color.rgb(255, 165, 0));
        tvcol4_9.setPadding(10, 0,0,10);
        tvcol4_9.setWidth(900);

        row_spec = GridLayout.spec(0,1f);
        col_spec = GridLayout.spec(3, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tvcol4_9);

        TextView tvcol4_10 = new TextView(this);
        tvcol4_10.setText("Good Night");
        tvcol4_10.setTextSize(16);
        tvcol4_10.setBackgroundColor(Color.rgb(255, 165, 0));
        tvcol4_10.setPadding(10, 0,0,10);
        tvcol4_10.setWidth(900);

        row_spec = GridLayout.spec(0,1f);
        col_spec = GridLayout.spec(3, 2,0f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(50, 0, 50, 0);
        root.addView(tvcol4_10);


        setContentView(root);


        //setContentView(R.layout.activity_main);
    }
}
