package edu.westga.tamikowilliamsstaticfragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.miko.tamikowilliamsstaticfragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DataDisplayFragment extends Fragment {
    private static TextView textView1;
    private Double numberOne, numberTwo;
    private Double results;
    private EditText editTextFirst;
    private EditText editTextSecond;
    private DataDisplayListener listener;

   public interface DataDisplayListener {
        public void onDataDisplay(Double c, Double d);
    }
    public DataDisplayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View theView = inflater.inflate(R.layout.fragment_data_display,
                container, false);

        this.editTextFirst = (EditText) theView.findViewById(R.id.editText);
        this.editTextSecond = (EditText) theView.findViewById(R.id.editText2);
        this.textView1 = (TextView) theView.findViewById(R.id.textView2);

        Button addButton = (Button) theView.findViewById(R.id.addBtn);
        addButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addButtonClicked(v);
            }
        });
        return theView;

    }
    public Double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(Double numberOne) {
        this.numberOne = numberOne;
    }

    public Double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(Double numberTwo) {
        this.numberTwo = numberTwo;
    }
    public void multiple() {
        results = numberOne * numberTwo;
    }
    public void displayProduct() {
        textView1.setText("" + results.toString().trim());
    }
    private void addButtonClicked(View v){
        double number1 = Double.parseDouble(this.editTextFirst.getText().toString());
        double number2 = Double.parseDouble(this.editTextSecond.getText().toString());
        listener.onDataDisplay(number1, number2);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            listener = (DataDisplayListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString());
        }
    }



}
