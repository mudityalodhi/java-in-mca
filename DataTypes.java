import java.io.*;

class DataTypes {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // int
        int a = Integer.parseInt(br.readLine());

        // double
        double b = Double.parseDouble(br.readLine());

        // float
        float c = Float.parseFloat(br.readLine());

        // long
        long d = Long.parseLong(br.readLine());

        // boolean
        boolean e = Boolean.parseBoolean(br.readLine()); // "true" ya "false" likhna hoga

        // char
        char f = br.readLine().charAt(0); // pehla character le lega

        // String — seedha, koi conversion nahi!
        String g = br.readLine();

    }
}