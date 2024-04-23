package padroescriacao.prototype;
import org.junit.jupiter.api.Test;
import padroescriacao.prototype_inimigo.Arma;
import padroescriacao.prototype_inimigo.Inimigo;
import padroescriacao.prototype_vet.Animal;
import padroescriacao.prototype_vet.Tutor;

import static org.junit.jupiter.api.Assertions.*;


public class VetTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Animal animal = new Animal("Sirius", "gato", new Tutor("Katherine", "45678934567"));

        Animal animalClone = animal.clone();
        animalClone.setNome("Jacó");
        animalClone.setEspecie("cachorro");
        animalClone.getTutor().setNome("Karoline");
        animalClone.getTutor().setDocumento("789023156798");

        assertEquals("Animal{nome='Sirius', especie='gato', tutor=Tutor{nome='Katherine', documento='45678934567'}}", animal.toString());
        assertEquals("Animal{nome='Jacó', especie='cachorro', tutor=Tutor{nome='Karoline', documento='789023156798'}}", animalClone.toString());

    }}

