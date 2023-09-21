public class Aresta {

  private String verticeOrigem;
  String verticeDestino;
  double valorAresta;

  public Aresta(
    String verticeOrigem,
    String verticeDestino,
    double valorAresta
  ) {
    this.verticeOrigem = verticeOrigem;
    this.verticeDestino = verticeDestino;
    this.valorAresta = valorAresta;
  }

  public String getVerticeOrigem() {
    return verticeOrigem;
  }

  public String getVerticeDestino() {
    return verticeDestino;
  }

  public double getValorAresta() {
    return valorAresta;
  }
}
