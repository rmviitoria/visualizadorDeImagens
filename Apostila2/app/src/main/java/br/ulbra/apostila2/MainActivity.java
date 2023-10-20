package br.ulbra.apostila2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    ImageView imgfoto;
    Button btnFoto1, btnFoto2;
    TextView txtInformacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgfoto = (ImageView) findViewById(R.id.foto1);

        btnFoto1 = (Button) findViewById(R.id.btnFoto1);
        btnFoto2 = (Button) findViewById(R.id.btnFoto2);
        txtInformacao = (TextView) findViewById(R.id.txtInformacao);
        btnFoto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                imgfoto.setImageResource(R.drawable.papel);
                txtInformacao.setText("Foto 1");
            } });
        btnFoto2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                imgfoto.setImageResource(R.drawable.tesoura);
                txtInformacao.setText("Foto 2");

            } }); } }
