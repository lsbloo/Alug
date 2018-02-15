package com.example.osvaldoairon.pojoalug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

public class CadUsuario extends AppCompatActivity {

    private EditText nomeUsuario,emailUsuario,loginUsuario,senhaUsuario,enderecoUsuario;
    private Button btn_cadastrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_usuario);

        btn_cadastrar=(Button)findViewById(R.id.btn_cadastrar);
        nomeUsuario=(EditText)findViewById(R.id.nome_completo);
        emailUsuario=(EditText)findViewById(R.id.email);
        loginUsuario=(EditText)findViewById(R.id.login);
        senhaUsuario=(EditText)findViewById(R.id.senha);


        btn_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(nomeUsuario.getText().toString().isEmpty() || emailUsuario.getText().toString().isEmpty() || loginUsuario.getText().toString().isEmpty() || senhaUsuario.getText().toString().isEmpty()) {
                    Toast.makeText(CadUsuario.this, "Preencha todos os campos !", Toast.LENGTH_SHORT).show();
                }
                else {
                    // iniciar o firebase pra salvar os dados do usuario x


                    Toast.makeText(CadUsuario.this, "Cadastrado!", Toast.LENGTH_SHORT).show();
                    limparCampos();
                }
            }
        });

    }
    public void limparCampos() {
        nomeUsuario.setText("");
        emailUsuario.setText("");
        loginUsuario.setText("");
        senhaUsuario.setText("");

    }
}
