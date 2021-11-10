package com.example.guessnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int time;
        int drawnum;
        int a = 0;
        drawnum = (int)(Math.random()*9+1);

        String ToBig = "太大了";
        String ToSmall = "太小了";
        String correct = "答對了";
        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                Bundle bundle = new Bundle();
                if(drawnum == 1){
                bundle.putString("text",correct);
                intent.putExtras(bundle);
                startActivity(intent);
                }else if (drawnum > 1){
                    bundle.putString("text",ToBig);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                Bundle bundle = new Bundle();
                if(drawnum == 2){
                    bundle.putString("text",correct);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }else if (drawnum > 2){
                    bundle.putString("text",ToBig);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }else{
                    bundle.putString("text",ToSmall);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                Bundle bundle = new Bundle();
                if(drawnum == 3){
                    bundle.putString("text",correct);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }else if (drawnum > 3){
                    bundle.putString("text",ToBig);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }else{
                    bundle.putString("text",ToSmall);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                Bundle bundle = new Bundle();
                if(drawnum == 4){
                    bundle.putString("text",correct);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }else if (drawnum > 4){
                    bundle.putString("text",ToBig);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }else{
                    bundle.putString("text",ToSmall);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                Bundle bundle = new Bundle();
                if(drawnum == 5){
                    bundle.putString("text",correct);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }else if (drawnum > 5){
                    bundle.putString("text",ToBig);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }else{
                    bundle.putString("text",ToSmall);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                Bundle bundle = new Bundle();
                if(drawnum == 6){
                    bundle.putString("text",correct);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }else if (drawnum > 6){
                    bundle.putString("text",ToBig);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }else{
                    bundle.putString("text",ToSmall);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                Bundle bundle = new Bundle();
                if(drawnum == 7){
                    bundle.putString("text",correct);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }else if (drawnum > 7){
                    bundle.putString("text",ToBig);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }else{
                    bundle.putString("text",ToSmall);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                Bundle bundle = new Bundle();
                if(drawnum == 8){
                    bundle.putString("text",correct);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }else if (drawnum > 8){
                    bundle.putString("text",ToBig);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }else{
                    bundle.putString("text",ToSmall);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                Bundle bundle = new Bundle();
                if(drawnum == 9){
                    bundle.putString("text",correct);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }else if (drawnum < 9){
                    bundle.putString("text",ToSmall);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }
        });



    }
}