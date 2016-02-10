package edu.westga.tamikowilliamsstaticfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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


    public DataDisplayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View theView = inflater.inflate(R.layout.fragment_data_display,
                container, false);
        this.textView1 = (TextView) theView.findViewById(R.id.textView2);
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
       textView1.setText("" + results);
    }

}
