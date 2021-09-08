package puntos;

import java.util.Comparator;

public class ComparadorPorXDecreciente implements Comparator<Punto> {
  @Override
  public int compare(Punto uno, Punto dos) {
    return -1 * new ComparadorPorX().compare(uno,dos);
  }
}