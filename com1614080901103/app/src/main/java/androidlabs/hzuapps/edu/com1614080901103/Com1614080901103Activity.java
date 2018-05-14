package androidlabs.hzuapps.edu.com1614080901103;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Com1614080901103Activity extends AppCompatActivity {

    private ImageView imageView;
    private Button newbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_com1614080901103);

        imageView = (ImageView) findViewById(R.id.textview_01);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Com1614080901103Activity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
        newbutton=(Button) findViewById(R.id.button);
        newbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Com1614080901103Activity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}
