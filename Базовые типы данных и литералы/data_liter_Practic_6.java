public class data_liter_Practic_6 {
    public static void main(String[] args) {
        // 1. Из double в int (дробная часть просто отбрасывается)
        double pi = 3.14159;
        int intPi = (int) pi;
        System.out.println(intPi); // Результат: 3

        // 2. Из большого целого в маленькое (возможна потеря данных)
        int bigNum = 130;
        byte smallNum = (byte) bigNum;
        System.out.println(smallNum); // Результат: -126 (произошло переполнение)

        // 3. Из long в short
        long l = 100L;
        short s = (short) l;
        System.out.println(s); // Результат: 100
    }
}
