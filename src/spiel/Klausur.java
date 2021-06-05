public class Klausur {
public static String umdrehen(String str) {
String result="";
for(int i = str.length()-1; i>=0; i--) {
result += str.charAt(i);
}
return result;
}
public static boolean istPalindrom(String str) {
if(str.equals(umdrehen(str))) return true;
return false;
}
public static void main(String[] args) {
System.out.println(umdrehen("Moin"));
System.out.println(istPalindrom("anna"));
System.out.println(umdrehen("Hallo"));
System.out.println(istPalindrom("anne"));
}
}