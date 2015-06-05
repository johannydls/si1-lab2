/**
 * Created by Johanny on 05/06/2015.
 */

function pesquisar() {
    var valor = $("#codigo").val();

    if (valor != "") {
        $("#meusAnuncios").append(
        '<td>@anuncio.getTitulo</td>' +
        '<td>@anuncio.getDataDePostagem</td>' +
        '<td>@anuncio.getCidade</td>' +
        '<td>@anuncio.getBairro</td>' +
        '<td>' +
            '@if(anuncio.isFinalizado) {' +
            'N&Atilde;O!' +
        '} else {' +
            'SIM!' +
        '}'+
    '</td>' +
        '<td>'+
        '<div class="btn-group">' +
            '<a class="btn btn-success" href="/anuncios">' +
            '<span class="glyphicon glyphicon-thumbs-up icon-white" aria-hidden="true"></span>' +
            '</a>' +
            '</div>' +
            '</td>'
        );
    }
}