public class strings1 {
    public static void main(String[] args) {
        String y = new String("Yash");
        System.out.println(y);
        System.out.println(y.toLowerCase());
        System.out.println(y.toUpperCase());
        System.out.println(y.trim());
        System.out.println(y.length());
        //System.out.println(y.substring(2,6));
        System.out.println(y.substring(2,3));
        System.out.println(y.startsWith("Ya"));
        System.out.println(y.endsWith("Yash"));
        System.out.println(y.charAt(2));

        String modifiedName = "Harryrry";
        System.out.println(modifiedName.indexOf("rdsdsry", 3));
        System.out.println(modifiedName.lastIndexOf('r', 6));
        System.out.println(y.equals("yash"));
        System.out.println(y.equalsIgnoreCase("YasH"));
        System.out.println("This is Thai Indian Curry \nNevertheless I am the best and \t you go to the helll");
        
    }
}
