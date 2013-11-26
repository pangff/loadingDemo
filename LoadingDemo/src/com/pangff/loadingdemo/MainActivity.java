package com.pangff.loadingdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {

	private RelativeLayout anchor;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		anchor = (RelativeLayout) this.findViewById(R.id.anchor);
		new LoadingView(this).addLoadingTo(anchor);
	}

}
