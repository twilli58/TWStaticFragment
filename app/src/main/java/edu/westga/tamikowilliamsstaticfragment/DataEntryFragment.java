package edu.westga.tamikowilliamsstaticfragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.miko.tamikowilliamsstaticfragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DataEntryFragment extends Fragment {
    private EditText editTextFirst;
    private EditText editTextSecond;

    public DataEntryFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View theView = inflater.inflate(R.layout.fragment_data_entry,
                container, false);
        this.editTextFirst = (EditText) theView.findViewById(R.id.editText);
        this.editTextSecond = (EditText) theView.findViewById(R.id.editText2);

        Button multiplyButton = (Button) theView.findViewById(R.id.button);
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                multiplyButtonClicked(v);
            }
        });
        return theView;
    }
    private void multiplyButtonClicked(View v) {
        double a = Double.parseDouble(this.editTextFirst.getText().toString());
        double b = Double.parseDouble(this.editTextSecond.getText().toString());
        //listener.onDataEntry(a, b);

    }

}
