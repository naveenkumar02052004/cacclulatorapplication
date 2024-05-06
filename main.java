package com.lovecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;
import java.util.Random.*;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        String name = String.valueOf(findViewById(R.id.name));
        String pairname = String.valueOf(findViewById(R.id.pairname));

        char n1 = name.charAt(0);
        char n2 = name.charAt(1);
        char n3 = name.charAt(2);
        char n4 = name.charAt(3);
        char n5 = name.charAt(4);
        char n6 = name.charAt(5);
        char n7 = name.charAt(6);
        char n8 = name.charAt(7);
        char n9 = name.charAt(8);
        char n10 = name.charAt(9);
        char p1 = pairname.charAt(0);
        char p2 = pairname.charAt(1);
        char p3 = pairname.charAt(2);
        char p4 = pairname.charAt(3);
        char p5 = pairname.charAt(4);
        char p6 = pairname.charAt(5);
        char p7 = pairname.charAt(6);
        char p8 = pairname.charAt(7);
        char p9 = pairname.charAt(8);
        char p10 = pairname.charAt(9);
        Button p = findViewById(R.id.percentage);

        Random r = new Random();

        int t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
        if(n1==p1){
             t1 = yes();
        }else{
            t1 = no();
        }
        if(n2==p2){
            t2 = yes();
        }else{
            t2 = no();
        }
        if(n3==p3){
            t3 = yes();
        }else{
            t3 = no();
        }
        if(n4==p4){
            t4 = yes();
        }else{
            t4 = no();
        }
        if(n5==p5){
            t5 = yes();
        }else{
            t5 = no();
        }
        if(n6==p6){
            t6 = yes();
        }else{
            t6 = no();
        }
        if(n7==p7){
            t7 = yes();
        }else{
            t7 = no();
        }
        if(n8==p8){
            t8 = yes();
        }else{
            t8 = no();
        }
        if(n9==p9){
            t9 = yes();
        }else{
            t9 = no();
        }
        if(n10==p10){
            t10 = yes();
        }else{
            t10 = no();
        }
        int sum = (t1 + t2 + t3 + t4 + t5 + t6 + t7 + t8 + t9 + t10);

        EditText et = findViewById(R.id.answer);

        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                et.setInputType(sum);
            }
        });


    }

    public static int yes(){
        Random rand = new Random();
        int r = rand.nextInt(15);
        return r;
    }
    public static int no() {
        Random rand = new Random();
        int r = rand.nextInt(20);
        return r;
    }
}
