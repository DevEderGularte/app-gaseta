package devandroid.edergularte.appgaseta.controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.edergularte.appgaseta.model.Pessoa;
import devandroid.edergularte.appgaseta.view.MainActivity;

public class PessoaController {
    SharedPreferences preferences;
    SharedPreferences.Editor listaVip;
    private static final String NOME_PREFERENCES = "pref_listavip";

    public PessoaController(MainActivity activity){
        preferences = activity.getSharedPreferences(NOME_PREFERENCES, 0);
        listaVip = preferences.edit();
    }
    @NonNull
    @Override
    public String toString() {
        Log.d("MVC_Controller", "Controller Iniciada");
        return super.toString();
    }

      public void salvar(Pessoa pessoa) {
        Log.d("MVC_Controller", "Salvo: " + pessoa.toString());

        listaVip.putString("primeiroNome",pessoa.getPrimeiroNome());
        listaVip.putString("sobreNome",pessoa.getSobreNome());
        listaVip.putString("nomeCurso",pessoa.getCursoDesejado());
        listaVip.putString("telefoneContato",pessoa.getTelefoneContato());
        listaVip.apply();
    }

    public Pessoa buscar(Pessoa pessoa) {
        pessoa.setPrimeiroNome(preferences.getString("primeiroNome","N/A"));
        pessoa.setSobreNome(preferences.getString("sobreNome","N/A"));
        pessoa.setCursoDesejado(preferences.getString("nomeCurso","N/A"));
        pessoa.setTelefoneContato(preferences.getString("telefoneContato","N/A"));

        return pessoa;
    }

    public void limpar() {
        listaVip.clear();
        listaVip.apply();
    }
}
