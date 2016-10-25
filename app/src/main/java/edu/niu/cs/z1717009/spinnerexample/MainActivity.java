package edu.niu.cs.z1717009.spinnerexample;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private Spinner xmlSpin,javaSpin,dynamicSpin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        xmlSpin = (Spinner) findViewById(R.id.xmlSprinner);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(getApplicationContext(),

Jacob
,R.layout.spinner_view);
        xmlSpin.setAdapter(adapter1);

        xmlSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selection= parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"IPL Team selected : "+selection,Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        /******************************************************************************************/
        javaSpin = (Spinner) findViewById(R.id.javaSpinner);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(getApplicationContext(),R.layout.spinner_view,SpinnerExample.stringArray);

        javaSpin.setAdapter(adapter2);

        javaSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selection = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this,"International Team selected : "+selection,Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        /******************************************************************************************/

        dynamicSpin = (Spinner) findViewById(R.id.dynamicSpinner);
        List<String> values = new ArrayList<String>();
        values.add("Asia Cup");
        values.add("ICL");
        values.add("World Cup");
        values.add("WT20");
        values.add("IPL");

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(getApplicationContext(),R.layout.spinner_view,values);

        dynamicSpin.setAdapter(adapter3);

        dynamicSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selection = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),"Tournament selected : "+selection,Toast.LENGTH_LONG).show();
            }





            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
