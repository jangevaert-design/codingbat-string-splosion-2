public class StringSplosion2 {
  public String stringSplosion(String str) {
    String result = "";

    for (int i = 0; i < str.length() + 1; i++) {
      result += str.substring(0, i);
    }
    return result;
  }
}

//public class StringSplosion2 {
//  public String stringSplosion(String str) {
//    StringBuilder result = new StringBuilder();
//
//    for (int i = 0; i < str.length() + 1; i++) {
//      result = result.append(str.substring(0, i));
//    }
//    return result.toString();
//  }
//}
