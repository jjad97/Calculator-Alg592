package com.example.jordanne.mybasicapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 *
 * import android.R;
 * import android.R.*;
 * import android.R.array;
 *
 * Created by Jordanne on 3/29/2020.
 *
 */

public class MainActivity2 extends AppCompatActivity{

    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button ac;
    private Button percent;
    private Button plusMinus;
    private Button divide;
    private Button multiply;
    private Button minus;
    private Button plus;
    private Button equal;
    private Button decimal;
    private TextView action;
    private TextView result;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char EQUAL = 0;
    private final char PERCENT = '%';
    private final char DECIMAL = '.';
    private final char PLMIN = 0;
    private EditText first;
    private EditText second;
    private double val1 = Double.NaN;
    private double val2;
    private char COMPUTE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        textView();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "I JUST TAPPED NUMBER ZERO");
                action.setText(action.getText().toString() + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "I JUST TAPPED NUMBER ONE");
                action.setText(action.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "I JUST TAPPED NUMBER TWO");
                action.setText(action.getText().toString() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "I JUST TAPPED NUMBER THREE");
                action.setText(action.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "I JUST TAPPED NUMBER FOUR");
                action.setText(action.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "I JUST TAPPED NUMBER FIVE");
                action.setText(action.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "I JUST TAPPED NUMBER SIX");
                action.setText(action.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "I JUST TAPPED NUMBER SEVEN");
                action.setText(action.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "I JUST TAPPED NUMBER EIGHT");
                action.setText(action.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "I JUST TAPPED NUMBER NINE");
                action.setText(action.getText().toString() + "9");
            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "I JUST TAPPED THE CLEAR BUTTON");
                if(action.getText().length() > 0){
                    CharSequence name = action.getText().toString();
                    action.setText(name.subSequence(0, name.length()-1));
                }
                else{
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    action.setText(null);
                    result.setText(null);
                }
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "I JUST TAPPED ADDITION SYMBOL");
                compute();
                COMPUTE = ADDITION;
                result.setText(String.valueOf(val1) + " + ");
                action.setText(null);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "I JUST TAPPED SUBTRACTION SYMBOL");
                compute();
                COMPUTE = SUBTRACTION;
                result.setText(String.valueOf(val1) + " - ");
                action.setText(null);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "I JUST TAPPED MULTIPLICATION SYMBOL");
                compute();
                COMPUTE = MULTIPLICATION;
                result.setText(String.valueOf(val1) + " * ");
                action.setText(null);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "I JUST TAPPED DIVISION SYMBOL");
                compute();
                COMPUTE = DIVISION;
                result.setText(String.valueOf(val1) + " / ");
                action.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "I JUST TAPPED EQUAL SYMBOL");
                compute();
                COMPUTE = EQUAL;
                result.setText(result.getText().toString() + String.valueOf(val2) + " = " + String.valueOf(val1));
                // 7 + 3 = 10
                action.setText(null);
            }
        });

        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "I JUST TAPPED PERCENT SYMBOL");
                compute();
                COMPUTE = PERCENT;
                result.setText(String.valueOf(val1) + " % ");
                action.setText(null);
            }
        });

        plusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "I JUST TAPPED NEGATIVE SYMBOL");
                compute();
                COMPUTE = PLMIN;
                result.setText(String.valueOf(val1 * -1));
                action.setText(null);
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "I JUST TAPPED DECIMAL SYMBOL");
                compute();
                COMPUTE = DECIMAL;
                result.setText(String.valueOf(val1) + " . ");
                action.setText(null);
            }
        });
    }

    private void textView() {
        zero = (Button) findViewById(R.id.button0);
        one = (Button)findViewById(R.id.button1);
        two = (Button)findViewById(R.id.button2);
        three = (Button)findViewById(R.id.button3);
        four = (Button)findViewById(R.id.button4);
        five = (Button)findViewById(R.id.button5);
        six = (Button)findViewById(R.id.button6);
        seven = (Button)findViewById(R.id.button7);
        eight = (Button)findViewById(R.id.button8);
        nine = (Button)findViewById(R.id.button9);
        ac = (Button)findViewById(R.id.buttonAC);
        percent = (Button)findViewById(R.id.buttonPercent);
        plusMinus = (Button)findViewById(R.id.buttonPlusMinus);
        divide = (Button)findViewById(R.id.buttonDivide);
        multiply = (Button)findViewById(R.id.buttonMultiply);
        minus = (Button)findViewById(R.id.buttonMinus);
        plus = (Button)findViewById(R.id.buttonPlus);
        equal = (Button)findViewById(R.id.buttonEqual);
        decimal = (Button)findViewById(R.id.buttonDecimal);

        action = (TextView) findViewById(R.id.textView_action);
        result = (TextView) findViewById(R.id.textView_result);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private void compute()
    {
        if(!Double.isNaN(val1))
        {
            val2 = Double.parseDouble(action.getText().toString());

            switch(COMPUTE) {
                case ADDITION:
                    val1 = val1 + val2;
                    break;
                case SUBTRACTION:
                    val1 = val1 - val2;
                    break;
                case MULTIPLICATION:
                    val1 = val1 * val2;
                    break;
                case DIVISION:
                    val1 = val1 / val2;
                    break;
                case PERCENT:
                    val1 = val1 / 100;
                    break;
                case DECIMAL:
                    val1 = Double.parseDouble("0.");
                    break;
                case EQUAL:
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + COMPUTE);
            }
        }
        else{
            val1 = Double.parseDouble(action.getText().toString());
        }
    }

}
