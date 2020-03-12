package com.example.setmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public static final String EXTRA_MESSAGE = "com.example.setmenu.extra.MESSAGE";
public static final String EXTRA_MESSAGE2 = "com.example.setmenu.extra.MESSAGE2";
public static final String EXTRA_MESSAGE3 = "com.example.setmenu.extra.MESSAGE3";
private EditText lunch;
private EditText breakfast;
private EditText dinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        breakfast = findViewById(R.id.editText);
        lunch = findViewById(R.id.editText2);
        dinner = findViewById(R.id.editText3);

    }
    public void showDatePicker(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.datepicker));
    }
    public void showDatePicker2(View view) {
        DialogFragment newFragment = new DatePickerFragment2();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.datepicker));
    }

    public void showDatePicker3(View view) {
        DialogFragment newFragment = new DatePickerFragment3();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.datepicker));
    }

    public void processDatePickerResult(int year, int month, int day) {
        String month_string = Integer.toString(month + 1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        String dateMessage = (month_string +
                "/" + day_string +
                "/" + year_string);

        Toast.makeText(this, getString(R.string.date) + dateMessage,
                Toast.LENGTH_SHORT).show();
        EditText edittext= findViewById(R.id.editText);
        edittext.setText(dateMessage);
    }

    public void processDatePickerResult2(int year, int month, int day) {
        String month_string = Integer.toString(month + 1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        String dateMessage = (month_string +
                "/" + day_string +
                "/" + year_string);

        Toast.makeText(this, getString(R.string.date) + dateMessage,
                Toast.LENGTH_SHORT).show();
        EditText edittext= findViewById(R.id.editText2);
        edittext.setText(dateMessage);
    }

    public void processDatePickerResult3(int year, int month, int day) {
        String month_string = Integer.toString(month + 1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        String dateMessage = (month_string +
                "/" + day_string +
                "/" + year_string);

        Toast.makeText(this, getString(R.string.date) + dateMessage,
                Toast.LENGTH_SHORT).show();
        EditText edittext= findViewById(R.id.editText3);
        edittext.setText(dateMessage);
    }


    public void showUpdate(View view) {
        Intent intent = new Intent(this, DisplayMenu.class);
        String breakfastdate = breakfast.getText().toString();
        String lunchdate = lunch.getText().toString();
        String dinnerdate = dinner.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, breakfastdate);
        intent.putExtra(EXTRA_MESSAGE2, lunchdate);
        intent.putExtra(EXTRA_MESSAGE3, dinnerdate);
        startActivity(intent);
    }
}
