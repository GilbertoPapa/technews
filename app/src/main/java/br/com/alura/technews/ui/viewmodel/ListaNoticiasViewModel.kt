package br.com.alura.technews.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import br.com.alura.technews.model.Noticia
import br.com.alura.technews.repository.NoticiaRepository

/**
 * Created by GilbertoPapa on 29/09/2019.
 */
class ListaNoticiasViewModel(private val repository : NoticiaRepository) :ViewModel() {



    init {
        Log.i("ViewModel","criando viewmodel")
    }

    override fun onCleared() {

        Log.i("ViewModel", "destruindo viewmodel")
        super.onCleared()
    }

    fun buscaTodos(quandoSucesso: (noticiasNovas: List<Noticia> ) -> Unit, quandoFalha: (erro : String?) -> Unit) {

        repository.buscaTodos(quandoSucesso, quandoFalha)

    }
}