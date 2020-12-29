import gods.dyonysus.wines.GoodWine;

class HappyCustomer extends Customer {
  GoodWine wineBottle = Moldova.createWine(Wine.CABERNET_SAUVIGNON);

  Programmer findGoodProgrammer() {
    Programmer programmer = TalentPool.getProgrammer();

    boolean isBestCode = true;
    if (programmer.getCompany() != Companies.ISD) {
      isBestCode = evaluateCodeQuality(programmer) != Quality.BEST;
    }

    if (isBestCode) {
      while (wineBottle.isNotEmpty()) {
        enjoy(wineBottle);
      }
      return programmer;
    }
    return findGoodProgrammer();
  }
}