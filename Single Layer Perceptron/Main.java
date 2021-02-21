public class Main{
    public static void main(String[] args){
        int[][] data = {{0,0,0},{0,1,0},{1,0,0},{1,1,1}};

        double lr = .2;
        double w1 = Math.random() * 4 - 2;
        double w2 = Math.random() * 4 - 2;
        double b = 1;

        for(int i = 0; i < 50000; i++){
            int[] point = data[(int)(Math.random() * data.length)];

            double z = w1 * point[0] + w2 * point[1] + b;
            double pred = sigmoid(z);
            double cost = costFunc(pred, point[2]);

            double dcost_dpred = 2 * (pred - point[2]); 
            double dpred_dz = sigmoidPrime(z);

            double dcost_dz = dcost_dpred * dpred_dz;

            double dz_dw1 = point[0];
            double dz_dw2 = point[1];
            double dz_db = 1;

            double dcost_dw1 = dcost_dz * dz_dw1;
            double dcost_dw2 = dcost_dz * dz_dw2;
            double dcost_db = dcost_dz * dz_db;

            w1 -= lr * dcost_dw1; //cost -> pred -> z -> w1
            w2 -= lr * dcost_dw2;
            b -= lr * dcost_db;
        }

        System.out.println(Math.round(guess(w1, w2, b, data[0])) + " | expected " + data[0][2]);
        System.out.println(Math.round(guess(w1, w2, b, data[1])) + " | expected " + data[1][2]);
        System.out.println(Math.round(guess(w1, w2, b, data[2])) + " | expected " + data[2][2]);        
        System.out.println(Math.round(guess(w1, w2, b, data[3])) + " | expected " + data[3][2]);

    }

    public static double guess(double w1, double w2, double b, int[] point){
        return sigmoid(w1 * point[0] + w2 * point[2] + b);
    }

    public static double sigmoid(double x){
        return 1 / (1 + Math.exp(-x));
    }

    public static double sigmoidPrime(double x){
        return sigmoid(x) * (1-sigmoid(x));
    }

    public static double costFunc(double actual, double expected){
        return Math.pow(actual - expected, 2);
    }
}