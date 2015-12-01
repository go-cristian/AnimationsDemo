package co.iyubinest.animations;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity
{

    private Button button;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {

                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                ActivityOptions options =
                    ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, button,
                        "button");
                startActivity(i, options.toBundle());
            }
        });
    }
}
