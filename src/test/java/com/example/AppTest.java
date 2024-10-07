package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
  private GestorEventos gestor = new GestorEventos();
  private Eventos ev1 = new Eventos("evento 1", "07/07/2006", "parque", 10, 20, 40);

  @Test
  public void testApp() {
    assertEquals(1, 1);
  }

  @Test
  public void testInscreverEmEvento() {
    ev1.inscreverParticipante();
    assertEquals(1, ev1.getInscritos());
    assertEquals(ev1.getCapacidadeMaxima() - 1, ev1.getVagasDisponiveis());
  }

  @Test
  public void testCadastrarEvento() {
    gestor.cadastrarEvento("evento 1", "07/07/2006", "parque", 10, 20, 40);
    assertEquals(ev1, gestor.getEventos()[0]);
  }

  @Test
  public void testBuscarEventoPorNome() {
    gestor.cadastrarEvento("evento 1", "07/07/2006", "parque", 10, 20, 40);
    assertEquals(ev1, gestor.buscarEventoPorNome("evento 1"));
  }
}
