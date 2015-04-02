package com.rgz.broadcasttutorial;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by rgz on 14-12-22.
 */
public class NotificationView extends Activity {

    String title;
    String text;
    TextView txttitle;
    TextView txttext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.notificationview);

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.cancel(0);


        // Receive the data from MainActivity.javja
        Intent intent = getIntent();

        title = intent.getStringExtra("title");
        text = intent.getStringExtra("text");

        txttitle = (TextView) findViewById(R.id.title);
        txttext = (TextView) findViewById(R.id.text);

        txttitle.setText(title);
        txttext.setText(text);

    }
}
