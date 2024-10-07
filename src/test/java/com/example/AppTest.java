package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
  private GestorEventos gestor = new GestorEventos();
  private Eventos ev1 = new Eventos("evento 1", "07/07/2006", "parque", 10, 20, 40);
  private Eventos ev2 = new Eventos("evento 2", "11/09/2001", "torres gêmeas", 23, 70, 42);

  @Test
  public void testApp() {
    assertEquals(1, 1);
  }

  @Test
  public void testInscreverParticipante() {
    ev1.inscreverParticipante();
    assertEquals(1, ev1.getInscritos());
    assertEquals(ev1.getCapacidadeMaxima() - 1, ev1.getVagasDisponiveis());
  }

  @Test
  public void testCadastrarEvento() {
    gestor.cadastrarEvento(ev1);
    assertEquals(ev1, gestor.getEventos()[0]);
  }

  @Test
  public void testBuscarEventoPorNome() {
    gestor.cadastrarEvento(ev1);
    gestor.cadastrarEvento(ev2);
    assertEquals(gestor.getEventos()[1], gestor.buscarEventoPorNome("evento 2"));
  }

  @Test
  public void testInscreverEmEvento() {
    gestor.cadastrarEvento(ev1);
    assertEquals(true, gestor.inscreverEmEvento("evento 1"));
  }

}
