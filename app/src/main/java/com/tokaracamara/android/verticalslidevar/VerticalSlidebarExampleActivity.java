package com.tokaracamara.android.verticalslidevar;

import android.app.Activity;
import android.os.Bundle;

public class VerticalSlidebarExampleActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        VerticalSeekBar vSeekBar = (VerticalSeekBar)findViewById(R.id.SeekBar01);
        vSeekBar.setMax(100);
        vSeekBar.setProgress(30);
        vSeekBar.setOnSeekBarChangeListener(new VerticalSeekBar.OnSeekBarChangeListener() {

    		@Override
    		public void onStopTrackingTouch(VerticalSeekBar seekBar) {
    		}

    		@Override
    		public void onStartTrackingTouch(VerticalSeekBar seekBar) {

    		}

    		@Override
    		public void onProgressChanged(VerticalSeekBar seekBar, int progress, boolean fromUser) {
                //Log.v("D",String.valueOf(progress));

    		}
    	});

    }
}