public class Main{
    public static void main(String[] args){

        double[][] data = {{0,0,0}, {0,1,1}, {1,0,1}, {1,1,1}};

        double w1 = Math.random() * 4 - 2;
        double w2 = Math.random() * 4 - 2;
        double w3 = Math.random() * 4 - 2;
        double w4 = Math.random() * 4 - 2;
        double w5 = Math.random() * 4 - 2;
        double w6 = Math.random() * 4 - 2;
        double b1 = 1;
        double b2 = 1;
        double lr = .2;

        
        for(int i = 0; i < 50000; i++){
            double[] point = data[(int)(Math.random() * data.length)];
            double i1 = point[0];
            double i2 = point[1];
            double target = point[2];

            double h1 = 0;
            double h2 = 0;
            double pred = 0;

            double z_h1 = i1 * w1 + i2 * w3 + b1;
            double z_h2 = i1 * w2 + i2 * w4 + b1;
            h1 = sigmoid(z_h1);
            h2 = sigmoid(z_h2);
            double z = h1 * w5 + h2 * w6 + b2;
            pred = sigmoid(z);

            double cost = Math.pow(pred - target, 2);

            double dcost_dpred = 2 * (pred - target);
            double dpred_dz = sigmoidPrime(z);

            double dz_dw5 = h1;
            double dz_dw6 = h2;
            double dz_db2 = 1;

            w5 -= lr * dcost_dpred * dpred_dz * dz_dw5;
            w6 -= lr * dcost_dpred * dpred_dz * dz_dw6;
            b2 -= lr * dcost_dpred * dpred_dz * dz_db2;

            w1 -= lr * dcost_dpred * dpred_dz * dz_dw5 * sigmoidPrime(h1) * i1;
            w2 -= lr * dcost_dpred * dpred_dz * dz_dw6 * sigmoidPrime(h2) * i1;
            w3 -= lr * dcost_dpred * dpred_dz * dz_dw5 * sigmoidPrime(h1) * i2;
            w4 -= lr * dcost_dpred * dpred_dz * dz_dw6 * sigmoidPrime(h2) * i2;
            b1 -= lr * (dcost_dpred * dpred_dz * dz_dw6);

        }
        
        double i1 = 0;
        double i2 = 0;
        double res = sigmoid((sigmoid(i1 * w1 + i2 * w3 + b1) * w5) + ((sigmoid(i1 * w3 + i2 * w4 + b1) * w6) + b2));
        System.out.println(Math.round(res));
        i1 = 0;
        i2 = 1;
        res = sigmoid((sigmoid(i1 * w1 + i2 * w3 + b1) * w5) + ((sigmoid(i1 * w3 + i2 * w4 + b1) * w6) + b2));
        System.out.println(Math.round(res));
        i1 = 1;
        i2 = 0;
        res = sigmoid((sigmoid(i1 * w1 + i2 * w3 + b1) * w5) + ((sigmoid(i1 * w3 + i2 * w4 + b1) * w6) + b2));
        System.out.println(Math.round(res));
        i1 = 1;
        i2 = 1;
        res = sigmoid((sigmoid(i1 * w1 + i2 * w3 + b1) * w5) + ((sigmoid(i1 * w3 + i2 * w4 + b1) * w6) + b2));
        System.out.println(Math.round(res));
        
    }

    public static double sigmoid(double x){
        return 1 / (1 + Math.exp(-x));
    }

    public static double sigmoidPrime(double x){
        return sigmoid(x) * (1 - sigmoid(x));
    }
}