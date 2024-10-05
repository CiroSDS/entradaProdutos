package db;

import models.Usuario;
import java.util.List;
import java.util.ArrayList;

public class UsuarioDB {

    private List<Usuario> usuarioList = new ArrayList<>();

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void addNovoUsuario(Usuario usuario) {
        int id = usuarioList.size()+1;
        usuario.setId(id);
        usuarioList.add(usuario);
    }
}
