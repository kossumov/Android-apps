package com.example.ribbit;

import android.app.Application;

import com.parse.Parse;

public class RibbitApplication extends Application{
	@Override
	public void onCreate() {
		super.onCreate();
		Parse.initialize(this, "oFr5Uln1GRa66qDYjLAchEd7CNWyRq1SK8ILdi6s", "NbjHsGBdVYuYNt0z3XCV8QnifZoMpl0gRwj25Xmt");
	}
}
