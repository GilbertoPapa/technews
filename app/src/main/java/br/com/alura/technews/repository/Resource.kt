package br.com.alura.technews.repository

/**
 * Created by GilbertoPapa on 30/09/2019.
 */
class Resource <T>(
    val dado: T?,
    val erro: String? = null

)


fun <T> criaResourceFalha(
    resourceAtual: Resource<T?>?,
    erro: String?
): Resource<T?> {
    if (resourceAtual != null) {
        return Resource(dado = resourceAtual.dado, erro = erro)
    }
    return Resource(dado = null, erro = erro)

}