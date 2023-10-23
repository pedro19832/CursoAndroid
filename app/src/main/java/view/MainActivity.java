package view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import devandroid.monti.applistacurso.R;
import model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outrapessoa;

    String dadosPessoa;
    String dadosOutraPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        //Atribuir conteudo, dados, valores para o objeto
        //conforme o template
        pessoa.setPrimeiroNome("Pedro");
        pessoa.setSobreNome("Monti");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("119898995");

        outrapessoa = new Pessoa();
        outrapessoa.setPrimeiroNome("Luiz");
        outrapessoa.setSobreNome("Alves");
        outrapessoa.setCursoDesejado("Kotlin");
        outrapessoa.setTelefoneContato("11666");

        dadosPessoa = "Primeiro nome: ";
        dadosPessoa += pessoa.getPrimeiroNome(); // concatenar com +=
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += " Curso desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += " Telefone de contato: ";
        dadosPessoa += pessoa.getTelefoneContato();

        dadosOutraPessoa = "Primeiro nome: ";
        dadosOutraPessoa += outrapessoa.getPrimeiroNome(); // concatenar com +=
        dadosOutraPessoa += " Sobrenome: ";
        dadosOutraPessoa += outrapessoa.getSobreNome();
        dadosOutraPessoa += " Curso desejado: ";
        dadosOutraPessoa += outrapessoa.getCursoDesejado();
        dadosOutraPessoa += " Telefone de contato: ";
        dadosOutraPessoa += outrapessoa.getTelefoneContato();

        Log.i("POOAndroid",pessoa.toString());
        Log.i("POOAndroid",outrapessoa.toString());




    }
}