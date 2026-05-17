//1. Из String в StringBuilder или StringBuffer

String str = "Привет";
// В StringBuilder
StringBuilder sb = new StringBuilder(str);
// В StringBuffer
StringBuffer sbf = new StringBuffer(str);


//2. Из StringBuilder / StringBuffer в String
StringBuilder sb = new StringBuilder("Java");
String str1 = sb.toString();

StringBuffer sbf = new StringBuffer("World");
String str2 = sbf.toString();


//3. Из StringBuilder в StringBuffer и наоборот
StringBuilder sb = new StringBuilder("Test");

// StringBuilder -> StringBuffer
StringBuffer sbf = new StringBuffer(sb);

// StringBuffer -> StringBuilder
StringBuilder sbNew = new StringBuilder(sbf);