import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VideojocTest {

    public static final String NOM_VIDEOJOC = "fifa";
    public static final String EDAT_PEGI = "PEGI 12";
    public static final String SET_VIDEOJOC = "FiFA";


    @Test
    void getUsuarisQueHanConsultat() {
        Videojoc test1 = new Videojoc("fifa");
    }

    @Test
    void getNom() {
        Videojoc testVideojoc = new Videojoc(NOM_VIDEOJOC);
        assertEquals(testVideojoc.getNom(), NOM_VIDEOJOC);
        String nomDelVideojoc = testVideojoc.getNom();

        assert(nomDelVideojoc == NOM_VIDEOJOC);
    }

    @Test
    void setNom() {
        Videojoc testVideojoc = new Videojoc(NOM_VIDEOJOC);
        testVideojoc.setNom(NOM_VIDEOJOC);
        assert (testVideojoc.getNom() == NOM_VIDEOJOC);
    }

    @Test
    void getGenere() {

    }

    @Test
    void setGenere() {
    }

    @Test
    void getNumeroJugadors() {
    }

    @Test
    void setNumeroJugadors() {
    }

    @Test
    void getPreu() {
    }

    @Test
    void setPreu() {
    }

    @Test
    void getPlataformes() {
    }

    @Test
    void setPlataformes() {
    }

    @Test
    void getAmbientacio() {
    }

    @Test
    void setAmbientacio() {
    }

    @Test
    void getEdatRecomanadaPEGI() {
    }

    @Test
    void setEdatRecomanadaPEGI() {
        Videojoc testVideojoc = new Videojoc(NOM_VIDEOJOC);
        testVideojoc.setEdatRecomanadaPEGI(EDAT_PEGI);
        assert (testVideojoc.getEdatRecomanadaPEGI() == EDAT_PEGI);
    }

    @Test
    void getContingutEspecificPEGI() {
    }

    @Test
    void setContingutEspecificPEGI() {
    }

    @Test
    void getRequisits() {
    }

    @Test
    void setRequisits() {
    }

    @Test
    void getComentaris() {
    }
}