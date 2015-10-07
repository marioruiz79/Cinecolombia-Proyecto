package co.edu.uan.cinecolombia;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class MyActivity extends Activity {

    ListViewAdapter adapter;

    String[] titulo = new String[]{
            "titulo1",
            "titulo2",
            "titulo3",
            "titulo4",
    };

    int[] imagenes = {
            R.drawable.aviator,
            R.drawable.batman,
            R.drawable.crepucsulo,
            R.drawable.harry
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        final ListView lista = (ListView) findViewById(R.id.listView1);
        adapter = new ListViewAdapter(this, titulo, imagenes);
        lista.setAdapter(adapter);


lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
});

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                                Toast.makeText(getApplicationContext(), "presiono " + i, Toast.LENGTH_SHORT).show();
            }
        });


    }
}