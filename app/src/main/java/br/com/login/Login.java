package br.com.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Login extends AppCompatActivity {

    ImageView Google;
    ImageView Facebook;
    ImageView Twitter;
    TextView Cadastrar;
    Button Login;
    EditText Email;
    EditText Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Google = findViewById(R.id.Google);
        Facebook = findViewById(R.id.Facebook);
        Twitter = findViewById(R.id.Twitter);
        Cadastrar = findViewById(R.id.Cadastrar);
        Login = findViewById(R.id.Login);
        Email = findViewById(R.id.Email);
        Password = findViewById(R.id.Password);

        Google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com.br")));
            }
        });

        Facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com.br")));
            }
        });

        Twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.twitter.com.br")));
            }
        });

        Cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Cadastro = new Intent(getApplicationContext(), Cadastro.class);
                startActivity(Cadastro);
            }
        });

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Email.getText().toString().equals("admin@gmail.com") && Password.getText().toString().equals("admin123"))
                {
                    Toast.makeText(getBaseContext(), "Login Feito com Sucesso!!!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getBaseContext(), "Login Inválido!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}