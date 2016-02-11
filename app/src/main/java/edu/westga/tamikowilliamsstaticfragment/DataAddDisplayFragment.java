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

public class DataAddDisplayFragment extends Fragment {
    private static TextView textView1;

    public DataAddDisplayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View theView = inflater.inflate(R.layout.fragment_data_add_display,
                container, false);

        this.textView1 = (TextView) theView.findViewById(R.id.textView3);

        return theView;
    }


    public void displayAddProduct(Double result) {
        textView1.setText(String.valueOf(result));
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }



}
