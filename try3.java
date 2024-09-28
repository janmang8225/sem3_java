public class try3 {
  public static void main(String[] args) {
    String s1 = new String("Hello");
    String s2 = "Another String with spaces";
    // String s3;
    System.out.println(s1.toUpperCase());
    System.out.println(s1.toLowerCase());
    System.out.println(s1.charAt(0));
    // System.out.println(s1.replace(s1, s2));
    System.out.println(s1);
    System.out.println(s1.substring(3));
    char arr1[] = s1.toCharArray();
    char arr3[] = arr1;
    for(int i=0; i<s1.length(); i++) arr3[i]=arr1[s1.length()-1-i];
    System.out.println(arr3);

    

  }
}
