import gods.dyonysus.wines.GoodWine;

public class Customer {

  public Quality getRandomQuality() {
    return Quality.BEST;
  }

  public void enjoy(GoodWine wineBottle) {
    System.out.println("Enjoying the wine" + wineBottle);
  }

  public Quality evaluateCodeQuality(Programmer programmer) {
    return Quality.BEST;
  }
}
