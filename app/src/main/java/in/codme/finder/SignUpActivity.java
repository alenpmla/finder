package in.codme.finder;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class SignUpActivity extends AppCompatActivity {

    EditText usernamesu,passwordsu1,passwordconfirm,namereg;
    Button signupbtn;
    String name,email,password,passwordtwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        usernamesu=(EditText) findViewById(R.id.emailsignup);
        passwordsu1=(EditText) findViewById(R.id.password1);
        passwordconfirm=(EditText) findViewById(R.id.passwordconfirm);
        namereg=(EditText) findViewById(R.id.namereg);

        signupbtn=(Button) findViewById(R.id.signupbtn);



        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                password = passwordsu1.getText().toString();
                passwordtwo = passwordconfirm.getText().toString();
                 email = usernamesu.getText().toString();
                 name=namereg.getText().toString();
                password = password.trim();

                email = email.trim();
                name=name.trim();
                password=password.trim();
                passwordtwo=passwordtwo.trim();

                if (password.isEmpty() || email.isEmpty()||passwordtwo.isEmpty()) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(SignUpActivity.this);
                    builder.setMessage(R.string.signup_error_message)
                            .setTitle(R.string.signup_error_title)
                            .setPositiveButton(android.R.string.ok, null);
                    AlertDialog dialog = builder.create();
                    dialog.show();
                } else
                {

                    if(password.equals(passwordtwo)){


                        final ProgressDialog progressDialog=new ProgressDialog(SignUpActivity.this);
                        progressDialog.setMessage("Registering user");
                        progressDialog.show();






                    }
else{
                        AlertDialog.Builder builder = new AlertDialog.Builder(SignUpActivity.this);
                        builder.setMessage(R.string.confirm_fail_error)
                                .setTitle(R.string.signup_error_title)
                                .setPositiveButton(android.R.string.ok, null);
                        AlertDialog dialog = builder.create();
                        dialog.show();
           }


                }


            }
        });

    }
}
