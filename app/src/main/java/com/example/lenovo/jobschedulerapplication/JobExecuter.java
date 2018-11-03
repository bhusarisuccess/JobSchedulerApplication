package com.example.lenovo.jobschedulerapplication;

import android.os.AsyncTask;

public class JobExecuter extends AsyncTask<Void,Void,String> {

    @Override
    protected String doInBackground(Void... voids) {
        return "Background long runing task is finished..";
    }
}
