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

public class DataAddDisplayFragment extends Fragment {
    private static TextView textView2;
    private Double numberOneAdd, numberTwoAdd;
    private Double addResults;

    public DataAddDisplayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View theView = inflater.inflate(R.layout.fragment_data_add_display,
                container, false);
        this.textView2 = (TextView) theView.findViewById(R.id.textView3);

        return theView;

    }

    public Double getNumberOneAdd() {
        return numberOneAdd;
    }

    public void setNumberOneAdd(Double numberOneAdd) {
        this.numberOneAdd = numberOneAdd;
    }

    public Double getNumberTwoAdd() {
        return numberTwoAdd;
    }

    public void setNumberTwoAdd(Double numberTwoAdd) {
        this.numberTwoAdd = numberTwoAdd;
    }
    public void Add(){
        addResults = numberOneAdd + numberTwoAdd;
    }
    public void displayAddProduct() {
        textView2.setText("" + addResults);
    }

}
