package BasicPrograms;
public class DataTypes {

    public static void main(String[] args) {

        // =====================================================
        // 1. INTEGER DATA TYPES
        // =====================================================

        // byte: Stores small whole numbers
        // Range: -128 to 127
        byte age = 25;

        // short: Stores whole numbers larger than byte
        short year = 2026;

        // int: Commonly used for whole numbers
        int population = 100000;

        // long: Used for very large whole numbers
        // L is added at the end to indicate a long value
        long distance = 9876543210L;


        // =====================================================
        // 2. DECIMAL DATA TYPES
        // =====================================================

        // float: Stores decimal numbers
        // f is added at the end to indicate a float value
        float temperature = 36.5f;

        // double: Stores decimal numbers with more precision
        // double is commonly used for decimal values
        double salary = 2500.75;


        // =====================================================
        // 3. CHARACTER DATA TYPE
        // =====================================================

        // char: Stores a single character
        // Character must be written inside single quotes
        char grade = 'A';


        // =====================================================
        // 4. BOOLEAN DATA TYPE
        // =====================================================

        // boolean: Stores only true or false
        boolean isStudent = true;


        // =====================================================
        // 5. STRING
        // =====================================================

        // String: Stores a sequence of characters/text
        // String values are written inside double quotes
        String name = "Ananya";


        // =====================================================
        // DISPLAYING THE VALUES
        // =====================================================

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("Population: " + population);
        System.out.println("Distance: " + distance);
        System.out.println("Temperature: " + temperature);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student: " + isStudent);

    }
}
