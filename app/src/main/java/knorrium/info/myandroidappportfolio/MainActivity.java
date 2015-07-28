package knorrium.info.myandroidappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {
    private ArrayList<Button> buttonList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        buttonList = new ArrayList<Button>();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnApp1 = (Button) findViewById(R.id.button);
        Button btnApp2 = (Button) findViewById(R.id.button2);
        Button btnApp3 = (Button) findViewById(R.id.button3);
        Button btnApp4 = (Button) findViewById(R.id.button4);
        Button btnApp5 = (Button) findViewById(R.id.button5);
        Button btnApp6 = (Button) findViewById(R.id.button6);

        buttonList.add(btnApp1);
        buttonList.add(btnApp2);
        buttonList.add(btnApp3);
        buttonList.add(btnApp4);
        buttonList.add(btnApp5);
        buttonList.add(btnApp6);

        for (int i = 0; i < buttonList.size(); i++) {
            buttonList.get(i).setText(buttonList.get(i).getText().toString().toUpperCase());
            buttonList.get(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){
                    String appTitle = new String();
                    String toastMsg = new String();
                    switch(v.getId()){
                        case R.id.button:
                            appTitle = getString(R.string.main_app1_title);
                            break;
                        case R.id.button2:
                            appTitle = getString(R.string.main_app2_title);
                            break;
                        case R.id.button3:
                            appTitle = getString(R.string.main_app3_title);
                            break;
                        case R.id.button4:
                            appTitle = getString(R.string.main_app4_title);
                            break;
                        case R.id.button5:
                            appTitle = getString(R.string.main_app5_title);
                            break;
                        case R.id.button6:
                            appTitle = getString(R.string.main_app6_title);
                            break;
                    }
                    toastMsg = String.format(
                            getString(R.string.main_app_toast_message),
                            getString(R.string.main_app_launch),
                            appTitle,
                            getString(R.string.main_app_app)
                            );

                    Toast.makeText(v.getContext().getApplicationContext(), toastMsg, Toast.LENGTH_SHORT).show();
                }
            });
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
