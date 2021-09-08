package puntos;

import java.util.Comparator;

public class ComparadorPorX implements Comparator<Punto> {
  @Override
  public int compare(Punto uno, Punto dos) {
    return uno.getX().compareTo(dos.getX());
  }
}