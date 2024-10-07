package com.example;

public class Eventos {
  private String nome;
  private String data;
  private String local;
  private int inscritos;
  private int vip;
  private int camarote;
  private int pista;

  public Eventos(String nome, String data, String local, int vip, int camarote, int pista) {
    this.nome = nome;
    this.data = data;
    this.local = local;
    this.inscritos = 0;
    this.vip = vip;
    this.camarote = camarote;
    this.pista = pista;
  }

  public String getNome() {
    return nome;
  }

  public String getData() {
    return data;
  }

  public String getLocal() {
    return local;
  }

  public int getVip() {
    return vip;
  }

  public void setVip(int vip) {
    this.vip = vip;
  }

  public int getCamarote() {
    return camarote;
  }

  public void setCamarote(int camarote) {
    this.camarote = camarote;
  }

  public int getPista() {
    return pista;
  }

  public void setPista(int pista) {
    this.pista = pista;
  }

  public int getVagasDisponiveis() {
    return getCapacidadeMaxima() - inscritos;
  }

  public int getCapacidadeMaxima() {
    return vip + camarote + pista;
  }

  public int getInscritos() {
    return inscritos;
  }

  public boolean inscreverParticipante() {
    if (inscritos < getCapacidadeMaxima()) {
      inscritos++;
      return true;
    } else {
      return false;
    }
  }

  @Override
  public String toString() {
    return "Nome: " + nome + "\nData: " + data + "\nLocal: " + local +
        "\nVagas Disponíveis: " + getVagasDisponiveis();
  }
}
