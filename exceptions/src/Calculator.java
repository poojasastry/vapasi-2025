public class Calculator {
    double calculateDouble(int inputNum) {
        double modifiedInput;
        try {
            if (inputNum == 0){
                throw new MyArithException("Zero not allowed.");
            }else if (inputNum < 0) {
                throw new MyArithException("Negative not allowed.");
            }
            modifiedInput = inputNum;
        }
        finally{
        }
        return modifiedInput;
    }
}
