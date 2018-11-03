package com.example.lenovo.jobschedulerapplication;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.widget.Toast;

public class MJobScheduler extends JobService {
    private JobExecuter executer;
    @Override
    public boolean onStartJob(final JobParameters jobParameters) {
        executer = new JobExecuter(){
            @Override
            protected void onPostExecute(String s) {
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
                jobFinished(jobParameters,false);
            }
        };
        executer.execute();
        return true;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
