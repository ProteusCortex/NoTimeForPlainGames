package gr.devoid.notimeforplaingames;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;

public class CreatePlayersActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_create_players);
		
		// TODO: Get the number of players from a previous activity...
		int nPlayerNumber = 20;
		int[] nPlayerId = new int[nPlayerNumber];
		for (int i = 0; i < nPlayerNumber; i++) {
			nPlayerId[i] = i + 1;
		}
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.create_players, menu);
		return true;
	}

}
