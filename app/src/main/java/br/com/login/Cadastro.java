package br.com.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Cadastro extends AppCompatActivity {

    ImageView Google;
    ImageView Facebook;
    ImageView Twitter;
    Button Cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro);

        Google = findViewById(R.id.Google);
        Facebook = findViewById(R.id.Facebook);
        Twitter = findViewById(R.id.Twitter);
        Cadastrar = findViewById(R.id.Cadastrar);

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
                Toast.makeText(getBaseContext(), "Cadastro Realizado com Sucesso", Toast.LENGTH_SHORT).show();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                Intent Cadastrar = new Intent(getApplicationContext(), Login.class);
                startActivity(Cadastrar);
                        finish();
                    }
                },1000);
            }
        });
    }
}