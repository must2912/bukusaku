package stematel.bukusaku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView TxtID, TxtUser, TxtNama, TxtKelas, TxtPoin, TxtKeterangan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //if the user is not logged in
        //starting the login activity
        if (!SharedPrefManager.getInstance(this).isLoggedIn()) {
            finish();
            startActivity(new Intent(this, LoginActivity.class));
        }


        /*TxtID = (TextView) findViewById(R.id.TxtID);
        TxtUser = (TextView) findViewById(R.id.TxtUser);
        TxtNama = (TextView) findViewById(R.id.TxtNama);
        TxtKelas = (TextView) findViewById(R.id.TxtKelas);
        TxtPoin = (TextView) findViewById(R.id.TxtPoin);
        TxtKeterangan = (TextView) findViewById(R.id.TxtKeterangan);*/


        //getting the current user
        User user = SharedPrefManager.getInstance(this).getUser();

        //setting the values to the textviews
        /*TxtID.setText(String.valueOf(user.getID()));
        TxtUser.setText(user.getUsername());
        TxtNama.setText(user.getNama());
        TxtKelas.setText(user.getKelas());
        TxtPoin.setText(String.valueOf(user.getPoin()));
        TxtKeterangan.setText(user.getKeterangan());
*/
        //when the user presses logout button
        //calling the logout method
        /*findViewById(R.id.BtnLogout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                SharedPrefManager.getInstance(getApplicationContext()).logout();
            }
        });*/
    }
}
