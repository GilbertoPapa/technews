package br.com.alura.technews.ui.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.alura.technews.model.Noticia
import br.com.alura.technews.repository.NoticiaRepository
import br.com.alura.technews.repository.Resource

/**
 * Created by GilbertoPapa on 30/09/2019.
 */
class FormularioNoticiaViewModel(private val repository: NoticiaRepository): ViewModel(){

    init {
        Log.i("ViewModel","criando viewmodel")
    }

    private val liveData = MutableLiveData<List<Noticia>>()

    fun buscaTodos(): LiveData<Resource<List<Noticia>?>> {

        return repository.buscaTodos()
    }

    override fun onCleared() {

        Log.i("ViewModel", "destruindo viewmodel")
        super.onCleared()
    }

    fun salva(noticia: Noticia): LiveData<Resource<Void?>>{
        return repository.salva(noticia)
    }


}