package models;

import play.db.ebean.Model;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Johanny on 22/05/2015.
 */
@Entity
public class Anuncio extends Model {

    @Id @GeneratedValue
    private String id;

    //@Column(name="titulo")
    private String titulo;

    //@Column(name="cidade")
    private String cidade;

    //@Column(name="bairro")
    private String bairro;

    //@Column(name="descricao")
    private String descricao;

    //@Column(name="instrumentos")
    //private List<String> instrumentos;

    //@Column(name="instrumentos")
    private String instrumentos;

    //@Column(name="estilosPretendidos")
    //private List<String> estilosPretendidos;
    //@Column(name="estilosPretendidos")
    private String estilosPretendidos;

    //@Column(name="estilosNaoPretendidos")
    //private List<String> estilosNaoPretendidos;
    //@Column(name="estilosNaoPretendidos")
    private String estilosNaoPretendidos;

    //@Column(name="opcaoQueBusca")
    private String opcaoQueBusca;

    //@Column(name="formasDeContato")
    //private List<String> formasDeContato;
    //@Column(name="formasDeContato")
    private String formasDeContato;

    //@Column(name="finalizado")
    private boolean finalizado;

    //@Column(name="dataDePostagem")
    private String dataDePostagem;

    public Anuncio(){
        //Construtor padrao para o Hibernate
        this.dataDePostagem = getDateTime();
    }

    public Anuncio(String id, String t, String d, String c, String b, String i, String o, String cont) {
        this.id = id;
        this.titulo = t;
        this.descricao = d;
        this.cidade = c;
        this.bairro = b;
        this.instrumentos = i;
        this.opcaoQueBusca = o;
        this.formasDeContato = cont;
        this.finalizado = false;
        this.dataDePostagem = getDateTime();
    }

    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(String instrumento) {
       this.instrumentos = instrumento;
    }

    public String getEstilosPretendidos() {
        return estilosPretendidos;
    }

    public void setEstilosPretendidos(String estilo) {
        this.estilosPretendidos = estilo;
    }

    public String getEstilosNaoPretendidos() {
        return estilosNaoPretendidos;
    }

    public void setEstilosNaoPretendidos(String estiloNaoPretendido) {
        this.estilosNaoPretendidos = estiloNaoPretendido;
    }

    public String getOpcaoQueBusca() {
        return opcaoQueBusca;
    }

    public void setOpcaoQueBusca(String opcaoQueBusca) {
        this.opcaoQueBusca = opcaoQueBusca;
    }

    public String getFormasDeContato() {
        return formasDeContato;
    }

    public void setFormasDeContato(String formaDeContato) {
        this.formasDeContato = formaDeContato;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public String getDataDePostagem() {
        return dataDePostagem;
    }


    public static Map<String, String> opcaoQueBusca() {
        LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
        options.put("Formar banda", "Formar Banda");
        options.put("Tocar ocasionalmente", "Tocar ocasionalmente");
        return options;
    }
}
