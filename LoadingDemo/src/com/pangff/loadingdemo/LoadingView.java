package com.pangff.loadingdemo;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public class LoadingView extends View{
	private View view;
	public LoadingView(Context context) {
		super(context);
		view = ((Activity)context).getLayoutInflater().inflate(R.layout.loading, null);
	}
	
	public void addLoadingTo(ViewGroup anchor){
		ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
		anchor.addView(view, lp);
	}
	
	public void removeLoadingFrom(ViewGroup anchor){
		anchor.removeView(view);
	}
}
