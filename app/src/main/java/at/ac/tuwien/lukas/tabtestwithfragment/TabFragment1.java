package at.ac.tuwien.lukas.tabtestwithfragment;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;


public class TabFragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab_fragment_1,container,false);


        ImageButton imageButtonStop = view.findViewById(R.id.stopButton);
        ImageButton imageButtonOk = view.findViewById(R.id.okButton);
        ImageButton imageButtonHelp = view.findViewById(R.id.helpButton);

        final MediaPlayer mpStop = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.digi_plink);
        final MediaPlayer mpOkay = MediaPlayer.create(getActivity().getApplicationContext(),R.raw.music_marimba_chord);
        final MediaPlayer mpHelp = MediaPlayer.create(getActivity().getApplicationContext(),R.raw.beep_short_off);

        imageButtonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpStop.start();
            }
        });

        imageButtonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpOkay.start();
                ((MainActivity)getActivity()).getProgressBar().setProgress(33);
            }
        });

        imageButtonHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpHelp.start();
            }
        });

        return view;
    }
}
