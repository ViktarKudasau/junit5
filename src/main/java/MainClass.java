public class MainClass {
    public static String justExample(String string){
        System.out.println(string);
        if (string.contains("3")){
            throw new NumberFormatException();
        }
        if (string.contains("4")){
            return string.replace("1", "3");
        }
        String result = string.replace("1", "2");
        return result;
    }
}
