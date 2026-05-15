package com.example.discografia.discos;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "discos")
public class Disco {
    @Id
    public String _id;
    public String idArtista;
    public String nombre;
    public int anioLanzamiento;
    public List<String> canciones;

    public String get_id() { return _id; }
    public void set_id(String _id) { this._id = _id; }
    public String getIdArtista() { return idArtista; }
    public void setIdArtista(String idArtista) { this.idArtista = idArtista; }
}