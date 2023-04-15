package com.example.schedule;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TimeBlocksActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    Button next;
    Button previous;
    CharSequence[] items = {"1", "2", "3", "4", "5", "6", "7", "8"};
    boolean[] selecteditems = {false, false, false, false, false, false, false, false};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_blocks);
        button = findViewById(R.id.button3);
        textView = findViewById(R.id.txtViews);
        textView.setText(itemsToString());
        next = findViewById(R.id.button5);
        previous = findViewById(R.id.button6);
        /*
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity6();
            }
        });
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity7();
            }
        });

         */

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(TimeBlocksActivity.this);
                alertDialogBuilder.setCancelable(true);
                alertDialogBuilder.setTitle("Select Programming Language: ");
                alertDialogBuilder.setMultiChoiceItems(items, selecteditems, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which, boolean isChecked) {
                        selecteditems[which] = isChecked;
                    }
                });
                alertDialogBuilder.setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        textView.setText(itemsToString());
                        dialog.dismiss();
                    }
                });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.setCanceledOnTouchOutside(true);
                alertDialog.show();

            }
        });
    }
    private String itemsToString() {
        String text = "";
        for (int i = 0; i < selecteditems.length; i++) {
            if(selecteditems[i]) {
                text = text + items[i] + " ";
            }

        }
        return text.trim();
    }
}