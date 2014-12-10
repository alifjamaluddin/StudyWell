package com.um.studywell;



import net.pmium.notausrah.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class LoginActivity extends Activity {
	EditText et1;
	EditText et2;
	Button btn1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		et1 = (EditText) findViewById(R.id.editText1);
		et2 = (EditText) findViewById(R.id.editText2);
		btn1 = (Button) findViewById(R.id.button1);

	}

	public void login(View view) {
		String username = et1.getText().toString();
		String password = et2.getText().toString();
		if (username.equalsIgnoreCase("root")
				&& password.equalsIgnoreCase("root")) {
			Intent intent = new Intent(LoginActivity.this, MainActivity.class);
			startActivity(intent);
		}

	}

}
