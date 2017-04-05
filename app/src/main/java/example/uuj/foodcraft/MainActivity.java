package example.uuj.foodcraft;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private SQLiteDatabase db;
    DataBaseHelper myDb;
    ListView listView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDb = new DataBaseHelper(this);

        listView = (ListView) findViewById(R.id.listView);

       // myDb.insertData(listView.getText().toString());


    }
}




//https://www.youtube.com/watch?v=p8TaTgr4uKM