public class JavaFiddle
{
  public static void main(String[] args)
  {
    System.out.println(compressed("aabbbca"));
    System.out.println(compressed(""));
    System.out.println(compressed("aaaaaaaaaaa"));
    System.out.println(compressed("fdbshalfbiudshabfildbvyavouewdsahlfbjfhjbhdvsalidwonuojndsjanjnldblsuiavb"));
  }

  public static String compressed(String Value){
      if(Value.equals("")){
          return Value;
      }

      String toReturn = "";
      int counter = 1;
      char looker = Value.charAt(0);
      for(int i = 1; i < Value.length(); i++){
          if(looker == Value.charAt(i)){
              counter++;
          }else{
              toReturn += looker;
              toReturn+= ""+counter;
              looker = Value.charAt(i);
              counter = 1;
          }
      }
      toReturn += looker;
      toReturn+= ""+counter;
      return toReturn;
  }
}
