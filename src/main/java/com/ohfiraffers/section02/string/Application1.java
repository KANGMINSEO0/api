package com.ohfiraffers.section02.string;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. String 클래스의 자주 사용하는 메소드에 대해 숙지하고 응용할 수 있다. */
        /* charAt() : 해당 문자열의 특정 인덱스에 해당하는 문자를 반환한다.
        * 인덱스는 0부터 시작하는 숫자 체계를 의미하며
        * 인덱스를 벗어난 정수를 인자로 전달하는 경우에는 IndexOutOfBoundsException이 발생한다.
        * */

        String str1 = "apple";

        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }

        /* compareTo() : 인자로 전달된 문자열과 사전 순으로 비교를 하여
        *  두문자열이 같다면 0을 반환, 인자로 전달된 문자열보다 작으면 음수를.
        *  크면 양수를 반환한다.
        *  단, 이 메소드는 대소문자를 구분하여 비교한다.
        * */
        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";

        System.out.println(str2.compareTo(str3));
        System.out.println(str2.compareTo(str4));
        System.out.println(str4.compareTo(str2));

        System.out.println(str2.compareTo(str5));
        System.out.println(str5.compareTo(str2));

        /* concat() : 문자열에 인자로 전잘된 문자열을 합치기해서 새로운 문자열을 반환한다.
        *  원본 문자열에는 영향을 주지 않는다.
        * */
        System.out.println(str2.concat(str5));
        System.out.println(str2);

        String caseStr = "JavaOracle";
        System.out.println(caseStr.toLowerCase()); // 모든 문자를 소문자로 바꿔줌
        System.out.println(caseStr.toUpperCase()); // 모든 문자를 대문자로 바꿔줌

        String javaoracle = "javaoracle";
        System.out.println(javaoracle.substring(3,6)); // 3부터 6전까지 반환
        System.out.println(javaoracle);

        System.out.println(javaoracle.replace("java","python")); // java 부분이 python으로 바뀜
        System.out.println(javaoracle);

        System.out.println("".isEmpty());
        System.out.println("abc".isEmpty());

    }
}
